package RaceCars;

public class Segment {
	private int segmentCount;  //hold for segment count
	
	public Segment() {
		segmentCount = 0;
	}
	
	public Segment(int c) {
		segmentCount = c;
	}
	
	public void addCount(int sc) {
		segmentCount += sc;
	}

	public void setCount(int set) {
		segmentCount = set;
	}
	public int getCount() {
		return segmentCount;
	}
}
