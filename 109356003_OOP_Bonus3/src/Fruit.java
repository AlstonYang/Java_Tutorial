import java.util.ArrayList;
import java.util.Collections;

public class Fruit {

	private String name;
	private int price;
	private int sales;
	private ArrayList <Integer> sale;
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
		this.sales = 0;
		sale = new ArrayList <Integer>();
	}

	public String getName() {

		return this.name;
	}

	public int getPrice() {

		return this.price;
	}

	public int getSales() {

		return this.sales;
	}

	public void setName(String name) {
		
		this.name = name;
	}
	
	public void setPrice(int price) {
		
		this.price = price;
	}
	
	public void updateSales(int amount) {
		sale.add(amount);
		this.sales += amount;

	}
	
	public String getInfo() {
	
		String name_info = String.format("%-12s%6s\n","Fruit name:",this.name);
		String price_info = String.format("%-12s%3d\n","Fruit price:",this.price);
		String sale_info =String.format("%-12s","Indiv sales:");
		String sales_info = String.format("\n%-12s%3d\n","Total sales:",this.sales);
		
		Collections.sort(sale);
		for(int count:sale) {
			sale_info+=String.format("%2d, ",count);
		}
		
		String info = name_info+price_info+sale_info+sales_info;
		return info;
	}
}
