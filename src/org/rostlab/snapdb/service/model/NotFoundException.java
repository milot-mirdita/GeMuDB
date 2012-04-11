package org.rostlab.snapdb.service.model;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

public class NotFoundException extends WebApplicationException {
	private static final long serialVersionUID = 1L;

	public NotFoundException(String message) {
         super(Response.status(404).build());
     }
}