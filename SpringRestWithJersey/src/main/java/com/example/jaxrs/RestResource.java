package com.example.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

@Component
@Path(value="/rest")
public class RestResource {

	@Path(value = "/hello")
	@GET
	@Produces("application/json")
	public String sayHello() {
		return "hello";
	}
}
