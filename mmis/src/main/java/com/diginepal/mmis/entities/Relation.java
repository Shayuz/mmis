package com.diginepal.mmis.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="relation")
public class Relation extends BaseEntity {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
