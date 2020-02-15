/*
 * This file is generated by jOOQ.
 */
package com.softserve.rms.jooq.tables.pojos;


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
public class Room implements Serializable {

    private static final long serialVersionUID = 1648758083;

    private Long    id;
    private String  name;
    private String  description;
    private Integer number;
    private Integer testint;

    public Room() {}

    public Room(Room value) {
        this.id = value.id;
        this.name = value.name;
        this.description = value.description;
        this.number = value.number;
        this.testint = value.testint;
    }

    public Room(
        Long    id,
        String  name,
        String  description,
        Integer number,
        Integer testint
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.number = number;
        this.testint = testint;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getTestint() {
        return this.testint;
    }

    public void setTestint(Integer testint) {
        this.testint = testint;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Room (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(description);
        sb.append(", ").append(number);
        sb.append(", ").append(testint);

        sb.append(")");
        return sb.toString();
    }
}
