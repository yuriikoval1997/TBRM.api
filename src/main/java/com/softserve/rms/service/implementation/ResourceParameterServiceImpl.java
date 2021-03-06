package com.softserve.rms.service.implementation;


import com.softserve.rms.constants.ErrorMessage;
import com.softserve.rms.constants.FieldConstants;
import com.softserve.rms.dto.resourceParameter.ResourceParameterDTO;
import com.softserve.rms.dto.resourceParameter.ResourceParameterSaveDTO;
import com.softserve.rms.dto.template.ResourceTemplateDTO;
import com.softserve.rms.entities.ParameterType;
import com.softserve.rms.entities.ResourceParameter;
import com.softserve.rms.entities.ResourceRelation;
import com.softserve.rms.entities.ResourceTemplate;
import com.softserve.rms.exceptions.NotDeletedException;
import com.softserve.rms.exceptions.NotFoundException;
import com.softserve.rms.exceptions.NotUniqueNameException;
import com.softserve.rms.exceptions.resourceParameter.ResourceParameterCanNotBeModified;
import com.softserve.rms.exceptions.resourseTemplate.ResourceTemplateIsNotPublishedException;
import com.softserve.rms.repository.ResourceParameterRepository;
import com.softserve.rms.repository.ResourceRelationRepository;
import com.softserve.rms.service.ResourceParameterService;
import com.softserve.rms.service.ResourceTemplateService;
import com.softserve.rms.util.RangeIntegerPatternGenerator;
import com.softserve.rms.util.Validator;
import org.jooq.DSLContext;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.table;

/**
 * Implementation of {@link ResourceParameterService}
 *
 * @author Andrii Bren
 */
@Service
public class ResourceParameterServiceImpl implements ResourceParameterService {
    private final ResourceParameterRepository resourceParameterRepository;
    private final ResourceRelationRepository resourceRelationRepository;
    private final ResourceTemplateService resourceTemplateService;
    private Validator validator = new Validator();
    private ModelMapper modelMapper = new ModelMapper();
    private RangeIntegerPatternGenerator patternGenerator = new RangeIntegerPatternGenerator();
    private DSLContext dslContext;

    /**
     * Constructor with parameters
     *
     * @author Andrii Bren
     */
    @Autowired
    public ResourceParameterServiceImpl(ResourceParameterRepository resourceParameterRepository,
                                        ResourceTemplateService resourceTemplateService,
                                        ResourceRelationRepository resourceRelationRepository, DSLContext dslContext) {
        this.resourceParameterRepository = resourceParameterRepository;
        this.resourceTemplateService = resourceTemplateService;
        this.resourceRelationRepository = resourceRelationRepository;
        this.dslContext = dslContext;
    }

    /**
     * {@inheritDoc}
     *
     * @author Halyna Yatseniuk
     */
    @Override
    @Transactional
    public ResourceParameterDTO checkIfParameterCanBeSaved(Long id, ResourceParameterSaveDTO parameterDTO)
            throws NotFoundException, NotUniqueNameException {
        if (resourceTemplateService.findEntityById(id).getIsPublished().equals(false)) {
            return save(id, parameterDTO);
        } else throw new ResourceParameterCanNotBeModified(
                ErrorMessage.PARAMETER_CAN_NOT_BE_ADDED.getMessage());
    }

    /**
     * Method saves {@link ResourceParameter}.
     *
     * @param id           {@link ResourceTemplate} id
     * @param parameterDTO {@link ResourceParameterSaveDTO}
     * @throws NotUniqueNameException if the resource parameter with provided name exists
     * @throws NotFoundException      if the resource parameter with provided id is not found
     * @author Andrii Bren
     */
    @Transactional
    public ResourceParameterDTO save(Long id, ResourceParameterSaveDTO parameterDTO)
            throws NotFoundException, NotUniqueNameException {

        ResourceParameter resourceParameter = new ResourceParameter();
        resourceParameter.setName(verifyIfParameterNameIsUniquePerResourceTemplate(parameterDTO.getName(), id));
        resourceParameter.setColumnName(
                verifyIfParameterColumnNameIsUniquePerResourceTemplate(parameterDTO.getName(), id));
        resourceParameter.setParameterType(parameterDTO.getParameterType());
        if (parameterDTO.getPattern() != null ||
                parameterDTO.getParameterType() == ParameterType.COORDINATES) {
            resourceParameter.setPattern(getMatchedPatternToParameterType(
                    parameterDTO.getParameterType(), parameterDTO.getPattern()));
        }
        resourceParameter.setResourceTemplate(resourceTemplateService.findEntityById(id));

        resourceParameterRepository.save(resourceParameter);

        if (parameterDTO.getRelatedResourceTemplateId() != null) {
            resourceParameter.setResourceRelations(saveParameterRelation(resourceParameter.getId(),
                    parameterDTO.getRelatedResourceTemplateId()));
        }
        return modelMapper.map(resourceParameter, ResourceParameterDTO.class);
    }

