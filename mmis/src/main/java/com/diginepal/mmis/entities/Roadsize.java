package com.diginepal.mmis.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="roadsize")
public class Roadsize extends BaseEntity{

	private String size;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	

}
