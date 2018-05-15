package Abstract;

public abstract class Student {

	private String name;
	private int id;
	
	
	public Student(String n) {
		name = n;
	}
	
	public void setID(int i) {
		id = i;
	}
	
	public String getName() {
		return name;
	}
	public int getID() {
		return id;
	}
	
	public abstract int getGrade();
	

}
