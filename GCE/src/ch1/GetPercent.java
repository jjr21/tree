package ch1;

import javax.swing.JOptionPane;

public class GetPercent {
	public static void main(String[] args) {
		double score;
		String str;
		double p;
		str = JOptionPane.showInputDialog("Enter your socre : ");
		score = Double.parseDouble(str);
		p =GetPEC(score);
		JOptionPane.showMessageDialog(null, "Your score based on percent : " + p );
		System.exit(0);
	}
	public static double GetPEC(double i) {
		double result;
		result = i *100;
		return result;
	}

}
