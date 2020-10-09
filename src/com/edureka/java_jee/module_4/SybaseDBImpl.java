package com.edureka.java_jee.module_4;

public class SybaseDBImpl implements IDatbaseExecutor {

	@Override
	public int create(Object obj) {
		System.out.println("Storing the"+ obj+" in Sybase database..");
		return (int)Math.random();
	}

	@Override
	public void update(int id, Object obj) {
		System.out.println("Updating the"+ obj+" for id > "+id+" in Sybase database..");
	}

	@Override
	public Object[] readAll() {
		return new Object[]{"Pradeep", "Praveen", "Arjun", "Sriharsha"};
	}

	@Override
	public Object read(int id) {
		if(id ==1){
			return "Pradeep";
		}else if (id==2){
			return "Praveen";
		}
		return null;
	}

	@Override
	public void delete(int id) {
		System.out.println("Deleting the Object from the Sybase database ");
		
	}

}
