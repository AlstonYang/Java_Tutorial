import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RegisterFrame extends JFrame{

	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 300;
	private static final int FIELD_WIDTH = 10;
	private static final int COLUMN = 40;
	
	private final Register register;
	private JPanel panel;
	private JPanel stuPanel;
	private JPanel courPanel;
	private JPanel butPanel;
	
	private JLabel studentIDLabel;
	private JLabel courseIDLabel;

	private JTextField studentIDField;
	private JTextField courseIDField;
	
	private JButton studentInfoButton;
	private JButton courseInfoButton;
	private JButton enrollButton;
	private JButton dropButton;
	
	private JTextArea resultArea;
	
	public RegisterFrame() {
		
		register = new Register();
		
		register.addCourse("306050001", "OOPI", 2);
		register.addCourse("306050021", "ICS", 2); 
		register.addCourse("301303999", "Intern", 3);
		register.addStudent("109356501", "A");
		register.addStudent("109356510", "B");

		this.setTitle("Course Register");
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.createPanel();
	}
	
	public void createStudentIDComp() {
		
		stuPanel = new JPanel();
		studentIDLabel = new JLabel("Student ID:");
		studentIDField = new JTextField(FIELD_WIDTH);
		studentInfoButton = new JButton("Student INFO");
		stuPanel.add(studentIDLabel);
		stuPanel.add(studentIDField);
		stuPanel.add(studentInfoButton);
		
		class ClickListener implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
				
				String studentID = studentIDField.getText();
				Student findedStudent = register.findStudent(studentID);
				
				if (findedStudent != null) {
					
					resultArea.setText(findedStudent.getInfo());
				
				}else {
					
					resultArea.setText("Cannot find the student");
				}
				
			}
		}
		
		ClickListener listener = new ClickListener();
		studentInfoButton.addActionListener(listener);
	}
	
	public void createCourseIDComp() {
		
		courPanel = new JPanel();
		courseIDLabel = new JLabel ("Course ID:");
		courseIDField = new JTextField(FIELD_WIDTH);
		courseInfoButton = new JButton("Course INFO");
		courPanel.add(courseIDLabel);
		courPanel.add(courseIDField);
		courPanel.add(courseInfoButton);
		
		class ClickListener implements ActionListener{
			
			public void actionPerformed(ActionEvent e) {
				
				String courseID = courseIDField.getText();
				Course findedCourse = register.findCourse(courseID);
				
				if (findedCourse != null) {
					
					resultArea.setText(findedCourse.getInfo());
				}else {
					
					resultArea.setText("Cannot find the course");
				}
			}
		}
		
		ClickListener listener = new ClickListener();
		courseInfoButton.addActionListener(listener);
	}
	
	public void createEnrollBtn() {
		
		enrollButton = new JButton("Enroll");
		
		class ClickListener implements ActionListener{
			
			public void actionPerformed(ActionEvent e) {
				
				String studentID = studentIDField.getText();
				String courseID = courseIDField.getText();
				
				if(register.enrollCourse(studentID, courseID)) {
					
					resultArea.setText(String.format("%s enrolled in %s", studentID, courseID));
				}else {
					
					resultArea.setText("Error");
				}
			}
		}
		
		ClickListener listener = new ClickListener();
		enrollButton.addActionListener(listener);
	}
	
	public void createDropBtn() {
		
		dropButton = new JButton("Drop");
		
		class ClickListener implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
				
				String studentID = studentIDField.getText();
				String courseID = courseIDField.getText();
				
				if(register.dropCourse(studentID, courseID)) {
					
					resultArea.setText(String.format("%s dropped out of %s", studentID, courseID));
				}else {
					
					resultArea.setText("Error");
				}
			}
		}
		
		ClickListener listener = new ClickListener();
		dropButton.addActionListener(listener);
	}
	
	public void createPanel() {
		
		
		panel= new JPanel();
		resultArea= new JTextArea(FRAME_HEIGHT,COLUMN);
		resultArea.setLineWrap(true);

		butPanel = new JPanel();
		
		JScrollPane scrollPane = new JScrollPane(resultArea);
	
		createStudentIDComp();
		createCourseIDComp();
		createEnrollBtn();
		createDropBtn();
		
		butPanel.add(enrollButton);
		butPanel.add(dropButton);
		
		panel.add(this.stuPanel);
		panel.add(this.courPanel);
		panel.add(this.butPanel);
		panel.add(scrollPane);
//		
		this.add(panel);
		
	}
	
	
}
