package com.edureka.java_jee.module_4;

public class DBInterfaceClient {
	public static void main(String[] args) {
		IDatbaseExecutor dbInstance  = new SybaseDBImpl();
		dbInstance.create("Pavan");
		dbInstance.update(1, "Kiran");
		System.out.println(dbInstance.readAll());;
		System.out.println(dbInstance.read(1));;
		dbInstance.delete(1);
	}
}
