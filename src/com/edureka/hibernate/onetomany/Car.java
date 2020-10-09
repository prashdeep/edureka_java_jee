package com.edureka.hibernate.onetomany;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="car")
public class Car {
	
	private String model;
	
	private long chassieNumber;
	
	@ManyToOne
	@JoinColumn(name="user_id", nullable = false)
	private User user;
	
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getChassieNumber() {
		return chassieNumber;
	}

	public void setChassieNumber(long chassieNumber) {
		this.chassieNumber = chassieNumber;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}



}
