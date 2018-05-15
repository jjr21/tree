package oca;

public class staticCount {

	 static int count;
	static {
		count = 0;
	}
	staticCount(){
		count++;
	}
	public static void main(String[] args) {
		count ++;
		staticCount a = new staticCount();
		staticCount b = new staticCount();
		staticCount c = new staticCount();
		System.out.println(b.count);
	}
}
