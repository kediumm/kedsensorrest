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
 * @data: 2017/01/24
 *
 * This source code is intended for educational and illustrative purposes only
 * and is provided AS-IS without warranty of any kind.
 *
 */
package com.kediumm.kedsensorrest.controller.core;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.eclipse.persistence.jaxb.rs.MOXyJsonProvider;

import com.kediumm.kedsensorrest.controller.ws.restful.AirQualityRestWS;
import com.kediumm.kedsensorrest.controller.ws.restful.HeartActivityRestWS;
import com.kediumm.kedsensorrest.controller.ws.restful.TemperatureRestWS;
import com.kediumm.kedsensorrest.controller.ws.restful.TrafficFlowRestWS;

@ApplicationPath("rs")
public class Library extends Application {
	
	private final Set<Class<?>> classes;
	
	/**
	 * Registers the classes used in the rest application
	 */
    public Library() {
        
    	HashSet<Class<?>> c = new HashSet<>();
    	c.add(AirQualityRestWS.class);
    	c.add(HeartActivityRestWS.class);
    	c.add(TemperatureRestWS.class);
    	c.add(TrafficFlowRestWS.class);
    	c.add(MOXyJsonProvider.class);
    	
    	classes = Collections.unmodifiableSet(c);
    }
    
    @Override
    public Set<Class<?>> getClasses() {
    	return classes;
    }
}
