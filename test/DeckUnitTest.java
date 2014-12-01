import static junit.framework.Assert.assertEquals;
import java.util.*;


public class DeckUnitTest {
    Deck deck = new Deck(104);

    public void distribuerUnitTest() {

        assertEquals(104, deck.getSize());
        deck.distribuer(47);
        assertEquals(103, deck.getSize());
    }
}
