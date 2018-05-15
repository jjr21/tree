package AssessmentRaceCars;

public class SegmentCount {
	
	private int count;
	
	
	
	public SegmentCount() {
		count = 0;

	}
	
	public SegmentCount(int c) {
		count = c;
	}
	
	public void AddCount(int c) {
		count += c;
	}
	
	public void SetCount(int cnt) {
		count = cnt;
	}
	
	public int GetCount() {
		return count;
	}
	 
	

}
