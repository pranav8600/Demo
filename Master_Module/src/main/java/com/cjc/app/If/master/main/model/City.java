package com.cjc.app.If.master.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {

	@Id
	private int cityId;
	private String cityname;
	private int cityCode;
	
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public int getCityCode() {
		return cityCode;
	}
	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}
	
	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityname=" + cityname + ", cityCode=" + cityCode + "]";
	}
	
}
