package com.softserve.rms.entities;

import org.jooq.DataType;
import org.jooq.impl.SQLDataType;

public enum ParameterType {
    POINT_INT("Point", "Integer", SQLDataType.INTEGER),
    POINT_DOUBLE("Point", "Double", SQLDataType.DOUBLE),
    POINT_STRING("Point", "String", SQLDataType.VARCHAR),
    POINT_REFERENCE("Point", "Integer", SQLDataType.INTEGER),
    RANGE_DOUBLE("Range", "Double", SQLDataType.DOUBLE),
    RANGE_INT("Range", "Integer", SQLDataType.INTEGER),
    COORDINATES("Coordinates", "String", SQLDataType.VARCHAR);

    private String name;
    private String type;
    private DataType<?> sqlType;

    ParameterType(String name, String type, DataType<?> sqlType) {
        this.name = name;
        this.type = type;
        this.sqlType = sqlType;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public DataType<?> getSqlType() {
        return sqlType;
    }
}