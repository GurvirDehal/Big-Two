
public class Card {
	String rank;
	String suit;
	int suitValue;
	int value;
	

	Card(String rank, String suit) {
		this.rank = rank;
		this.suit = suit;
		value = findValue();
		suitValue = findSuitValue();
	}

	public int findValue() {
		int value = 0;
		try {
			if (rank.equals("2")) {
				value = 15;
			} else {
				value = Integer.parseInt(rank);
			}
		} catch (NumberFormatException e) {
			if (rank.equals("J")) {
				value = 11;
			} else if (rank.equals("Q")) {
				value = 12;
			} else if (rank.equals("K")) {
				value = 13;
			} else {
				value = 14;
			}
		}
		return value;
	}

	public int findSuitValue() {
		int value = 0;
		if (suit.equals("♠")) {
			value = 4;
		} else if (suit.equals("♥")) {
			value = 3;
		} else if (suit.equals("♣")) {
			value = 2;
		} else {
			value = 1;
		}
		return value;
	}
}
