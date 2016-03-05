package com.edureka.java_jee.module6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataObject {

	private int data1 = 100;
	private String data2 = "hello";
	private List<String> list = new ArrayList<String>() {

		private static final long serialVersionUID = 1L;

		{
			add("Pradeep");
			add("Naveen");
			add("Nitin");
			add("Mithun");
		}
	};

	private Map<Integer, String> empMap = new HashMap<Integer, String>() {
		{
			put(1, "Pradeep");
			put(2, "Praveen");
			put(3, "Ajay");
		}
	};

	@Override
	public String toString() {
		return "DataObject [data1=" + data1 + ", data2=" + data2 + ", list=" + list + ", empMap=" + empMap + "]";
	}

}
