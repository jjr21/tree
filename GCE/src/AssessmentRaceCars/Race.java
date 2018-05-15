package AssessmentRaceCars;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;

public class Race {
	
	public static void main(String[] agrs) {
		
		Car();
		System.exit(0);
		}
	
	public static void Car() {
		SegmentCount sc = new SegmentCount();
		int segCount1 = 0;
		int input1;
		int carA;
		carA= 0;
		FirstCarPolicy car1 = new FirstCarPolicy();
		input1 = car1.GetCount1();
		int c1 = input1;
		while (c1 < 100) {
			car1.AddCount(carA);
			//System.out.println(car1.GetCount1());
			c1 = car1.GetCount1();
			carA = 3;
			segCount1 ++;
		}
		//System.out.println(" car 1 : " + segCount1);
		sc.AddCount(segCount1);
	//	System.out.println("car 1 : " + sc.GetCount());
	//}
	//public static void secondCar() {
		/*
		SegmentCount2 sc2 = new SegmentCount2();
		int segCount2 = 0;
		int input2;
		int carB;
		carB= 0;
		SecondCarPolicy car2 = new SecondCarPolicy();
		input2 = car2.GetCount2();
		int c2 = input2;
		while (c2 < 100) {
			car2.AddCount(carB);
			//System.out.println(car2.GetCount2());
			c2 = car2.GetCount2();
			carB = ThreadLocalRandom.current().nextInt(2,5);
			segCount2 ++;
		}
		//System.out.println(" car 2 : " + segCount2);
		sc2.AddCount(segCount2);
		System.out.println(" car 2 : " + sc2.GetCount());
		*/
		SegmentCount sc2 = new SegmentCount();
		int segCount2 = 0;
		int input2;
		int carB;
		carB= 0;
		FirstCarPolicy car2 = new FirstCarPolicy();
		input2 = car2.GetCount1();
		int c2 = input2;
		while (c2 < 100) {
			car2.AddCount(carB);
			//System.out.println(car2.GetCount2());
			c2 = car2.GetCount1();
			carB = ThreadLocalRandom.current().nextInt(2,5);
			segCount2 ++;
		}
		//System.out.println(" car 2 : " + segCount2);
		sc2.AddCount(segCount2);
	//	System.out.println(" car 2 : " + sc2.GetCount());
	//}
	//public static void thirdCar() {
		SegmentCount sc3 = new SegmentCount();
		int segCount3 = 0;
		int input3;
		int carC;
		carC= 0;
		FirstCarPolicy car3 = new FirstCarPolicy();
		input3 = car3.GetCount1();
		int c3 = input3;
		while (c3 < 100) {
			car3.AddCount(carC);
			//System.out.println(car3.GetCount3());
			c3 = car3.GetCount1();
			carC = ThreadLocalRandom.current().nextInt(1,6);
			segCount3 ++;
	}
		sc3.AddCount(segCount3);
		//System.out.println(" car 3 : " + segCount3);
		//final result
		int final1 = sc.GetCount();
		int final3 = sc3.GetCount();
		int final2 = sc2.GetCount();
		JOptionPane.showMessageDialog(null, "The result of race: Race Car 1 has segment : " + final1
				+ " , Race Car 2 segment : " + final2 + 
				" , Race Car 3 has segment : " + final3);
		
		if ( final1 > final2 && final1 > final3) {
			JOptionPane.showMessageDialog(null, "The first car is in first place");
		}
		  else if (final2 > final3 && final2 > final1) {
			JOptionPane.showMessageDialog(null, "The second car is in the first place" );
		}
		  else if (final3 > final1 && final3 > final2) {
			  JOptionPane.showMessageDialog(null, "The third car is in the first place");
		  }
		  else if ( final1 == final2 && final2 == final3) {
			  JOptionPane.showMessageDialog(null, "first and second and third were tied");
		  }
		  else if ( final1 == final2) {
			  JOptionPane.showMessageDialog(null, "first and second were tied");
		  }
		  else if ( final1 == final3) {
			  JOptionPane.showMessageDialog(null, "first and third were tied");
		  }
		  else if ( final2 == final3) {
			  JOptionPane.showMessageDialog(null, "second and third were tied");
		  }
		  else {
			  JOptionPane.showMessageDialog(null, "The race isnt complete");
		  }
	}
}

