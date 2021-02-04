package casters;

import enemies.Orc;
import goodpets.Ogre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {
    Fireball fireball;
    Lightning lightning;
    Warlock warlock;
    Orc orc;
    Ogre ogre;

    @Before
    public void before(){
        fireball = new Fireball();
        lightning = new Lightning();
        ogre = new Ogre();
        orc = new Orc(120);
        warlock = new Warlock("James", 100, lightning, ogre);
    }

    @Test
    public void hasName(){
        assertEquals("James", warlock.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(100, warlock.getHealth());
    }

    @Test
    public void canCastSpell(){
        warlock.cast(orc);
        assertEquals(100, warlock.getHealth());
    }

    @Test
    public void canChangeSpell(){
        warlock.setSpell(fireball);
        warlock.cast(orc);
        assertEquals(100, orc.getHealth());
    }

    @Test
    public void canDefend(){
        warlock.defend(orc);
        assertEquals(70, orc.getHealth());
    }
}
