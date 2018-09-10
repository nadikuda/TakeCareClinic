package com.capgemini.tcc.ui;

import java.util.Scanner;

import com.capgemini.tcc.bean.PatientBean;
import com.capgemini.tcc.exception.PatientProblemException;
import com.capgemini.tcc.service.IPatientService;
import com.capgemini.tcc.service.PatientService;

public class Client {
	
	public static void main(String[] args) {
		//PatientService service=new PatientService() ;
		
		System.out.println("****Menu******");
		System.out.println("1.Add Patient Information");
		System.out.println("2.Exit");
		System.out.println("Please choose option");
		Scanner scanner=new Scanner(System.in);
		int choice=scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter the name of the Patient:");
			String patientname=scanner.next();
			
			System.out.println("Enter the Patient Age:");
			int patientage=scanner.nextInt();
			
			
			System.out.println("Enter Patient phone number:");
			Long patientphonenumber=scanner.nextLong();
			
			System.out.println("Enter Patient Description");
			String description=scanner.next();
			
			 PatientBean patientbean=new PatientBean();
			 
			patientbean.setPatientname(patientname);
			patientbean.setPatientage(patientage);
			patientbean.setPatientpnumber(patientphonenumber);
			patientbean.setPatientdescription(description);
			
			int status=0;
			try {
				status=new Client().addPatient(patientbean);
			System.out.println("Patient details are Added successfully for:"+status);
			}catch(PatientProblemException d) {
				//logger.err("Problem with exception");
			}
			break;
		case 2:
			System.exit(0);
		default:
			System.out.println("Please choose correct option---Thank you");
		}
    scanner.close();
	}
	IPatientService service=null;
	
		public int addPatient(PatientBean patient) throws PatientProblemException{
			service=new PatientService();
			return service.addPatientDetails(patient);
		}
		
	}
	


