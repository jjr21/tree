package splashScreen;

import javax.swing.JOptionPane;

public class runThread extends Thread{

	public static void main(String[] args) {
		 
			
			
			
		
		String input;
		input = JOptionPane.showInputDialog("Enter your name : ");
		String name;
		name = input;
		int age;
		input = JOptionPane.showInputDialog("Enter your Age : ");
		age = Integer.parseInt(input);
		Thread t = Thread.currentThread();
		System.out.println("Current thread in main : " + t.getName());
		t.setName("Star Wars Main");
		System.out.println("After changed name in main : " + t.getName());
		System.out.println("Main Thread priority : " + t.getPriority());
		t.setPriority(MAX_PRIORITY); //10
		System.out.println("After Changed, Main Thread priority : " + t.getPriority());
		
		//Child Thread
		ThreadComboBoxWindow box = new ThreadComboBoxWindow();
		System.out.println("Get Priority in Child Main : " + box.getPriority());
		box.setPriority(MIN_PRIORITY);
		System.out.println("After changed, Get Priority in Child Main : " + box.getPriority());
		ThreadComboBoxWindow box2 = new ThreadComboBoxWindow();
		try {
			System.out.println("Enter try loop");
			box2.start();
			box2.join();
			System.out.println("Passed the Yhread Join Function");
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		String str = "Your name : "+ name + " , your age : " + age;
		JOptionPane.showMessageDialog(null,str);
	}
}
