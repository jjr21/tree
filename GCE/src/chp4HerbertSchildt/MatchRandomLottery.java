package chp4HerbertSchildt;

public class MatchRandomLottery extends Lottery{

	private int resultF, resultS, resultT, result4, result5, resultM;
	

	
	public int getResult1() {
		resultF = getFirst();
		return resultF;
	}
	public int getResult2() {
		resultS = getSecond();
		return resultS;
	}
	public  int getResult3() {
		resultT = getThird();
		return resultT;
	}
	public int getResult4() {
		result4 = getFourth();
		return result4;
	}
	public int getResult5() {
		result5 = getFifth();
		return result5;
	}
	public int getMegaNumner() {
		resultM = getMegaNumner();
		return resultM;
	}
	
}
