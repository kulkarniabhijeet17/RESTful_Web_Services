package com.abhijeet.helloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

// http://localhost:8008/Jersey1.xHelloWorld/rest/hello/abhijeet
@Path("/hello")
public class HelloWorldService {
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
		String output = "Hello : " + msg;

		return Response.status(200).entity(output).build();
	}
}