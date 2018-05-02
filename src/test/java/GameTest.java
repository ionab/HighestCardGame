import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Deck deck;


    @Before
    public void before(){
        game = new Game(deck);

    }

    @Test
    public void gameStartsWith2Players(){
        assertEquals(2, game.getPlayerCount());
    }
}
