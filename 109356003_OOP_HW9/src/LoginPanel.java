import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginPanel extends JPanel {

	private static final int FIELD_WIDTH = 10;

	private JPanel loginPanel;
	private JPanel userIDPanel;
	private JPanel passwordPanel;
	private JLabel imgLabel;
	private JLabel userIDLabel;
	private JLabel passwordLabel;
	private JTextField userIDField;
	private JPasswordField passwordField;
	private JButton loginButton;

	public LoginPanel() {

		createComp();
	}

	public void createComp() {

		imgLabel = new JLabel(new ImageIcon(getClass().getResource("store.png")), SwingConstants.CENTER);
		
		userIDLabel = new JLabel("User ID:");
		passwordLabel = new JLabel("Password:");
		userIDField = new JTextField(FIELD_WIDTH);
		passwordField = new JPasswordField(FIELD_WIDTH);

		userIDPanel = new JPanel();
		userIDPanel.add(userIDLabel);
		userIDPanel.add(userIDField);

		passwordPanel = new JPanel();
		passwordPanel.add(passwordLabel);
		passwordPanel.add(passwordField);

		loginPanel = new JPanel(new GridLayout(1, 2));
		loginPanel.add(userIDPanel);
		loginPanel.add(passwordPanel);

		loginButton = new JButton("Log in");

		this.setLayout(new BorderLayout());
		this.add(imgLabel, BorderLayout.NORTH);
		this.add(loginPanel, BorderLayout.CENTER);
		this.add(loginButton, BorderLayout.SOUTH);
	}

	public JButton getLoginButton() {

		return this.loginButton;
	}

	public void addButtonListener(JPanel panel1, CartPanel cartPanel, UserManagement userManagement, JMenuBar mb) {

		class ClickListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				try {

					int userID = Integer.parseInt(userIDField.getText());
					String password = passwordField.getText();
					boolean valid = false;

					for (User user : userManagement.getUsers()) {

						if (userID == user.getID() & password.equals(user.getPassword())) {

							valid = true;
							userIDField.setText("");
							passwordField.setText("");
							mb.setVisible(true);

							if (user.getIdentity().equals("Admin")) {

								((CardLayout) panel1.getLayout()).show(panel1, "3");

							} else if (user.getIdentity().equals("User")) {

								cartPanel.uploadItemComp();
								((CardLayout) panel1.getLayout()).show(panel1, "2");
							}
						}

					}

					if (!valid) {

						JOptionPane.showMessageDialog(null, "The username or password is wrong", "Error",
								JOptionPane.ERROR_MESSAGE);
					}

				} catch (NumberFormatException error) {

					JOptionPane.showMessageDialog(null, "Please enter the relevant information correctly", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		}

		ClickListener listener = new ClickListener();
		this.loginButton.addActionListener(listener);
	}
}
