import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CartFrame extends JFrame{
	
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 400;
	private static final int FIELD_WIDTH = 10;
	
	private ItemManager itemManager;
	private Order order;
	
	private JPanel itemPanel;
	private JPanel quantityPanel;
	private JPanel overallPanel;
	private JPanel operatePanel;
	
	
	private JLabel itemLabel;
	private JComboBox itemCombo;
	private JLabel quantityLabel;
	private JTextField quantityField;
	private JButton buyButton;
	private JButton placeButton;
	private JTextArea infoArea;
	
	public CartFrame() {
		
		order = new Order();
		itemManager = new ItemManager();
		itemManager.addNewItem(1, "Lamp", 500);
		itemManager.addNewItem(2, "Desk", 1500);
		itemManager.addNewItem(3, "Chair", 1300);
		
		this.setTitle("Shopping cart");
		this.setSize(this.FRAME_WIDTH, this.FRAME_HEIGHT);
		
		this.createItemComp();
		this.createInfoArea();
		this.createBuyButton();
		this.createPlaceButton();
		this.createPanel();
	}
	
	public void buyItem() {
		
		String itemBoughtName = (String)itemCombo.getSelectedItem();
		Item itemBought = itemManager.findItem(itemBoughtName);
		int quantity = Integer.parseInt(quantityField.getText());
		order.addItem(itemBought, quantity);
	}
	
	public void createItemComp() {
		itemLabel = new JLabel("Item");
		quantityLabel = new JLabel("Quantity");
		itemCombo = new JComboBox();
		quantityField = new JTextField("0", FIELD_WIDTH);
		
		for(Item item:itemManager.getItems()) {
			
			itemCombo.addItem(item.getName());
		}
	}
	
	public void createInfoArea(){
		
		infoArea = new JTextArea(20,30);
	}
	
	public void createBuyButton() {
		buyButton = new JButton("Buy more");
		
		class ClickListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if (!quantityField.getText().equals("0")){
					buyItem();
					infoArea.setText("Action completed!");
					quantityField.setText("0");
				}else {
					
					JOptionPane.showMessageDialog(operatePanel,"The number must above than 0","Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		
		ClickListener clickListener = new ClickListener();
		buyButton.addActionListener(clickListener);
	}
	
	public void createPlaceButton() {
		placeButton = new JButton("Check out");
		
		class ClickListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if (!quantityField.getText().equals("0")){
					buyItem();
				} 
				
				infoArea.setText(order.checkout());
			}
		}
		
		ClickListener clickListener = new ClickListener();
		placeButton.addActionListener(clickListener);
	}
	
	public void createPanel() {
		
		itemPanel = new JPanel();
		itemPanel.add(itemLabel);
		itemPanel.add(itemCombo);
		
		quantityPanel = new JPanel();
		quantityPanel.add(quantityLabel);
		quantityPanel.add(quantityField);
		
		operatePanel = new JPanel(new GridLayout(2, 2));
		operatePanel.add(itemPanel);
		operatePanel.add(quantityPanel);
//		operatePanel.add(itemCombo);
//		operatePanel.add(quantityField);
		operatePanel.add(buyButton);
		operatePanel.add(placeButton);
//		operatePanel.add(infoArea);
		
		overallPanel = new JPanel(new BorderLayout());
		overallPanel.add(operatePanel, BorderLayout.NORTH);
		overallPanel.add(infoArea, BorderLayout.CENTER);
		
		this.add(overallPanel);
	}
}
