package com.edureka.java_jee.module_4;

import java.util.Scanner;

public class DBInterfaceClient {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {

		System.out.println("Enter your implementation class ..");
		Scanner scanner = new Scanner (System.in);
		String choice = scanner.next();
		scanner.close();
		String className = "com.edureka.java_jee.module_4.MySqlExecutorImpl";
		
		switch (choice) {
			case "oracle":
				className = "com.edureka.java_jee.module_4.OracleDatabaseImpl";
				break;
			case "mysql":
				className = "com.edureka.java_jee.module_4.MySqlExecutorImpl";
				break;
				
			case "sybase":
				className = "com.edureka.java_jee.module_4.SybaseDBImpl";
				break;
			default:
				className = "com.edureka.java_jee.module_4.OracleDatabaseImpl";
				break;
		}
				
		IDatbaseExecutor dbInstance = (IDatbaseExecutor) Class.forName(className).newInstance();
		
		dbInstance.create("Pavan");
		
		dbInstance.update(1, "Kiran");
		
		System.out.println(dbInstance.readAll());

		System.out.println(dbInstance.read(1));

		dbInstance.delete(1);
	}
}
