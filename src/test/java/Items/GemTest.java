package Items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GemTest {
    @Test
    public void gemHasValue(){
        assertEquals(20, new Gem().getValue());
    }
}