package com.cjc.app.If.master.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Branch_Address {

	@Id
	private int branchAddrId;
	private String branchAddrStreetName;
	private String branchAddrArea;
	private String branchAddrLandmark;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cityId")
	private City  branchAddrCity;
	
	private String branchAddrTaluka;
	private String branchAddrDistrict;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "stateId")
	private State branchAddrState;
	
	private int branchAddrPincode;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "countryId")
	private Country branchAddrCountry;
	
	public int getBranchAddrId() {
		return branchAddrId;
	}
	public void setBranchAddrId(int branchAddrId) {
		this.branchAddrId = branchAddrId;
	}
	public String getBranchAddrStreetName() {
		return branchAddrStreetName;
	}
	public void setBranchAddrStreetName(String branchAddrStreetName) {
		this.branchAddrStreetName = branchAddrStreetName;
	}
	public String getBranchAddrArea() {
		return branchAddrArea;
	}
	public void setBranchAddrArea(String branchAddrArea) {
		this.branchAddrArea = branchAddrArea;
	}
	public String getBranchAddrLandmark() {
		return branchAddrLandmark;
	}
	public void setBranchAddrLandmark(String branchAddrLandmark) {
		this.branchAddrLandmark = branchAddrLandmark;
	}
	public City getBranchAddrCity() {
		return branchAddrCity;
	}
	public void setBranchAddrCity(City branchAddrCity) {
		this.branchAddrCity = branchAddrCity;
	}
	public String getBranchAddrTaluka() {
		return branchAddrTaluka;
	}
	public void setBranchAddrTaluka(String branchAddrTaluka) {
		this.branchAddrTaluka = branchAddrTaluka;
	}
	public String getBranchAddrDistrict() {
		return branchAddrDistrict;
	}
	public void setBranchAddrDistrict(String branchAddrDistrict) {
		this.branchAddrDistrict = branchAddrDistrict;
	}
	public State getBranchAddrState() {
		return branchAddrState;
	}
	public void setBranchAddrState(State branchAddrState) {
		this.branchAddrState = branchAddrState;
	}
	public int getBranchAddrPincode() {
		return branchAddrPincode;
	}
	public void setBranchAddrPincode(int branchAddrPincode) {
		this.branchAddrPincode = branchAddrPincode;
	}
	public Country getBranchAddrCountry() {
		return branchAddrCountry;
	}
	public void setBranchAddrCountry(Country branchAddrCountry) {
		this.branchAddrCountry = branchAddrCountry;
	}
	
	@Override
	public String toString() {
		return "Branch_Address [branchAddrId=" + branchAddrId + ", branchAddrStreetName=" + branchAddrStreetName
				+ ", branchAddrArea=" + branchAddrArea + ", branchAddrLandmark=" + branchAddrLandmark
				+ ", branchAddrCity=" + branchAddrCity + ", branchAddrTaluka=" + branchAddrTaluka
				+ ", branchAddrDistrict=" + branchAddrDistrict + ", branchAddrState=" + branchAddrState
				+ ", branchAddrPincode=" + branchAddrPincode + ", branchAddrCountry=" + branchAddrCountry + "]";
	}
	
	
}
