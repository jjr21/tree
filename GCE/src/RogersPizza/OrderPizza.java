package RogersPizza;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class OrderPizza {

	public static void main(String[] args) throws java.io.IOException{
	
	String size, cheese, vegatable, meat;
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter size for pizza: ");
	size = (scanner.next());
	
	System.out.println("Enter cheese for pizza: ");
	cheese = (scanner.next());
	
	System.out.println("Enter vegatable for pizza: ");
	vegatable = (scanner.next());

	
	System.out.println("Enter meat for pizza: ");
	meat = (scanner.next());
	
	
	Hold hold = new Hold();
	hold.setSize(size);
	hold.setCheese(cheese);
	hold.setVegatable(vegatable);
	hold.setMeat(meat);
	System.out.println("Size : " + hold.getSize());
	System.out.println("cheese : " + hold.getCheese());
	System.out.println("Vegatable : " + hold.getVegatable());
	System.out.println("Meat : " + hold.getMeat());
	System.out.println("Your number order : "  + hold.getHold());
	


	
}
	
	
}
