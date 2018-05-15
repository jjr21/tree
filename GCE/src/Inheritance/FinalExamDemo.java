package Inheritance;

import javax.swing.JOptionPane;

public class FinalExamDemo {

	public static void main(String[] ags) {
		String input;
		int questions;
		int missed;
		
		
		input = JOptionPane.showInputDialog("Enter your final exam's score : " );
		
		questions = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Enter your final exam's missed : " );
		missed = Integer.parseInt(input);
		
		FinallExam examgrade = new FinallExam(questions, missed);
		
		
		JOptionPane.showMessageDialog(null, "Each questions count " + examgrade.getPointEach()  + " points .\nThe exam score is " + examgrade.getScore() + " \nThe exam grade is " +
		 examgrade.getGrade());
		
		System.exit(0);
		
		
	}
}
