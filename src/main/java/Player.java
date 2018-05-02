import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfCardsInHand(){
        return this.hand.size();
    }

    public void addCardtoHand(Deck deck){
        Card card = deck.removeCard();
        this.hand.add(card);
    }

    public int valueOfCardInHand(){
        return this.hand.get(0).getValueFromEnum();
    }

    public int valueOfCardsInHand() {
        return (this.hand.get(0).getValueFromEnum() + (this.hand.get(1).getValueFromEnum()));
    }
}
