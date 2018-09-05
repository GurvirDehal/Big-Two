
public class Main {

	public static void main(String[] args) {
		Player[] player = new Player[4];
		Deck deck = new Deck();

		for (int i = 0; i < player.length; i++) {
			player[i] = new Player(i);
			for (int j = 0; j < 13; j++) {
				player[i].hand.add(j, deck.get(j + (i * 13)));
			}
			player[i].sortHand();
		}
		for (Player n : player) {
			n.printHand();
		}
	}
}
