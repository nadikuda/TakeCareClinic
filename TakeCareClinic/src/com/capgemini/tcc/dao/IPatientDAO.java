package com.capgemini.tcc.dao;

import com.capgemini.tcc.bean.PatientBean;
import com.capgemini.tcc.exception.PatientProblemException;

public interface IPatientDAO {
	public abstract int addPatientDetails(PatientBean patient) throws  PatientProblemException; 
		

}
