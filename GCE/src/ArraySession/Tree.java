package ArraySession;

import java.util.ArrayList;

public class Tree {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("JJ");
		name.add("Rogers");
		name.add("Tong");
		name.add("Magic");
		name.add("Moshu");
		name.add("Bella");
		name.add("Buster");
		name.add("Diego");
		name.add("Golden");
		name.add("Roxy");
		name.add("Gigi");
		System.out.println(name);
		//name.clear();
		//System.out.println("After clear function " + name);
	/*
		String Aobject = "tree";
		Aobject = name.get(1).toString();
		System.out.println(Aobject);
		*/
		
	      ArrayList<String> list = new ArrayList<String>();
	      list = name;
	      list.add("Yoda");
	      System.out.println(list);
	      System.out.println(name);
	      if(list.clone().equals(name)) {
	    	  System.out.println("Clone is true");
	      }
	      else {
	    	  System.out.println("Clone is false");
	      }
	      
		
		
	}

}
