package com.jbk.HProject;

import java.util.Date;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name= "student_address")
public class Address {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="address_id")
	private int Aid;
	@Column(length=20,name= "street",nullable=true,unique=true)
	private String Astreet;
	@Column(length=25,name="city")
	private String Acity;
	@Column(name="is_open")
	private boolean isOpen;
	@Transient
	private double x;
	@Column(name= "added_date")
	@Temporal(TemporalType.DATE)
	private Date addeddate ;
	@Lob
	private byte[] Aimage;
	public Address(int aid, String astreet, String acity, boolean isOpen, double x, Date addeddate, byte[] aimage) {
		super();
		Aid = aid;
		Astreet = astreet;
		Acity = acity;
		this.isOpen = isOpen;
		this.x = x;
		this.addeddate = addeddate;
		Aimage = aimage;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAid() {
		return Aid;
	}
	public void setAid(int aid) {
		Aid = aid;
	}
	public String getAstreet() {
		return Astreet;
	}
	public void setAstreet(String astreet) {
		Astreet = astreet;
	}
	public String getAcity() {
		return Acity;
	}
	public void setAcity(String acity) {
		Acity = acity;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getAddeddate() {
		return addeddate;
	}
	public void setAddeddate(Date addeddate) {
		this.addeddate = addeddate;
	}
	public byte[] getAimage() {
		return Aimage;
	}
	public void setAimage(byte[] aimage) {
		Aimage = aimage;
	}
	@Override
	public String toString() {
		return "Address [Aid=" + Aid + ", Astreet=" + Astreet + ", Acity=" + Acity + ", isOpen=" + isOpen + ", x=" + x
				+ ", addeddate=" + addeddate + ", Aimage=" + Arrays.toString(Aimage) + "]";
	}
	
	

}
