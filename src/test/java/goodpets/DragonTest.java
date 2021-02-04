package goodpets;

import enemies.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DragonTest {


    Dragon dragon;
    Troll troll;

    @Before
    public void before() {
        dragon = new Dragon();
        troll = new Troll(120);
    }

    @Test
    public void canCreateDragon() {
        assertNotNull(dragon);
    }

    @Test
    public void canDefendWizard() {
        dragon.defend(troll);
        assertEquals(60, troll.getHealth());
    }
}
