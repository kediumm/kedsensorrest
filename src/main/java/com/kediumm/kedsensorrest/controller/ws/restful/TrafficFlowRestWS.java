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

import com.kediumm.kedsensorrest.controller.dao.TrafficFlowDAO;
import com.kediumm.kedsensorrest.model.TrafficFlow;

/**
 * Restful Web Service for TrafficFlow 
 * 
 */
@Path("/trafficflow")
@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Stateless
public class TrafficFlowRestWS {
	
	@Context
	private UriInfo uriInfo;
	
	TrafficFlowDAO _trafficflow = TrafficFlowDAO.getInstance();
	
	/**
	 * Get all records of TrafficFlow 
	 * @return TrafficFlow list
	 */
	@GET
	public Response getAll() {
		
		List<TrafficFlow> trafficflows = _trafficflow.getAll();
		
		GenericEntity<List<TrafficFlow>> list = new GenericEntity<List<TrafficFlow>>(trafficflows) {};
		
		return Response.ok( list ).build();
	}
	
	/**
	 * Get records of TrafficFlow by local 
	 * @return TrafficFlow list
	 */
	@GET
	@Path("{local}")
	public Response getTrafficFlowByLocal(@PathParam("local") String local) {
		
		List<TrafficFlow> trafficflows = _trafficflow.getTrafficFlowByLocal(local);
		
		if ( trafficflows.isEmpty() ) {
			
			throw new NotFoundException();
		}
		
		GenericEntity<List<TrafficFlow>> list = new GenericEntity<List<TrafficFlow>>(trafficflows) {};
		
		return Response.ok( list ).build();
	}
	
	/**
	 * Create new TrafficFlow record
	 * @param trafficFlow
	 * @return
	 */
	@POST
	public Response create(TrafficFlow trafficFlow) {
		
		if ( trafficFlow == null ) {
			
			throw new BadRequestException();
		}
		
		_trafficflow.createTrafficFlow(trafficFlow);
		
		return Response.ok().build();
	}
	
	/**
	 * Update new TrafficFlow record
	 * @param trafficFlow
	 * @return
	 */
	@PUT
	public Response update(TrafficFlow trafficFlow) {
		
		if ( trafficFlow == null ) {
			
			throw new BadRequestException();
		}
		
		_trafficflow.updateTrafficFlow(trafficFlow);
		
		return Response.ok().build();
	}
	
	/**
	 * Delete new TrafficFlow record
	 * @param id TrafficFlow to delete
	 * @return status of the operation
	 */
	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") Integer trafficflowID) {
		
		TrafficFlow tflow = _trafficflow.getTrafficFlowById(trafficflowID);
		
		if ( tflow == null ) {
			
			throw new BadRequestException();
		}
		
		_trafficflow.deleteTrafficFlow(tflow);
		
		return Response.noContent().build();
	}

}
