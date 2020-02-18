/*
 * This file is generated by jOOQ.
 */
package com.softserve.rms.jooq;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>public.acl_class_id_seq</code>
     */
    public static final Sequence<Long> ACL_CLASS_ID_SEQ = new SequenceImpl<Long>("acl_class_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.acl_entry_id_seq</code>
     */
    public static final Sequence<Long> ACL_ENTRY_ID_SEQ = new SequenceImpl<Long>("acl_entry_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.acl_object_identity_id_seq</code>
     */
    public static final Sequence<Long> ACL_OBJECT_IDENTITY_ID_SEQ = new SequenceImpl<Long>("acl_object_identity_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.acl_sid_id_seq</code>
     */
    public static final Sequence<Long> ACL_SID_ID_SEQ = new SequenceImpl<Long>("acl_sid_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.resource_parameters_id_seq</code>
     */
    public static final Sequence<Long> RESOURCE_PARAMETERS_ID_SEQ = new SequenceImpl<Long>("resource_parameters_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.resource_relations_id_seq</code>
     */
    public static final Sequence<Long> RESOURCE_RELATIONS_ID_SEQ = new SequenceImpl<Long>("resource_relations_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.resource_templates_id_seq</code>
     */
    public static final Sequence<Long> RESOURCE_TEMPLATES_ID_SEQ = new SequenceImpl<Long>("resource_templates_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.s3bucket_test_id_seq</code>
     */
    public static final Sequence<Long> S3BUCKET_TEST_ID_SEQ = new SequenceImpl<Long>("s3bucket_test_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.users_id_seq</code>
     */
    public static final Sequence<Long> USERS_ID_SEQ = new SequenceImpl<Long>("users_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}