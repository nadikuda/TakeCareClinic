package com.capgemini.tcc.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.tcc.bean.PatientBean;

class PatientDAOTest {
PatientBean patient=new PatientBean();
	@Test
	void testAddPatientDetails(PatientBean patient) {
		patient.setPatientname("giri");
		assertEquals("giri",patient.getPatientname());
		
	}

}
