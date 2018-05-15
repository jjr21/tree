package RaceCars;

public class CarPolicy extends Segment {
	private int count;
	
 
	public CarPolicy() {
		count = 0;
	}
	public CarPolicy(int a) {
		count = a;
	}
	public void addLap(int l) {
		count += l;
	}
	public void setLap(int la) {
		count = la;
	}
	public int getLap() {
		return count;
	}
}
