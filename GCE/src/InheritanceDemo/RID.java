package InheritanceDemo;

import javax.swing.JOptionPane;

public class RID  extends ContactInfo{
	
	private int EmployedID;
	private int NumberOfEmployed;

	
	public RID(int id, int number) {
		EmployedID = id;
		NumberOfEmployed = number;
		
		setID(EmployedID);
		
		JOptionPane.showMessageDialog(null, "HI from RID JAVA");
	} 

	public int getEmployedID() {
		return EmployedID;
	}
	
	public int getNumberOfEmployed() {
		return NumberOfEmployed;
	}
	
	
}
