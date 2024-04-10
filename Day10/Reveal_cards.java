package Day10;
import java.util.*;
public class Reveal_cards {

	public static void main(String[] args) {
		int[] deck= {17,13,11,2,3,5,7};
		System.out.println(deckRevealedIncreasing(deck));
	}
	public static int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Queue<Integer> index = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            index.add(i);
        }

        Arrays.sort(deck);
        int[] rst = new int[n];
        for (int card:deck) {
            rst[index.poll()] = card;
            if (!index.isEmpty()) {
                index.add(index.poll());
            }
        }
        return rst;
    }

}
