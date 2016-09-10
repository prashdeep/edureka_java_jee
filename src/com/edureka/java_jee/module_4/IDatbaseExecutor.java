package com.edureka.java_jee.module_4;

import java.io.Serializable;

public interface IDatbaseExecutor extends Serializable, Cloneable {
	
	public static final String TABLE_NAME="USERS";
	
	public abstract int create(Object obj);
	
	public  abstract void update(int id , Object obj);
	
	public  abstract Object[] readAll();
	
	public abstract Object read(int id);
	
	public abstract void delete(int id);
}
