import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("Pure", "BBC Radio 2");
    }

    @Test
    public void getStation(){
        assertEquals("BBC Radio 2", radio.getStation());
    }

    @Test
    public void setStation(){
        radio.setStation("Classic FM");
        assertEquals("Classic FM", radio.getStation());
    }

}
