package model;
/**
 * Aaliyah Trotter - atrotter1@dmacc.edu
 * CIS175 - Fall 2022
 */
public class Pizza {
	private int price;
	private int size;
	private int cheese;
	private int pepperoni;
	private int sausage;
	private int ham;
	
	public Pizza(){
		super();
		
	}
	public Pizza(int price){
		super();
		this.price = price;
		setProtein(price);
		
	}
	
	public int getCheese() {
		return cheese;
	}
	public void setCheese(int cheese) {
		this.cheese = cheese;
	}
	public int getPepperoni() {
		return pepperoni;
	}
	public void setPepperoni(int pepperoni) {
		this.pepperoni = pepperoni;
	}
	public int getSausage() {
		return sausage;
	}
	public void setSausage(int sausage) {
		this.sausage = sausage;
	}
	public int getHam() {
		return ham;
	}
	public void setHam(int ham) {
		this.ham = ham;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public int setPrice(int price) {
		return this.price = price;
	}
	public void setProtein(int price) {
		final int PEPPERONI = 15;
		final int CHEESE = 10;
		final int SAUSAGE = 13;
		final int HAM = 12;
		
		
		if(getSize() == 12) {
			price = setPrice(PEPPERONI + 2);
			price = setPrice(CHEESE + 2);
			price = setPrice(SAUSAGE + 2);
			price = setPrice(HAM + 2);
		}else if(getSize() == 13) {
			price = setPrice(PEPPERONI + 3);
			price = setPrice(CHEESE + 3);
			price = setPrice(SAUSAGE + 3);
			price = setPrice(HAM + 3);
		}else if(getSize()== 16) {
			price = setPrice(PEPPERONI + 4);
			price = setPrice(CHEESE + 4);
			price = setPrice(SAUSAGE + 4);
			price = setPrice(HAM + 4);
		}else {
			System.out.println("Incorrect Information");
		}
	}
	@Override
	public String toString() {
		return "Pizza [price=" + price + ", size=" + size + " ]";
	}
	
	

}
