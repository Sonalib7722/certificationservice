package com.sb.certifications.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Certifications {
	@Id
	private String certificationcode;
	private String certificationname;
	private int certcredpoints;
	private int certcost;
	public String getCertificationcode() {
		return certificationcode;
	}
	public void setCertificationcode(String certificationcode) {
		this.certificationcode = certificationcode;
	}
	public String getCertificationname() {
		return certificationname;
	}
	public void setCertificationname(String certificationname) {
		this.certificationname = certificationname;
	}
	public int getCertcredpoints() {
		return certcredpoints;
	}
	public void setCertcredpoints(int certcredpoints) {
		this.certcredpoints = certcredpoints;
	}
	public int getCertcost() {
		return certcost;
	}
	public void setCertcost(int certcost) {
		this.certcost = certcost;
	}
	
	
}
