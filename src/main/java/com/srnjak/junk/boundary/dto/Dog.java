package com.srnjak.junk.boundary.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema
public class Dog extends Pet {

    private String dogProperty;

    public String getDogProperty() {
        return dogProperty;
    }

    public void setDogProperty(String dogProperty) {
        this.dogProperty = dogProperty;
    }
}
