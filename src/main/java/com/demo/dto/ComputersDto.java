package com.demo.dto;



public class ComputersDto {
	 
	
  
    private String brandName;
    private String Model;
    private String sizeInches;
    private String Price;
	
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getSizeInches() {
		return sizeInches;
	}
	public void setSizeInches(String sizeInches) {
		this.sizeInches = sizeInches;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
    
}
