import java.util.ArrayList;
import java.util.Arrays;

public class Cart {

	private Fruit[] basket;
	private int[] subAmount;
	private int totalExpense;

	
	public Cart(){
		basket = new Fruit[3];
		subAmount = new int[3];
		totalExpense=0;
	}
	
	public int getTotalAmount() {
		return this.totalExpense;
	}
	
	public int getTotalExpense() {
		return this.totalExpense;
	}
	
	public void addItem(Fruit fruit, int amount) {
		
		
		for(int i =0; i<basket.length; i++) {
			
			if(basket[i]==null) {
				basket[i] = fruit;
				break;
			}
			
		}
		
		for(int i =0; i<subAmount.length; i++) {
			if(subAmount[i]==0) {
				subAmount[i] = amount;
				break;
			}
		}
		
		
		fruit.updateTotalSales(amount);
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
		
		for (int i=0; i<basket.length;i++) {
			if (basket[i]!=null)
				totalExpense += basket[i].getPrice()*subAmount[i];
		}
	}
	
	
	
	public String getInfo() {

		totalExpense();
		
		String title = String.format("%-6s%11s%6s\n","Name","Price($NT)","Unit");
		String detail="";
		for (int i=0; i<basket.length;i++) {
			if (basket[i]!=null) {
				detail += String.format("%-6s:%5d%6s%4d\n", basket[i].getName(),basket[i].getPrice(),"*",subAmount[i]);
			}
		}
		
		String totalCost = String.format("The current expense is:NT$%d\n",totalExpense);
		return totalCost+title+detail;
	}

}
