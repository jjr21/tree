package ch1;

public class Rectangle {

	private double length;
	private double width;

	
	public void setLength(double l) {
		length = l;
		
	}
	
	public void setWidth(double w) {
		width = w;
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}

	public double getArea() {
		return width * length;
	}
}
