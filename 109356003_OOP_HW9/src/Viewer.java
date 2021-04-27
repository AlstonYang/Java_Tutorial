import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Viewer {

	private static final int FRAME_WIDTH = 650;
	private static final int FRAME_HEIGHT = 350;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserManagement userManagement = new UserManagement();
		userManagement.addNewUser(110306500, "Aa123456", "Admin");
		userManagement.addNewUser(110306501, "Aa123456", "User");
		
		JFrame frame = new JFrame();
		ItemManager itemManager = new ItemManager();
		JPanel cardsPanel = new JPanel(new CardLayout());
		LoginPanel loginPanel = new LoginPanel();
		CartPanel cartPanel = new CartPanel(itemManager);
		ManagementPanel managementPanel = new ManagementPanel(itemManager);
		
		JMenuBar mb=new JMenuBar();
		JMenu menu = new JMenu("Menu"); 
		JMenuItem lagOutItem = new JMenuItem("Lag out");
		JMenuItem exitItem = new JMenuItem("Exit");
		
		menu.add(lagOutItem);
		menu.add(exitItem);
		mb.add(menu);
		
		cardsPanel.add(loginPanel, "1");
		cardsPanel.add(cartPanel, "2");
		cardsPanel.add(managementPanel, "3");
		
		((CardLayout) cardsPanel.getLayout()).show(cardsPanel, "1");
		loginPanel.addButtonListener(cardsPanel, cartPanel, userManagement, mb);

		class LagOutListener implements ActionListener{
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				((CardLayout) cardsPanel.getLayout()).show(cardsPanel, "1");
				mb.setVisible(false);
			}
		}
		
		class ExitListener implements ActionListener{
			
			@Override
			public void actionPerformed(ActionEvent e) {
		
				System.exit(0);
			}
		}

		LagOutListener lagOutListener = new LagOutListener();
		lagOutItem.addActionListener(lagOutListener);
		
		ExitListener exitListener = new ExitListener();
		exitItem.addActionListener(exitListener);
		
		
		
		frame.setJMenuBar(mb);
		mb.setVisible(false);
		
		
		
		frame.add(cardsPanel);
		frame.setTitle("E-Commerce");
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);  
		
		
	}

}
