package com.rahul.bootproject.util.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class BootExceptionMapper implements ExceptionMapper<Throwable> {

	@Override
	public Response toResponse(Throwable exception) {
		System.err.println("Inside BootExceptionMapper::toResponse "+exception.getMessage());
		return Response.serverError().entity(exception.getMessage()).build();
	}

}
