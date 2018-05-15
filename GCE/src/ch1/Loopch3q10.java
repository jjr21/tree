package ch1;

import javax.swing.JOptionPane;

public class Loopch3q10 {

	public static void main(String[] agrs) throws java.io.IOException {
		
		int count = 0;
		char key;
		String arg1 = "Enter period to stop";
		JOptionPane.showMessageDialog(null, arg1);
		
		boolean access;
		
		while(access = true) {
			key = (char) System.in.read();
			if(key >= 'a') {
				key -= 32;
				count ++;
				System.out.println(key);
			}
			else if(key <= 'z') {
				key -= 32;
				count ++;
				System.out.println(key);
			}
			else if(key >= 'A') {
				key += 32;
				count ++;
				System.out.println(key);
			}
			else if(key >= 'Z') {
				key += 32;
				count ++;
				System.out.println(key);
			}
			else if (key != '.') {
				access = false;
			}
			
			System.out.println("count : " + count);
		}
		
	}
}
