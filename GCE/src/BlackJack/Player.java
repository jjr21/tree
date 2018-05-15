package BlackJack;

public class Player {

	private int amount;
	
	public Player() {
		amount = 1000;
	}
	
	public Player(int a) {
		amount = a;
	}
	
	public void setPlayer(int am) {
		amount = am;
	}
	public void subPlayer(int neg) {
		amount -= neg;
	}
	public void addPlayer(int pos) {
		amount += pos;
	}
	
	public int getPlayerAmount() {
		return amount;
	}
	
	
}