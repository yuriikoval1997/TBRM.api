/*
 * This file is generated by jOOQ.
 */
package database.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ResourceParameters implements Serializable {

    private static final long serialVersionUID = -1886998025;

    private Long   id;
    private String columnName;
    private String name;
    private String fieldType;
    private String pattern;
    private Long   resourceTemplateId;

    public ResourceParameters() {}

    public ResourceParameters(ResourceParameters value) {
        this.id = value.id;
        this.columnName = value.columnName;
        this.name = value.name;
        this.fieldType = value.fieldType;
        this.pattern = value.pattern;
        this.resourceTemplateId = value.resourceTemplateId;
    }

    public ResourceParameters(
        Long   id,
        String columnName,
        String name,
        String fieldType,
        String pattern,
        Long   resourceTemplateId
    ) {
        this.id = id;
        this.columnName = columnName;
        this.name = name;
        this.fieldType = fieldType;
        this.pattern = pattern;
        this.resourceTemplateId = resourceTemplateId;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColumnName() {
        return this.columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFieldType() {
        return this.fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getPattern() {
        return this.pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public Long getResourceTemplateId() {
        return this.resourceTemplateId;
    }

    public void setResourceTemplateId(Long resourceTemplateId) {
        this.resourceTemplateId = resourceTemplateId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ResourceParameters (");

        sb.append(id);
        sb.append(", ").append(columnName);
        sb.append(", ").append(name);
        sb.append(", ").append(fieldType);
        sb.append(", ").append(pattern);
        sb.append(", ").append(resourceTemplateId);

        sb.append(")");
        return sb.toString();
    }
}
