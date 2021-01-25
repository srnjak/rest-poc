/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srnjak.junk;

import com.srnjak.junk.boundary.dto.Cat;
import org.eclipse.microprofile.auth.LoginConfig;
import org.eclipse.microprofile.openapi.annotations.Components;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.annotation.security.DeclareRoles;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/resources")
@OpenAPIDefinition(
        info = @Info(title = "My API", version = "0.1"),
        components = @Components(schemas = {
                @Schema(implementation = Cat.class)
        }))
public class RESTConfiguration extends Application {
    
}
