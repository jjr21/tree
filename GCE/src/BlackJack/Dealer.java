package BlackJack;

import java.util.Random;

import javax.swing.JOptionPane;

public class Dealer {

	public static void main(String[] args) {
		final int arrayLimit = 13;
		int[] cards = new int [arrayLimit];
		Player player1 = new Player();
	
		
		CardSymbol cardNumber = new CardSymbol();
		CardSymbol DealercardNumber = new CardSymbol();
		Random random = new Random();
		int holdPerfectCount = 0;
		int blackjackRatio;
		String valid = "yes";
		Object[] options = {"Yes, Continue", "No, Quit", "Reset"};
		Object[] optionsCard = {"yes, Continue", "STOP"};
		

	
		System.out.println("Player's amount: " +player1.getPlayerAmount());
		cards[0] = 2;
		cards[1] = 3;
		cards[2] = 4;
		cards[3] = 4;   
		cards[4] = 5;
		cards[5] = 6;
		cards[6] = 7;
		cards[7] = 8;
		cards[8] = 9;
		cards[9] = 10;
		cards[10] = 11;
		cards [11] = 12;
		cards [12] = 13;
		String name = JOptionPane.showInputDialog("enter your name");
		boolean status;
		//hold result for win
		int addwinS = 0;
		//hold result for lose
		int addLoseS = 0;
		while(status = true) {
			int validBet = player1.getPlayerAmount();
			JOptionPane.showMessageDialog(null, " Hello " + name + ".  Currently, you have " + player1.getPlayerAmount());
			//System.out.println("your total amount : " + player1.getPlayerAmount());
			if (validBet < 0 || validBet == 0) {
				JOptionPane.showMessageDialog(null, "You have to reset since your balance is 0");
				int ratioW = PlayerWonStatic(addwinS);
				int ratioL = DealerWonStatic(addLoseS);
				blackjackRatio = BlackJack21(holdPerfectCount);
				JOptionPane.showMessageDialog(null, "Ratio : " + ratioW + "/" + ratioL  + " blackjack: " + blackjackRatio );
				JOptionPane.showMessageDialog(null, "The raito will be reset also");
				 ResetWin();
				 ResetLose();
				  addwinS = 0;
				  addLoseS = 0;
				  player1.setPlayer(1000);
				  holdPerfectCount =0;
				  continue;
			}
		int bet;
		String tempHold = JOptionPane.showInputDialog("Enter bet : ");
		try {
			bet =Integer.parseInt(tempHold);
		}
		catch (NumberFormatException e){
			System.out.println("Only number!");
			break;
		}
		bet = Integer.parseInt(tempHold);
		if(validBet < bet) {
			JOptionPane.showMessageDialog(null,"You cannot bet more than your amount");
			continue;
		}
		System.out.println("Bet : " + bet);
		int firstAttempt = random.nextInt(13); //player's first card
		int secondAttempt = random.nextInt(13); //player's second card
		int x = firstAttempt;	
		//draw the first card 		firstAttempt x cardNumber
		
		if(x> 8) {
			
			cardNumber.MatchCard(x);
			firstAttempt = cardNumber.getCard();
			//System.out.println("Array : " + x + " " + " convert to Card Deck :   " + cardNumber.getJQKA() + " ..   number : " + cardNumber.getCard());
			System.out.println("First card : " + cardNumber.getJQKA());
			}
		
			
		
		else {
			cardNumber.MatchCard(x);
			firstAttempt = cardNumber.getCard();
		//System.out.println("Array : " + x + " " +" convert to Card Deck : " + cardNumber.getCard());
		System.out.println("First card: " + cardNumber.getCard());
	}	
		
		//dealer 
		String dealerName = "dealer";
		int DealerFirstAttempt = random.nextInt(13); //dealer's first card
		//first dealer draw		DealerFirstAttempt xx DealercardNumber
		int xx = DealerFirstAttempt;
	
	if(xx> 8) {
		
		DealercardNumber.MatchCard(xx);
		DealerFirstAttempt = DealercardNumber.getCard();
		//System.out.println("Dealer Part Array : " + xx + " " + " convert to Card Deck : " + DealercardNumber.getJQKA() + " number : " + DealercardNumber.getCard());
		System.out.println("Dealer's first card: " + DealercardNumber.getJQKA());
		
	}
	else {
		DealercardNumber.MatchCard(xx);
		DealerFirstAttempt = DealercardNumber.getCard();
	//System.out.println("Dealer Part Array : " + xx + " " +" convert to Card Deck : " + DealercardNumber.getCard());
		System.out.println("Dealer's first card : " + DealercardNumber.getCard());
}	
		//System.out.println("Array: " + xx+ "The first card of dealer : " + DealerFirstAttempt);
		
		
		//draw the second card
	//	System.out.println("The second card for player begins");
		int y = secondAttempt;
		
		if(y> 8) {
			
			cardNumber.MatchCard(y);
			secondAttempt = cardNumber.getCard();
			//System.out.println("Array : " +y + " " +" convert to Card Deck : " + cardNumber.getJQKA()+ "number : " + cardNumber.getCard());
			System.out.println("Second Card : " + cardNumber.getJQKA());
		}
		else {
			cardNumber.MatchCard(y);
			secondAttempt = cardNumber.getCard();
		//System.out.println("Array : " + y + " " + " convert to Card Deck : " +cardNumber.getCard());
			System.out.println("Second Card : " +cardNumber.getCard());
	}	
		//System.out.println("first Random :" + firstAttempt);
		//System.out.println("second Random :" + secondAttempt);
		//add total of first and second cards
		int total = Sum(firstAttempt, secondAttempt);
		System.out.println("Your first card is " + firstAttempt + " , Your second card is " + secondAttempt + " total : " + total);
		//System.out.println("total : " + total);
		if(total == 21) {
			System.out.println("Congrats, you got 21 as BlackJack!");
			holdPerfectCount ++;
			BlackJack21(holdPerfectCount);
			addwinS ++;
			int scoreResult = PlayerWonStatic(addwinS);
			System.out.println("Your result of win : " + scoreResult);
			player1.addPlayer(bet);
			System.out.println("You won the bet, overall total: " + player1.getPlayerAmount());
			int agen = JOptionPane.showOptionDialog(null, "Do you want to continue?", "BlackJack 21", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			
			if(agen == 0) {
				  continue;
				  
				} 
				if(agen == 1) {
					int ratioW = PlayerWonStatic(addwinS);
					int ratioL = DealerWonStatic(addLoseS);
					blackjackRatio = BlackJack21(holdPerfectCount);
					JOptionPane.showMessageDialog(null, "Ratio : " + ratioW + "/" + ratioL  + " blackjack: " + blackjackRatio );
					break;
				}
				if(agen==2) {
					 ResetWin();
					 ResetLose();
					  addwinS = 0;
					  addLoseS = 0;
					  player1.setPlayer(1000);
					  holdPerfectCount =0;
					  continue;
				} 
		/*	String cont = JOptionPane.showInputDialog("Do you want to continue? ::: enter yes ");
			if(cont.equals(valid)){
				continue;
			}
			else {
				status = false;
				break;
			}
			*/
		
		}
	
		int DealerSecondAttempt = random.nextInt(13);//dealer's second card
		//second dealer draw
		int yy = DealerSecondAttempt;
		
		if(yy> 8) {
			
			DealercardNumber.MatchCard(yy);
			DealerSecondAttempt = DealercardNumber.getCard();
			System.out.println("Dealer's second card is facedown");
			//System.out.println("Array : " +yy + " " +" convert to Card Deck : " + DealercardNumber.getJQKA()+ "  number : " + DealercardNumber.getCard());
			
		}
		else {
			DealercardNumber.MatchCard(yy);
			DealerSecondAttempt = DealercardNumber.getCard();
			System.out.println("Dealer's second card is facedown");
		//System.out.println("Array : " +yy + " " + " convert to Card Deck : " + DealercardNumber.getCard());
	}	
		
		
		//String input = JOptionPane.showInputDialog("Do you want to add 3rd card? ::: enter yes or any keyboard to decline  ");
		int contStop = JOptionPane.showOptionDialog(null, "Do you want to add 3rd card?", "BlackJack 21", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionsCard, optionsCard[0]);
		
		if (contStop == 0) {
			int thirdAttempt = random.nextInt(13);
			int x2 = thirdAttempt;
	
			if(x2> 8) {
				
				cardNumber.MatchCard(x2);
				thirdAttempt = cardNumber.getCard();
				//System.out.println("Array : " + x2 + " " + " convert to Card Deck :   " + cardNumber.getJQKA() + " ..   number : " + cardNumber.getCard());
				System.out.println("Third Card :  " + cardNumber.getJQKA());
				
				
			}
			else {
				cardNumber.MatchCard(x2);
				thirdAttempt = cardNumber.getCard();
			System.out.println("Third Card  : " + cardNumber.getCard());
		}	
			//System.out.println("your 3rd card: " + thirdAttempt);
			
			
			int total3 = AddSum(total, thirdAttempt);
			System.out.println("You took 3rd card, your new total : " + total3);
			
			
			if (total3 > 21) {
				System.out.println("You loser! over 21!");
				System.out.println("Dealer won" );
				addLoseS ++;
				int dealerScoreResult = DealerWonStatic(addLoseS);
				System.out.println("your result of lose : " + dealerScoreResult);
				player1.subPlayer(bet);
				System.out.println("You lose bet, your overall total :" + player1.getPlayerAmount());
				
				/*
				String cont = JOptionPane.showInputDialog("Do you want to continue? ::: enter yes ");
				if(cont.equals(valid)){
					continue; 
				}
				else {
					status = false;
					break;
				}
				*/
				int agen = JOptionPane.showOptionDialog(null, "Do you want to continue?", "BlackJack 21", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
				
				if(agen == 0) {
					  continue;
					  
					} 
					if(agen == 1) {
						int ratioW = PlayerWonStatic(addwinS);
						int ratioL = DealerWonStatic(addLoseS);
						blackjackRatio = BlackJack21(holdPerfectCount);
						JOptionPane.showMessageDialog(null, "Ratio : " + ratioW + "/" + ratioL  + " blackjack: " + blackjackRatio );
						break;
					}
					if(agen==2) {
						 ResetWin();
						 ResetLose();
						  addwinS = 0;
						  addLoseS = 0;
						  player1.setPlayer(1000);
						  holdPerfectCount =0;
						  continue;
					} 
				
			}
			
			total = total3;
			//after 3rd, 21 blackjack
			if(total == 21) {
				System.out.println("Congrats, you got 21 as BlackJack!");
				holdPerfectCount ++;
				blackjackRatio = BlackJack21(holdPerfectCount);
				System.out.println("The result of blackjack : " + blackjackRatio);
				addwinS ++;
				int scoreResult = PlayerWonStatic(addwinS);
				System.out.println("Your result of win : " + scoreResult);
				player1.addPlayer(bet);
				System.out.println("You won the bet, overall total: " + player1.getPlayerAmount());
				/*
				String cont = JOptionPane.showInputDialog("Do you want to continue? ::: enter yes ");
				if(cont.equals(valid)){
					continue;
				}
				else {
					status = false;
					break;
				}
				*/
				int agen = JOptionPane.showOptionDialog(null, "Do you want to continue?", "BlackJack 21", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
				
				if(agen == 0) {
					  continue;
					  
					} 
					if(agen == 1) {
						int ratioW = PlayerWonStatic(addwinS);
						int ratioL = DealerWonStatic(addLoseS);
						blackjackRatio = BlackJack21(holdPerfectCount);
						JOptionPane.showMessageDialog(null, "Ratio : " + ratioW + "/" + ratioL  + " blackjack: " + blackjackRatio );
						break;
					}
					if(agen==2) {
						 ResetWin();
						 ResetLose();
						  addwinS = 0;
						  addLoseS = 0;
						  player1.setPlayer(1000);
						  holdPerfectCount =0;
						  continue;
					} 
			
			}
			
			if (total3 < 21 ) { 
				//String input2 = JOptionPane.showInputDialog("Do you want to add 4rd card? ::: enter yes or any keyboard to decline  ");
				//String valid2 = "yes";
				//if (input2.equals(valid2)) 
				int contStop4 = JOptionPane.showOptionDialog(null, "Do you want to add 4th card?", "BlackJack 21", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionsCard, optionsCard[0]);
					if(contStop4 == 0){
					int fourthAttempt = random.nextInt(13);
					int x3 = fourthAttempt;
					
					if(x3> 8) {
						
						cardNumber.MatchCard(x3);
						fourthAttempt = cardNumber.getCard();
						System.out.println("Fourth Card : " + cardNumber.getJQKA());
						
					}
					else {
						cardNumber.MatchCard(x3);
						fourthAttempt = cardNumber.getCard();
					System.out.println("Fourth Card: " + cardNumber.getCard());
				}	
					//System.out.println("your 4rd card: " + fourthAttempt);
					int total4 = AddSum(total3, fourthAttempt);
					System.out.println("You took 4rd card, your new total : " + total4);
					total = total4;
					if(total4 > 21) {
						
						 
							System.out.println("After 4th, You loser! over 21!");
							System.out.println("Dealer won" );
							addLoseS ++;
							int dealerScoreResult = DealerWonStatic(addLoseS);
							System.out.println("your result of lose : " + dealerScoreResult);
							player1.subPlayer(bet);
							System.out.println("You lose bet, your overall total :" + player1.getPlayerAmount());
							/*
							String cont = JOptionPane.showInputDialog("Do you want to continue? ::: enter yes ");
							if(cont.equals(valid)){
								continue;
							}
							else {
								status = false;
								break;
							}
						*/
							int agen = JOptionPane.showOptionDialog(null, "Do you want to continue?", "BlackJack 21", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
							
							if(agen == 0) {
								  continue;
								  
								} 
								if(agen == 1) {
									int ratioW = PlayerWonStatic(addwinS);
									int ratioL = DealerWonStatic(addLoseS);
									blackjackRatio = BlackJack21(holdPerfectCount);
									JOptionPane.showMessageDialog(null, "Ratio : " + ratioW + "/" + ratioL  + " blackjack: " + blackjackRatio );
									break;
								}
								if(agen==2) {
									 ResetWin();
									 ResetLose();
									  addwinS = 0;
									  addLoseS = 0;
									  player1.setPlayer(1000);
									  holdPerfectCount =0;
									  continue;
								} 
					}
					if(total == 21) {
						System.out.println("Congrats, you got 21 as BlackJack!");
						holdPerfectCount ++;
						
						blackjackRatio = BlackJack21(holdPerfectCount);
						System.out.println("The result of blackjack : " + blackjackRatio);
						addwinS ++;
						int scoreResult = PlayerWonStatic(addwinS);
						System.out.println("Your result of win : " + scoreResult);
						player1.addPlayer(bet);
						System.out.println("You won the bet, overall total: " + player1.getPlayerAmount());
						/*
						String cont = JOptionPane.showInputDialog("Do you want to continue? ::: enter yes ");
						if(cont.equals(valid)){
							continue;
						}
						else {
							status = false;
							break;
						}
						*/
						int agen = JOptionPane.showOptionDialog(null, "Do you want to continue?", "BlackJack 21", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
						
						if(agen == 0) {
							  continue;
							  
							} 
							if(agen == 1) {
								int ratioW = PlayerWonStatic(addwinS);
								int ratioL = DealerWonStatic(addLoseS);
								blackjackRatio = BlackJack21(holdPerfectCount);
								JOptionPane.showMessageDialog(null, "Ratio : " + ratioW + "/" + ratioL  + " blackjack: " + blackjackRatio );
								break;
							}
							if(agen==2) {
								 ResetWin();
								 ResetLose();
								  addwinS = 0;
								  addLoseS = 0;
								  player1.setPlayer(1000);
								  holdPerfectCount =0;
								  continue;
							} 
						
					
					}
					if (total4 < 21) { 
						//String input5 = JOptionPane.showInputDialog("Do you want to add 5rd card? ::: enter yes or any keyboard to decline  ");
						//String valid5 = "yes";
						int contStop5 = JOptionPane.showOptionDialog(null, "Do you want to add 5th card?", "BlackJack 21", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionsCard, optionsCard[0]);
						//if (input5.equals(valid5)) 
						if(contStop5 == 0){
							int FifthAttempt = random.nextInt(13);
							int x5 = FifthAttempt;
							
							if(x5> 8) {
								
								cardNumber.MatchCard(x5);
								FifthAttempt = cardNumber.getCard();
								System.out.println("Fifth Card :   " + cardNumber.getJQKA());
								
							}
							else {
								cardNumber.MatchCard(x5);
								FifthAttempt = cardNumber.getCard();
							System.out.println("Fifth Card" + cardNumber.getCard());
						}	
							System.out.println("your 5rd card: " + FifthAttempt);
							int total5 = AddSum(total4, fourthAttempt);
							System.out.println("You took risk, after 4rd card, total : " + total5);
							total = total5;
							if(total5 > 21) {
								
								 
									System.out.println("After 5th, You loser! over 21!");
									System.out.println("Dealer won" );
									addLoseS ++;
									int dealerScoreResult = DealerWonStatic(addLoseS);
									System.out.println("your result of lose : " + dealerScoreResult);
									player1.subPlayer(bet);
									System.out.println("You lose bet, your overall total :" + player1.getPlayerAmount());
									/*
									String cont = JOptionPane.showInputDialog("Do you want to continue? ::: enter yes ");
									if(cont.equals(valid)){
										continue;
									}
									else {
										status = false;
										break;
									}
									*/
									int agen = JOptionPane.showOptionDialog(null, "Do you want to continue?", "BlackJack 21", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
									
									if(agen == 0) {
										  continue;
										  
										} 
										if(agen == 1) {
											int ratioW = PlayerWonStatic(addwinS);
											int ratioL = DealerWonStatic(addLoseS);
											blackjackRatio = BlackJack21(holdPerfectCount);
											JOptionPane.showMessageDialog(null, "Ratio : " + ratioW + "/" + ratioL  + " blackjack: " + blackjackRatio );
											break;
										}
										if(agen==2) {
											 ResetWin();
											 ResetLose();
											  addwinS = 0;
											  addLoseS = 0;
											  player1.setPlayer(1000);
											  holdPerfectCount =0;
											  continue;
										} 
								
							}
							if(total == 21) {
								System.out.println("Congrats, you got 21 as BlackJack!");
								holdPerfectCount ++;
								
								blackjackRatio = BlackJack21(holdPerfectCount);
								System.out.println("The result of blackjack : " + blackjackRatio);
								addwinS ++;
								int scoreResult = PlayerWonStatic(addwinS);
								System.out.println("Your result of win : " + scoreResult);
								player1.addPlayer(bet);
								System.out.println("You won the bet, overall total: " + player1.getPlayerAmount());
								/*
								String cont = JOptionPane.showInputDialog("Do you want to continue? ::: enter yes ");
								if(cont.equals(valid)){
									continue;
								}
								else {
									status = false;
									break;
								}
								*/
							
							}
						}
					}
				}
				
			}
			
			
			/*
			if(total3 > 21) {
				System.out.println("aaaYou loser!");
			}
			*/
		}
		//dealer's cards total
		System.out.println("The dealer's second card is show:");
	
		System.out.println("The dealer's second card : "+ DealerSecondAttempt);
		
				int DealerTotal = Sum(DealerFirstAttempt, DealerSecondAttempt);
				System.out.println(dealerName + " the first card : " + DealerFirstAttempt + "  the second card " + DealerSecondAttempt + " total : " + DealerTotal );
				
		//In the case if Dealer's cards below 17
		if(DealerTotal < 17) {
			int DealerThirdAttempt = random.nextInt(13);
			int xx3 = DealerThirdAttempt;
			
			if(xx3> 8) {
				
				DealercardNumber.MatchCard(xx3);
				DealerThirdAttempt = DealercardNumber.getCard();
				System.out.println("Dealer draw the third card due to below 17");
				System.out.println("Dealer's 3rd card : " + DealercardNumber.getJQKA());
				
				
			}
			else {
				DealercardNumber.MatchCard(xx3);
				DealerThirdAttempt = DealercardNumber.getCard();
			System.out.println(" Dealer's third card : " + DealercardNumber.getCard());
		}	
			int dealerTotal3 = AddSum(DealerTotal, DealerThirdAttempt);
			DealerTotal = dealerTotal3;
			System.out.println("total of dealership's card : " + DealerTotal);
			if (dealerTotal3 < 17) {
				int DealerFourthAttempt = random.nextInt(13);
				int xx4 = DealerFourthAttempt;
				
				if(xx4> 8) {
					
					DealercardNumber.MatchCard(xx4);
					DealerFourthAttempt = DealercardNumber.getCard();
					System.out.println("Dealer draw the fourth  card due to below 17");
					System.out.println("Dealer's 4th card : " + DealercardNumber.getJQKA());
					
				}
				else {
					DealercardNumber.MatchCard(xx3);
					DealerFourthAttempt = DealercardNumber.getCard();
				System.out.println("Dealer's 4th card : " + DealercardNumber.getCard());
			}	
				int dealerTotal4 = AddSum(DealerTotal, DealerFourthAttempt);
				DealerTotal = dealerTotal4;
				System.out.println("total of dealership's card : " + DealerTotal);
				if (dealerTotal4 < 17) {
					int DealerFifthAttempt = random.nextInt(13);
					int xx5 = DealerFifthAttempt;
				
					if(xx5> 8) {
						
						DealerFifthAttempt = DealercardNumber.getCard();
						System.out.println("Dealer draw the fifth  card due to below 17");
						System.out.println("Dealer's 5th card:  : " + DealercardNumber.getJQKA());
						
					}
					else {
						DealercardNumber.MatchCard(xx5);
						DealerFifthAttempt = DealercardNumber.getCard();
					System.out.println("Dealer's 5th card : " + DealercardNumber.getCard());
				}	
					int dealerTotal5 = AddSum(DealerTotal, DealerFifthAttempt);
					DealerTotal = dealerTotal5;
					System.out.println("total of dealership's card : " + DealercardNumber.getCard());
					
					if(DealerTotal > 21) {
						System.out.println("Player won!");
						addwinS ++;
						int scoreResult = PlayerWonStatic(addwinS);
						System.out.println("Your result of win : " + scoreResult);
						player1.addPlayer(bet);
						System.out.println("You won the bet, overall total: " + player1.getPlayerAmount());
						/*
						
						if(cont.equals(valid)){
							continue;
						}
						else {
							status = false;
							break;
						}
						*/
						int agen = JOptionPane.showOptionDialog(null, "Do you want to continue?", "BlackJack 21", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
						
						if(agen == 0) {
							  continue;
							  
							} 
							if(agen == 1) {
								int ratioW = PlayerWonStatic(addwinS);
								int ratioL = DealerWonStatic(addLoseS);
								blackjackRatio = BlackJack21(holdPerfectCount);
								JOptionPane.showMessageDialog(null, "Ratio : " + ratioW + "/" + ratioL  + " blackjack: " + blackjackRatio );
								break;
							}
							if(agen==2) {
								 ResetWin();
								 ResetLose();
								  addwinS = 0;
								  addLoseS = 0;
								  player1.setPlayer(1000);
								  holdPerfectCount =0;
								  continue;
							} 
					}
					
				}
			}
			
			
			
			
		}
		
		if (DealerTotal < 22 && DealerTotal > total || total > 21) {
			System.out.println("Dealer won" );
			addLoseS ++;
			int dealerScoreResult = DealerWonStatic(addLoseS);
			System.out.println("your result of lose : " + dealerScoreResult);
			player1.subPlayer(bet);
			System.out.println("You lose bet, your overall total :" + player1.getPlayerAmount());
			/*
			String cont = JOptionPane.showInputDialog("Do you want to continue? ::: enter yes ");
			if(cont.equals(valid)){
				continue;
			}
			else {
				status = false;
				break;
			}
			
			int buttonResult2 = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "BlackJack", button);
			if(button == 0) {
				  System.out.println("Yes option");
				  continue;
				} else {
				  System.out.println("No Option");
				  break;
				} 
				*/
			int agen = JOptionPane.showOptionDialog(null, "Do you want to continue?", "BlackJack 21", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			
			if(agen == 0) {
				  continue;
				  
				} 
				if(agen == 1) {
					int ratioW = PlayerWonStatic(addwinS);
					int ratioL = DealerWonStatic(addLoseS);
					blackjackRatio = BlackJack21(holdPerfectCount);
					JOptionPane.showMessageDialog(null, "Ratio : " + ratioW + "/" + ratioL  + " blackjack: " + blackjackRatio );
					break;
				}
				if(agen==2) {
					 ResetWin();
					 ResetLose();
					  addwinS = 0;
					  addLoseS = 0;
					  player1.setPlayer(1000);
					  holdPerfectCount =0;
					  continue;
				} 
			 
			
		}
		if (total < 22 && total > DealerTotal || DealerTotal > 21 & total < 22) {
			System.out.println("Player won!");
			addwinS ++;
			int scoreResult = PlayerWonStatic(addwinS);
			System.out.println("Your result of win : " + scoreResult);
			player1.addPlayer(bet);
			System.out.println("You won the bet, overall total: " + player1.getPlayerAmount());
			/*
			String cont = JOptionPane.showInputDialog("Do you want to continue? ::: enter yes ");
			if(cont.equals(valid)){
				continue;
			}
			else {
				status = false;
				break;
			}
			*/
int agen = JOptionPane.showOptionDialog(null, "Do you want to continue?", "BlackJack 21", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			
			if(agen == 0) {
				  continue;
				  
				} 
				if(agen == 1) {
					int ratioW = PlayerWonStatic(addwinS);
					int ratioL = DealerWonStatic(addLoseS);
					blackjackRatio = BlackJack21(holdPerfectCount);
					JOptionPane.showMessageDialog(null, "Ratio : " + ratioW + "/" + ratioL  + " blackjack: " + blackjackRatio );
					break;
				}
				if(agen==2) {
					 ResetWin();
					 ResetLose();
					  addwinS = 0;
					  addLoseS = 0;
					  player1.setPlayer(1000);
					  holdPerfectCount =0;
					  continue;
				} 
		}
		
		//draw
		if (total == DealerTotal) {
			System.out.println("DRAW, no gain or lose");
			/*
			String cont = JOptionPane.showInputDialog("Do you want to continue? ::: enter yes ");
			if(cont.equals(valid)){
				continue;
			}
			else {
				status = false;
				break;
			}
			*/
		
int agen = JOptionPane.showOptionDialog(null, "Do you want to continue?", "BlackJack 21", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			
			if(agen == 0) {
				  continue;
				  
				} 
				if(agen == 1) {
					int ratioW = PlayerWonStatic(addwinS);
					int ratioL = DealerWonStatic(addLoseS);
					blackjackRatio = BlackJack21(holdPerfectCount);
					JOptionPane.showMessageDialog(null, "Ratio : " + ratioW + "/" + ratioL  + " blackjack: " + blackjackRatio );
					break;
				}
				if(agen==2) {
				  ResetWin();
				  ResetLose();
				  addwinS = 0;
				  addLoseS = 0;
				  player1.setPlayer(1000);
				  holdPerfectCount =0;
				  continue;
				} 
		}
		
		
		}
	
		
		 
	}
	
	public static int Sum(int a, int b) {
		int total = a + b;
		return total;
	}
	public static int AddSum(int previous, int c) {
		int total = previous + c;
		return total;
	}
	public static int AfterThirdCardSum(int previous2, int d) {
		int total = previous2 + d;
		return total;
	}
	public static int PlayerWonStatic(int r) {
		Point stat = new Point();
		int rr;
		stat.addWin(r);
		rr = stat.getWin();
		return rr;
	}
	public static int DealerWonStatic(int d) {
		Point dealerStat = new Point();
		
		int dd;
		dealerStat.addLose(d);
		dd = dealerStat.getLose();
		return dd; 
	}
	
	public static int BlackJack21(int bj21) {
		Point blackj21 = new Point();
		int bb;
		blackj21.addBlackJack(bj21);
		bb = blackj21.getBlackJack();
		return bb;
	}
	
	
	public static int ResetWin() {
		Point re = new Point(0,0);
		//re.setWin(0);
		
		int reW = re.getWin();
		return reW;
		
	}
	public static int ResetLose() {
		Point le = new Point(0,0);
		//le.setLose(0);
		int reL = le.getLose();
		return reL;
	}
	
	
	
	
	
}