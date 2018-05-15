package Abstract;

public class ITstudent extends Student{

	private int a = 99;

	public ITstudent(String n) {
		super(n);
	}

	public void setGrade(int aa, int bb) {
		a = aa;
	
	}
	public int getGrade() {
		
		
		
		return a;
		
	}
}

