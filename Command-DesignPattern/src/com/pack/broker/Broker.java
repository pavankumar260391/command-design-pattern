package com.pack.broker;

import com.pack.command.Order;

public class Broker {

	public void placeOrder(Order order){
		order.execute();
	}
}
