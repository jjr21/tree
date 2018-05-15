package ch1;

import javax.swing.JOptionPane;

public class ContORest {
	
	public static void main(String[] args) {
		Object[] options = {"Yes, Continue", "No, Quit", "Reset"};
		int agen = JOptionPane.showOptionDialog(null, "Do you want to continue?", "BlackJack 21", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		
		if(agen == 0) {
			  Reset();
			  
			} 
			if(agen == 1) {
				Reset();
			}
			if(agen==2) {
			  Reset();
			} 
	}
	public static int Reset() {
		int y =0;
		return y;
	}

}
