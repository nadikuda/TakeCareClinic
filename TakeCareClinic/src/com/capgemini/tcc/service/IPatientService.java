package com.capgemini.tcc.service;

import com.capgemini.tcc.bean.PatientBean;
import com.capgemini.tcc.dao.IPatientDAO;
import com.capgemini.tcc.dao.PatientDAO;
import com.capgemini.tcc.exception.PatientProblemException;

public interface IPatientService {
	public abstract int addPatientDetails(PatientBean patient); 
		
	}


