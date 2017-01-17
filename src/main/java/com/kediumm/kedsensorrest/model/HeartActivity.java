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

/**
 * 
 *
 */
public class HeartActivity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer hact_id;
	private Timestamp hact_date;
	private String hact_font;
	private String hact_gps;
	private Double hact_heartbeats;
	
	/**
	 * 
	 */
	public HeartActivity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param hact_id
	 * @param hact_date
	 * @param hact_font
	 * @param hact_gps
	 * @param hact_heartbeats
	 */
	public HeartActivity(Integer hact_id, Timestamp hact_date, String hact_font, String hact_gps,
			Double hact_heartbeats) {
		super();
		this.hact_id = hact_id;
		this.hact_date = hact_date;
		this.hact_font = hact_font;
		this.hact_gps = hact_gps;
		this.hact_heartbeats = hact_heartbeats;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HeartActivity [");
		if (hact_id != null)
			builder.append("hact_id=").append(hact_id).append(", ");
		if (hact_date != null)
			builder.append("hact_date=").append(hact_date).append(", ");
		if (hact_font != null)
			builder.append("hact_font=").append(hact_font).append(", ");
		if (hact_gps != null)
			builder.append("hact_gps=").append(hact_gps).append(", ");
		if (hact_heartbeats != null)
			builder.append("hact_heartbeats=").append(hact_heartbeats);
		builder.append("]");
		return builder.toString();
	}


	/**
	 * @return the hact_id
	 */
	public Integer getHact_id() {
		return hact_id;
	}
	/**
	 * @param hact_id the hact_id to set
	 */
	public void setHact_id(Integer hact_id) {
		this.hact_id = hact_id;
	}
	/**
	 * @return the hact_date
	 */
	public Timestamp getHact_date() {
		return hact_date;
	}
	/**
	 * @param hact_date the hact_date to set
	 */
	public void setHact_date(Timestamp hact_date) {
		this.hact_date = hact_date;
	}
	/**
	 * @return the hact_font
	 */
	public String getHact_font() {
		return hact_font;
	}
	/**
	 * @param hact_font the hact_font to set
	 */
	public void setHact_font(String hact_font) {
		this.hact_font = hact_font;
	}
	/**
	 * @return the hact_gps
	 */
	public String getHact_gps() {
		return hact_gps;
	}
	/**
	 * @param hact_gps the hact_gps to set
	 */
	public void setHact_gps(String hact_gps) {
		this.hact_gps = hact_gps;
	}
	/**
	 * @return the hact_heartbeats
	 */
	public Double getHact_heartbeats() {
		return hact_heartbeats;
	}
	/**
	 * @param hact_heartbeats the hact_heartbeats to set
	 */
	public void setHact_heartbeats(Double hact_heartbeats) {
		this.hact_heartbeats = hact_heartbeats;
	}
	
	
	

}
