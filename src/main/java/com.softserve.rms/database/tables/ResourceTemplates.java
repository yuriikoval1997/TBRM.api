/*
 * This file is generated by jOOQ.
 */
package database.tables;


import database.Indexes;
import database.Keys;
import database.Public;
import database.tables.records.ResourceTemplatesRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class ResourceTemplates extends TableImpl<ResourceTemplatesRecord> {

    private static final long serialVersionUID = -1732784315;

    /**
     * The reference instance of <code>public.resource_templates</code>
     */
    public static final ResourceTemplates RESOURCE_TEMPLATES = new ResourceTemplates();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ResourceTemplatesRecord> getRecordType() {
        return ResourceTemplatesRecord.class;
    }

    /**
     * The column <code>public.resource_templates.id</code>.
     */
    public final TableField<ResourceTemplatesRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('resource_templates_id_seq1'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.resource_templates.description</code>.
     */
    public final TableField<ResourceTemplatesRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.resource_templates.is_published</code>.
     */
    public final TableField<ResourceTemplatesRecord, Boolean> IS_PUBLISHED = createField(DSL.name("is_published"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.resource_templates.name</code>.
     */
    public final TableField<ResourceTemplatesRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.resource_templates.table_name</code>.
     */
    public final TableField<ResourceTemplatesRecord, String> TABLE_NAME = createField(DSL.name("table_name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.resource_templates.creator_id</code>.
     */
    public final TableField<ResourceTemplatesRecord, Long> CREATOR_ID = createField(DSL.name("creator_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.resource_templates</code> table reference
     */
    public ResourceTemplates() {
        this(DSL.name("resource_templates"), null);
    }

    /**
     * Create an aliased <code>public.resource_templates</code> table reference
     */
    public ResourceTemplates(String alias) {
        this(DSL.name(alias), RESOURCE_TEMPLATES);
    }

    /**
     * Create an aliased <code>public.resource_templates</code> table reference
     */
    public ResourceTemplates(Name alias) {
        this(alias, RESOURCE_TEMPLATES);
    }

    private ResourceTemplates(Name alias, Table<ResourceTemplatesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ResourceTemplates(Name alias, Table<ResourceTemplatesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ResourceTemplates(Table<O> child, ForeignKey<O, ResourceTemplatesRecord> key) {
        super(child, key, RESOURCE_TEMPLATES);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.RESOURCE_TEMPLATES_PKEY, Indexes.UK_1XX1119BT1OJGJS2LFRYL5PCR);
    }

    @Override
    public Identity<ResourceTemplatesRecord, Long> getIdentity() {
        return Keys.IDENTITY_RESOURCE_TEMPLATES;
    }

    @Override
    public UniqueKey<ResourceTemplatesRecord> getPrimaryKey() {
        return Keys.RESOURCE_TEMPLATES_PKEY;
    }

    @Override
    public List<UniqueKey<ResourceTemplatesRecord>> getKeys() {
        return Arrays.<UniqueKey<ResourceTemplatesRecord>>asList(Keys.RESOURCE_TEMPLATES_PKEY, Keys.UK_1XX1119BT1OJGJS2LFRYL5PCR);
    }

    @Override
    public ResourceTemplates as(String alias) {
        return new ResourceTemplates(DSL.name(alias), this);
    }

    @Override
    public ResourceTemplates as(Name alias) {
        return new ResourceTemplates(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ResourceTemplates rename(String name) {
        return new ResourceTemplates(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ResourceTemplates rename(Name name) {
        return new ResourceTemplates(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, Boolean, String, String, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}