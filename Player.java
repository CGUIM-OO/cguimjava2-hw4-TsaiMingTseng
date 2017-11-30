import java.util.ArrayList;

public class Player {
	private String name;
	private int chips;
	private int bet;
	private ArrayList<Card> oneRoundCard;

	public Player(String name, int chips) {
		oneRoundCard = new ArrayList<Card>();
		this.name = name;
		this.chips = chips;
	}
	public String getName() {
		return name;
	}
	public int makeBet() {
		int bet = 1;
		return bet;
	}
	public void setOneRoundCard(ArrayList<Card> cards) {
		oneRoundCard = cards;
	}
	public boolean hitMe() {
		int sum = 0;
		for(int count = 0 ; count < oneRoundCard.size() ; count++)
		{
			int rank;
			Card card = oneRoundCard.get(count);
			rank = card.getRank();
			if(rank >10) rank = 10;
			sum += rank;
		}
		if(sum <= 16) {
			return true;
		}
		else return false;
	}
	public int getTotalValue() {
		int sum = 0;
		for(int count = 0 ; count < oneRoundCard.size() ; count++)
		{
			int rank;
			Card card = oneRoundCard.get(count);
			rank = card.getRank();
			if(rank >10) rank = 10;
			sum += rank;
			
		}
		return sum;
	}
	public int getCurrentChips() {
		return chips;
	}
	public void increaseChips (int diff) {
		chips += diff;
	}
	public void sayHello() {
		System.out.println("Hello, I am " + name + ".");
	    System.out.println("I have " + chips + " chips.");

	}
	
}