package org.rostlab.gemudb.service.model;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

public class BadRequestException extends WebApplicationException {
	private static final long serialVersionUID = 1L;

	public BadRequestException() {
         super(Response.status(400).build());
     }
}