package RaceCars;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;

import AssessmentRaceCars.FirstCarPolicy;
import AssessmentRaceCars.SegmentCount;


public class Race {

	public static void main(String[] args) {
		CarPolicy Race1 = new CarPolicy();
		CarPolicy Race2 = new CarPolicy();
		CarPolicy Race3 = new CarPolicy();
		int input;
		int segment = 1;
		int carA = 0;
		input = Race1.getLap();
		int c1 = input;
		// First Race Car
		while (c1 < 100) {
			Race1.addLap(carA);
			//System.out.println(Race1.getLap());
			c1 = Race1.getLap();
			carA = 3;
			Race1.addCount(segment);
		}
		
		// Second Race Car
		int carB = 0;
		input = Race2.getLap();
		int c2 = input;
		while (c2 < 100) {
			Race2.addLap(carB);
			//System.out.println(Race2.getLap());
			c2 = Race2.getLap();
			carB = ThreadLocalRandom.current().nextInt(2,5);
			Race2.addCount(segment);
		}
		
		//Third Race Car
		
		int carC = 0;
		input = Race3.getLap();
		int c3 = input;
		while (c3 < 100) {
			Race3.addLap(carC);
			//System.out.println(Race3.getLap());
			c3 = Race3.getLap();
			carC = ThreadLocalRandom.current().nextInt(1,6);
			Race3.addCount(segment);
	}
		//Complete the Race
		int final1 = Race1.getCount();
		int final3 = Race2.getCount();
		int final2 = Race3.getCount();
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
		
		System.exit(0);
		
	}
}
