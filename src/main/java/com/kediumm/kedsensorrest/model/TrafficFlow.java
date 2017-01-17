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
	private Integer tflw_id;
	
	@Column(name = "tflw_date")
	private Timestamp tflw_date;
	
	@Column(name = "tflw_local")
	private String tflw_local;
	
	@Column(name = "tflw_font")
	private String tflw_font;
	
	@Column(name = "tflw_gps")
	private String tflw_gps;
	
	@Column(name = "tflw_min_car")
	private Double tflw_min_car;
	
	@Column(name = "tflw_foto")
	private String tflw_foto;
	
	@Column(name = "tflw_price")
	private String tflw_price;
	
	
	
	/**
	 * 
	 */
	public TrafficFlow() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * @param tflw_id
	 * @param tflw_date
	 * @param tflw_local
	 * @param tflw_font
	 * @param tflw_gps
	 * @param tflw_min_car
	 * @param tflw_foto
	 * @param tflw_price
	 */
	public TrafficFlow(Integer tflw_id, Timestamp tflw_date, String tflw_local, String tflw_font, String tflw_gps,
			Double tflw_min_car, String tflw_foto, String tflw_price) {
		super();
		this.tflw_id = tflw_id;
		this.tflw_date = tflw_date;
		this.tflw_local = tflw_local;
		this.tflw_font = tflw_font;
		this.tflw_gps = tflw_gps;
		this.tflw_min_car = tflw_min_car;
		this.tflw_foto = tflw_foto;
		this.tflw_price = tflw_price;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TrafficFlow [");
		if (tflw_id != null)
			builder.append("tflw_id=").append(tflw_id).append(", ");
		if (tflw_date != null)
			builder.append("tflw_date=").append(tflw_date).append(", ");
		if (tflw_local != null)
			builder.append("tflw_local=").append(tflw_local).append(", ");
		if (tflw_font != null)
			builder.append("tflw_font=").append(tflw_font).append(", ");
		if (tflw_gps != null)
			builder.append("tflw_gps=").append(tflw_gps).append(", ");
		if (tflw_min_car != null)
			builder.append("tflw_min_car=").append(tflw_min_car).append(", ");
		if (tflw_foto != null)
			builder.append("tflw_foto=").append(tflw_foto).append(", ");
		if (tflw_price != null)
			builder.append("tflw_price=").append(tflw_price);
		builder.append("]");
		return builder.toString();
	}



	/**
	 * @return the tflw_id
	 */
	public Integer getTflw_id() {
		return tflw_id;
	}
	/**
	 * @param tflw_id the tflw_id to set
	 */
	public void setTflw_id(Integer tflw_id) {
		this.tflw_id = tflw_id;
	}
	/**
	 * @return the tflw_date
	 */
	public Timestamp getTflw_date() {
		return tflw_date;
	}
	/**
	 * @param tflw_date the tflw_date to set
	 */
	public void setTflw_date(Timestamp tflw_date) {
		this.tflw_date = tflw_date;
	}
	/**
	 * @return the tflw_local
	 */
	public String getTflw_local() {
		return tflw_local;
	}
	/**
	 * @param tflw_local the tflw_local to set
	 */
	public void setTflw_local(String tflw_local) {
		this.tflw_local = tflw_local;
	}
	/**
	 * @return the tflw_font
	 */
	public String getTflw_font() {
		return tflw_font;
	}
	/**
	 * @param tflw_font the tflw_font to set
	 */
	public void setTflw_font(String tflw_font) {
		this.tflw_font = tflw_font;
	}
	/**
	 * @return the tflw_gps
	 */
	public String getTflw_gps() {
		return tflw_gps;
	}
	/**
	 * @param tflw_gps the tflw_gps to set
	 */
	public void setTflw_gps(String tflw_gps) {
		this.tflw_gps = tflw_gps;
	}
	/**
	 * @return the tflw_min_car
	 */
	public Double getTflw_min_car() {
		return tflw_min_car;
	}
	/**
	 * @param tflw_min_car the tflw_min_car to set
	 */
	public void setTflw_min_car(Double tflw_min_car) {
		this.tflw_min_car = tflw_min_car;
	}
	/**
	 * @return the tflw_foto
	 */
	public String getTflw_foto() {
		return tflw_foto;
	}
	/**
	 * @param tflw_foto the tflw_foto to set
	 */
	public void setTflw_foto(String tflw_foto) {
		this.tflw_foto = tflw_foto;
	}
	/**
	 * @return the tflw_price
	 */
	public String getTflw_price() {
		return tflw_price;
	}
	/**
	 * @param tflw_price the tflw_price to set
	 */
	public void setTflw_price(String tflw_price) {
		this.tflw_price = tflw_price;
	}
	
	
	

}
