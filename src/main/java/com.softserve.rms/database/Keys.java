/*
 * This file is generated by jOOQ.
 */
package database;


import database.tables.AclClass;
import database.tables.AclEntry;
import database.tables.AclObjectIdentity;
import database.tables.AclSid;
import database.tables.ResourceParameters;
import database.tables.ResourceRelations;
import database.tables.ResourceTemplates;
import database.tables.Roles;
import database.tables.S3bucketTest;
import database.tables.Users;
import database.tables.records.AclClassRecord;
import database.tables.records.AclEntryRecord;
import database.tables.records.AclObjectIdentityRecord;
import database.tables.records.AclSidRecord;
import database.tables.records.ResourceParametersRecord;
import database.tables.records.ResourceRelationsRecord;
import database.tables.records.ResourceTemplatesRecord;
import database.tables.records.RolesRecord;
import database.tables.records.S3bucketTestRecord;
import database.tables.records.UsersRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AclClassRecord, Long> IDENTITY_ACL_CLASS = Identities0.IDENTITY_ACL_CLASS;
    public static final Identity<AclEntryRecord, Long> IDENTITY_ACL_ENTRY = Identities0.IDENTITY_ACL_ENTRY;
    public static final Identity<AclObjectIdentityRecord, Long> IDENTITY_ACL_OBJECT_IDENTITY = Identities0.IDENTITY_ACL_OBJECT_IDENTITY;
    public static final Identity<AclSidRecord, Long> IDENTITY_ACL_SID = Identities0.IDENTITY_ACL_SID;
    public static final Identity<ResourceParametersRecord, Long> IDENTITY_RESOURCE_PARAMETERS = Identities0.IDENTITY_RESOURCE_PARAMETERS;
    public static final Identity<ResourceRelationsRecord, Long> IDENTITY_RESOURCE_RELATIONS = Identities0.IDENTITY_RESOURCE_RELATIONS;
    public static final Identity<ResourceTemplatesRecord, Long> IDENTITY_RESOURCE_TEMPLATES = Identities0.IDENTITY_RESOURCE_TEMPLATES;
    public static final Identity<S3bucketTestRecord, Long> IDENTITY_S3BUCKET_TEST = Identities0.IDENTITY_S3BUCKET_TEST;
    public static final Identity<UsersRecord, Long> IDENTITY_USERS = Identities0.IDENTITY_USERS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AclClassRecord> ACL_CLASS_PKEY = UniqueKeys0.ACL_CLASS_PKEY;
    public static final UniqueKey<AclClassRecord> UNIQUE_UK_2 = UniqueKeys0.UNIQUE_UK_2;
    public static final UniqueKey<AclEntryRecord> ACL_ENTRY_PKEY = UniqueKeys0.ACL_ENTRY_PKEY;
    public static final UniqueKey<AclEntryRecord> UNIQUE_UK_4 = UniqueKeys0.UNIQUE_UK_4;
    public static final UniqueKey<AclObjectIdentityRecord> ACL_OBJECT_IDENTITY_PKEY = UniqueKeys0.ACL_OBJECT_IDENTITY_PKEY;
    public static final UniqueKey<AclObjectIdentityRecord> UNIQUE_UK_3 = UniqueKeys0.UNIQUE_UK_3;
    public static final UniqueKey<AclSidRecord> ACL_SID_PKEY = UniqueKeys0.ACL_SID_PKEY;
    public static final UniqueKey<AclSidRecord> UNIQUE_UK_1 = UniqueKeys0.UNIQUE_UK_1;
    public static final UniqueKey<ResourceParametersRecord> RESOURCE_PARAMETERS_PKEY = UniqueKeys0.RESOURCE_PARAMETERS_PKEY;
    public static final UniqueKey<ResourceRelationsRecord> RESOURCE_RELATIONS_PKEY = UniqueKeys0.RESOURCE_RELATIONS_PKEY;
    public static final UniqueKey<ResourceTemplatesRecord> RESOURCE_TEMPLATES_PKEY = UniqueKeys0.RESOURCE_TEMPLATES_PKEY;
    public static final UniqueKey<ResourceTemplatesRecord> UK_1XX1119BT1OJGJS2LFRYL5PCR = UniqueKeys0.UK_1XX1119BT1OJGJS2LFRYL5PCR;
    public static final UniqueKey<RolesRecord> ROLES_PKEY = UniqueKeys0.ROLES_PKEY;
    public static final UniqueKey<RolesRecord> UNIQUE_UK_5 = UniqueKeys0.UNIQUE_UK_5;
    public static final UniqueKey<S3bucketTestRecord> S3BUCKET_TEST_PKEY = UniqueKeys0.S3BUCKET_TEST_PKEY;
    public static final UniqueKey<UsersRecord> USERS_PKEY = UniqueKeys0.USERS_PKEY;
    public static final UniqueKey<UsersRecord> UK_6DOTKOTT2KJSP8VW4D0M25FB7 = UniqueKeys0.UK_6DOTKOTT2KJSP8VW4D0M25FB7;
    public static final UniqueKey<UsersRecord> UK_DU5V5SR43G5BFNJI4VB8HG5S3 = UniqueKeys0.UK_DU5V5SR43G5BFNJI4VB8HG5S3;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<AclClassRecord, Long> IDENTITY_ACL_CLASS = Internal.createIdentity(AclClass.ACL_CLASS, AclClass.ACL_CLASS.ID);
        public static Identity<AclEntryRecord, Long> IDENTITY_ACL_ENTRY = Internal.createIdentity(AclEntry.ACL_ENTRY, AclEntry.ACL_ENTRY.ID);
        public static Identity<AclObjectIdentityRecord, Long> IDENTITY_ACL_OBJECT_IDENTITY = Internal.createIdentity(AclObjectIdentity.ACL_OBJECT_IDENTITY, AclObjectIdentity.ACL_OBJECT_IDENTITY.ID);
        public static Identity<AclSidRecord, Long> IDENTITY_ACL_SID = Internal.createIdentity(AclSid.ACL_SID, AclSid.ACL_SID.ID);
        public static Identity<ResourceParametersRecord, Long> IDENTITY_RESOURCE_PARAMETERS = Internal.createIdentity(ResourceParameters.RESOURCE_PARAMETERS, ResourceParameters.RESOURCE_PARAMETERS.ID);
        public static Identity<ResourceRelationsRecord, Long> IDENTITY_RESOURCE_RELATIONS = Internal.createIdentity(ResourceRelations.RESOURCE_RELATIONS, ResourceRelations.RESOURCE_RELATIONS.ID);
        public static Identity<ResourceTemplatesRecord, Long> IDENTITY_RESOURCE_TEMPLATES = Internal.createIdentity(ResourceTemplates.RESOURCE_TEMPLATES, ResourceTemplates.RESOURCE_TEMPLATES.ID);
        public static Identity<S3bucketTestRecord, Long> IDENTITY_S3BUCKET_TEST = Internal.createIdentity(S3bucketTest.S3BUCKET_TEST, S3bucketTest.S3BUCKET_TEST.ID);
        public static Identity<UsersRecord, Long> IDENTITY_USERS = Internal.createIdentity(Users.USERS, Users.USERS.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<AclClassRecord> ACL_CLASS_PKEY = Internal.createUniqueKey(AclClass.ACL_CLASS, "acl_class_pkey", AclClass.ACL_CLASS.ID);
        public static final UniqueKey<AclClassRecord> UNIQUE_UK_2 = Internal.createUniqueKey(AclClass.ACL_CLASS, "unique_uk_2", AclClass.ACL_CLASS.CLASS);
        public static final UniqueKey<AclEntryRecord> ACL_ENTRY_PKEY = Internal.createUniqueKey(AclEntry.ACL_ENTRY, "acl_entry_pkey", AclEntry.ACL_ENTRY.ID);
        public static final UniqueKey<AclEntryRecord> UNIQUE_UK_4 = Internal.createUniqueKey(AclEntry.ACL_ENTRY, "unique_uk_4", AclEntry.ACL_ENTRY.ACL_OBJECT_IDENTITY, AclEntry.ACL_ENTRY.ACE_ORDER);
        public static final UniqueKey<AclObjectIdentityRecord> ACL_OBJECT_IDENTITY_PKEY = Internal.createUniqueKey(AclObjectIdentity.ACL_OBJECT_IDENTITY, "acl_object_identity_pkey", AclObjectIdentity.ACL_OBJECT_IDENTITY.ID);
        public static final UniqueKey<AclObjectIdentityRecord> UNIQUE_UK_3 = Internal.createUniqueKey(AclObjectIdentity.ACL_OBJECT_IDENTITY, "unique_uk_3", AclObjectIdentity.ACL_OBJECT_IDENTITY.OBJECT_ID_CLASS, AclObjectIdentity.ACL_OBJECT_IDENTITY.OBJECT_ID_IDENTITY);
        public static final UniqueKey<AclSidRecord> ACL_SID_PKEY = Internal.createUniqueKey(AclSid.ACL_SID, "acl_sid_pkey", AclSid.ACL_SID.ID);
        public static final UniqueKey<AclSidRecord> UNIQUE_UK_1 = Internal.createUniqueKey(AclSid.ACL_SID, "unique_uk_1", AclSid.ACL_SID.SID, AclSid.ACL_SID.PRINCIPAL);
        public static final UniqueKey<ResourceParametersRecord> RESOURCE_PARAMETERS_PKEY = Internal.createUniqueKey(ResourceParameters.RESOURCE_PARAMETERS, "resource_parameters_pkey", ResourceParameters.RESOURCE_PARAMETERS.ID);
        public static final UniqueKey<ResourceRelationsRecord> RESOURCE_RELATIONS_PKEY = Internal.createUniqueKey(ResourceRelations.RESOURCE_RELATIONS, "resource_relations_pkey", ResourceRelations.RESOURCE_RELATIONS.ID);
        public static final UniqueKey<ResourceTemplatesRecord> RESOURCE_TEMPLATES_PKEY = Internal.createUniqueKey(ResourceTemplates.RESOURCE_TEMPLATES, "resource_templates_pkey", ResourceTemplates.RESOURCE_TEMPLATES.ID);
        public static final UniqueKey<ResourceTemplatesRecord> UK_1XX1119BT1OJGJS2LFRYL5PCR = Internal.createUniqueKey(ResourceTemplates.RESOURCE_TEMPLATES, "uk_1xx1119bt1ojgjs2lfryl5pcr", ResourceTemplates.RESOURCE_TEMPLATES.NAME);
        public static final UniqueKey<RolesRecord> ROLES_PKEY = Internal.createUniqueKey(Roles.ROLES, "roles_pkey", Roles.ROLES.ID);
        public static final UniqueKey<RolesRecord> UNIQUE_UK_5 = Internal.createUniqueKey(Roles.ROLES, "unique_uk_5", Roles.ROLES.NAME);
        public static final UniqueKey<S3bucketTestRecord> S3BUCKET_TEST_PKEY = Internal.createUniqueKey(S3bucketTest.S3BUCKET_TEST, "s3bucket_test_pkey", S3bucketTest.S3BUCKET_TEST.ID);
        public static final UniqueKey<UsersRecord> USERS_PKEY = Internal.createUniqueKey(Users.USERS, "users_pkey", Users.USERS.ID);
        public static final UniqueKey<UsersRecord> UK_6DOTKOTT2KJSP8VW4D0M25FB7 = Internal.createUniqueKey(Users.USERS, "uk_6dotkott2kjsp8vw4d0m25fb7", Users.USERS.EMAIL);
        public static final UniqueKey<UsersRecord> UK_DU5V5SR43G5BFNJI4VB8HG5S3 = Internal.createUniqueKey(Users.USERS, "uk_du5v5sr43g5bfnji4vb8hg5s3", Users.USERS.PHONE);
    }
}
