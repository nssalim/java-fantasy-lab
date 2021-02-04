package weapons;

import enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AxeTest {

    Axe axe;
    Orc orc;

    @Before
    public void before() {
        axe = new Axe(40);
        orc = new Orc(100);
    }

    @Test
    public void canGetDamage() {
        assertEquals(40, axe.getDamage());
    }

    @Test
    public void canSetDamage() {
        axe.setDamage(50);
        assertEquals(50, axe.getDamage());
    }

    @Test
    public void canAttack() {
        axe.attack(orc);
        assertEquals(60, orc.getHealth());
    }
}