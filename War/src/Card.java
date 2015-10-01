import java.util.*;

public class Card
	{	
	static String playerOne;
	private String suit;
	private String rank;
	private int value;
	static ArrayList<Card> deck = new ArrayList<Card>();
	public Card (String s, String r, int v)
		{
		suit = s;
		rank = r;
		value = v;
		}

	public String getSuit()
		{
		return suit;
		}
	public void setSuit(String suit)
		{
		this.suit = suit;
		}
	public String getRank()
		{
		return rank;
		}
	public void setRank(String rank)
		{
		this.rank = rank;
		}
	public int getValue()
		{
		return value;
		}
	public void setValue(int value)
		{
		this.value = value;
		}
	public static void introducePlayers()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to the game of war. Player one, what is your name?");
		playerOne = userInput.nextLine();
		System.out.println("The rules are pretty simple, " + playerOne + ". You will be playing against a computer.");
		System.out.println("You will be dealt 26 cards and flip one over for each turn. The player with the highest card ");
		System.out.println("value wins both cards. After all cards have been flipped, the player with the most cards wins.");
		}
	public static void fillDeck()
	{
		deck.add(new Card("Diomonds","Ace",1));
		deck.add(new Card("Diomonds","Two",2));
		deck.add(new Card("Diomonds","Three",3));
		deck.add(new Card("Diomonds","Four",4));
		deck.add(new Card("Diomonds","Five",5));
		deck.add(new Card("Diomonds","Six",6));
		deck.add(new Card("Diomonds","Seven",7));
		deck.add(new Card("Diomonds","Eight",8));
		deck.add(new Card("Diomonds","Nine",9));
		deck.add(new Card("Diomonds","Ten",10));
		deck.add(new Card("Diomonds","Jack",10));
		deck.add(new Card("Diomonds","Queen",10));
		deck.add(new Card("Diomonds","King",10));
		
		deck.add(new Card("Hearts","Ace",1));
		deck.add(new Card("Hearts","Two",2));
		deck.add(new Card("Hearts","Three",3));
		deck.add(new Card("Hearts","Four",4));
		deck.add(new Card("Hearts","Five",5));
		deck.add(new Card("Hearts","Six",6));
		deck.add(new Card("Hearts","Seven",7));
		deck.add(new Card("Hearts","Eight",8));
		deck.add(new Card("Hearts","Nine",9));
		deck.add(new Card("Hearts","Ten",10));
		deck.add(new Card("Hearts","Jack",10));
		deck.add(new Card("Hearts","Queen",10));
		deck.add(new Card("Hearts","King",10));
		
		deck.add(new Card("Spades","Ace",1));
		deck.add(new Card("Spades","Two",2));
		deck.add(new Card("Spades","Three",3));
		deck.add(new Card("Spades","Four",4));
		deck.add(new Card("Spades","Five",5));
		deck.add(new Card("Spades","Six",6));
		deck.add(new Card("Spades","Seven",7));
		deck.add(new Card("Spades","Eight",8));
		deck.add(new Card("Spades","Nine",9));
		deck.add(new Card("Spades","Ten",10));
		deck.add(new Card("Spades","Jack",10));
		deck.add(new Card("Spades","Queen",10));
		deck.add(new Card("Spades","King",10));
		
		deck.add(new Card("Clubs","Ace",1));
		deck.add(new Card("Clubs","Two",2));
		deck.add(new Card("Clubs","Three",3));
		deck.add(new Card("Clubs","Four",4));
		deck.add(new Card("Clubs","Five",5));
		deck.add(new Card("Clubs","Six",6));
		deck.add(new Card("Clubs","Seven",7));
		deck.add(new Card("Clubs","Eight",8));
		deck.add(new Card("Clubs","Nine",9));
		deck.add(new Card("Clubs","Ten",10));
		deck.add(new Card("Clubs","Jack",10));
		deck.add(new Card("Clubs","Queen",10));
		deck.add(new Card("Clubs","King",10));
		
		Collections.shuffle(deck);
		}
	}
