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
 * @data: 2017/01/16
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

import com.kediumm.kedsensorrest.model.Temperature;

/**
 * Data Access Object CRUD operations for Temperature
 *
 */
@XmlRootElement
@XmlSeeAlso(Temperature.class)
public class TemperatureDAO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final TemperatureDAO instance = new TemperatureDAO();

	private SessionFactory sessionFactory;

	private Session session;

	private TemperatureDAO() {

		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Temperature.class)
				.buildSessionFactory();

	}

	/**
	 * TemperatureDAO Singleton Pattern 
	 * @return TemperatureDAO instance
	 */
	public static TemperatureDAO getInstance() {

		return instance;
	}

	/**
	 * Get all records of Temperature 
	 * @return Temperature list
	 */
	@SuppressWarnings("unchecked")
	@XmlElement(name = "AllTemperatures")
	public List<Temperature> getAll() {
		
		try {
		
			session = sessionFactory.getCurrentSession();
		
			session.beginTransaction();
		
			List<Temperature> temperatues = session.createQuery("from Temperature").getResultList();
		
			session.getTransaction().commit();
			
			return temperatues;
		
		} finally {
			
			session.close();
		}
		
	}
	
	/**
	 * Get records of Temperature by local 
	 * @return Temperature list
	 */
	@SuppressWarnings("unchecked")
	@XmlElement(name = "TemperaturesByLocal")
	public List<Temperature> getTemperatureByLocal(String local) {
		
		try {
		
			session = sessionFactory.getCurrentSession();
		
			session.beginTransaction();
		
			List<Temperature> temperatues = session.createQuery("from Temperature t where t._local = '" + local + "'").getResultList();
		
			session.getTransaction().commit();
			
			return temperatues;
		
		} finally {
			
			session.close();
		}
		
	}
	
	/**
	 * Get object of Temperature by id
	 * @return Temperature object
	 */
	@XmlElement(name = "TemperatureById")
	public Temperature getTemperatureById(Integer temperatureID) {
		
		try {
			
			Temperature temp = null;
			StringBuilder query = new StringBuilder("from Temperature t where t._id = ").append(temperatureID);
			
			session = sessionFactory.getCurrentSession();
			
			session.beginTransaction();
			
			temp =  (Temperature) session.createQuery( query.toString() ).getSingleResult();
			
			session.getTransaction().commit();
			
			return temp;
		
		} finally {
			
			session.close();
			
		}
	}
	
	/**
	 * Create new Temperature record
	 * 
	 */
	public void createTemperature(Temperature temperature) {
		
		try {
			
			session = sessionFactory.getCurrentSession();
			
			session.beginTransaction();
			
			session.save(temperature);
			
			session.getTransaction().commit();
			
		
		} finally {
			
			session.close();
		}
		
	}
	
	/**
	 * Update Temperature record
	 * 
	 */
	@XmlElement(name = "updateTemperature")
	public void updateTemperature(Temperature temperature) {
		
		try {
			
			session = sessionFactory.getCurrentSession();
			
			session.beginTransaction();
			
			session.update(temperature);
			
			session.getTransaction().commit();
			
		
		} finally {
			
			session.close();
		}
		
	}
	
	/**
	 * Delete Temperature record
	 * 
	 */
	@XmlElement(name = "deleteTemperature")
	public void deleteTemperature(Temperature temperature) {
		
		try {
			
			session = sessionFactory.getCurrentSession();
			
			session.beginTransaction();
			
			session.delete(temperature);
			
			session.getTransaction().commit();
			
		
		} finally {
			
			session.close();
		}
		
	}
	
}
