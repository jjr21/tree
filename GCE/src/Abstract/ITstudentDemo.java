package Abstract;

import javax.swing.JOptionPane;

public class ITstudentDemo {

	public static void main(String[] args) {
		String n;
		n = JOptionPane.showInputDialog(" Name : ");
		ITstudent it = new ITstudent(n);
		int d = 32;
		it.setID(d);
		JOptionPane.showMessageDialog(null, "Your name : " + it.getName() + " your id : " + it.getID() + " your unit : " + it.getGrade());
	}
}
