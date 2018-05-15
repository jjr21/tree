package ch1;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class BankBalance {
	
	public static void main(String[] args) {
		String input;
		
		DecimalFormat dollar = new DecimalFormat("#,###.00");
		
		OverLoadingMethod bank = new OverLoadingMethod();
		
		input = JOptionPane.showInputDialog("Enter the balance for account : ");
		
		bank.setBalance(input);
		JOptionPane.showMessageDialog(null, "Your total account not included benefit : " + bank.getBalance());
	
		input = JOptionPane.showInputDialog("Enter the benefit : ");
		bank.deposit(input);
		
		JOptionPane.showMessageDialog(null, "Your total account included benefit : " + bank.getBalance());
		
		input = JOptionPane.showInputDialog("How much do you want to withdraw : " );
		bank.withdraw(input);
		JOptionPane.showMessageDialog(null, "After withdraw, your balance : " + bank.getBalance());
		
		System.exit(0);
	}

}
