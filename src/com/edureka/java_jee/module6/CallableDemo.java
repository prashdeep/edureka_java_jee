package com.edureka.java_jee.module6;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class CallableDemo {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/STUDENTS", "root", "welcome");

		CallableStatement cst = con.prepareCall("{call selectEmp4 (?, ?)}");
		try {
			cst.setInt(1, 11);
			cst.registerOutParameter(2, Types.VARCHAR);
			
			cst.execute();
			System.out.println(cst.getString(2));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
	}

}
