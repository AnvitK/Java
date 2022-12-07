package com.java.sortedCollections;

import java.util.Map;

public class Main {

	private static StockList stockList = new StockList();
	
	public static void main(String[] args) {
		
		StockItem temp = new StockItem("bread", 0.86,100);
		stockList.addStock(temp);
		
		temp = new StockItem("cake", 1.10, 7);
		stockList.addStock(temp);
		
		temp = new StockItem("car", 12.10, 2);
		stockList.addStock(temp);
		
		temp = new StockItem("chair", 62.0, 10);
		stockList.addStock(temp);
		
		temp = new StockItem("cup", 0.50, 200);
		stockList.addStock(temp);
		temp = new StockItem("cup", 0.35, 100);
		stockList.addStock(temp);
		
		temp = new StockItem("door", 71.96, 4);
		stockList.addStock(temp);
		
		temp = new StockItem("juice", 2.35, 35);
		stockList.addStock(temp);
		
		temp = new StockItem("phone", 72.60, 40);
		stockList.addStock(temp);
		
		temp = new StockItem("towel", 2.96, 70);
		stockList.addStock(temp);
		
		temp = new StockItem("vase", 8.10, 50);
		stockList.addStock(temp);
		
		System.out.println(stockList);
		
		for(String s : stockList.items().keySet()) {
			System.out.println(s);
		}
	
		Basket anvitBasket =  new Basket("Anvit");
		sellItem(anvitBasket, "car", 1);
		System.out.println(anvitBasket);
		
		sellItem(anvitBasket, "car", 1);
		System.out.println(anvitBasket);
		
		if(sellItem(anvitBasket, "car", 1) != 1) {
			System.out.println("There are no more cars in stock");
		}
		sellItem(anvitBasket, "spoon", 5);
		System.out.println(anvitBasket);
		
		sellItem(anvitBasket, "towel", 4);
		sellItem(anvitBasket, "door", 2);
		sellItem(anvitBasket, "chair", 5);
		System.out.println(anvitBasket);
		
		System.out.println(stockList);
		
//		temp = new StockItem("pen", 1.3);
//		stockList.items().put(temp.getName(), temp);
		stockList.items().get("car").adjustStock(3000);
		stockList.get("car").adjustStock(-1300);
		System.out.println(stockList);
		
		for( Map.Entry<String, Double> price : stockList.pricesList().entrySet()) {
			System.out.println(price.getKey() + " : " + price.getValue());
		}
		
	}
	
	public static int sellItem(Basket basket, String item, int quantity) {
		StockItem stockItem = stockList.get(item);
		if(stockItem == null) {
			System.out.println("We dont sell " + item);
			return 0;
		}
		if(stockList.sellStock(item, quantity) != 0) {
			basket.addToBasket(stockItem, quantity);
			return quantity;
		}
		return 0;
	}
	
}
