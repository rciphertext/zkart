//Rest API for registration.

package com.flipkart.rest;

import javax.ws.rs.Consumes;
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
import com.flipkart.model.BuyerBean;

@Path("/registration")
public class RegistrationRest {

	@POST
	@Path("/buyer_registration")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public int buyerRegistration(BuyerBean user)
	{
		BuyerRegistration br = new BuyerRegistration();
		int status = br.saveBuyerInformation(user);
		return status;
	}
}
