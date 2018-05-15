package RogersPizza;

import javax.swing.JOptionPane;

public class Pizza {

	private String size, cheese, vegatable, meat;
	private String later;
	public Pizza() {
		size = " ";
		cheese = " ";
		vegatable = " ";
		meat = " ";
		
	}
	
	public void setSize(String s) {
		size = s;
	}
	public void setCheese(String c) {
		cheese = c;
	}
	public void setVegatable(String v) {
		vegatable = v;
	}
	public void setMeat(String m) {
		meat = m;
	}
	public void setLater() {
		later = JOptionPane.showInputDialog("Later or Now? ");
		 
	}
	public void setLater2(String s) {
		later = s;
		
	}
	public String getLater() {
		return later;
	}
	public String getSize() {
		return size;
	}
	public String getCheese() {
		return cheese;
	}
	public String getVegatable() {
		return vegatable;
	}
	public String getMeat() {
		return meat;
	}
}
