package com.srnjak.junk.boundary.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(oneOf = {Dog.class/*, Cat.class*/})
public class Pet {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
