package Interface;

public class Surf implements InterfaceSurf{
	private int temp;
	private int windy;
	private String tide;
	private int feetWave;
	public Surf() {
		temp = 0;
		windy = 0;
		tide = " ";
	}
	public void setTemp(int t) {
		temp = t;
		
	}
	public void setWindy(int w) {
		windy = w;
	}
	public void setTide(String t) {
		tide = t;
	}
	public void setWave(int f) {
		feetWave = f;
	}
	public int getTemp2() { 
		return temp;
	}
	public int getWindy() {
		return windy;
	}
	public String getTide() {
		return tide;
	}
	public int getWave() {
		return feetWave;
	}
	
}
