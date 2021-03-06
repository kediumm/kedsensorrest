/**
 * Copyright 2017 Miguel Vale Teixeira
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @author: Miguel Vale Teixeira
 * @data: 2017/01/23
 *
 * This source code is intended for educational and illustrative purposes only
 * and is provided AS-IS without warranty of any kind.
 *
 */
package com.kediumm.kedsensorrest.controller.ws.restful;

import java.util.List;

import javax.ejb.Stateless;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.kediumm.kedsensorrest.controller.dao.HeartActivityDAO;
import com.kediumm.kedsensorrest.model.HeartActivity;

/**
 * Restful Web Service for HeartActivity
 *
 */
@Path("/heartactivity")
@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Stateless
public class HeartActivityRestWS {
	
	@Context
	private UriInfo uriInfo;
	
	HeartActivityDAO _heartactivity = HeartActivityDAO.getInstance();
	
	/**
	 * Get all records of HeartActivity 
	 * @return HeartActivity list
	 */
	@GET
	public Response getAll() {
		
		List<HeartActivity> heartactivities = _heartactivity.getAll();
		
		GenericEntity<List<HeartActivity>> list = new GenericEntity<List<HeartActivity>>( heartactivities ) {};
		
		return Response.ok( list ).build();
	}
	
	/**
	 * Get records of HeartActivity by font 
	 * @return HeartActivity list
	 */
	@GET
	@Path("{font}")
	public Response getAll(@PathParam("font") String font) {
		
		List<HeartActivity> heartactivities = _heartactivity.getHeartActivitiesByFont(font);
		
		if ( heartactivities.isEmpty() ) {
			
			throw new NotFoundException();
		}
		
		GenericEntity<List<HeartActivity>> list = new GenericEntity<List<HeartActivity>>( heartactivities ) {};
		
		return Response.ok( list ).build();
	}
	
	/**
	 * Create new HeartActivity record
	 * @param heartActivity
	 * @return
	 */
	@POST
	public Response create(HeartActivity heartActivity) {
	
		if ( heartActivity == null ) {
			
			throw new BadRequestException();
		}
		
		_heartactivity.createHeartActivity(heartActivity);
		
		return Response.ok().build();
	}
	
	/**
	 * Update new HeartActivity record
	 * @param heartActivity
	 * @return
	 */
	@PUT
	public Response update(HeartActivity heartActivity) {
		
		if ( heartActivity == null ) {
			
			throw new BadRequestException();
		}
		
		_heartactivity.updateHeartActivity(heartActivity);
		
		return Response.ok().build();
	}
	
	/**
	 * Delete new HeartActivity record
	 * @param id HeartActivity to delete
	 * @return status of the operation
	 */
	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") Integer heartactivityID) {
		
		HeartActivity heartActivity = _heartactivity.getHeartActivityById(heartactivityID);
		
		if ( heartActivity == null ) {
			
			throw new BadRequestException();
		}
		
		_heartactivity.deleteHeartActivity(heartActivity);
		
		return Response.noContent().build();
	}

}
