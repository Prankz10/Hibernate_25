package org.tnsindia.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

//child

@Entity
@Table(name="Car")
public class Car extends Vehicle{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//data members
	private double price;

	//setters and getters method
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setPrice(int price2) {
		// TODO Auto-generated method stub
		
	}

	public void setPrice1(int price2) {
		// TODO Auto-generated method stub
		
	}

}