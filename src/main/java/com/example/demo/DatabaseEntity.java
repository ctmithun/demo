/**
 * 
 */
package com.example.demo;

/**
 * @author CTM
 *
 */
public class DatabaseEntity {
	String productName;
	int retailPrice;
	int discountedPrice;
	String description;
	String brand;

	public DatabaseEntity(String productName, int retailPrice, int discountedPrice, String description, String brand) {
		super();
		this.productName = productName;
		this.retailPrice = retailPrice;
		this.discountedPrice = discountedPrice;
		this.description = description;
		this.brand = brand;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(int retailPrice) {
		this.retailPrice = retailPrice;
	}

	public int getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(int discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
