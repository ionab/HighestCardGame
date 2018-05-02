import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Test //3% Chance of Draw/Fail
    public void gameHasWinner(){
        assertTrue(game.getPlayers().contains(game.decideWinner()));
    }
}
