
public class gamePlayer
	{
	static int playerRandom;
	static int compRandom;
	static int counter;
	static int playerCards;
	static int compCards;
	
	public static void flipCards()
		{
		playerRandom = (int)(Math.random()*26);
		String playerValue = Card.deck.get(playerRandom).getRank();
		String playerHouse = Card.deck.get(playerRandom).getSuit();
		System.out.println("You flipped a " + playerValue + " of " + playerHouse );
		compRandom = (int)(Math.random()*26);
		String compValue = Card.deck.get(compRandom).getRank();
		String compHouse = Card.deck.get(compRandom).getSuit();
		System.out.println("The computer flipped a " + compValue + " of " + compHouse);
		counter++;
		}
	public static void determineWinner()
		{
		if (Card.deck.get(playerRandom).getValue() == Card.deck.get(compRandom).getValue())
			{
			System.out.println("This round was a tie, let's flip again.");
			System.out.println();
			Card.deck.remove(compRandom);
			Card.deck.remove(playerRandom);
			}
		if (Card.deck.get(playerRandom).getValue() > Card.deck.get(compRandom).getValue())
			{
			System.out.println( "You win this round.");
			System.out.println();
			playerCards++;
			Card.deck.remove(compRandom);
			Card.deck.remove(playerRandom);
			}
		if (Card.deck.get(playerRandom).getValue() < Card.deck.get(compRandom).getValue())
			{
			System.out.println("The computer wins this round.");
			System.out.println();
			compCards++;
			Card.deck.remove(compRandom);
			Card.deck.remove(playerRandom);
			}
		}
	}
