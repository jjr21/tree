package ch1;


public class LoopPeriod {
	public static void main(String[] args) throws java.io.IOException {
		char s;
		int count = 0;
		int li = 1;
		
		System.out.println( " enter . to stop the loop ");
		while (li <2) {
		s  = (char) System.in.read();

		if (s == ' ') {
			count ++;
		}
		else if (s <= 'a') {
			count ++;
		}
		else {
			li ++;
			System.out.println("total of space : " + count);
		}
		
		}
		System.exit(0);
	}

}
