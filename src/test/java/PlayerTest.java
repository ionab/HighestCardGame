import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Deck deck;

    @Before
    public void before(){
        player = new Player("Liam");
        deck = new Deck();
    }

    @Test
    public void hasName(){
        assertEquals("Liam", player.getName());
    }

    @Test
    public void handStartsEmpty(){
        assertEquals(0, player.getCardsInHand());
    }

    @Test
    public void hasCardInHand(){
        player.addCardtoHand(deck);
        player.addCardtoHand(deck);
        assertEquals(2, player.getCardsInHand());
    }
}
