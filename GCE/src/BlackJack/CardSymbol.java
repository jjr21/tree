package BlackJack;

public class CardSymbol {

	private int numberCard;
	private int numberCardA1;
	private String jqka;
	 
	public CardSymbol() {
		numberCard = 0;
		numberCardA1=0;
		jqka = " ";
	}
	public void MatchCard(int M) {
		
		numberCard = M;
		if (M == 0) {
			numberCard = 2;
		}
		if (M == 1) {
			numberCard = 3;
		}
		if (M == 2) {
			numberCard = 4;
		}
		if (M == 3) {
			numberCard = 5;
		}
		if (M == 4) {
			numberCard = 6;
		}
		if (M == 5) {
			numberCard = 7;
		}
		if (M == 6) {
			numberCard = 8;
		}
		if (M == 7) {
			numberCard = 9;
		}
		if (M == 8) {
			numberCard = 10;
		}
		if (M == 9) {
			numberCard = 10;
			jqka = "Joker";
		}
		if (M == 10) {
			numberCard = 10;
			jqka = "Queen";
		}
		if (M == 11) {
			numberCard = 10;
			jqka = "King";
		}
		if (M == 12) {
			numberCard = 11;
			numberCardA1 = 1;
			jqka = "Ace";
		}
		
		}
	
		
		public int getCard() {
			return numberCard;
			
		}
		
		public int getSecondNumberForOnlyA() {
			return numberCardA1;
		}
		public String getJQKA() {
			return jqka;
		}
	}

