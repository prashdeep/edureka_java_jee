package com.edureka.java_jee_module5;

public class WrapperExample {
	
	public static void main(String[] args) {
		int i = 10;
		Integer I = new Integer(i);
		Integer integerObj = Integer.valueOf(i);
		
		int intValue = integerObj.intValue();
		
		Integer parsedInteger = Integer.parseInt("3434");
		
		String iStr = "53";
		Integer intFromStr = new Integer(iStr);
		new Integer(Integer.parseInt(iStr));
		Integer int2 = Integer.valueOf(i);
		int2.intValue();
		
		float f = 45;
		Float ft = 45f;
		Float.valueOf(f);
		new Float(f);
		
	}

}
