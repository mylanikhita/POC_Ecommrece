package com.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "mobiles")
public class Mobiles {

			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
		    private Long id;
			@Column(nullable = false,unique = true,length = 45)
		    private String brandName;
			@Column(nullable = false,length = 20)
		    private String Model;
			@Column(nullable = false,length = 20)
		    private String Colour;
			@Column(nullable = false,length = 64)
		    private String Price;
			public Long getId() {
				return id;
			}
			public void setId(Long id) {
				this.id = id;
			}
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
			public String getColour() {
				return Colour;
			}
			public void setColour(String colour) {
				Colour = colour;
			}
			public String getPrice() {
				return Price;
			}
			public void setPrice(String price) {
				Price = price;
			}
			
		
}


