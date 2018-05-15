package splashScreen;

import java.util.concurrent.CountDownLatch;

import javax.swing.JOptionPane;

public class JoinThread{

	public static void main(String[] args) throws InterruptedException {
		String input;
		input = JOptionPane.showInputDialog("Enter your name : ");
		String name;
		name = input;
		int age;
		input = JOptionPane.showInputDialog("Enter your Age : ");
		age = Integer.parseInt(input);
		
		CountDownLatch loginSignal = new CountDownLatch(1);
		 
		ThreadComboBoxWindow box = new ThreadComboBoxWindow();
		
		
		loginSignal.countDown();
		
		try {
			System.out.println("Enter try loop");
			box.start();
			box.run();
			box.join();
			System.out.println("Passed the Yhread Join Function");
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		loginSignal.await();
		String str = "Your name : "+ name + " , your age : " + age;
		JOptionPane.showMessageDialog(null,str);
	}
}
