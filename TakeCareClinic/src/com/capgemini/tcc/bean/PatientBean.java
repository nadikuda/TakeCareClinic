package com.capgemini.tcc.bean;

public class PatientBean {
	private  String patientname;
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public int getPatientage() {
		return patientage;
	}
	public void setPatientage(int patientage) {
		this.patientage = patientage;
	}
	public Long getPatientpnumber() {
		return patientpnumber;
	}
	public void setPatientpnumber(Long patientpnumber) {
		this.patientpnumber = patientpnumber;
	}
	public String getPatientdescription() {
		return patientdescription;
	}
	public void setPatientdescription(String patientdescription) {
		this.patientdescription = patientdescription;
	}
	private int patientage;
	private Long patientpnumber;
	private String patientdescription;
	
	public PatientBean(){
}
	PatientBean(String patientname,int patientage,Long patientpnumber,String patientdescription){
		this.patientname=patientname;
		this.patientpnumber=patientpnumber;
		this.patientage=patientage;
		this.patientdescription=patientdescription;
		
		
}
}