    /**
     * Method matches pattern to {@link ParameterType}.
     *
     * @param type    {@link ParameterType}
     * @param pattern regex pattern
     * @return String regex
     * @author Andrii Bren
     */
    private String getMatchedPatternToParameterType(ParameterType type, String pattern) {
        if (type == ParameterType.POINT_INT || type == ParameterType.RANGE_INT) {
            return patternGenerator.generateRangeIntegerRegex(pattern);
        } else if (type == ParameterType.COORDINATES) {
            return Validator.COORDINATES_PATTERN;
        }
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * @author Halyna Yatseniuk
     */
    @Override
    @Transactional
    public ResourceParameterDTO checkIfParameterCanBeUpdated(Long templateId, Long parameterId, ResourceParameterSaveDTO parameterSaveDTO)
            throws NotFoundException, NotUniqueNameException, ResourceParameterCanNotBeModified {
        if (resourceTemplateService.findEntityById(templateId).getIsPublished().equals(false)) {
            ResourceParameter resourceParameter = findById(parameterId);
            return updateById(templateId, resourceParameter, parameterSaveDTO);
        } else throw new ResourceParameterCanNotBeModified(
                ErrorMessage.RESOURCE_PARAMETER_CAN_NOT_BE_UPDATED.getMessage());
    }

    /**
     * Method updates {@link ResourceParameter}.
     *
     * @param templateId        {@link ResourceTemplate} id
     * @param resourceParameter {@link ResourceParameter}
     * @param parameterDTO      {@link ResourceParameterSaveDTO}
     * @return updated instance of {@link ResourceParameterDTO}
     * @throws NotUniqueNameException if the resource parameter with provided name exists
     * @throws NotFoundException      if the resource parameter with provided id is not found
     * @author Andrii Bren
     */
    private ResourceParameterDTO updateById(Long templateId, ResourceParameter resourceParameter,
                                            ResourceParameterSaveDTO parameterDTO)
            throws NotUniqueNameException, NotFoundException {
        updateParameterNameAndColumnName(templateId, resourceParameter, parameterDTO);
        resourceParameter.setParameterType(parameterDTO.getParameterType());
        if (parameterDTO.getPattern() != null) {
            resourceParameter.setPattern(getMatchedPatternToParameterType(
                    parameterDTO.getParameterType(), parameterDTO.getPattern()));
        }
        resourceParameterRepository.save(resourceParameter);
        verifyParameterRelation(resourceParameter, parameterDTO);
        return modelMapper.map(resourceParameter, ResourceParameterDTO.class);
    }

    /**
     * Method verifies {@link ResourceParameter} relation type.
     *
     * @param resourceParameter {@link ResourceParameter}
     * @param parameterDTO      {@link ResourceParameterSaveDTO}
     * @author Halyna Yatseniuk
     */
    private void verifyParameterRelation(ResourceParameter resourceParameter,
                                         ResourceParameterSaveDTO parameterDTO) {
        if (parameterDTO.getParameterType().equals(ParameterType.POINT_REFERENCE)) {
            resourceParameter.setResourceRelations(updateParameterRelation(
                    resourceParameter.getId(), parameterDTO.getRelatedResourceTemplateId()));
        } else if (!parameterDTO.getParameterType().equals(ParameterType.POINT_REFERENCE)
                && resourceParameter.getResourceRelations() != null) {
            dropParameterRelation(resourceParameter);
        }
    }

    /**
     * Method drops {@link ResourceRelation} of {@link ResourceParameter}.
     *
     * @param resourceParameter {@link ResourceParameter}
     * @author Halyna Yatseniuk
     */
    private void dropParameterRelation(ResourceParameter resourceParameter) {
        int deleted = dslContext.delete(table(FieldConstants.RESOURCE_RELATION_TABLE.getValue()))
                .where(field(FieldConstants.ID.getValue()).eq(resourceParameter.getResourceRelations().getId()))
                .execute();
        if (deleted == 1) {
            resourceParameter.setResourceRelations(null);
        }
    }

    /**
     * Method updates {@link ResourceParameter} name and column name.
     *
     * @param templateId        {@link ResourceTemplate} id
     * @param resourceParameter {@link ResourceParameter}
     * @param parameterDTO      {@link ResourceParameterSaveDTO}
     * @throws NotUniqueNameException if the resource template or parameter is not found
     * @author Halyna Yatseniuk
     */
    private void updateParameterNameAndColumnName(Long templateId, ResourceParameter resourceParameter,
                                                  ResourceParameterSaveDTO parameterDTO) {
        if (!resourceParameter.getName().equals(parameterDTO.getName())) {
            resourceParameter.setName(verifyIfParameterNameIsUniquePerResourceTemplate(
                    parameterDTO.getName(), templateId));
            resourceParameter.setColumnName(verifyIfParameterColumnNameIsUniquePerResourceTemplate(
                    parameterDTO.getName(), templateId));
        }
    }

    /**
     * Method updates {@link ResourceRelation}.
     *
     * @param parameterId {@link ResourceParameter} id
     * @param relatedResourceParameterId {@link ResourceRelation} relatedTemplate id
     * @return instance of {@link ResourceRelation}
     * @throws NotFoundException                       if the resource template or parameter is not found
     * @throws ResourceTemplateIsNotPublishedException if resource template has not been published
     * @author Halyna Yatseniuk
     */
    private ResourceRelation updateParameterRelation(Long parameterId, Long relatedResourceParameterId)
            throws NotFoundException {
        ResourceRelation resourceRelation = resourceRelationRepository.findByResourceParameterId(parameterId);
        if (resourceRelation != null) {
            resourceRelation.setRelatedResourceTemplate(verifyIfResourceTemplateIsPublished(resourceTemplateService
                    .findEntityById(relatedResourceParameterId)));
            return resourceRelation;
        } else return saveParameterRelation(parameterId, relatedResourceParameterId);
    }

    /**
     * Method saves {@link ResourceRelation}.
     *
     * @param parameterId {@link ResourceParameter} id
     * @param relatedResourceParameterId {@link ResourceRelation} relatedTemplate id
     * @return instance of {@link ResourceRelation}
     * @throws NotFoundException                       if the resource template or parameter is not found
     * @throws ResourceTemplateIsNotPublishedException if resource template has not been published
     * @author Andrii Bren
     */
    private ResourceRelation saveParameterRelation(Long parameterId, Long relatedResourceParameterId)
            throws NotFoundException, ResourceTemplateIsNotPublishedException {
        ResourceRelation resourceRelation = new ResourceRelation();
        resourceRelation.setResourceParameter(findById(parameterId));
        resourceRelation.setRelatedResourceTemplate(verifyIfResourceTemplateIsPublished(resourceTemplateService
                .findEntityById(relatedResourceParameterId)));
        return resourceRelationRepository.save(resourceRelation);
    }

    /**
     * Method verifies if {@link ResourceTemplate} has been published.
     *
     * @param resourceTemplate {@link ResourceTemplate}
     * @return {@link ResourceTemplateDTO} if provided resource template has not been published yet
     * @throws ResourceTemplateIsNotPublishedException if resource template has been already published
     * @author Halyna Yatseniuk
     */
    private ResourceTemplate verifyIfResourceTemplateIsPublished(ResourceTemplate resourceTemplate)
            throws ResourceTemplateIsNotPublishedException {
        if (!resourceTemplate.getIsPublished()) {
            throw new ResourceTemplateIsNotPublishedException(
                    ErrorMessage.RESOURCE_TEMPLATE_CAN_NOT_HAVE_RELATIONS.getMessage());
        }
        return resourceTemplate;
    }

    /**
     * Method finds {@link ResourceParameter} by id.
     *
     * @param id {@link ResourceParameter} id
     * @return instance of {@link ResourceParameter}
     * @throws NotFoundException if the resource parameter with provided id is not found
     * @author Andrii Bren
     */
    public ResourceParameter findById(Long id) throws NotFoundException {
        return resourceParameterRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(
                        ErrorMessage.RESOURCE_PARAMETER_CAN_NOT_BE_FOUND_BY_ID.getMessage() + id));
    }

