
public class Deck {
	private Card[] deck = new Card[52];
	private String[] suits = { "♠", "♥", "♣", "♦" };
	private String[] ranks = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	
	Deck() {
		for (int i = 0; i < deck.length; i++) {
			deck[i] = new Card(ranks[i % 13],suits[i / 13]);
		}
		shuffleCards(deck);
	}
	/**
	 * Shuffles the Cards in the deck
	 * @param Deck - The deck you wish to shuffle
	 */
	private void shuffleCards(Card[] Deck) {
		for (int i = 0; i < Deck.length; i++) {
			int rand = (int) (Math.random() * Deck.length); 
			Card temp = Deck[i]; 
			Deck[i] = Deck[rand]; 
			Deck[rand] = temp;
		}
	}
	public Card get(int i) {
		return deck[i];
	}
}
