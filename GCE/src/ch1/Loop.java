package ch1;

public class Loop {

	public static void main(String[] args) throws java.io.IOException {
		char c;
		int spaces = 0;
		 System.out.println("enter the period to stop");
		 
		 
		 do {
			 c = (char) System.in.read();
			 if (c == ' ') spaces ++;
			 
		 }
		 while (c  != '.'); {
			 System.out.print("Spaces : " + spaces);
		 }
	}
	
}
