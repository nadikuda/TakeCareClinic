package com.capgemini.tcc.service;

import com.capgemini.tcc.bean.PatientBean;
import com.capgemini.tcc.dao.IPatientDAO;
import com.capgemini.tcc.dao.PatientDAO;
import com.capgemini.tcc.exception.PatientProblemException;

public class PatientService implements IPatientService{
	IPatientDAO patientdao=null;
	
	public int addPatientDetails(PatientBean patient){  
		patientdao=new PatientDAO();
	
			try {
				return patientdao.addPatientDetails(patient);
			} catch (PatientProblemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return 0;
		
		}
	}
	


