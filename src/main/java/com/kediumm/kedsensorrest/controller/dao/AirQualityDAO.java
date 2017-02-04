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

import com.kediumm.kedsensorrest.model.AirQuality;


/**
 * Data Access Object CRUD operations for AirQuality 
 *
 */
@XmlRootElement
@XmlSeeAlso(AirQuality.class)
public class AirQualityDAO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final AirQualityDAO instance = new AirQualityDAO();
	
	private SessionFactory sessionFactory;

	private Session session;
	
	private AirQualityDAO() {
		
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(AirQuality.class)
				.buildSessionFactory();

	}
	
	/**
	 * AirQualityDAO Singleton Pattern 
	 * @return AirQualityDAO instance
	 */
	public static AirQualityDAO getInstance() {
		
		return instance;
	}
	
	/**
	 * Get all records of AirQuality 
	 * @return AirQuality list
	 */
	@SuppressWarnings("unchecked")
	@XmlElement(name = "AllAirQualities")
	public List<AirQuality> getAll() {
		
		try {
			session = sessionFactory.getCurrentSession();
			
			session.beginTransaction();
			
			List<AirQuality> airqlt = session.createQuery("from AirQuality").getResultList();
			
			session.getTransaction().commit();
			
			return airqlt;
		
		} finally {
			
			session.close();
		}
	}
	
	/**
	 * Get all records of AirQuality by local
	 * @return AirQuality list
	 */
	@SuppressWarnings("unchecked")
	@XmlElement(name = "AirQualitiesByLocal")
	public List<AirQuality> getAirQualitiesByLocal(String local) {
		
		try {
			session = sessionFactory.getCurrentSession();
			
			session.beginTransaction();
			
			List<AirQuality> airqlt = session.createQuery("from AirQuality a where a._local = '" + local + "'").getResultList();
			
			session.getTransaction().commit();
			
			return airqlt;
		
		} finally {
			
			session.close();
			
		}
	}
	
	/**
	 * Create new AirQuality record
	 * 
	 */
	@XmlElement(name = "createAirQuality")
	public void createAirQuality(AirQuality airQuality) {
		
		try {
			
			session = sessionFactory.getCurrentSession();
			
			session.beginTransaction();
			
			session.save(airQuality);
			
			session.getTransaction().commit();
			
		
		} finally {
			
			session.close();
		}
		
	}
	
	/**
	 * Update AirQuality record
	 * 
	 */
	@XmlElement(name = "updateAirQuality")
	public void updateAirQuality(AirQuality airQuality) {
		
		try {
			
			session = sessionFactory.getCurrentSession();
			
			session.beginTransaction();
			
			session.update(airQuality);
			
			session.getTransaction().commit();
			
		
		} finally {
			
			session.close();
		}
		
	}
	
	
}
