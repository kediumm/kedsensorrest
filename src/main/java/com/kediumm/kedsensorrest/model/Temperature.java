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
package com.kediumm.kedsensorrest.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 
 *
 */
@Entity
@Table(name = "temperature")
public class Temperature implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="TEMPERATURE_ID_GENERATOR", sequenceName="seqTemperature")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TEMPERATURE_ID_GENERATOR")
	@Column(name = "tmp_id")
	private Integer tmp_id;
	
	@Column(name = "tmp_date")
	private Timestamp tmp_date;
	
	@Column(name = "tmp_local")
	private StringBuilder tmp_local;
	
	@Column(name = "tmp_gps")
	private StringBuilder tmp_gps;
	
	@Column(name = "tmp_temperature")
	private Double tmp_tmperature;
	
	/**
	 * 
	 */
	public Temperature() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	/**
	 * @param tmp_id
	 * @param tmp_date
	 * @param tmp_local
	 * @param tmp_gps
	 * @param tmp_tmperature
	 */
	public Temperature(Integer tmp_id, Timestamp tmp_date, StringBuilder tmp_local, StringBuilder tmp_gps,
			Double tmp_tmperature) {
		super();
		this.tmp_id = tmp_id;
		this.tmp_date = tmp_date;
		this.tmp_local = tmp_local;
		this.tmp_gps = tmp_gps;
		this.tmp_tmperature = tmp_tmperature;
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Temperature [");
		if (tmp_id != null)
			builder.append("tmp_id=").append(tmp_id).append(", ");
		if (tmp_date != null)
			builder.append("tmp_date=").append(tmp_date).append(", ");
		if (tmp_local != null)
			builder.append("tmp_local=").append(tmp_local).append(", ");
		if (tmp_gps != null)
			builder.append("tmp_gps=").append(tmp_gps).append(", ");
		if (tmp_tmperature != null)
			builder.append("tmp_tmperature=").append(tmp_tmperature);
		builder.append("]");
		return builder.toString();
	}




	/**
	 * @return the tmp_id
	 */
	public Integer getTmp_id() {
		return tmp_id;
	}
	/**
	 * @param tmp_id the tmp_id to set
	 */
	public void setTmp_id(Integer tmp_id) {
		this.tmp_id = tmp_id;
	}
	/**
	 * @return the tmp_date
	 */
	public Timestamp getTmp_date() {
		return tmp_date;
	}
	/**
	 * @param tmp_date the tmp_date to set
	 */
	public void setTmp_date(Timestamp tmp_date) {
		this.tmp_date = tmp_date;
	}
	/**
	 * @return the tmp_local
	 */
	public StringBuilder getTmp_local() {
		return tmp_local;
	}
	/**
	 * @param tmp_local the tmp_local to set
	 */
	public void setTmp_local(StringBuilder tmp_local) {
		this.tmp_local = tmp_local;
	}
	/**
	 * @return the tmp_gps
	 */
	public StringBuilder getTmp_gps() {
		return tmp_gps;
	}
	/**
	 * @param tmp_gps the tmp_gps to set
	 */
	public void setTmp_gps(StringBuilder tmp_gps) {
		this.tmp_gps = tmp_gps;
	}
	/**
	 * @return the tmp_tmperature
	 */
	public Double getTmp_tmperature() {
		return tmp_tmperature;
	}
	/**
	 * @param tmp_tmperature the tmp_tmperature to set
	 */
	public void setTmp_tmperature(Double tmp_tmperature) {
		this.tmp_tmperature = tmp_tmperature;
	}
	
	

}
