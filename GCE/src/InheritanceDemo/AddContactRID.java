package InheritanceDemo;

import javax.swing.JOptionPane;

public class AddContactRID {

	public static void main(String [] args) {
		String input;
		int numberID;
		int numberOfEmp;
		int phoneNum;
		
		
		input = JOptionPane.showInputDialog("What is your ID for employed : ");
		numberID = Integer.parseInt(input);
		input = JOptionPane.showInputDialog("How many employed works at RID : ");
		numberOfEmp = Integer.parseInt(input);
		RID contact = new RID(numberID, numberOfEmp);
		
		input = JOptionPane.showInputDialog("what is your first name :");
		contact.setFirstName(input);
		input = JOptionPane.showInputDialog("what is your last name :");
		contact.setLastName(input);
		input = JOptionPane.showInputDialog("What is your phone number : " );
		phoneNum = Integer.parseInt(input);
		contact.setPhone(phoneNum);
		input = JOptionPane.showInputDialog("What is your email : " );
		contact.setEmail(input);
		
		JOptionPane.showMessageDialog(null, "Your first name : " + contact.getFirstName() + " \n Your Last Name : " + contact.getLastName() +
				"\n Your ID : " + contact.getEmployedID() + "\n Your phone number : " + contact.getPhone() + " \n Your email : " +
				contact.getEmail() + "\n There is total of employed at RID : " + contact.getNumberOfEmployed());
		
		System.exit(0);
	}
}
