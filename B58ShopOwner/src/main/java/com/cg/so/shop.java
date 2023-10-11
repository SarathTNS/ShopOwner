package com.cg.so;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class shop {
	
	private int id;
	private String name;
	private LocalDate dob;
	private String address;
	private int shop_id;
	
	public shop() {
		super();
	}
	
	
	
	public shop(int id, String name, LocalDate dob, String address, int shop_id) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.shop_id = shop_id;
	}


@Id
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public LocalDate getDob() {
		return dob;
	}



	public void setDob(LocalDate dob) {
		this.dob = dob;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getShop_id() {
		return shop_id;
	}



	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}



	@Override
	public String toString() {
		return "shop [id=" + id + ", name=" + name + ", dob=" + dob + ", address=" + address + ", shop_id=" + shop_id
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getDob()=" + getDob() + ", getAddress()="
				+ getAddress() + ", getShop_id()=" + getShop_id() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}