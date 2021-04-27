import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Tester {

	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 200;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Company company = new Company("NCCU");
		company.addFixedAsset(new Vehicle(1, 500000, 10, 50000));

		
		
		JFrame frame = new JFrame();
		JLabel yearLabel = new JLabel("Year");
		JLabel expenseLabel = new JLabel("Total depreciation expense");
		JLabel bookValueLabel = new JLabel("Book value of fixed assets");
		JButton button = new JButton("Do calculate");
		
		frame.setTitle("Depreciation Expense Calculator");
		
//		frame.setLayout(new GridLayout(4,1));
//		frame.add(yearLabel);
//		frame.add(expenseLabel);
//		frame.add(bookValueLabel);
		frame.add(button);
//		
		
		
		class ButtonListener implements ActionListener{
			
			private int currentYear = 0;
			
			public void actionPerformed(ActionEvent e) {

//				yearLabel.setText(String.format("Year: %d", currentYear+=1));
//				expenseLabel.setText(String.format("Total depreciation expense: %.2f", company.getDepreciationExp()));
//				bookValueLabel.setText(String.format("Book value of fixed assets: %.2f", company.getTotalBookValue()));
//				
				System.out.printf("Year: %d\n", currentYear+=1);
				System.out.printf("Total depreciation expense: %.2f\n", company.getDepreciationExp());
				System.out.printf("Book value of fixed assets : %.2f\n\n", company.getTotalBookValue());
			}
		}
		
		ActionListener listener = new ButtonListener();
		button.addActionListener(listener);
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
