import java.util.ArrayList;

public class ChoiceQuiz extends Quiz{

	
	private ArrayList<String> choices;
	
	public ChoiceQuiz() {
		
		choices = new ArrayList<String>();
	}
	
	public void addChoices(String choice, boolean correct) {
		
		choices.add(choice);
		
		if(correct) {  
			this.setAnswer(Integer.toString(choices.size()));
		}
	}
	
	public void display() {
		super.display();
		
		for (int i=0; i<choices.size();i++) {
			System.out.printf("%d:%s\n",i+1,choices.get(i));
		}
	}

}
