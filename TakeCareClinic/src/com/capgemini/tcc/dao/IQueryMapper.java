package com.capgemini.tcc.dao;

public interface IQueryMapper {
	public static String INSERT_QUERY="insert into patient values(seq_seq.NEXTVAL,?,?,?,?,SYSDATE)";
	public static final String IDVALUE="SELECT patientid_seq.currval FROM DUAL";

}
