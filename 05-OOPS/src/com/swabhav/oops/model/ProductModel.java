package com.swabhav.oops.model;

public class ProductModel {
 String productName;
 double price;
 double quantity;
 
 public ProductModel(String productName,double price,double quantity){
	 this.productName=productName;
	 this.price=price;
	 this.quantity=quantity;
 }
 
 
  public double claculateTotal() {
	  double total=price*quantity;
	  return total;
  }
}
