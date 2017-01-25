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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *  
 *
 */
@Entity
@Table(name = "heart_activity")
@XmlRootElement
public class HeartActivity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="HEARTACTIVITY_ID_GENERATOR", sequenceName="seqHeartActivity")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HEARTACTIVITY_ID_GENERATOR")
	@Column(name = "hact_id")
	private Integer _id;
	
	@Column(name = "hact_date")
	private Timestamp _date;
	
	@Column(name = "hact_font")
	private String _font;
	
	@Column(name = "hact_gps")
	private String _gps;
	
	@Column(name = "hact_heartbeats")
	private Double _heartbeats;
	
	/**
	 * 
	 */
	public HeartActivity() {
		
	}
	
	
	/**
	 * @param _id
	 * @param _date
	 * @param _font
	 * @param _gps
	 * @param _heartbeats
	 */
	public HeartActivity(Integer _id, Timestamp _date, String _font, String _gps,
			Double _heartbeats) {
		
		this._id = _id;
		this._date = _date;
		this._font = _font;
		this._gps = _gps;
		this._heartbeats = _heartbeats;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HeartActivity [");
		if (_id != null)
			builder.append("_id=").append(_id).append(", ");
		if (_date != null)
			builder.append("_date=").append(_date).append(", ");
		if (_font != null)
			builder.append("_font=").append(_font).append(", ");
		if (_gps != null)
			builder.append("_gps=").append(_gps).append(", ");
		if (_heartbeats != null)
			builder.append("_heartbeats=").append(_heartbeats);
		builder.append("]");
		return builder.toString();
	}


	/**
	 * @return the _id
	 */
	public Integer getId() {
		return _id;
	}
	/**
	 * @param _id the _id to set
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
	 * @param _date the _date to set
	 */
	public void setDate(Timestamp _date) {
		this._date = _date;
	}
	/**
	 * @return the _font
	 */
	public String getFont() {
		return _font;
	}
	/**
	 * @param _font the _font to set
	 */
	public void setFont(String _font) {
		this._font = _font;
	}
	/**
	 * @return the _gps
	 */
	public String getGps() {
		return _gps;
	}
	/**
	 * @param _gps the _gps to set
	 */
	public void setGps(String _gps) {
		this._gps = _gps;
	}
	/**
	 * @return the _heartbeats
	 */
	public Double getHeartbeats() {
		return _heartbeats;
	}
	/**
	 * @param _heartbeats the _heartbeats to set
	 */
	public void setHeartbeats(Double _heartbeats) {
		this._heartbeats = _heartbeats;
	}

}
