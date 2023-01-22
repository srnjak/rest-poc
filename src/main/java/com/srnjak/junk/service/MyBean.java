package com.srnjak.junk.service;

import jakarta.enterprise.context.RequestScoped;
import jakarta.validation.GroupSequence;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@RequestScoped
@GroupSequence({MyBean.class, Heavy.class})
public class MyBean {

    public String doSomething(
            @NotBlank
            @Size(min = 10, groups = Heavy.class) String param) {

        return "Everything is ok. The input was: '" + param + "'\n";
    }
}
