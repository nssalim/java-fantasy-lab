package casters;

import enemies.Troll;
import goodpets.Ogre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class WizardTest {

    Fireball fireball;
    Lightning lightning;
    Wizard wizard;
    Troll troll;
    Ogre ogre;

    @Before
    public void before(){
        fireball = new Fireball();
        lightning = new Lightning();
        ogre = new Ogre();
        troll = new Troll(120);
        wizard = new Wizard("Merlin", 100, lightning, ogre);
    }

    @Test
    public void hasName(){
        assertEquals("Merlin", wizard.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(100, wizard.getHealth());
    }

    @Test
    public void canCastSpell(){
        wizard.cast(troll);
        assertEquals(30, troll.getHealth());
    }

    @Test
    public void canChangeSpell(){
        wizard.setSpell(fireball);
        wizard.cast(troll);
        assertEquals(100, troll.getHealth());
    }

    @Test
    public void canDefend(){
        wizard.defend(troll);
        assertEquals(70, troll.getHealth());
    }
}
