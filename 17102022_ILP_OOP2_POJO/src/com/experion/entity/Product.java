package com.experion.entity;

import java.util.Scanner;

public class Product {
	
	private String productCode;
	private  String productName;
	private  String productDescription;
	private  double productPrice;
	private  String openDate;
	private  String validityDate;
	private boolean active;
	
	
	public Product() //constructor
	{
		
	}
	public Product(String productCode,String productName,String productDescription,double productPrice,String openDate,String validityDate,boolean active) //constructor
	{
		this.productCode=productCode;
		this.productName=productName;
		this.productDescription=productDescription;
		this.productPrice=productPrice;
		this.openDate=openDate;
		this.validityDate=validityDate;
		this.validityDate=validityDate;
		this.active=active;
		
		
		
	}
	
	
	
	
	
	
	
	
	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getOpenDate() {
		return openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	public String getValidityDate() {
		return validityDate;
	}

	public void setValidityDate(String validityDate) {
		this.validityDate = validityDate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	

	}


