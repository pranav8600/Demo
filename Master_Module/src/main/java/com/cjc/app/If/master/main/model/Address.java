package com.cjc.app.If.master.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Address {

	@Id
	private int addrId;
	private String addrLocalHouseNo;
	private String addrLocalStreetName;
	private String addrLocalArea;
	private String addrLocalLandmark;
	private String addrLocalTaluka;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "loccityId")
	private City addrLocalCity;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "locstateId")
	private State addrLocalState;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "loccountryId")
	private Country addrLoacalCountry;
	
	private int addrLocalPincode;
	private String addrPermantHouseNo;
	private String addrPermantStreetName;
	private String addrPermantArea;
	private String addrPermantLandmark;
	private String addrPermantTaluka;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "percityId")
	private City addrPermantCity;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "perstateId")
	private State addrPermantState;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "percountryId")
	private Country addrPermantCountry;
	
	private int addrPermantPincode;
	private int addrStatus;
	
	public int getAddrId() {
		return addrId;
	}
	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}
	public String getAddrLocalHouseNo() {
		return addrLocalHouseNo;
	}
	public void setAddrLocalHouseNo(String addrLocalHouseNo) {
		this.addrLocalHouseNo = addrLocalHouseNo;
	}
	public String getAddrLocalStreetName() {
		return addrLocalStreetName;
	}
	public void setAddrLocalStreetName(String addrLocalStreetName) {
		this.addrLocalStreetName = addrLocalStreetName;
	}
	public String getAddrLocalArea() {
		return addrLocalArea;
	}
	public void setAddrLocalArea(String addrLocalArea) {
		this.addrLocalArea = addrLocalArea;
	}
	public String getAddrLocalLandmark() {
		return addrLocalLandmark;
	}
	public void setAddrLocalLandmark(String addrLocalLandmark) {
		this.addrLocalLandmark = addrLocalLandmark;
	}
	public String getAddrLocalTaluka() {
		return addrLocalTaluka;
	}
	public void setAddrLocalTaluka(String addrLocalTaluka) {
		this.addrLocalTaluka = addrLocalTaluka;
	}
	public City getAddrLocalCity() {
		return addrLocalCity;
	}
	public void setAddrLocalCity(City addrLocalCity) {
		this.addrLocalCity = addrLocalCity;
	}
	public State getAddrLocalState() {
		return addrLocalState;
	}
	public void setAddrLocalState(State addrLocalState) {
		this.addrLocalState = addrLocalState;
	}
	public Country getAddrLoacalCountry() {
		return addrLoacalCountry;
	}
	public void setAddrLoacalCountry(Country addrLoacalCountry) {
		this.addrLoacalCountry = addrLoacalCountry;
	}
	public int getAddrLocalPincode() {
		return addrLocalPincode;
	}
	public void setAddrLocalPincode(int addrLocalPincode) {
		this.addrLocalPincode = addrLocalPincode;
	}
	public String getAddrPermantHouseNo() {
		return addrPermantHouseNo;
	}
	public void setAddrPermantHouseNo(String addrPermantHouseNo) {
		this.addrPermantHouseNo = addrPermantHouseNo;
	}
	public String getAddrPermantStreetName() {
		return addrPermantStreetName;
	}
	public void setAddrPermantStreetName(String addrPermantStreetName) {
		this.addrPermantStreetName = addrPermantStreetName;
	}
	public String getAddrPermantArea() {
		return addrPermantArea;
	}
	public void setAddrPermantArea(String addrPermantArea) {
		this.addrPermantArea = addrPermantArea;
	}
	public String getAddrPermantLandmark() {
		return addrPermantLandmark;
	}
	public void setAddrPermantLandmark(String addrPermantLandmark) {
		this.addrPermantLandmark = addrPermantLandmark;
	}
	public String getAddrPermantTaluka() {
		return addrPermantTaluka;
	}
	public void setAddrPermantTaluka(String addrPermantTaluka) {
		this.addrPermantTaluka = addrPermantTaluka;
	}
	public City getAddrPermantCity() {
		return addrPermantCity;
	}
	public void setAddrPermantCity(City addrPermantCity) {
		this.addrPermantCity = addrPermantCity;
	}
	public State getAddrPermantState() {
		return addrPermantState;
	}
	public void setAddrPermantState(State addrPermantState) {
		this.addrPermantState = addrPermantState;
	}
	public Country getAddrPermantCountry() {
		return addrPermantCountry;
	}
	public void setAddrPermantCountry(Country addrPermantCountry) {
		this.addrPermantCountry = addrPermantCountry;
	}
	public int getAddrPermantPincode() {
		return addrPermantPincode;
	}
	public void setAddrPermantPincode(int addrPermantPincode) {
		this.addrPermantPincode = addrPermantPincode;
	}
	public int getAddrStatus() {
		return addrStatus;
	}
	public void setAddrStatus(int addrStatus) {
		this.addrStatus = addrStatus;
	}
	
	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", addrLocalHouseNo=" + addrLocalHouseNo + ", addrLocalStreetName="
				+ addrLocalStreetName + ", addrLocalArea=" + addrLocalArea + ", addrLocalLandmark=" + addrLocalLandmark
				+ ", addrLocalTaluka=" + addrLocalTaluka + ", addrLocalPincode=" + addrLocalPincode
				+ ", addrPermantHouseNo=" + addrPermantHouseNo + ", addrPermantStreetName=" + addrPermantStreetName
				+ ", addrPermantArea=" + addrPermantArea + ", addrPermantLandmark=" + addrPermantLandmark
				+ ", addrPermantTaluka=" + addrPermantTaluka + ", addrPermantPincode=" + addrPermantPincode
				+ ", addrStatus=" + addrStatus + "]";
	}
	
}
