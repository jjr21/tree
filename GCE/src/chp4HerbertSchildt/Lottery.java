package chp4HerbertSchildt;

public class Lottery {

	private int first, second, third, fourth, fifth, megaNumber;
	
	public Lottery() {
		first = 0;
		second = 0;
		third = 0;
		fourth = 0;
		fifth = 0;
		megaNumber = 0;
	}
	
	public void setFirst (int a) {
		first = a;
	}
	
	public void setSecond( int b) {
		second = b;
	}
	public void setThird(int c) {
		third = c;
	}
	public void setForth(int d) {
		fourth = d;
	}
	public void setFifth(int e) {
		fifth = e;
	}
	public void setMegaNumber(int z) {
		megaNumber = z;
	}
	
	public int getFirst() {
		return first;
	}
	public int getSecond() {
		return second;
	}
	public int getThird() {
		return third;
	}
	public int getFourth() {
		return fourth;
	}
	public int getFifth() {
		return fifth;
	}
	public int getMegaNumber() {
		return megaNumber;
	}
}
