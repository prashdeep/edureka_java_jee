package com.edureka.java_jee_module5;

public class WrapperExample {
	
	public static void main(String[] args) {
		int i = 10;
		Integer I = new Integer(i);
		System.out.println(i);
		
		String iStr = "53";
		new Integer(Integer.parseInt(iStr));
		
		float f = 45;
		Float ft = 45f;
		Float.valueOf(f);
		new Float(f);
		
	}

}
