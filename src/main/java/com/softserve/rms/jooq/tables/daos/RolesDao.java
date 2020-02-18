/*
 * This file is generated by jOOQ.
 */
package com.softserve.rms.jooq.tables.daos;


import com.softserve.rms.jooq.tables.Roles;
import com.softserve.rms.jooq.tables.records.RolesRecord;

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
public class RolesDao extends DAOImpl<RolesRecord, com.softserve.rms.jooq.tables.pojos.Roles, Long> {

    /**
     * Create a new RolesDao without any configuration
     */
    public RolesDao() {
        super(Roles.ROLES, com.softserve.rms.jooq.tables.pojos.Roles.class);
    }

    /**
     * Create a new RolesDao with an attached configuration
     */
    public RolesDao(Configuration configuration) {
        super(Roles.ROLES, com.softserve.rms.jooq.tables.pojos.Roles.class, configuration);
    }

    @Override
    public Long getId(com.softserve.rms.jooq.tables.pojos.Roles object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.softserve.rms.jooq.tables.pojos.Roles> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Roles.ROLES.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.softserve.rms.jooq.tables.pojos.Roles> fetchById(Long... values) {
        return fetch(Roles.ROLES.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.softserve.rms.jooq.tables.pojos.Roles fetchOneById(Long value) {
        return fetchOne(Roles.ROLES.ID, value);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.softserve.rms.jooq.tables.pojos.Roles> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Roles.ROLES.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.softserve.rms.jooq.tables.pojos.Roles> fetchByName(String... values) {
        return fetch(Roles.ROLES.NAME, values);
    }

    /**
     * Fetch a unique record that has <code>name = value</code>
     */
    public com.softserve.rms.jooq.tables.pojos.Roles fetchOneByName(String value) {
        return fetchOne(Roles.ROLES.NAME, value);
    }
}