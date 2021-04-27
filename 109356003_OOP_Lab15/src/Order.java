import java.util.ArrayList;

public class Order {

	int ID;
	double totalAmount;
	ArrayList<Item> items;
	ArrayList<Integer> quantities;

	public Order() {

		items = new ArrayList<Item>();
		quantities = new ArrayList<Integer>();
	}

	public void addItem(Item item, int quantity) {

		boolean newItem = true;
		
		for (int i=0; i<items.size(); i++) {
			
			if (item.getName().equals(items.get(i).getName())) {
				
				newItem = false;
				quantities.set(i, quantities.get(i)+quantity);
				break;
			}
		}
		
		if (newItem) {
			items.add(item);
			quantities.add(quantity);
		}
	}

	public String getInfo() {

		String info = String.format("%-8s%15s%15s\n", "Item", "Price", "Quantity");

		for (int i = 0; i < items.size(); i++) {
			info += String.format("%-8s%12.0f%18d\n", items.get(i).getName(), items.get(i).getPrice(),
					quantities.get(i));
		}
		info += "-------------------------\n";
		info += String.format("The total amount:%.2f\n", this.totalAmount);

		items = new ArrayList<>();
		quantities = new ArrayList<>();
		
		return info;
	}

	public String checkout() {
		totalAmount =0;
		
		for (int i = 0; i < items.size(); i++) {
			
			totalAmount += items.get(i).getPrice() * quantities.get(i);
		}

		return this.getInfo();
	}
}
