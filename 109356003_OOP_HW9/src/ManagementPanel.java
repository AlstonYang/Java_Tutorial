import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ManagementPanel extends JPanel {

	private static final int FIELD_WIDTH = 10;

	private JLabel titleLabel;

	private JLabel IDLabel;
	private JLabel nameLabel;
	private JLabel priceLabel;

	private JTextField IDField;
	private JTextField nameField;
	private JTextField priceField;

	private JButton sentButton;

	private ItemManager itemManager;

	public ManagementPanel(ItemManager itemManager) {

		this.itemManager = itemManager;
		createComp();
	}

	public void createComp() {

		IDLabel = new JLabel("Item ID");
		nameLabel = new JLabel("Item name");
		priceLabel = new JLabel("Item price");

		IDField = new JTextField(FIELD_WIDTH);
		nameField = new JTextField(FIELD_WIDTH);
		priceField = new JTextField(FIELD_WIDTH);
		sentButton = new JButton("Send");

		titleLabel = new JLabel("E-connerce management platform");
		Font font = new Font(Font.DIALOG, Font.BOLD, 25);
		titleLabel.setFont(font);

		GridBagConstraints c;
		this.setLayout(new GridBagLayout());

		// Title Label
		c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = GridBagConstraints.REMAINDER;
		c.gridheight = 10;

		this.add(titleLabel, c);

		// IDLabel
		c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 20;
		c.insets = new Insets(30, 0, 0, 0);

		this.add(IDLabel, c);

		// IDField
		c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 20;
		// c.gridwidth = 10;
		c.insets = new Insets(30, 0, 0, 0);

		this.add(IDField, c);

		// nameLabel
		c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 30;
		// c.gridwidth = 5;

		this.add(nameLabel, c);

		// nameField
		c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 30;
		// c.gridwidth = 10;

		this.add(nameField, c);

		// priceLabel
		c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 40;
		// c.gridwidth = 5;

		this.add(priceLabel, c);

		// priceField
		c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 40;
		// c.gridwidth = 10;

		this.add(priceField, c);

		// send button
		c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 70;
		// c.gridwidth = 7;
		c.insets = new Insets(10, 0, 0, 0);
		this.add(sentButton, c);

		class ClickListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int ID;
				String name;
				double price;

				try {
					ID = Integer.parseInt(IDField.getText());
					name = nameField.getText();
					price = Double.parseDouble(priceField.getText());
	
					itemManager.addNewItem(ID, name, price);
	
					IDField.setText("");
					nameField.setText("");
					priceField.setText("");
					
				}catch(NumberFormatException error) {
					
					JOptionPane.showMessageDialog(null,"Please enter the relevant information correctly", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}

		}

		ClickListener listener = new ClickListener();
		sentButton.addActionListener(listener);

		// this.setLayout(new BorderLayout());
		// this.add(IDPanel, BorderLayout.EAST);
		// this.add(namePanel, BorderLayout.CENTER);
		// this.add(pricePanel, BorderLayout.WEST);
	}
}
