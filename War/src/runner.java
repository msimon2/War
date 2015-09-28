import java.util.*;

public class runner 
{
	public static void playGame()
		{
		//greet users
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to the game of war. Player one, what is your name?");
		String playerOne = userInput.nextLine();
		System.out.println("Welcome " +playerOne+ ". Player two, what is your name?");
		String playerTwo = userInput.nextLine();
		System.out.println("Welcome " +playerTwo+ ".");
		
		//place bets
		System.out.println("You each have $100. " + playerOne+ ", how much do you want to bet?");
		int playerOneBet=userInput.nextInt();
		System.out.println(playerOne+ ", you bet "+ playerOneBet+ ". " +playerTwo+ ", how much do you want to bet?");
		int playerTwoBet=userInput.nextInt();
		System.out.println(playerTwo+ ", you bet " + playerTwoBet+ ".");
		
		//draw cards
		String[] suit = { "clubs", "hearts", "spades", "diamonds"};
		String[] rank = { "ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
		int randomSuit = (int)(Math.random()*4);
		int randomRank = (int)(Math.random()*13);
		System.out.println("Player one drew a " + rank[randomRank] + " of " + suit[randomSuit] + ".");
		String[] suits= { "clubs", "hearts", "spades", "diamonds"};
		String[] ranks= { "ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
		int randomSuits = (int)(Math.random()*4);
		int randomRanks = (int)(Math.random()*13);
		System.out.println("Player two drew a " + ranks[randomRanks] + " of " + suits[randomSuits] + ".");
		int playerOneDraw = randomRank;
		int playerTwoDraw = randomRanks;
		if (playerOneDraw > playerTwoDraw)
			{
			System.out.println(playerOne+ " won! You won the bet and got " + playerOneBet + " more in your bank.");
			}
		else  
			{
			System.out.println(playerTwo+ " won! You won the bet and got " + playerTwoBet + " more in your bank." );
			}
		}
	}
