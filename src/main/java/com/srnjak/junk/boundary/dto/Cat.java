package com.srnjak.junk.boundary.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema
public class Cat extends Pet {

    private String catProperty;

    public String getCatProperty() {
        return catProperty;
    }

    public void setCatProperty(String catProperty) {
        this.catProperty = catProperty;
    }
}
