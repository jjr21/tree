package Inheritance;

public class GradeActivity {

	private double score;
	
	public void setScore(double s) {
		score = s;
	}
	public double getScore() {
		return score;
	}
	
	public char getGrade() {
		char letterGrade;
		
		if (score>90) {
			letterGrade = 'A';
		}
		else {
			letterGrade = 'F';
		}
		return letterGrade;
	}
}
