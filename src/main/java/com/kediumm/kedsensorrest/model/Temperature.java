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
 * Temperature Entity
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
	@SequenceGenerator(name = "TEMPERATURE_ID_GENERATOR", sequenceName = "seqtemperature")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TEMPERATURE_ID_GENERATOR")
	@Column(name = "tmp_id")
	private Integer _id;

	@Column(name = "tmp_date")
	private Timestamp _date;

	@Column(name = "tmp_local")
	private String _local;

	@Column(name = "tmp_gps")
	private String _gps;

	@Column(name = "tmp_temperature")
	private Double _temperature;

	/**
	 * 
	 */
	public Temperature() {

	}

	/**
	 * @param _id
	 * @param _date
	 * @param _local
	 * @param _gps
	 * @param _tmperature
	 */
	public Temperature(Integer _id, Timestamp _date, String _local, String _gps, Double _temperature) {

		this._id = _id;
		this._date = _date;
		this._local = _local;
		this._gps = _gps;
		this._temperature = _temperature;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Temperature [" + (_id != null ? "_id=" + _id + ", " : "")
				+ (_date != null ? "_date=" + _date + ", " : "") + (_local != null ? "_local=" + _local + ", " : "")
				+ (_gps != null ? "_gps=" + _gps + ", " : "")
				+ (_temperature != null ? "_temperature=" + _temperature : "") + "]";
	}

	/**
	 * @return the _id
	 */
	public Integer getId() {
		return _id;
	}

	/**
	 * @param _id
	 *            the _id to set
	 */
	public void setId(Integer _id) {
		this._id = _id;
	}

	/**
	 * @return the _date
	 */
	public Timestamp getDate() {
		return _date;
	}

	/**
	 * @param _date
	 *            the _date to set
	 */
	public void setDate(Timestamp _date) {
		this._date = _date;
	}

	/**
	 * @return the _local
	 */
	public String getLocal() {
		return _local;
	}

	/**
	 * @param _local
	 *            the _local to set
	 */
	public void setLocal(String _local) {
		this._local = _local;
	}

	/**
	 * @return the _gps
	 */
	public String getGps() {
		return _gps;
	}

	/**
	 * @param _gps
	 *            the _gps to set
	 */
	public void setGps(String _gps) {
		this._gps = _gps;
	}

	/**
	 * @return the _temperature
	 */
	public Double getTemperature() {
		return _temperature;
	}

	/**
	 * @param _temperature
	 *            the _temperature to set
	 */
	public void setTemperature(Double _temperature) {
		this._temperature = _temperature;
	}

}
