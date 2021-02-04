package casters;

import enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FireballTest {
    Fireball fireball;
    Orc orc;

    @Before
    public void before() {
        fireball = new Fireball();
        orc = new Orc(110);
    }

    @Test
    public void canGetDamage() {
        assertEquals(20, fireball.getDamage());
    }

    @Test
    public void canBeCast() {
        fireball.cast(orc);
        assertEquals(90, orc.getHealth());
    }

}
