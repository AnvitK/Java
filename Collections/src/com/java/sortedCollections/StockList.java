package com.java.sortedCollections;

import java.util.*;

public class StockList {

	private final Map<String, StockItem> list;

	public StockList() {
//		this.list = new HashMap<>(); unordered
		this.list = new LinkedHashMap<>();	 // ordered
	}

	public int addStock(StockItem item) {
		if(item != null) {
			StockItem inStock = list.getOrDefault(item.getName(), item); //	Stock inStock = list.get(item.getName());
			if(inStock != item) { // if(inStock != null)
				item.adjustStock(inStock.quantityInStock());
			}
			
			list.put(item.getName(), item);
			return item.quantityInStock();
		}
		return 0;
	}
	
	public int sellStock(String item, int quantity) {
		StockItem inStock = list.getOrDefault(item, null);
		
		if((inStock != null) && (inStock.quantityInStock() >= quantity) && quantity > 0) {
			inStock.adjustStock(-quantity);
			return quantity;
		}
		return 0;
	}
	
	public StockItem get(String key) {
		return list.get(key);
	}
	
	public Map<String, Double> pricesList(){
		Map<String, Double> prices = new LinkedHashMap<>();
		for(Map.Entry<String, StockItem> item : list.entrySet()) {
			prices.put(item.getKey(), item.getValue().getPrice());
		}
		return Collections.unmodifiableMap(prices);
	}
	
	
	public Map<String, StockItem> items(){
		return Collections.unmodifiableMap(list);
	}

	@Override
	public String toString() {
		String s = "\nStock List\n";
		double totalCost = 0.0;
		for(Map.Entry<String, StockItem> item : list.entrySet()) {
			StockItem stockItem = item.getValue();
			
			double itemValue = stockItem.getPrice() * stockItem.quantityInStock();
			
			s = s + stockItem + " :\tThere are " + stockItem.quantityInStock() + " in stock. Value of those items is ";
			s = s + String.format("%.2f", itemValue) + "\n";
			totalCost += itemValue;
		}
		return s + "Total stock value " + totalCost;
	}
	
	
}
