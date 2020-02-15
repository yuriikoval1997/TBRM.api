/*
 * This file is generated by jOOQ.
 */
package com.softserve.rms.jooq.tables;


import com.softserve.rms.jooq.Public;
import com.softserve.rms.jooq.tables.records.RoomsRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class Rooms extends TableImpl<RoomsRecord> {

    private static final long serialVersionUID = -1765737708;

    /**
     * The reference instance of <code>public.rooms</code>
     */
    public static final Rooms ROOMS = new Rooms();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoomsRecord> getRecordType() {
        return RoomsRecord.class;
    }

    /**
     * The column <code>public.rooms.id</code>.
     */
    public final TableField<RoomsRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.rooms.name</code>.
     */
    public final TableField<RoomsRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.rooms.description</code>.
     */
    public final TableField<RoomsRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.rooms.resource_template_id</code>.
     */
    public final TableField<RoomsRecord, Long> RESOURCE_TEMPLATE_ID = createField(DSL.name("resource_template_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.rooms.user_id</code>.
     */
    public final TableField<RoomsRecord, Long> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.rooms.squares</code>.
     */
    public final TableField<RoomsRecord, String> SQUARES = createField(DSL.name("squares"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.rooms.tables</code>.
     */
    public final TableField<RoomsRecord, Double> TABLES = createField(DSL.name("tables"), org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.rooms.today_from</code>.
     */
    public final TableField<RoomsRecord, Double> TODAY_FROM = createField(DSL.name("today_from"), org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.rooms.today_to</code>.
     */
    public final TableField<RoomsRecord, Double> TODAY_TO = createField(DSL.name("today_to"), org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.rooms.geolocation</code>.
     */
    public final TableField<RoomsRecord, String> GEOLOCATION = createField(DSL.name("geolocation"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.rooms.mond_from</code>.
     */
    public final TableField<RoomsRecord, Integer> MOND_FROM = createField(DSL.name("mond_from"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.rooms.mond_to</code>.
     */
    public final TableField<RoomsRecord, Integer> MOND_TO = createField(DSL.name("mond_to"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.rooms.square</code>.
     */
    public final TableField<RoomsRecord, Integer> SQUARE = createField(DSL.name("square"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.rooms</code> table reference
     */
    public Rooms() {
        this(DSL.name("rooms"), null);
    }

    /**
     * Create an aliased <code>public.rooms</code> table reference
     */
    public Rooms(String alias) {
        this(DSL.name(alias), ROOMS);
    }

    /**
     * Create an aliased <code>public.rooms</code> table reference
     */
    public Rooms(Name alias) {
        this(alias, ROOMS);
    }

    private Rooms(Name alias, Table<RoomsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Rooms(Name alias, Table<RoomsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Rooms(Table<O> child, ForeignKey<O, RoomsRecord> key) {
        super(child, key, ROOMS);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public Rooms as(String alias) {
        return new Rooms(DSL.name(alias), this);
    }

    @Override
    public Rooms as(Name alias) {
        return new Rooms(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Rooms rename(String name) {
        return new Rooms(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Rooms rename(Name name) {
        return new Rooms(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Long, String, String, Long, Long, String, Double, Double, Double, String, Integer, Integer, Integer> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}
