package com.example.jaxrs;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig 
{
    public JerseyConfig() {
        register(RestResource.class);
    }
}