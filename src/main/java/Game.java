import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;

    public Game(Deck deck) {
        this.deck = deck;
        this.players = new ArrayList<>();
        populateGame();
        dealCards();
    }

    private void populateGame() {
        Player player1 = new Player("Liam");
        Player player2 = new Player("Kelsie");
        this.players.add(player1);
        this.players.add(player2);
    }


    private void dealCards() {
        for (Player player : this.players){
            player.addCardtoHand(deck);
            player.addCardtoHand(deck);
        }
    }

    public int getPlayerCount(){
        return this.players.size();
    }

    public boolean playerHasCard(int playerIndex) {
        if (this.players.get(playerIndex).getNumberOfCardsInHand() >= 1) {
            return true;
        }
        return false;
    }

//    public Player decideWinner(){
//            if (this.players.get(0).valueOfCardInHand() > this.players.get(1).valueOfCardInHand()) {
//                return this.players.get(0);
//            } else if
//                (this.players.get(0).valueOfCardInHand() < this.players.get(1).valueOfCardInHand()) {
//                    return this.players.get(1);
//                }
//        return null;
//    }

    public Player decideWinner(){
            if (this.players.get(0).valueOfCardsInHand() > this.players.get(1).valueOfCardsInHand()) {
                return this.players.get(0);
            } else if
                (this.players.get(0).valueOfCardsInHand() < this.players.get(1).valueOfCardsInHand()) {
                    return this.players.get(1);
                }
        return null;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }
}
