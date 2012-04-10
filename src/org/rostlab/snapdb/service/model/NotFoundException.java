package org.rostlab.snapdb.service.model;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class NotFoundException extends WebApplicationException {
     public NotFoundException(String message) {
         super(Response.status(404).build());
     }
}