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

import com.kediumm.kedsensorrest.controller.dao.AirQualityDAO;
import com.kediumm.kedsensorrest.model.AirQuality;

/**
 * Restful Web Service for AirQuality 
 * 
 */
@Path("/airquality")
@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Stateless
public class AirQualityRestWS {

	@Context
	private UriInfo uriInfo;
	
	AirQualityDAO _airquality = AirQualityDAO.getInstance();
	
	/**
	 * Get all records of AirQuality 
	 * @return AirQuality list
	 */
	@GET
	public Response getAll() {
		
		List<AirQuality> airqlt = _airquality.getAll();
		
		GenericEntity<List<AirQuality>> list = new GenericEntity<List<AirQuality>>(airqlt) {};
		
		return Response.ok( list ).build();
	}
	
	/**
	 * Get all records of AirQuality by local
	 * @return AirQuality list
	 */
	@GET
	@Path("{local}")
	public Response getAirQualitiesByLocal(@PathParam("local") String local) {
		
		List<AirQuality> airqlt = _airquality.getAirQualitiesByLocal(local);
		
		if ( airqlt.isEmpty() ) {
			
			throw new NotFoundException();
		}
		
		GenericEntity<List<AirQuality>> list = new GenericEntity<List<AirQuality>>(airqlt) {};
		
		return Response.ok( list ).build();
	}
	
	/**
	 * Create new AirQuality record
	 * @param airQuality
	 * @return
	 */
	@POST
	public Response create(AirQuality airQuality) {
		
		//Response response = Response.notModified().build();
		//response.ok().build();
		if ( airQuality == null ) {
			
			throw new BadRequestException();
		}
		
		_airquality.createAirQuality(airQuality);
		
		return Response.ok().build();
	}
	
	/**
	 * Update new AirQuality record
	 * @param airQuality
	 * @return
	 */
	@PUT
	public Response update(AirQuality airQuality) {
		
		if ( airQuality == null ) {
			
			throw new BadRequestException();
		}
		
		_airquality.updateAirQuality(airQuality);
		
		return Response.ok().build();
	}
	
}
