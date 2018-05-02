import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PlayerTest {

    Player player;
    Deck deck;
    Card card;

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
        assertEquals(0, player.getNumberOfCardsInHand());
    }

    @Test
    public void hasCardInHand(){
        player.addCardtoHand(deck);
        player.addCardtoHand(deck);
        assertEquals(2, player.getNumberOfCardsInHand());
    }

    @Test
    public void hasCardValue() {
        player.addCardtoHand(deck);
        int result = player.valueOfCardInHand();
        assertNotNull(result);
    }

    @Test
    public void hasAllCardValues() {
        player.addCardtoHand(deck);
        player.addCardtoHand(deck);
        int result = player.valueOfCardsInHand();
        assertNotNull(result);
    }
}
