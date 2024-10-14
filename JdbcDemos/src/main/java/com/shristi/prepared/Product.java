package com.shristi.prepared;

public class Product {
	String productName;
	String brand;
	float price;
	int product_Id;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", brand=" + brand + ", price=" + price + ", product_Id="
				+ product_Id + "]";
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getProduct_Id() {
		return product_Id;
	}
	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}
	public Product(String productName, String brand, float price, int product_Id) {
		super();
		this.productName = productName;
		this.brand = brand;
		this.price = price;
		this.product_Id = product_Id;
	}

}
