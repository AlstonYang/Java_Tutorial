import java.util.ArrayList;

public class ItemManager {

	private ArrayList<Item> items;
	
	public ItemManager() {
		
		items = new ArrayList<Item>();
	}
	
	public void addNewItem(int ID, String name, double price) {
		Item item = new Item(ID, name, price);
		items.add(item);
	}
	
	public ArrayList<Item> getItems() {
		
		return this.items;
	}
	
	public Item findItem(String itemName) {
		
		for(Item item: items) {
			if(item.getName().equals(itemName)) {
				return item;
			}
		}
		return null;
	}
}
