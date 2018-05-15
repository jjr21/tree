package RogersPizza;


public class Hold extends Pizza {
	private int hold;

	
	public Hold() {
		hold = 0;
		
	}
	
	public Hold(int i) {
		hold = i;
	}

	public void setHold(int h) {
		hold = h;
	}
	public void addHold() {
		int add = 1;
		hold += add;
	}
	public int getHold() {
		return hold;
	}
	
	
	
	
	
	

}
