import java.util.ArrayList;

public class Player {
	int num;
	ArrayList<Card> hand = new ArrayList<Card>(13);

	Player(int i) {
		num = i + 1;
	}

	public void sortHand() {
		boolean swap = true;
		Card temp;
		do {
			swap = false;
			int size = hand.size();
			for (int i = 0; i < size - 1; i++) {
				Card a = hand.get(i);
				Card b = hand.get(i + 1);
				if (a.value > b.value || // if Card A is greater than Card B
						(a.value == b.value && // or if card A is equal to Card B
								a.suitValue > b.suitValue)) // and Card A has the higher suit than Card B
				{
					temp = a;
					hand.set(i, b);
					hand.set(i + 1, temp);
					swap = true;
				}

			}
		} while (swap);
	}

	public void printHand() {
		System.out.print("Player " + num + " : ");
		for (Card n : hand) {
			System.out.print(n.rank + n.suit + " ");

		}
		System.out.println();
	}
}
