package com.edureka.java_jee.module_4;

import java.io.Serializable;

public abstract class MyCustomDB implements IDatbaseExecutor, Serializable, Cloneable{

	@Override
	public int create(Object obj) {
		System.out.println("Implemented the create method on my custom DB");
		return 0;
	}

	@Override
	public void update(int id, Object obj) {
		System.out.println("Implemented the update method on my custom DB");
		
	}

}
