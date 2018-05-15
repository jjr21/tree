package ArraySession;

import java.util.ArrayList;

public class TreeVsBranch {

	public static void main(String[] args) {
		ArrayList<String> AppleTree = new ArrayList<String>();
		AppleTree.add("Granny Smith");
		AppleTree.add("Jonagold");
		AppleTree.add("Nothern Spy");
		AppleTree.add("Mutsu");
		System.out.println("List of JJ's favorite apples : " + AppleTree);
	
		String[] BranchTree= {"Branchles", "Spray", "Surcle", "Surculus", "Ramulus"};
		for(int i = 0; i< 5; i++) {
			if(i ==0) {
				System.out.println( "Array Function");
			}
			System.out.println(BranchTree[i]);
		}
		System.exit(0);
}
}
