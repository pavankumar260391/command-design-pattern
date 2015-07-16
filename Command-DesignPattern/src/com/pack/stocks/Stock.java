package com.pack.stocks;

public class Stock {

	String name="synergisticit";
	double price=200.50;
	
	public void buy(){
		System.out.println("Stock of "+name+" bought for $"+price);
	}
	
	public void sell(){
		System.out.println("Stock of "+name+" sold for $"+price);

	}
}
