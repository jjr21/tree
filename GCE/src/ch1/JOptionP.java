package ch1;

import javax.swing.JOptionPane;

public class JOptionP {

	public static void main(String[] args) {
		
		Object[] options = {"Continue", "stop", "reset"};
		int x = JOptionPane.showOptionDialog(null, "Continue?", "BlackJack 21", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		
		if(x == 0) {
			  System.out.println("Hello Mars");
			  
			} 
			if(x == 1) {
				System.out.println("Hey Venus");
			}
			if(x==2) {
			  System.out.println("No Option");
			} 
		/*
		int dialogButton = JOptionPane.YES_NO_CANCEL_OPTION;
		int dialogResult = JOptionPane.showConfirmDialog(null, "Your Message", "Title on Box", dialogButton);
		if(dialogResult == 0) {
		  System.out.println("Yes option");
		  
		} 
		if(dialogResult == 1) {
			System.out.println("Hey Earth");
		}
		else {
		  System.out.println("No Option");
		} 
		*/
		
		
		/*
		Object[] options = {"Yes, please",
        "No way!"};
		int n = JOptionPane.showOptionDialog(null,"Would you like green  eggs and ham?","A Silly Question",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,     //do not use a custom Icon
				options,  //the titles of buttons
				options[0]); //default button title
				*/
	}
}
