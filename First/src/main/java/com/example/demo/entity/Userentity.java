package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Userentity {
	@Id
	private int productid;
	private String productname;
	private String productmode;
	private int productamount;
	private String productcolor;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductmode() {
		return productmode;
	}
	public void setProductmode(String productmode) {
		this.productmode = productmode;
	}
	public int getProductamount() {
		return productamount;
	}
	public void setProductamount(int productamount) {
		this.productamount = productamount;
	}
	public String getProductcolor() {
		return productcolor;
	}
	public void setProductcolor(String productcolor) {
		this.productcolor = productcolor;
	}
	public Userentity(int productid, String productname, String productmode, int productamount, String productcolor) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productmode = productmode;
		this.productamount = productamount;
		this.productcolor = productcolor;
	}
	public Userentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
