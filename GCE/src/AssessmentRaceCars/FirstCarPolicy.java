package AssessmentRaceCars;
import java.util.Random;


public class FirstCarPolicy {
	private int count1 = 0;

	Random Rdm = new Random();
	
	public  FirstCarPolicy() {
		
		int count1 = 0;
		
	}
	
	public void AddCount(int i) {
	
		count1 += i;

	}
	
	public void SetCount(int s) {
		count1 = s;
	}
	
	public int GetCount1() {
		return count1;
	}
}