package splashScreen;

import javax.swing.JOptionPane;

public class ThreadComboBoxWindow extends Thread{
	private ComboBoxWindow box;
	public void run() {
		box = setComboBox();	
		
		
	}
	
	public static ComboBoxWindow setComboBox() {
		return new ComboBoxWindow();
	}
	

}
