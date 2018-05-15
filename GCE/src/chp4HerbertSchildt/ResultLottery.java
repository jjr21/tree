package chp4HerbertSchildt;


import java.util.concurrent.ThreadLocalRandom;

public class ResultLottery {


	public static void main(String[] args) {
		MatchRandomLottery game = new MatchRandomLottery();
		int pass = 0;
			for(int y =1; y<7;y++) {
				int result = RandomLottery();
				int resultMega = RandomLotteryMega();
				
				switch(y) {
				case 1:
					game.setFirst(result);
					break;
					
				case 2:
					game.setSecond(result);
					break;
				
				case 3:
					game.setThird(result);
					break;
				case 4:
					game.setForth(result);
					break;
				case 5:
				
					game.setFifth(result);
					break;
				case 6:
					game.setMegaNumber(resultMega);
					break;
									}

			}
			
			//identiy picks
			int first = game.getFirst();
			int second = game.getSecond();
			int third = game.getThird();
			int fourth = game.getFourth();
			int fifth = game.getFifth();
			int numberMega = game.getMegaNumber();
			while(pass == 0) {
			//vertify first pick which is no same with other pick
			boolean VerFirst = VerfitySameNumber(first,second);
			boolean VertFirst3 = VerfitySameNumber(first,third);
			boolean VertFirst4 = VerfitySameNumber(first, fourth);
			boolean VertFirst5 = VerfitySameNumber(first, fifth);
	
			if (VerFirst == false || VertFirst3 == false || VertFirst4 == false || VertFirst5 == false ) {
				int RedoFirst = RandomLottery();
				game.setFirst(RedoFirst);
				first = game.getFirst();
			}
			//vertify second pick which is no same with other pick
			boolean VerSecond = VerfitySameNumber(second, third);
			boolean VerSecond4 = VerfitySameNumber(second, fourth);
			boolean VerSecond5 = VerfitySameNumber(second, fifth);
			if (VerSecond == false || VerSecond4 == false || VerSecond5 == false ) {
				int RedoSecond = RandomLottery();
				game.setSecond(RedoSecond);
				second = game.getSecond();
			}
			
			//verfity third pick which is no same with other pick
			boolean VerThird = VerfitySameNumber(third, fourth);
			boolean VerThird5 = VerfitySameNumber(third, fifth);
			
			if(VerThird == false || VerThird5 == false) {
				int RedoThird = RandomLottery();
				game.setThird(RedoThird);
				third = game.getThird();
			}
			//verfity fourth which is no same with other pick
			boolean VerFourth = VerfitySameNumber(fourth, fifth);
			if(VerFourth == false) {
				int RedoFourth = RandomLottery();
				game.setForth(RedoFourth);
				fourth = game.getFourth();
			}
			
			if (VerFirst == true || VertFirst3 == true ||VertFirst4 == true || VertFirst5 == true || VerSecond == true || VerSecond4 == true 
					|| VerSecond5 == true || VerThird == true || VerThird5 == true || VerFourth == true) {
				pass ++;
				
			}
			}
			System.out.println(first + "   " + second + "  " +third + 
					"  " + fourth + "  " + fifth + " " + " Mega : " + numberMega);
			
			
			System.exit(0);
	}
	public static int RandomLottery() {
		int numberRandom = ThreadLocalRandom.current().nextInt(1,71);
		
		return numberRandom;
	}
	public static int RandomLotteryMega() {
		int numberRandomMega = ThreadLocalRandom.current().nextInt(1,26);
		
		return numberRandomMega;
	}
	public static boolean VerfitySameNumber(int a, int b) {
		boolean SecondAttemptRandom;
		if(a == b) {
			System.out.println("SAME REDO");
			 SecondAttemptRandom = false;
		}
		else {
			 SecondAttemptRandom =true;
		}
		
		return SecondAttemptRandom;
		
	}
}
