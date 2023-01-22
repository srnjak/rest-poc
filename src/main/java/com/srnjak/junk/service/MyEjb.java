package com.srnjak.junk.service;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.validation.GroupSequence;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@LocalBean
@Stateless
@GroupSequence({MyEjb.class, Heavy.class})
public class MyEjb {

    public String doSomething(
            @NotBlank
            @Size(min = 10, groups = Heavy.class) String param) {

        return "Everything is ok. The input was: '" + param + "'\n";
    }
}
