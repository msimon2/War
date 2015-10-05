import java.util.*;

public class Card
	{	
	static String player;
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
		System.out.println("Welcome to the game of war. Player, what is your name?");
		player = userInput.nextLine();
		System.out.println("The rules are pretty simple, " + player + ". You will be playing against a computer.");
		System.out.println("You will be dealt 26 cards and flip one over for each turn. The player with the highest card ");
		System.out.println("value wins both cards. After all cards have been flipped, the player with the most cards wins.");
		System.out.println();
		}
	public static void fillDeck()
	{
		deck.add(new Card("Diamonds", "Ace", 1));
		deck.add(new Card("Diamonds", "Two", 2));
		deck.add(new Card("Diamonds", "Three", 3));
		deck.add(new Card("Diamonds", "Four", 4));
		deck.add(new Card("Diamonds", "Five", 5));
		deck.add(new Card("Diamonds", "Six", 6));
		deck.add(new Card("Diamonds", "Seven", 7));
		deck.add(new Card("Diamonds", "Eight", 8));
		deck.add(new Card("Diamonds", "Nine", 9));
		deck.add(new Card("Diamonds", "Ten", 10));
		deck.add(new Card("Diamonds", "Jack", 11));
		deck.add(new Card("Diamonds", "Queen", 12));
		deck.add(new Card("Diamonds", "King", 13));
		
		deck.add(new Card("Hearts", "Ace", 1));
		deck.add(new Card("Hearts", "Two", 2));
		deck.add(new Card("Hearts", "Three", 3));
		deck.add(new Card("Hearts", "Four", 4));
		deck.add(new Card("Hearts", "Five", 5));
		deck.add(new Card("Hearts", "Six", 6));
		deck.add(new Card("Hearts", "Seven", 7));
		deck.add(new Card("Hearts", "Eight", 8));
		deck.add(new Card("Hearts", "Nine", 9));
		deck.add(new Card("Hearts", "Ten", 10));
		deck.add(new Card("Hearts", "Jack", 11));
		deck.add(new Card("Hearts", "Queen", 12));
		deck.add(new Card("Hearts", "King", 13));
		
		deck.add(new Card("Spades", "Ace", 1));
		deck.add(new Card("Spades", "Two", 2));
		deck.add(new Card("Spades", "Three", 3));
		deck.add(new Card("Spades", "Four", 4));
		deck.add(new Card("Spades", "Five", 5));
		deck.add(new Card("Spades", "Six", 6));
		deck.add(new Card("Spades", "Seven", 7));
		deck.add(new Card("Spades", "Eight", 8));
		deck.add(new Card("Spades", "Nine", 9));
		deck.add(new Card("Spades", "Ten", 10));
		deck.add(new Card("Spades", "Jack", 11));
		deck.add(new Card("Spades", "Queen", 12));
		deck.add(new Card("Spades", "King", 13));
		
		deck.add(new Card("Clubs", "Ace", 1));
		deck.add(new Card("Clubs", "Two", 2));
		deck.add(new Card("Clubs", "Three", 3));
		deck.add(new Card("Clubs", "Four", 4));
		deck.add(new Card("Clubs", "Five", 5));
		deck.add(new Card("Clubs", "Six", 6));
		deck.add(new Card("Clubs", "Seven", 7));
		deck.add(new Card("Clubs", "Eight", 8));
		deck.add(new Card("Clubs", "Nine", 9));
		deck.add(new Card("Clubs", "Ten", 10));
		deck.add(new Card("Clubs", "Jack", 11));
		deck.add(new Card("Clubs", "Queen", 12));
		deck.add(new Card("Clubs", "King", 13));
		
		Collections.shuffle(deck);
		}
	}
