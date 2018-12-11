import java.util.ArrayList;
import java.util.List;

public class Hand {
    List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        hand.add(card);
    }

    public String compare(Hand hand) {
        int max = 0;
        for (int i = 0; i < this.hand.size(); i++) {
            for (int j = 0; j < this.hand.size(); j++) {
                if (this.hand.get(i).getValue() > hand.hand.get(j).getValue()) {
                    max = this.hand.get(i).getValue();

                } else {
                    max = hand.hand.get(j).getValue();
                }

            }
        }
        return max+ "";

    }


}
