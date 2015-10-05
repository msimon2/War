import java.util.*;


public class runner 
	{
	public static void main(String[] args) throws InterruptedException
		{
		Card.fillDeck();
		Card.introducePlayers();
		while (gamePlayer.counter <= 26)
			{
			gamePlayer.flipCards();
			gamePlayer.determineWinner();
			Thread.sleep(7000);
			}
		Winners.findGameWinners();
		}
	}
