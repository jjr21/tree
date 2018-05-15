package ArraySession;

public class Array {
	public static void main(String[] args) {
		int[] numbers;
		numbers = new int[6];
		int d = 10;
		for(int c = 0; c<6; c++)
		{
			numbers[c] = d;
			d +=10;
			System.out.println(numbers[c]);
		}
		String[] names = new String[10];
		names[0] = "JJ";
		System.out.println(names[0]);
		System.exit(0);
		
	}

}
