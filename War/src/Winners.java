
public class Winners
	{
	public static void findGameWinners()
		{
		if (gamePlayer.playerCards > gamePlayer.compCards)
			{
			System.out.println(Card.player + " wins the game!");
			}
		if (gamePlayer.playerCards < gamePlayer.compCards)
			{
			System.out.println("Computer wins this game!");
			}
		if (gamePlayer.playerCards == gamePlayer.compCards)
			{
			System.out.println("It's a tie! ");
			}
		}
	}
