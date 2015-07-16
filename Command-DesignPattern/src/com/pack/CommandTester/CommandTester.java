package com.pack.CommandTester;

import com.pack.broker.Broker;
import com.pack.command.BuyStock;
import com.pack.command.SellStock;
import com.pack.stocks.Stock;

public class CommandTester {
	public static void main(String[] args) {
		
		Stock stock = new Stock();
		
		BuyStock buy = new BuyStock(stock);
		SellStock sell = new SellStock(stock);
		
		Broker br = new Broker();
		br.placeOrder(buy);
		br.placeOrder(sell);
		
	}
}
