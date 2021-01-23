package com.cjc.app.If.master.main.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Country {

	@Id
	private int countryId;
	private String countryName;
	private int countryCode;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "stateId")
	private Set<State> countryState;
	
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	public Set<State> getCountryState() {
		return countryState;
	}
	public void setCountryState(Set<State> countryState) {
		this.countryState = countryState;
	}
	
	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + ", countryCode=" + countryCode
				+ ", countryState=" + countryState + "]";
	}
	
}
