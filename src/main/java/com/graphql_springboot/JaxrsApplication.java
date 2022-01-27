package com.graphql_springboot;


import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@Component
@ApplicationPath("/api")
public class JaxrsApplication extends Application {


    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();

        //json config
       // classes.add(JacksonObjectResolver.class);

        registerApis(classes);

        return classes;
    }

    @Override
    public Set<Object> getSingletons() {

        Set<Object> singletons = new HashSet<>();

        //filters


        //exception mappers



        return singletons;
    }

    private void registerApis(Set<Class<?>> classes) {

    }

}