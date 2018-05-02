import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void hasStarting52Cards(){
        assertEquals(52, deck.getNumberOfCards());
    }

    @Test
    public void hasRemovedCard(){
        deck.removeCard();
        assertEquals(51, deck.getNumberOfCards());
    }
}
