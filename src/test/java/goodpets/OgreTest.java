package goodpets;

import enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class OgreTest {

    Ogre ogre;
    Orc orc;

    @Before
    public void before(){
        ogre = new Ogre();
        orc = new Orc(100);
    }

    @Test
    public void canCreateOgre() {
        assertNotNull(ogre);
    }

    @Test
    public void canDefend(){
        ogre.defend(orc);
        assertEquals(50, orc.getHealth());
    }

}
