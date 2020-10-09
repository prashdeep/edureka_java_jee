package com.edureka.module6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataObject {

	private List<String> list = new ArrayList<String>();

	private Map<Integer, String> empMap = new HashMap<Integer, String>();
	
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<Integer, String> getEmpMap() {
		return empMap;
	}

	public void setEmpMap(Map<Integer, String> empMap) {
		this.empMap = empMap;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empMap == null) ? 0 : empMap.hashCode());
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof DataObject)) {
			return false;
		}
		DataObject other = (DataObject) obj;
		if (empMap == null) {
			if (other.empMap != null) {
				return false;
			}
		} else if (!empMap.equals(other.empMap)) {
			return false;
		}
		if (list == null) {
			if (other.list != null) {
				return false;
			}
		} else if (!list.equals(other.list)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "DataObject [list=" + list + ", empMap=" + empMap + "]";
	}

	

	
}
