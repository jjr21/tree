package Inheritance;

public class FinallExam extends GradeActivity{
	private int numQuestions;
	private double pointsEach;
	private int numMissed;
	
	public FinallExam(int questions, int missed) {
		numQuestions = questions;
		numMissed = missed;
		
		double numericScore;
		pointsEach = 100 / questions;
		numericScore = 100 - (missed * pointsEach);
		
		setScore(numericScore);	
	}
	
	public double getPointEach() {
		return pointsEach;
	}
	
	public int getNumMissed() {
		return numMissed;
	}

}
