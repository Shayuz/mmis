package com.diginepal.mmis.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="occupation")

public class Occupation extends BaseEntity{
private String occupationtype;

public String getOccupationtype() {
	return occupationtype;
}

public void setOccupationtype(String occupationtype) {
	this.occupationtype = occupationtype;
}


}
