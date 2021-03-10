import java.util.ArrayList;
import java.util.Arrays;

public class Cart {

	private ArrayList <Fruit> basket;
	private ArrayList <Integer> subAmount;
	

	private int totalExpense;

	
	public Cart(){
		basket = new ArrayList<Fruit>();
		subAmount = new ArrayList<Integer>();

		totalExpense=0;

	}
	
	public int getTotalAmount() {
		return this.totalExpense;
	}
	
	public int getTotalExpense() {
		return this.totalExpense;
	}
	
	public void addItem(Fruit fruit, int amount) {
		
		basket.add(fruit);
		subAmount.add(amount);
		
		fruit.updateSales(amount);
	}

//	public void deleteItem(String fruit) {
//		if (basket.contains(fruit))
//			basket.remove(fruit);
//		else
//			System.out.println("Your basket does not have this product.");
//	}

	public void searchItem(Fruit fruit) {
		String result="Your basket do not have this product.";
		for(Fruit i : basket) {
			if (i==fruit) {
				result = "Your basket have this product.";
			} 
		}
		System.out.println(result);
	}
	
	public void totalExpense() {
		
		for (int i=0; i<basket.size();i++) {
			
			totalExpense += basket.get(i).getPrice()*subAmount.get(i);}
		
	}
	
	
	
	public String getInfo() {

		totalExpense();
		
		String title = String.format("%-6s%11s%6s\n","Name","Price($NT)","Unit");
		String detail="";
		for (int i=0; i<basket.size();i++) {
			detail += String.format("%-6s:%5d%6s%4d\n", basket.get(i).getName(),basket.get(i).getPrice(),"*",subAmount.get(i));
		}
		
		String totalCost = String.format("The current expense is:NT$%d\n",totalExpense);
		return totalCost+title+detail;
	}

}
