package com.flipkart.rest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import com.flipkart.controller.*;
import com.flipkart.model.*;

@Path("/item")
public class ItemRest{
@GET
@Path("/item_info")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public String getitemdetails(ItemBean item)
{
	ItemDetails rid = new ItemDetails();
	String res = rid.retrieveItemDetails(item);
	return res;
}
}

//ravindra