package com.softserve.rms.service;

import com.softserve.rms.dto.template.ResourceTemplateSaveDTO;
import com.softserve.rms.dto.template.ResourceTemplateDTO;
import com.softserve.rms.entities.ResourceTemplate;
import com.softserve.rms.entities.User;
import com.softserve.rms.exceptions.NotDeletedException;
import com.softserve.rms.exceptions.NotFoundException;
import com.softserve.rms.exceptions.NotUniqueNameException;

import java.util.List;
import java.util.Map;

public interface ResourceTemplateService {
    /**
     * Method creates {@link ResourceTemplate}.
     *
     * @param resourceTemplateSaveDTO {@link ResourceTemplateSaveDTO}
     * @return new {@link ResourceTemplateDTO}
     * @throws NotUniqueNameException if the resource template with provided name exists
     * @author Halyna Yatseniuk
     */
    ResourceTemplateDTO save(ResourceTemplateSaveDTO resourceTemplateSaveDTO);

    /**
     * Method finds {@link ResourceTemplate} by provided id.
     *
     * @param id of {@link ResourceTemplateDTO}
     * @return {@link ResourceTemplateDTO}
     * @throws NotFoundException if the resource template with provided id is not found
     * @author Halyna Yatseniuk
     */
    ResourceTemplateDTO findDTOById(Long id);

    /**
     * Method finds all {@link ResourceTemplate}.
     *
     * @return list of all {@link ResourceTemplateDTO}
     * @author Halyna Yatseniuk
     */
    List<ResourceTemplateDTO> getAll();

    /**
     * Method finds all {@link ResourceTemplate} by user id.
     *
     * @param id of {@link User}
     * @return list of all {@link ResourceTemplateDTO} for a user
     * @author Halyna Yatseniuk
     */
    List<ResourceTemplateDTO> getAllByUserId(Long id);

    /**
     * Method updates {@link ResourceTemplate} by id.
     *
     * @param id   of {@link ResourceTemplateDTO}
     * @param body map containing String key and Object value
     * @return {@link ResourceTemplateDTO}
     * @throws NotFoundException      if the resource template with provided id is not found
     * @throws NotUniqueNameException if the resource template name is not unique
     * @author Halyna Yatseniuk
     */
    ResourceTemplateDTO updateById(Long id, Map<String, Object> body);

    /**
     * Method deletes {@link ResourceTemplate} by id.
     *
     * @param id of {@link ResourceTemplateDTO}
     * @throws NotDeletedException if the resource template with provided id is not deleted
     * @author Halyna Yatseniuk
     */
    void deleteById(Long id);

    /**
     * Method finds all {@link ResourceTemplate} by name or description.
     *
     * @param searchedWord request parameter to search resource templates
     * @return list of {@link ResourceTemplateDTO}
     * @author Halyna Yatseniuk
     */
    List<ResourceTemplateDTO> searchByNameOrDescriptionContaining(String searchedWord);

    /**
     * Method finds  {@link ResourceTemplate} by provided id.
     *
     * @param id of {@link ResourceTemplateDTO}
     * @return {@link ResourceTemplate}
     * @throws NotFoundException if the resource template with provided id is not found
     * @author Halyna Yatseniuk
     */
    ResourceTemplate findEntityById(Long id);

    /**
     * Method verifies which action must be handled - publish or unpublish resource template -
     * by provided boolean value in body.
     *
     * @param id   of {@link ResourceTemplateDTO}
     * @param body map containing String key and Object value
     * @throws NotFoundException if the resource template with provided id is not found
     * @author Halyna Yatseniuk
     */
    void selectPublishOrUnpublishAction(Long id, Map<String, Object> body);
}