package ch1;

import java.util.Random;
import javax.swing.JOptionPane;

public class SamRandom {
	
	public static void main(String[] agrs) {
	Random ran = new Random();
	String str;
	JOptionPane.showMessageDialog(null, "The random is " + ((Random) ran));

}
}
