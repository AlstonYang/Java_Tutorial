
public class Grading {

	private int passMark;
	
	public Grading(int passMark) {
		this.passMark = passMark;
	}
	
	public void setPassMark(int passMark) {
		this.passMark = passMark;
	}
	
	public int getPassMark() {
		return passMark;
	}
	
	public String toLetterGrade(int score) {
		if(score>=80) {
			return "A";
		}else if(score >=70) {
			return "B";
		}else if(score >=60) {
			return "C";
		}else if(score >=50) {
			return "D";
		}else if(score >0) {
			return "E";
		}
		return "X";
	}
	
	public int calculateAvg(int[] grades) {
		int zero_count =0;
		int sum =0;
		
		for(int i=0; i<grades.length;i++) {
			sum += grades[i];
			if(grades[i]==0) {
				zero_count +=1;
			}
		}
		return sum/(grades.length-zero_count);
	}
	
	public String summarizeGrade(int[] grades) {
		int passCount=0;
		int failCount=0;
		
		for(int i=0; i<grades.length;i++) {
			if(grades[i]!=0) {
				if(grades[i]>=60) {
					passCount+=1;
				}else {
					failCount+=1;
				}
			}
		}
		String message ="";
		message = String.format("Avg. Score: %d\nPass: %d, failed: %d", this.calculateAvg(grades),passCount,failCount);
		return message;
	}
}
