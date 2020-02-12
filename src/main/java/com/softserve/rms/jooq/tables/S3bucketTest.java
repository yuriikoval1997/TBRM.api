/*
 * This file is generated by jOOQ.
 */
package com.softserve.rms.jooq.tables;


import com.softserve.rms.jooq.Indexes;
import com.softserve.rms.jooq.Keys;
import com.softserve.rms.jooq.Public;
import com.softserve.rms.jooq.tables.records.S3bucketTestRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class S3bucketTest extends TableImpl<S3bucketTestRecord> {

    private static final long serialVersionUID = -526456648;

    /**
     * The reference instance of <code>public.s3bucket_test</code>
     */
    public static final S3bucketTest S3BUCKET_TEST = new S3bucketTest();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<S3bucketTestRecord> getRecordType() {
        return S3bucketTestRecord.class;
    }

    /**
     * The column <code>public.s3bucket_test.id</code>.
     */
    public final TableField<S3bucketTestRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('s3bucket_test_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.s3bucket_test.file_name</code>.
     */
    public final TableField<S3bucketTestRecord, String> FILE_NAME = createField(DSL.name("file_name"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.s3bucket_test.resource_name</code>.
     */
    public final TableField<S3bucketTestRecord, String> RESOURCE_NAME = createField(DSL.name("resource_name"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>public.s3bucket_test</code> table reference
     */
    public S3bucketTest() {
        this(DSL.name("s3bucket_test"), null);
    }

    /**
     * Create an aliased <code>public.s3bucket_test</code> table reference
     */
    public S3bucketTest(String alias) {
        this(DSL.name(alias), S3BUCKET_TEST);
    }

    /**
     * Create an aliased <code>public.s3bucket_test</code> table reference
     */
    public S3bucketTest(Name alias) {
        this(alias, S3BUCKET_TEST);
    }

    private S3bucketTest(Name alias, Table<S3bucketTestRecord> aliased) {
        this(alias, aliased, null);
    }

    private S3bucketTest(Name alias, Table<S3bucketTestRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> S3bucketTest(Table<O> child, ForeignKey<O, S3bucketTestRecord> key) {
        super(child, key, S3BUCKET_TEST);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.S3BUCKET_TEST_PKEY);
    }

    @Override
    public Identity<S3bucketTestRecord, Long> getIdentity() {
        return Keys.IDENTITY_S3BUCKET_TEST;
    }

    @Override
    public UniqueKey<S3bucketTestRecord> getPrimaryKey() {
        return Keys.S3BUCKET_TEST_PKEY;
    }

    @Override
    public List<UniqueKey<S3bucketTestRecord>> getKeys() {
        return Arrays.<UniqueKey<S3bucketTestRecord>>asList(Keys.S3BUCKET_TEST_PKEY);
    }

    @Override
    public S3bucketTest as(String alias) {
        return new S3bucketTest(DSL.name(alias), this);
    }

    @Override
    public S3bucketTest as(Name alias) {
        return new S3bucketTest(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public S3bucketTest rename(String name) {
        return new S3bucketTest(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public S3bucketTest rename(Name name) {
        return new S3bucketTest(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
