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

@Entity
@Table(name = "traffic_flow")
public class TrafficFlow implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="TRAFFICFLOW_ID_GENERATOR", sequenceName="seqTrafficFlow")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TRAFFICFLOW_ID_GENERATOR")
	@Column(name = "tflw_id")
	private Integer _id;
	
	@Column(name = "tflw_date")
	private Timestamp _date;
	
	@Column(name = "tflw_local")
	private String _local;
	
	@Column(name = "tflw_font")
	private String _font;
	
	@Column(name = "tflw_gps")
	private String _gps;
	
	@Column(name = "tflw_min_car")
	private Double _min_car;
	
	@Column(name = "tflw_foto")
	private String _foto;
	
	@Column(name = "tflw_price")
	private String _price;
	
	
	
	/**
	 * 
	 */
	public TrafficFlow() {
		
	}
	
	/**
	 * @param _id
	 * @param _date
	 * @param _local
	 * @param _font
	 * @param _gps
	 * @param _min_car
	 * @param _foto
	 * @param _price
	 */
	public TrafficFlow(Integer _id, Timestamp _date, String _local, String _font, String _gps,
			Double _min_car, String _foto, String _price) {
		
		this._id = _id;
		this._date = _date;
		this._local = _local;
		this._font = _font;
		this._gps = _gps;
		this._min_car = _min_car;
		this._foto = _foto;
		this._price = _price;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TrafficFlow [");
		if (_id != null)
			builder.append("_id=").append(_id).append(", ");
		if (_date != null)
			builder.append("_date=").append(_date).append(", ");
		if (_local != null)
			builder.append("_local=").append(_local).append(", ");
		if (_font != null)
			builder.append("_font=").append(_font).append(", ");
		if (_gps != null)
			builder.append("_gps=").append(_gps).append(", ");
		if (_min_car != null)
			builder.append("_min_car=").append(_min_car).append(", ");
		if (_foto != null)
			builder.append("_foto=").append(_foto).append(", ");
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
	 * @return the _min_car
	 */
	public Double getMinCar() {
		return _min_car;
	}
	/**
	 * @param _min_car the _min_car to set
	 */
	public void setMinCar(Double _min_car) {
		this._min_car = _min_car;
	}
	/**
	 * @return the _foto
	 */
	public String getFoto() {
		return _foto;
	}
	/**
	 * @param _foto the _foto to set
	 */
	public void setFoto(String _foto) {
		this._foto = _foto;
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
