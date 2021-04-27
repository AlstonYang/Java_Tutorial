import java.util.ArrayList;

public class Furniture implements Item {

	private int ID;
	private double price;
	private double weight;
	private double weightShippingFee;
	private ArrayList<Double> discountsList;

	
	public Furniture(int ID, double price, double weight, double weightShippingFee, ArrayList<Double> discounts) {
		
		this.ID = ID;
		this.price = price;
		this.weight = weight;
		this.weightShippingFee = weightShippingFee;
		this.discountsList = discounts;
	}
	
	public double getPrice() {
		
		return this.price;
	}
	
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return this.ID;
	}
	
	@Override
	public double calcDiscount(int num) {
		// TODO Auto-generated method stub
		double discount;
		
		if(discountsList.size() != 0) {
			
			if(discountsList.size()<num) {
				discount = discountsList.get(discountsList.size()-1);
			}else {
				discount = discountsList.get(num-1);
			}
			
			return discount;
		
		}else{
			return 0;
		}
	}

	@Override
	public double calcShippingFee(int num) {
		// TODO Auto-generated method stub
		return this.weightShippingFee*this.weight*num;
	}

	
}
