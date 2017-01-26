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
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.kediumm.kedsensorrest.controller.dao.TemperatureDAO;
import com.kediumm.kedsensorrest.model.Temperature;

/**
 * Restful Web Service for Temperature 
 * 
 */
@Path("/temperature")
@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Stateless
public class TemperatureRestWS {
	
	@Context
	private UriInfo uriInfo;
	
	TemperatureDAO _temperature = TemperatureDAO.getInstance();
	
	/**
	 * Get all records of Temperature 
	 * @return Temperature list
	 */
	@GET
	public Response getAll() {
		
		List<Temperature> lst_temp = _temperature.getAll(); 
		
		GenericEntity<List<Temperature>> list = new GenericEntity<List<Temperature>>(lst_temp) {};
		
		return Response.ok( list ).build();
	}

}