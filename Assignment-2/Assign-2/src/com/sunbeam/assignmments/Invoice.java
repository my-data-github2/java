package com.sunbeam.assignmments;

import java.util.Scanner;

import javax.lang.model.element.QualifiedNameable;

public class Invoice { 
	
    private String partName;
	private String partDescription;
	private int quantItemPurchased;
	private double pricePerItem;
	
	//Constructor for intializing values
public Invoice() {
	partName = partName;
	partDescription  = partDescription;
	quantItemPurchased = quantItemPurchased;
	pricePerItem = pricePerItem;
}

//Getters

public String getPartName() {
	return partName;
}

public String getPartDescription() {
	return partDescription;
}

public int getQuantItemPurchased() {
	return quantItemPurchased;
}

public double getPricePerItem() {
	return pricePerItem;
}

//Setters

public void setPartName(String partName) {
	this.partName = partName;
}

public void setPartDescription(String partDescription) {
	this.partDescription = partDescription;
}

public void setQuantItemPurchased(int quantItemPurchased) {
	this.quantItemPurchased = quantItemPurchased;
}

public void setPricePerItem(double pricePerItem) {
	this.pricePerItem = pricePerItem;
}

 public void acceptData() {
	 System.out.println("Enter Part Name: ");
	 Scanner sc = new Scanner(System.in);
	 partName = sc.nextLine();
	 System.out.println("Enter Part Description: ");
	 partDescription = sc.nextLine();
	 System.out.println("Enter Quantity of item purchased: ");
	 quantItemPurchased = sc.nextInt();
	 System.out.println("Enter Price of item: ");
	 pricePerItem= sc.nextDouble();
	 
 }	
public double calculateInvoice() {
return quantItemPurchased*pricePerItem;
}

}; 


 


