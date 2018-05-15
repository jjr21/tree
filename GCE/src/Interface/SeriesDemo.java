package Interface;

public class SeriesDemo {

	public static void main(String[] args) {
		Bytwo ob = new Bytwo();
		
		for (int x = 0; x <5; x++) {
			System.out.println("Next value : " + ob.getNext());
			System.out.println("\nResetting");
			ob.reSet();
			for (int y=0; y<5; y++) {
				System.out.println("Next value : " + ob.getNext());
				
			}
			System.out.println("\nStarting at 100");
			ob.setStart(100);
			for (int c = 0; c<5; c++) {
				System.out.println("Next value : " + ob.getNext());
			}
			
		}
	}
}
