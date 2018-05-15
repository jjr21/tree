package TradeSession;

public class runTestThread {

	public static void main(String[] args) {
		
		for (int i = 0; i<8; i++) {
			testThread objectThread = new testThread();
			objectThread.start();
		}
	}
}
