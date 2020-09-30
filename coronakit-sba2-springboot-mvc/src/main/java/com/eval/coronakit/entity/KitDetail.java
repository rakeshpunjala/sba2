package com.eval.coronakit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="coronakit")
public class KitDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="prdnm")
	@NotNull(message = "Name is requried")
	@NotBlank(message = "Name is requried")
	@Size(min=2,max=25,message = "Product name is requried to be of 2 to 25 chars in length")
	private String productName;
	
	@Column(name="prdqn")
	@NotNull(message = "Quantity is requried")
	private int quantity;
	
	@Column(name="price")
	@NotNull(message = "Price is requried")
	private int price;
	
	@Column(name="totalamt")
    private int totalamount;
	
	public KitDetail() {
		// TODO Auto-generated constructor stub
	}
	
	

	public KitDetail(int id,
			@NotNull(message = "Name is requried") @NotBlank(message = "Name is requried") @Size(min = 2, max = 25, message = "Product name is requried to be of 2 to 25 chars in length") String productName,
			@NotNull(message = "Quantity is requried") int quantity, @NotNull(message = "Price is requried") int price,
			int totalamount) {
		super();
		this.id = id;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.totalamount = totalamount;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(int totalamount) {
		this.totalamount = totalamount;
	}
	
	
}
