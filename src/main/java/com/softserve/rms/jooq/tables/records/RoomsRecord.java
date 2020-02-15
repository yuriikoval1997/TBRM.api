/*
 * This file is generated by jOOQ.
 */
package com.softserve.rms.jooq.tables.records;


import com.softserve.rms.jooq.tables.Rooms;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.TableRecordImpl;


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
public class RoomsRecord extends TableRecordImpl<RoomsRecord> implements Record13<Long, String, String, Long, Long, String, Double, Double, Double, String, Integer, Integer, Integer> {

    private static final long serialVersionUID = -443252035;

    /**
     * Setter for <code>public.rooms.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.rooms.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.rooms.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.rooms.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.rooms.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.rooms.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.rooms.resource_template_id</code>.
     */
    public void setResourceTemplateId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.rooms.resource_template_id</code>.
     */
    public Long getResourceTemplateId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>public.rooms.user_id</code>.
     */
    public void setUserId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.rooms.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.rooms.squares</code>.
     */
    public void setSquares(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.rooms.squares</code>.
     */
    public String getSquares() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.rooms.tables</code>.
     */
    public void setTables(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.rooms.tables</code>.
     */
    public Double getTables() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>public.rooms.today_from</code>.
     */
    public void setTodayFrom(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.rooms.today_from</code>.
     */
    public Double getTodayFrom() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>public.rooms.today_to</code>.
     */
    public void setTodayTo(Double value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.rooms.today_to</code>.
     */
    public Double getTodayTo() {
        return (Double) get(8);
    }

    /**
     * Setter for <code>public.rooms.geolocation</code>.
     */
    public void setGeolocation(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.rooms.geolocation</code>.
     */
    public String getGeolocation() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.rooms.mond_from</code>.
     */
    public void setMondFrom(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.rooms.mond_from</code>.
     */
    public Integer getMondFrom() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>public.rooms.mond_to</code>.
     */
    public void setMondTo(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.rooms.mond_to</code>.
     */
    public Integer getMondTo() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>public.rooms.square</code>.
     */
    public void setSquare(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.rooms.square</code>.
     */
    public Integer getSquare() {
        return (Integer) get(12);
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<Long, String, String, Long, Long, String, Double, Double, Double, String, Integer, Integer, Integer> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<Long, String, String, Long, Long, String, Double, Double, Double, String, Integer, Integer, Integer> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Rooms.ROOMS.ID;
    }

    @Override
    public Field<String> field2() {
        return Rooms.ROOMS.NAME;
    }

    @Override
    public Field<String> field3() {
        return Rooms.ROOMS.DESCRIPTION;
    }

    @Override
    public Field<Long> field4() {
        return Rooms.ROOMS.RESOURCE_TEMPLATE_ID;
    }

    @Override
    public Field<Long> field5() {
        return Rooms.ROOMS.USER_ID;
    }

    @Override
    public Field<String> field6() {
        return Rooms.ROOMS.SQUARES;
    }

    @Override
    public Field<Double> field7() {
        return Rooms.ROOMS.TABLES;
    }

    @Override
    public Field<Double> field8() {
        return Rooms.ROOMS.TODAY_FROM;
    }

    @Override
    public Field<Double> field9() {
        return Rooms.ROOMS.TODAY_TO;
    }

    @Override
    public Field<String> field10() {
        return Rooms.ROOMS.GEOLOCATION;
    }

    @Override
    public Field<Integer> field11() {
        return Rooms.ROOMS.MOND_FROM;
    }

    @Override
    public Field<Integer> field12() {
        return Rooms.ROOMS.MOND_TO;
    }

    @Override
    public Field<Integer> field13() {
        return Rooms.ROOMS.SQUARE;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public Long component4() {
        return getResourceTemplateId();
    }

    @Override
    public Long component5() {
        return getUserId();
    }

    @Override
    public String component6() {
        return getSquares();
    }

    @Override
    public Double component7() {
        return getTables();
    }

    @Override
    public Double component8() {
        return getTodayFrom();
    }

    @Override
    public Double component9() {
        return getTodayTo();
    }

    @Override
    public String component10() {
        return getGeolocation();
    }

    @Override
    public Integer component11() {
        return getMondFrom();
    }

    @Override
    public Integer component12() {
        return getMondTo();
    }

    @Override
    public Integer component13() {
        return getSquare();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public Long value4() {
        return getResourceTemplateId();
    }

    @Override
    public Long value5() {
        return getUserId();
    }

    @Override
    public String value6() {
        return getSquares();
    }

    @Override
    public Double value7() {
        return getTables();
    }

    @Override
    public Double value8() {
        return getTodayFrom();
    }

    @Override
    public Double value9() {
        return getTodayTo();
    }

    @Override
    public String value10() {
        return getGeolocation();
    }

    @Override
    public Integer value11() {
        return getMondFrom();
    }

    @Override
    public Integer value12() {
        return getMondTo();
    }

    @Override
    public Integer value13() {
        return getSquare();
    }

    @Override
    public RoomsRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public RoomsRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public RoomsRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public RoomsRecord value4(Long value) {
        setResourceTemplateId(value);
        return this;
    }

    @Override
    public RoomsRecord value5(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public RoomsRecord value6(String value) {
        setSquares(value);
        return this;
    }

    @Override
    public RoomsRecord value7(Double value) {
        setTables(value);
        return this;
    }

    @Override
    public RoomsRecord value8(Double value) {
        setTodayFrom(value);
        return this;
    }

    @Override
    public RoomsRecord value9(Double value) {
        setTodayTo(value);
        return this;
    }

    @Override
    public RoomsRecord value10(String value) {
        setGeolocation(value);
        return this;
    }

    @Override
    public RoomsRecord value11(Integer value) {
        setMondFrom(value);
        return this;
    }

    @Override
    public RoomsRecord value12(Integer value) {
        setMondTo(value);
        return this;
    }

    @Override
    public RoomsRecord value13(Integer value) {
        setSquare(value);
        return this;
    }

    @Override
    public RoomsRecord values(Long value1, String value2, String value3, Long value4, Long value5, String value6, Double value7, Double value8, Double value9, String value10, Integer value11, Integer value12, Integer value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoomsRecord
     */
    public RoomsRecord() {
        super(Rooms.ROOMS);
    }

    /**
     * Create a detached, initialised RoomsRecord
     */
    public RoomsRecord(Long id, String name, String description, Long resourceTemplateId, Long userId, String squares, Double tables, Double todayFrom, Double todayTo, String geolocation, Integer mondFrom, Integer mondTo, Integer square) {
        super(Rooms.ROOMS);

        set(0, id);
        set(1, name);
        set(2, description);
        set(3, resourceTemplateId);
        set(4, userId);
        set(5, squares);
        set(6, tables);
        set(7, todayFrom);
        set(8, todayTo);
        set(9, geolocation);
        set(10, mondFrom);
        set(11, mondTo);
        set(12, square);
    }
}
