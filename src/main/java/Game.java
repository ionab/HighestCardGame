import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;

    public Game(Deck deck) {
        this.deck = deck;
        this.players = new ArrayList<>();
        populateGame();
    }

    private void populateGame() {
        Player player1 = new Player("Liam");
        Player player2 = new Player("Kelsie");
        this.players.add(player1);
        this.players.add(player2);
    }

//    private void addPlayers(Player player){
//        this.players.add(player);
//        this.players.add(player);
//    }

    public int getPlayerCount(){
        return this.players.size();
    }
}
