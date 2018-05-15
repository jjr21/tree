package BlackJack;

public class Point {
	private int win;
	private int lose;
	private int ratio;
	private int ratio2;
	private int perfectBlackJack;
	
	public Point() {
		win = 0;
		lose = 0;
		ratio = 0;
		perfectBlackJack = 0;
	}
	public Point(int w, int l) {
		win = w;
		lose = l;
		
	}
	
	public void setWin(int w) {
		win = w;
	}
	public void setLose(int l) {
		lose = l;
	}
	
	public void setBlackJack(int blackjackk) {
		perfectBlackJack = blackjackk;
	}
	public void addWin(int wn) {
		win += wn;
	}
	public void addLose(int ls) {
		lose += ls;
	}
	/*
	public void importRatio(double rt) {
		ratio = rt;
	}
	*/
	public void addBlackJack(int b) {
		perfectBlackJack += b;
	}
	public int getWin() {
		return win;
	}
	public int getLose() {
		return lose;
	}
	public void setRatio(int r) {
		r = win;
		
	}
	public void setRatio2(int r2) {
		r2 = lose;
		
	}
	public int getRatio() {
		return ratio;
	}
	public int getRatio2() {
		return ratio2;
	}
	public int getBlackJack() {
		return perfectBlackJack;
	}

}
