package ch1;

public class LengthDemo {
	
	public static void main(String[] args) {
		Rectangle box = new Rectangle();
		
		System.out.print("Send ten value to setLength in rectangle file ");
		box.setLength(10.0);
		
		// width
		box.setWidth(8.0);
		
		System.out.println("the length is : " + box.getLength()+ " the width is : "+ box.getWidth());
		System.out.println("the area : " + box.getArea());
		
		//calling to rectangle 2
		Rectangle2 box2 = new Rectangle2(3.0, 4.9);
		System.out.println("The length is : " + box2.getLength() + " the width is : " + box2.getWidth()); 
		
	}
	
	

}
