import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Tester {

	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 300;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> discounts = new ArrayList<Double>();
		discounts.add(100.0);
		discounts.add(200.0);
		discounts.add(300.0);
		
		ArrayList<Double> discountsRate = new ArrayList<Double>();
		discountsRate.add(0.1);
		discountsRate.add(0.15);
		discountsRate.add(0.2);
		
		Furniture sofa = new Furniture(1, 10000, 30, 200, discounts);
		Luxury wallet = new Luxury(2, 160000, 1000, discountsRate);
		
		Membership Tom = new Membership(1);
		
		int tomID = Tom.buy(sofa, 2);
		Tom.buy(tomID, wallet, 2);
		
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		JTextArea textArea = new JTextArea(15,10);
		JButton button = new JButton("Check out");
		
		
		textArea.setText("Status");
		panel.setLayout(new BorderLayout());
		panel.add(textArea, BorderLayout.NORTH);
		panel.add(button, BorderLayout.SOUTH);
		frame.add(panel);
		
		class buttonListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textArea.setText(Tom.checkOut(tomID));
			}
		}
		
		ActionListener listener = new buttonListener();
		button.addActionListener(listener);
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
