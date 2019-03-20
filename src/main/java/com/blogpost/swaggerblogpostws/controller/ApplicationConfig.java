package com.blogpost.swaggerblogpostws.controller;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Special-Projects-001 on 20/03/2019.
 */
@ApplicationPath("/api/v1")
public class ApplicationConfig extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        HashSet resources = new HashSet<Class<?>>();
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.blogpost.swaggerblogpostws.controller.UserService.class);
    }
}
