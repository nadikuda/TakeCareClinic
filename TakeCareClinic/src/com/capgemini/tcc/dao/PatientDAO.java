package com.capgemini.tcc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.capgemini.tcc.bean.PatientBean;
import com.capgemini.tcc.dbutil.DBUtil;
import com.capgemini.tcc.exception.PatientProblemException;

public class PatientDAO implements IPatientDAO {
	Logger logger = Logger.getAnonymousLogger();
	private Connection conn = null;

	public int addPatientDetails(PatientBean patient) throws PatientProblemException {
		int status = 0;
		try {
			conn = DBUtil.getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement(IQueryMapper.INSERT_QUERY);
			preparedStatement.setString(1, patient.getPatientname());
			preparedStatement.setInt(2, patient.getPatientage());
			preparedStatement.setLong(3, patient.getPatientpnumber());
			preparedStatement.setString(4, patient.getPatientdescription());
			int storedstatus = preparedStatement.executeUpdate(IQueryMapper.INSERT_QUERY);

			if (storedstatus == 1) {
				PreparedStatement preparedstatement = conn.prepareStatement(IQueryMapper.IDVALUE);
				ResultSet rs = preparedstatement.executeQuery();
				rs.next();
				status = rs.getInt(1);
				//logger.info("Inserted data");
			}
		} catch (SQLException e) {
			try {
				throw new PatientProblemException();
			} catch (PatientProblemException e1) {
				logger.info("Exception had occured");
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return status;

	}
}
