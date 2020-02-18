/*
 * This file is generated by jOOQ.
 */
package database.tables.daos;


import database.tables.AclSid;
import database.tables.records.AclSidRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class AclSidDao extends DAOImpl<AclSidRecord, database.tables.pojos.AclSid, Long> {

    /**
     * Create a new AclSidDao without any configuration
     */
    public AclSidDao() {
        super(AclSid.ACL_SID, database.tables.pojos.AclSid.class);
    }

    /**
     * Create a new AclSidDao with an attached configuration
     */
    public AclSidDao(Configuration configuration) {
        super(AclSid.ACL_SID, database.tables.pojos.AclSid.class, configuration);
    }

    @Override
    public Long getId(database.tables.pojos.AclSid object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<database.tables.pojos.AclSid> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(AclSid.ACL_SID.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<database.tables.pojos.AclSid> fetchById(Long... values) {
        return fetch(AclSid.ACL_SID.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public database.tables.pojos.AclSid fetchOneById(Long value) {
        return fetchOne(AclSid.ACL_SID.ID, value);
    }

    /**
     * Fetch records that have <code>principal BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<database.tables.pojos.AclSid> fetchRangeOfPrincipal(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(AclSid.ACL_SID.PRINCIPAL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>principal IN (values)</code>
     */
    public List<database.tables.pojos.AclSid> fetchByPrincipal(Boolean... values) {
        return fetch(AclSid.ACL_SID.PRINCIPAL, values);
    }

    /**
     * Fetch records that have <code>sid BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<database.tables.pojos.AclSid> fetchRangeOfSid(String lowerInclusive, String upperInclusive) {
        return fetchRange(AclSid.ACL_SID.SID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>sid IN (values)</code>
     */
    public List<database.tables.pojos.AclSid> fetchBySid(String... values) {
        return fetch(AclSid.ACL_SID.SID, values);
    }
}