import java.util.ArrayList;

public class TrueFalseQuiz extends Quiz {

	private ArrayList<String> choices;
	
	public TrueFalseQuiz() {
		
		choices = new ArrayList<String>();
		choices.add("True");
		choices.add("False");
	}
	
	
	public void display() {
		super.display();
		
		for (int i=0; i<choices.size();i++) {
			System.out.printf("%s\n",choices.get(i));
		}
	}
}
