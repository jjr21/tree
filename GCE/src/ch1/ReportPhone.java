package ch1;

import java.util.Scanner;

public class ReportPhone {

	public static void main(String[] args) {
		double phoneNumber;
		String phoneBrand;
		double phoneAge;
		String phoneModel;
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Enter the phone brand : ");
		phoneBrand = keyboard.nextLine();
		
		
	
		
		System.out.println("Enter the phone's model : ");
		phoneModel = keyboard.nextLine();
		
		System.out.println("Enter the phone's age : ");
		phoneAge = keyboard.nextDouble();
		
		System.out.println("Enter your phone number : ");
		phoneNumber = keyboard.nextDouble();
		
		Phone phone = new Phone();
		PhoneAge phoneage = new PhoneAge();
		PhoneModel phonemodel = new PhoneModel();
		
		
		phone.setNumber(phoneNumber);
		phone.setBrand(phoneBrand);
		 
		phoneage.setAge(phoneAge);
		
		phonemodel.setModel(phoneModel);
		
		System.out.println("Your phone's number is : " + phone.getNumber() + " , Brand is : " + phone.getBrand() + " , Age is : " + phoneage.getAge() + " , Model is " + phonemodel.getModel());
		
		System.exit(0);
	}
}
