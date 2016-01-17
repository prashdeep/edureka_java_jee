package com.edureka.java_jee.module6;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;


/*
 * 
 *  stored procedure in mysql.
 *  CREATE  PROCEDURE insertIntoEMP(IN name1 VARCHAR(50), IN sal1 INT)
     BEGIN
        insert into emp values (name1, sal1);
     END
 * 
 *   
 */

public class insert_stu 
{
	public static void main(String[] a)throws IOException
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded...");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/STUDENTS","root","welcome");
			System.out.println("Connected to the database");

			System.out.println("data base is connected!!!!");
			CallableStatement calstat=con.prepareCall("{call insertIntoStudent(?,?)}");

			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			Scanner sc = new Scanner (System.in);
			System.out.println("enter your id =>");
			String id=sc.nextLine();
			System.out.println("enter your name =>");
			String name=sc.nextLine();


			calstat.setString(1,id);
			calstat.setString(2,name);

			calstat.execute();
			con.close();
			System.out.println("Your data has been inserted into table.");
		}catch(Exception e){
			System.out.println(e);
		}
	}

}

