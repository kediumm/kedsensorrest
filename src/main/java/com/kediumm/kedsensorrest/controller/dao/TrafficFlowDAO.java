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
 * @data: 2017/01/21
 *
 * This source code is intended for educational and illustrative purposes only
 * and is provided AS-IS without warranty of any kind.
 *
 */
package com.kediumm.kedsensorrest.controller.dao;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kediumm.kedsensorrest.model.TrafficFlow;

/**
 * Data Access Object CRUD operations for TrafficFlow
 *
 */
@XmlRootElement
@XmlSeeAlso(TrafficFlow.class)
public class TrafficFlowDAO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final TrafficFlowDAO instance = new TrafficFlowDAO();
	
	private SessionFactory sessionFactory;

	private Session session;
	
	private TrafficFlowDAO() {
		
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(TrafficFlow.class)
				.buildSessionFactory();

	}
	
	/**
	 * TrafficFlowDAO Singleton Pattern 
	 * @return TrafficFlowDAO instance
	 */
	public static TrafficFlowDAO getInstance() {
		
		return instance;
	}
	
	/**
	 * Get all records of TrafficFlow 
	 * @return TrafficFlow list
	 */
	@SuppressWarnings("unchecked")
	@XmlElement(name = "AllTrafficFlow")
	public List<TrafficFlow> getAll() {
		
		try {
			
			session = sessionFactory.getCurrentSession();
			
			session.beginTransaction();
			
			List<TrafficFlow> tflows = session.createQuery("from TrafficFlow").getResultList();
			
			session.getTransaction().commit();
			
			return tflows;
		
		} finally {
			
			session.close();
		}
	}
	
	/**
	 * Get records of TrafficFlow by local 
	 * @return TrafficFlow list
	 */
	@SuppressWarnings("unchecked")
	@XmlElement(name = "TrafficFlowByLocal")
	public List<TrafficFlow> getTrafficFlowByLocal(String local) {
		
		try {
			
			session = sessionFactory.getCurrentSession();
			
			session.beginTransaction();
			
			List<TrafficFlow> tflows = session.createQuery("from TrafficFlow f where f._local = '" + local + "'").getResultList();
			
			session.getTransaction().commit();
			
			return tflows;
		
		} finally {
			
			session.close();
		}
	}
	
	/**
	 * Get object of TrafficFlow by id
	 * @return TrafficFlow object
	 */
	@XmlElement(name = "TrafficFlowById")
	public TrafficFlow getTrafficFlowById(Integer trafficflowID) {
		
		try {
			
			TrafficFlow tflow = null;
			StringBuilder query = new StringBuilder("from TrafficFlow f where f._id = ").append(trafficflowID);
			
			session = sessionFactory.getCurrentSession();
			
			session.beginTransaction();
			
			tflow =  (TrafficFlow) session.createQuery( query.toString() ).getSingleResult();
			
			session.getTransaction().commit();
			
			return tflow;
		
		} finally {
			
			session.close();
			
		}
	}
	
	/**
	 * Create new TrafficFlow record
	 * 
	 */
	public void createTrafficFlow(TrafficFlow trafficFlow) {
		
		try {
			
			session = sessionFactory.getCurrentSession();
			
			session.beginTransaction();
			
			session.save(trafficFlow);
			
			session.getTransaction().commit();
			
		
		} finally {
			
			session.close();
		}
		
	}
	
	/**
	 * Update TrafficFlow record
	 * 
	 */
	@XmlElement(name = "updateTrafficFlow")
	public void updateTrafficFlow(TrafficFlow trafficFlow) {
		
		try {
			
			session = sessionFactory.getCurrentSession();
			
			session.beginTransaction();
			
			session.update(trafficFlow);
			
			session.getTransaction().commit();
			
		
		} finally {
			
			session.close();
		}
		
	}
	
	/**
	 * Delete TrafficFlow record
	 * 
	 */
	@XmlElement(name = "deleteTrafficFlow")
	public void deleteTrafficFlow(TrafficFlow trafficFlow) {
		
		try {
			
			session = sessionFactory.getCurrentSession();
			
			session.beginTransaction();
			
			session.delete(trafficFlow);
			
			session.getTransaction().commit();
			
		
		} finally {
			
			session.close();
		}
		
	}

}