    /**
     * {@inheritDoc}
     *
     * @author Andrii Bren
     */
    @Override
    public ResourceParameterDTO findByIdDTO(Long id, Long parameterId) throws NotFoundException {
        return modelMapper.map(findById(parameterId),
                ResourceParameterDTO.class);
    }

    /**
     * {@inheritDoc}
     *
     * @author Andrii Bren
     */
    @Override
    public List<ResourceParameterDTO> findAllByTemplateId(Long id) throws NotFoundException {
        List<ResourceParameter> parameterList = resourceParameterRepository
                .findAllByResourceTemplateId(
                        resourceTemplateService.findEntityById(id).getId());
        return modelMapper.map(parameterList,
                new TypeToken<List<ResourceParameterDTO>>() {
                }.getType());
    }

    /**
     * {@inheritDoc}
     *
     * @author Halyna Yatseniuk
     */
    @Override
    @Transactional
    public void checkIfParameterCanBeDeleted(Long templateId, Long parameterId) throws ResourceParameterCanNotBeModified,
            NotDeletedException {
        if (resourceTemplateService.findEntityById(templateId).getIsPublished().equals(false)) {
            deleteById(parameterId);
        } else throw new ResourceParameterCanNotBeModified(
                ErrorMessage.RESOURCE_PARAMETER_CAN_NOT_BE_DELETED.getMessage());
    }

