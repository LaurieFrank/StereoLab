import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void before(){
        recordDeck = new RecordDeck("Denon", 45);
    }

    @Test
    public void getSpeed(){
        assertEquals(45, recordDeck.getSpeed());
    }

    @Test
    public void getVinylSize(){
        assertEquals(0, recordDeck.getVinylSize().size());
    }

    @Test
    public void addVinyl(){
        recordDeck.addVinyl("The Cure");
        assertEquals(1, recordDeck.getVinylSize().size());
    }

    @Test
    public void canPlay(){
        recordDeck.pressPlay();
        assertEquals(true, recordDeck.getPlay());
    }
}
