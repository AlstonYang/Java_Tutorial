import java.util.ArrayList;

public class Luxury implements Item{

	private int ID;
	private double price;
	private double shippingFee;
	private ArrayList<Double> discountRateList;
	
	public Luxury(int ID, double price, double shippingFee, ArrayList<Double> discountRateList) {
		
		this.ID = ID;
		this.price = price;
		this.shippingFee = shippingFee;
		this.discountRateList = discountRateList;
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
		
		if(discountRateList.size() != 0) {
			
			if(discountRateList.size()<num) {
				
				discount = discountRateList.get(discountRateList.size()-1);
			}else {
				
				discount = discountRateList.get(num-1);
			}
			
			return discount*num*this.price;
		
		}else{
			
			return 0;
		}
	}

	@Override
	public double calcShippingFee(int num) {
		// TODO Auto-generated method stub
		return this.shippingFee*num;
	}

	
	
}
