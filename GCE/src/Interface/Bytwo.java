package Interface;

public class Bytwo implements Series{
	
	int start;
	int val;
	
	 public Bytwo() {
		start =0;
		val = 0;
	}
	public int getNext() {
		val += 2;
		return val;
	}
	public void reSet() {
		val = start;
	}
	public void setStart(int x) {
		start = x;
		val = x;
	}
	

}
