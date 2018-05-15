package Inheritance;

import javax.swing.JOptionPane;

public class GradeDemo {

	public static void main(String[] args) {
		
		String input;
		double testScore;
		
		GradeActivity grade = new GradeActivity();
		
		input = JOptionPane.showInputDialog("Enter the score : ");
		
		testScore = Double.parseDouble(input);
		
		grade.setScore(testScore);
		
		JOptionPane.showMessageDialog(null, "your grade based on exam : " + grade.getGrade());
		
		System.exit(0);
	}
}
