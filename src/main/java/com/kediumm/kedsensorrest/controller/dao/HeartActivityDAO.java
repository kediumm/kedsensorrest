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

import com.kediumm.kedsensorrest.model.HeartActivity;

/**
 * Data Access Object CRUD operations for HeartActivity 
 * 
 *
 */
@XmlRootElement
@XmlSeeAlso(HeartActivity.class)
public class HeartActivityDAO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final HeartActivityDAO instance = new HeartActivityDAO();
	
	private SessionFactory sessionFactory;

	private Session session;
	
	private HeartActivityDAO() {
		
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(HeartActivity.class)
				.buildSessionFactory();

	}
	
	/**
	 * HeartActivityDAO Singleton Pattern 
	 * @return HeartActivityDAO instance
	 */
	public static HeartActivityDAO getInstance() {
		
		return instance;
	}
	
	/**
	 * Get all records of HeartActivity 
	 * @return HeartActivity list
	 */
	@SuppressWarnings("unchecked")
	@XmlElement(name = "AllHeartActivities")
	public List<HeartActivity> getAll() {
		
		try {
			
			session = sessionFactory.getCurrentSession();
			
			session.beginTransaction();
			
			List<HeartActivity> hactivity = session.createQuery("from HeartActivity").getResultList();
			
			session.getTransaction().commit();
			
			return hactivity;
		
		} finally {
			
			session.close();
		}
	}
	
	/**
	 * Get records of HeartActivity by font 
	 * @return HeartActivity list
	 */
	@SuppressWarnings("unchecked")
	@XmlElement(name = "HeartActivitiesByFont")
	public List<HeartActivity> getHeartActivitiesByFont(String font) {
		
		try {
			
			session = sessionFactory.getCurrentSession();
			
			session.beginTransaction();
			
			List<HeartActivity> hactivity = session.createQuery("from HeartActivity h where h._font = '" + font + "'").getResultList();
			
			session.getTransaction().commit();
			
			return hactivity;
		
		} finally {
			
			session.close();
		}
	}
	
	/**
	 * Create new HeartActivity record
	 * 
	 */
	public void createHeartActivity(HeartActivity heartActivity) {
		
		try {
			
			session = sessionFactory.getCurrentSession();
			
			session.beginTransaction();
			
			session.save(heartActivity);
			
			session.getTransaction().commit();
			
		
		} finally {
			
			session.close();
		}
		
	}
}
