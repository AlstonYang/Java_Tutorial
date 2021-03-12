package lab.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Fruit {

	private String name;
	private double price;
	private ArrayList<Double> sales;
	
	public Fruit(String name, double price, ArrayList<Double> sales) {
		this.name = name;
		this.price = price;
		this.sales = sales;
	}

	public String getName() {

		return this.name;
	}

	public double getPrice() {

		return this.price;
	}

	public ArrayList <Double> getSales() {

		return this.sales;
	}

}
