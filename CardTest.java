import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CardTest {
public static void main(String[] args) {
Card[] cards = {
new Card(1L, "Card1", Rank.UNIQUE),
new Card(2L, "Card2", Rank.RARE),
new Card(3L, "Card3", Rank.UNCOMMON),
new Card(4L, "Card4", Rank.COMMON)
};


    // Test toString() method
    for (Card card : cards) {
        System.out.println(card);
    }

    // Test equals() method
    Card card1Copy = new Card(1L, "Card1", Rank.UNIQUE);
    System.out.println("card1.equals(card1Copy): " + cards[0].equals(card1Copy));
    System.out.println("card1.equals(card2): " + cards[0].equals(cards[1]));

    // Test compareTo() method
    System.out.println("card1.compareTo(card1Copy): " + cards[0].compareTo(card1Copy));
    System.out.println("card1.compareTo(card2): " + cards[0].compareTo(cards[1]));
    System.out.println("card2.compareTo(card3): " + cards[1].compareTo(cards[2]));
    System.out.println("card3.compareTo(card4): " + cards[2].compareTo(cards[3]));

    // Test HashSet behavior
    Set<Card> cardSet = new HashSet<>();
    cardSet.add(cards[0]);
    cardSet.add(card1Copy);
    System.out.println("cardSet size: " + cardSet.size());

    // Test TreeSet behavior
    Set<Card> cardTreeSet = new TreeSet<>();
    Collections.addAll(cardTreeSet, cards);
    System.out.println("cardTreeSet:");
    for (Card card : cardTreeSet) {
        System.out.println(card);
    }
}
}