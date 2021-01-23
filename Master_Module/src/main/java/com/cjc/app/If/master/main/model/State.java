package com.cjc.app.If.master.main.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class State {

	@Id
	private int stateId;
	private String stateName;
	private int stateCode;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "cityId")
	private Set<City> stateCity;
	
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public int getStateCode() {
		return stateCode;
	}
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	public Set<City> getStateCity() {
		return stateCity;
	}
	public void setStateCity(Set<City> stateCity) {
		this.stateCity = stateCity;
	}
	
	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", stateName=" + stateName + ", stateCode=" + stateCode + ", stateCity="
				+ stateCity + "]";
	}
	
}
