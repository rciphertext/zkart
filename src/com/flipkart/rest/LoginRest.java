//Rest API for login.

package com.flipkart.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import com.flipkart.controller.*;
import com.flipkart.model.LoginBean;

@Path("/login")
public class LoginRest {
	
	@POST
	@Path("/login_credential")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String loginCredentials(LoginBean user)
	{
		Login login = new Login();
		String status = login.retrieveLoginCredential(user);
		return status;
	}
	
}