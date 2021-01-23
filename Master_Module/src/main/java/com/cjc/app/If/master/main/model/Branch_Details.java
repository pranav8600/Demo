package com.cjc.app.If.master.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Branch_Details {

	@Id
	private int branchId;
	private String branchName;
	private	long branchContactNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "branchAddrId")
	private Branch_Address branchAddress;
	
	private String branchType;
	private int branchCode;
	private String branchIFSCCode;
	private String branchEmailId;
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public long getBranchContactNumber() {
		return branchContactNumber;
	}
	public void setBranchContactNumber(long branchContactNumber) {
		this.branchContactNumber = branchContactNumber;
	}
	public Branch_Address getBranchAddress() {
		return branchAddress;
	}
	public void setBranchAddress(Branch_Address branchAddress) {
		this.branchAddress = branchAddress;
	}
	public String getBranchType() {
		return branchType;
	}
	public void setBranchType(String branchType) {
		this.branchType = branchType;
	}
	public int getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}
	public String getBranchIFSCCode() {
		return branchIFSCCode;
	}
	public void setBranchIFSCCode(String branchIFSCCode) {
		this.branchIFSCCode = branchIFSCCode;
	}
	public String getBranchEmailId() {
		return branchEmailId;
	}
	public void setBranchEmailId(String branchEmailId) {
		this.branchEmailId = branchEmailId;
	}
	
	@Override
	public String toString() {
		return "Branch_Details [branchId=" + branchId + ", branchName=" + branchName + ", branchContactNumber="
				+ branchContactNumber + ", branchAddress=" + branchAddress + ", branchType=" + branchType
				+ ", branchCode=" + branchCode + ", branchIFSCCode=" + branchIFSCCode + ", branchEmailId="
				+ branchEmailId + "]";
	}
	
	
}
