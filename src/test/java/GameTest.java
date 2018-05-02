import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Deck deck;
    Player player;


    @Before
    public void before(){

        deck = new Deck();
        game = new Game(deck);

    }

    @Test
    public void gameStartsWith2Players(){
        assertEquals(2, game.getPlayerCount());
    }

    @Test
    public void playersGivenCard(){
        assertEquals(true, game.playerHasCard(0));
    }

    @Test
    public void gameHasWinner(){
        assertEquals("Player 1 Wins", game.decideWinner());
    }
}
