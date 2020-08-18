package com.enigmacamp.model;

public class Product {
	private String productCode;
	private String productName;
	
	public Product() {
		super();
	}

	public Product(String productCode, String productName) {
		super();
		this.productCode = productCode;
		this.productName = productName;
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
}