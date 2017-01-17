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
public class AirQuality implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer aqlt_id;
	private Timestamp aqlt_date;
	private String aqlt_local;
	private String aqlt_origin;
	private String aqlt_indicator;
	private String aqlt_price;
	
	
	
	/**
	 * 
	 */
	public AirQuality() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	/**
	 * @param aqlt_id
	 * @param aqlt_date
	 * @param aqlt_local
	 * @param aqlt_origin
	 * @param aqlt_indicator
	 * @param aqlt_price
	 */
	public AirQuality(Integer aqlt_id, Timestamp aqlt_date, String aqlt_local, String aqlt_origin,
			String aqlt_indicator, String aqlt_price) {
		super();
		this.aqlt_id = aqlt_id;
		this.aqlt_date = aqlt_date;
		this.aqlt_local = aqlt_local;
		this.aqlt_origin = aqlt_origin;
		this.aqlt_indicator = aqlt_indicator;
		this.aqlt_price = aqlt_price;
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AirQuality [");
		if (aqlt_id != null)
			builder.append("aqlt_id=").append(aqlt_id).append(", ");
		if (aqlt_date != null)
			builder.append("aqlt_date=").append(aqlt_date).append(", ");
		if (aqlt_local != null)
			builder.append("aqlt_local=").append(aqlt_local).append(", ");
		if (aqlt_origin != null)
			builder.append("aqlt_origin=").append(aqlt_origin).append(", ");
		if (aqlt_indicator != null)
			builder.append("aqlt_indicator=").append(aqlt_indicator).append(", ");
		if (aqlt_price != null)
			builder.append("aqlt_price=").append(aqlt_price);
		builder.append("]");
		return builder.toString();
	}
	
	
	/**
	 * @return the aqlt_id
	 */
	public Integer getAqlt_id() {
		return aqlt_id;
	}
	/**
	 * @param aqlt_id the aqlt_id to set
	 */
	public void setAqlt_id(Integer aqlt_id) {
		this.aqlt_id = aqlt_id;
	}
	/**
	 * @return the aqlt_date
	 */
	public Timestamp getAqlt_date() {
		return aqlt_date;
	}
	/**
	 * @param aqlt_date the aqlt_date to set
	 */
	public void setAqlt_date(Timestamp aqlt_date) {
		this.aqlt_date = aqlt_date;
	}
	/**
	 * @return the aqlt_local
	 */
	public String getAqlt_local() {
		return aqlt_local;
	}
	/**
	 * @param aqlt_local the aqlt_local to set
	 */
	public void setAqlt_local(String aqlt_local) {
		this.aqlt_local = aqlt_local;
	}
	/**
	 * @return the aqlt_origin
	 */
	public String getAqlt_origin() {
		return aqlt_origin;
	}
	/**
	 * @param aqlt_origin the aqlt_origin to set
	 */
	public void setAqlt_origin(String aqlt_origin) {
		this.aqlt_origin = aqlt_origin;
	}
	/**
	 * @return the aqlt_indicator
	 */
	public String getAqlt_indicator() {
		return aqlt_indicator;
	}
	/**
	 * @param aqlt_indicator the aqlt_indicator to set
	 */
	public void setAqlt_indicator(String aqlt_indicator) {
		this.aqlt_indicator = aqlt_indicator;
	}
	/**
	 * @return the aqlt_price
	 */
	public String getAqlt_price() {
		return aqlt_price;
	}
	/**
	 * @param aqlt_price the aqlt_price to set
	 */
	public void setAqlt_price(String aqlt_price) {
		this.aqlt_price = aqlt_price;
	}
	
	

}
