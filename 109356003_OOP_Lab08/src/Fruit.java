import java.util.Arrays;

public class Fruit {

	private String name;
	private int price;
	private int totalSales;
	private int[]sale;
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
		this.totalSales = 0;
		sale = new int[3];
	}

	public String getName() {

		return this.name;
	}

	public int getPrice() {

		return this.price;
	}

	public int getTotalSales() {

		return this.totalSales;
	}

	public void setName(String name) {
		
		this.name = name;
	}
	
	public void setPrice(int price) {
		
		this.price = price;
	}
	
	public void updateTotalSales(int amount) {
		 
		for(int i =0; i<sale.length; i++) {
			if(sale[i]==0) {
				sale[i]=amount;
				break;
			}
		}
		this.totalSales += amount;
	}
	
	public String getInfo() {
	
		String name_info = String.format("%-12s%6s\n","Fruit name:",this.name);
		String price_info = String.format("%-12s%3d\n","Fruit price:",this.price);
		String sale_info =String.format("%-12s","Indiv sales:");
		String sales_info = String.format("\n%-12s%3d\n","Total sales:",this.totalSales);
		
		Arrays.sort(sale);
		for(int count:sale) {
			sale_info+=String.format("%2d, ",count);
		}
		
		String info = name_info+price_info+sale_info+sales_info;
		return info;
	}
}
