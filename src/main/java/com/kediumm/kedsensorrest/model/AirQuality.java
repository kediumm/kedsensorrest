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
@Table(name = "air_quality")
@XmlRootElement
public class AirQuality implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="AIRQUALITY_ID_GENERATOR", sequenceName="seqAirQuality")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AIRQUALITY_ID_GENERATOR")
	@Column(name = "aqlt_id")
	private Integer _id;
	
	@Column(name = "aqlt_date")
	private Timestamp _date;
	
	@Column(name = "aqlt_local")
	private String _local;
	
	@Column(name = "aqlt_origin")
	private String _origin;
	
	@Column(name = "aqlt_indicator")
	private String _indicator;
	
	@Column(name = "aqlt_price")
	private String _price;
	
	
	
	/**
	 * 
	 */
	public AirQuality() {
		
	}
	
	


	/**
	 * @param _id
	 * @param _date
	 * @param _local
	 * @param _origin
	 * @param _indicator
	 * @param _price
	 */
	public AirQuality(Integer _id, Timestamp _date, String _local, String _origin,
			String _indicator, String _price) {

		this._id = _id;
		this._date = _date;
		this._local = _local;
		this._origin = _origin;
		this._indicator = _indicator;
		this._price = _price;
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AirQuality [");
		if (_id != null)
			builder.append("_id=").append(_id).append(", ");
		if (_date != null)
			builder.append("_date=").append(_date).append(", ");
		if (_local != null)
			builder.append("_local=").append(_local).append(", ");
		if (_origin != null)
			builder.append("_origin=").append(_origin).append(", ");
		if (_indicator != null)
			builder.append("_indicator=").append(_indicator).append(", ");
		if (_price != null)
			builder.append("_price=").append(_price);
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
	 * @return the _local
	 */
	public String getLocal() {
		return _local;
	}
	/**
	 * @param _local the _local to set
	 */
	public void setLocal(String _local) {
		this._local = _local;
	}
	/**
	 * @return the _origin
	 */
	public String getOrigin() {
		return _origin;
	}
	/**
	 * @param _origin the _origin to set
	 */
	public void setOrigin(String _origin) {
		this._origin = _origin;
	}
	/**
	 * @return the _indicator
	 */
	public String getIndicator() {
		return _indicator;
	}
	/**
	 * @param _indicator the _indicator to set
	 */
	public void setIndicator(String _indicator) {
		this._indicator = _indicator;
	}
	/**
	 * @return the _price
	 */
	public String getPrice() {
		return _price;
	}
	/**
	 * @param _price the _price to set
	 */
	public void setPrice(String _price) {
		this._price = _price;
	}

}
