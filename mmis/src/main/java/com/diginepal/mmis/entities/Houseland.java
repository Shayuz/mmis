package com.diginepal.mmis.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="house_land")
public class Houseland extends BaseEntity {

	private String name;
	private String housenumber;
	private String landunit;
	private String landsize;
	private String plotnumber;
	private String sheetnumber;
	private String kittanumber;
	private String legacyaddress;
	private String tole;
	private String housefloor;
	private String rentedfloor;
	private String houseareaunit;
	private String housearea;
	private String mapaaplicationdate;
	private String mapapprovaeddate;
	private String constructionstartdate;
	private String constructioncompletiondate;
	private String constructioncompletionapprovaldate;
	private String constructionapprovedby;
	private String constructionpreparedby;
	private String propertytypefortax;
	private String longitude;
	private String latitude;
	
	@OneToOne
	private Constructiontype constructiontype;
	
	@ManyToOne
	@JoinColumn(name = "house_owner_id")
	private Houseowner houseowner;
	
	@ManyToOne
	@JoinColumn(name = "family")
	private Family family;
	
	@OneToOne
	private Disabledtype disabledtype;
	
	@OneToOne
	private Ownershiptype ownershiptype;
	
	@OneToOne
	private Usedstatus usedstatus;
	
	@OneToOne
	private User user;

	

	public String getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}

	public String getLandunit() {
		return landunit;
	}

	public void setLandunit(String landunit) {
		this.landunit = landunit;
	}

	public String getLandsize() {
		return landsize;
	}

	public void setLandsize(String landsize) {
		this.landsize = landsize;
	}

	public String getPlotnumber() {
		return plotnumber;
	}

	public void setPlotnumber(String plotnumber) {
		this.plotnumber = plotnumber;
	}

	public String getSheetnumber() {
		return sheetnumber;
	}

	public void setSheetnumber(String sheetnumber) {
		this.sheetnumber = sheetnumber;
	}

	public String getKittanumber() {
		return kittanumber;
	}

	public void setKittanumber(String kittanumber) {
		this.kittanumber = kittanumber;
	}

	public String getLegacyaddress() {
		return legacyaddress;
	}

	public void setLegacyaddress(String legacyaddress) {
		this.legacyaddress = legacyaddress;
	}

	public String getTole() {
		return tole;
	}

	public void setTole(String tole) {
		this.tole = tole;
	}

	public String getHousefloor() {
		return housefloor;
	}

	public void setHousefloor(String housefloor) {
		this.housefloor = housefloor;
	}

	public String getRentedfloor() {
		return rentedfloor;
	}

	public void setRentedfloor(String rentedfloor) {
		this.rentedfloor = rentedfloor;
	}

	public String getHouseareaunit() {
		return houseareaunit;
	}

	public void setHouseareaunit(String houseareaunit) {
		this.houseareaunit = houseareaunit;
	}

	public String getHousearea() {
		return housearea;
	}

	public void setHousearea(String housearea) {
		this.housearea = housearea;
	}

	public String getMapaaplicationdate() {
		return mapaaplicationdate;
	}

	public void setMapaaplicationdate(String mapaaplicationdate) {
		this.mapaaplicationdate = mapaaplicationdate;
	}

	public String getMapapprovaeddate() {
		return mapapprovaeddate;
	}

	public void setMapapprovaeddate(String mapapprovaeddate) {
		this.mapapprovaeddate = mapapprovaeddate;
	}

	public String getConstructionstartdate() {
		return constructionstartdate;
	}

	public void setConstructionstartdate(String constructionstartdate) {
		this.constructionstartdate = constructionstartdate;
	}

	public String getConstructioncompletiondate() {
		return constructioncompletiondate;
	}

	public void setConstructioncompletiondate(String constructioncompletiondate) {
		this.constructioncompletiondate = constructioncompletiondate;
	}

	public String getConstructioncompletionapprovaldate() {
		return constructioncompletionapprovaldate;
	}

	public void setConstructioncompletionapprovaldate(String constructioncompletionapprovaldate) {
		this.constructioncompletionapprovaldate = constructioncompletionapprovaldate;
	}

	public String getConstructionapprovedby() {
		return constructionapprovedby;
	}

	public void setConstructionapprovedby(String constructionapprovedby) {
		this.constructionapprovedby = constructionapprovedby;
	}

	public String getConstructionpreparedby() {
		return constructionpreparedby;
	}

	public void setConstructionpreparedby(String constructionpreparedby) {
		this.constructionpreparedby = constructionpreparedby;
	}

	public String getPropertytypefortax() {
		return propertytypefortax;
	}

	public void setPropertytypefortax(String propertytypefortax) {
		this.propertytypefortax = propertytypefortax;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public Constructiontype getConstructiontype() {
		return constructiontype;
	}

	public void setConstructiontype(Constructiontype constructiontype) {
		this.constructiontype = constructiontype;
	}

	public Houseowner getHouseowner() {
		return houseowner;
	}

	public void setHouseowner(Houseowner houseowner) {
		this.houseowner = houseowner;
	}

	public Family getFamily() {
		return family;
	}

	public void setFamily(Family family) {
		this.family = family;
	}

	public Disabledtype getDisabledtype() {
		return disabledtype;
	}

	public void setDisabledtype(Disabledtype disabledtype) {
		this.disabledtype = disabledtype;
	}

	public Ownershiptype getOwnershiptype() {
		return ownershiptype;
	}

	public void setOwnershiptype(Ownershiptype ownershiptype) {
		this.ownershiptype = ownershiptype;
	}

	public Usedstatus getUsedstatus() {
		return usedstatus;
	}

	public void setUsedstatus(Usedstatus usedstatus) {
		this.usedstatus = usedstatus;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