    /**
     * Method deletes {@link ResourceParameter} by id.
     *
     * @param parameterId {@link ResourceParameter} id
     * @throws NotDeletedException if the resource parameter with provided id is not deleted
     * @author Andrii Bren
     */
    public void deleteById(Long parameterId) throws NotDeletedException {
        try {
            resourceParameterRepository.deleteById(parameterId);
        } catch (EmptyResultDataAccessException ex) {
            throw new NotDeletedException(
                    ErrorMessage.RESOURCE_PARAMETER_CAN_NOT_BE_DELETE_BY_ID.getMessage() + parameterId);
        }
    }

    /**
     * Method verifies if {@link ResourceParameter} name is unique for specific {@link ResourceTemplate}.
     *
     * @param name of {@link ResourceParameter}
     * @param id   of {@link ResourceTemplate}
     * @return string of {@link ResourceParameter} name if it is unique
     * @throws NotUniqueNameException if the resource template already has a parameter with provided name
     * @author Halyna Yatseniuk
     */
    private String verifyIfParameterNameIsUniquePerResourceTemplate(String name, Long id)
            throws NotUniqueNameException {
        if (resourceParameterRepository.findByNameAndResourceTemplateId(name, id).isPresent()) {
            throw new NotUniqueNameException(ErrorMessage.RESOURCE_PARAMETER_NAME_IS_NOT_UNIQUE.getMessage());
        }
        return name;
    }

    /**
     * Method verifies if generated {@link ResourceParameter} column name is unique for
     * specific {@link ResourceTemplate}.
     *
     * @param name of {@link ResourceParameter}
     * @param id   of {@link ResourceTemplate}
     * @return string of generated {@link ResourceParameter} column name if it is unique
     * @throws NotUniqueNameException if generated resource parameter column name is not unique
     * @author Halyna Yatseniuk
     */
    private String verifyIfParameterColumnNameIsUniquePerResourceTemplate(String name, Long id)
            throws NotUniqueNameException {
        String generatedColumnName = validator.generateTableOrColumnName(name);
        if (resourceParameterRepository.findByColumnNameAndResourceTemplateId(generatedColumnName, id).isPresent()) {
            throw new NotUniqueNameException(ErrorMessage.RESOURCE_PARAMETER_COLUMN_NAME_IS_NOT_UNIQUE.getMessage());
        }
        return generatedColumnName;
    }
}
