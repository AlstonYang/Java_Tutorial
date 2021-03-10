import java.util.Scanner;

public class QuizDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		System.out.println(presentQuiz(Q1));
		System.out.println();
		System.out.println(presentChoiceQuiz(Q2));
		System.out.println();
		System.out.println(presentTrueFalseQuiz(Q3));
	}
	
	
	public static boolean presentQuiz(Quiz quiz) {
		
		Scanner input = new Scanner(System.in);
		quiz.display();
		System.out.print("Your answer:");
		return quiz.checkAnswer(input.nextLine());
	}
	
	public static boolean presentChoiceQuiz(ChoiceQuiz quiz) {
		
		Scanner input = new Scanner(System.in);
		quiz.display();
		System.out.print("Your answer:");
		return quiz.checkAnswer(input.nextLine());
	}

	public static boolean presentTrueFalseQuiz(TrueFalseQuiz quiz) {
	
		Scanner input = new Scanner(System.in);
		quiz.display();
		System.out.print("Your answer:");
		return quiz.checkAnswer(input.nextLine());
	}
	
}
