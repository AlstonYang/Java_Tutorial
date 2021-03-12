import java.util.ArrayList;

import lab.practice.Fruit;

public class FruitAnalyzer implements Analyzer {

	
	@Override
	public double measurer(Object object) {
		// TODO Auto-generated method stub
		
		Fruit fruit = (Fruit) object;
		
		double totalSales=0;
		
		for(double i:fruit.getSales()) {
			
			totalSales +=i; 
		}
		
		return totalSales*fruit.getPrice();
	}

	@Override
	public String getName(Object object) {
		// TODO Auto-generated method stub
		Fruit fruit = (Fruit) object;
		return fruit.getName();
	}

}
