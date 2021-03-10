import java.util.Scanner;

public class QuizDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		QuizDemo1 test = new QuizDemo1();
		
		Quiz Q1 = new Quiz();
		Q1.setText("What is the result of 52 + 47 = ?");
		Q1.setAnswer("99");
		
		ChoiceQuiz Q2 = new ChoiceQuiz();
		Q2.setText("What is the result of 13 + 14 = ?");
		Q2.addChoices("25", false);
		Q2.addChoices("26", false);
		Q2.addChoices("27", true);
		Q2.addChoices("28", false);	
		
		TrueFalseQuiz Q3 = new TrueFalseQuiz();
		Q3.setText("The result of \"16 + 13 = 29\" is true?");
		Q3.setAnswer("True");
		
		Q1.display();
		System.out.print("Your answer:");
		System.out.println(Q1.checkAnswer(input.nextLine()));
		
		System.out.println();
		
		Q2.display();
		System.out.print("Your answer:");
		System.out.println(Q2.checkAnswer(input.next()));
		
		System.out.println();
		
		Q3.display();
		System.out.print("Your answer:");
		System.out.println(Q3.checkAnswer(input.next()));
	}

}
