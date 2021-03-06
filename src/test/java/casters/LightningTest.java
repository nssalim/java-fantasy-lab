
package casters;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LightningTest {
    Lightning lightning;
    Orc orc;

    @Before
    public void before(){
        lightning = new Lightning();
        orc = new Orc(5);
    }

    @Test
    public void canBeCast() {
        lightning.cast(orc);
        assertEquals(-85, orc.getHealth());
    }

}
