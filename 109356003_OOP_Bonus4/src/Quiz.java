
public class Quiz {
	
	private String text;
	private String answer;

	public Quiz() {
		text = "";
		answer = "";
	}
	
	public void setText(String questionText) {
		
		this.text = questionText;
	
	}
	
	public void setAnswer(String correctResponse) {
	
		this.answer = correctResponse;
		
	}
	
	public boolean checkAnswer(String response) {
		
		return response.equals(this.answer);
	}
	
	public void display() {
		
		System.out.println(text);
		
	}
	
}
