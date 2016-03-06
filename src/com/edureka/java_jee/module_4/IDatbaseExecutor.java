package com.edureka.java_jee.module_4;

public interface IDatbaseExecutor{
	
	public static final String TABLE_NAME="USERS";
	
	public abstract int create(Object obj);
	
	public  abstract void update(int id , Object obj);
	
	public  abstract Object[] readAll();
	
	public abstract Object read(int id);
	
	public abstract void delete(int id);
}
