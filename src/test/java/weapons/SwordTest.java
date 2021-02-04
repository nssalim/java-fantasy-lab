package weapons;

import enemies.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {
    Sword sword;
    Troll troll;

    @Before
    public void before() {
        sword = new Sword(40);
        troll = new Troll(60);
    }

    @Test
    public void canGetDamage() {
        assertEquals(40, sword.getDamage());
    }

    @Test
    public void canSetDamage() {
        sword.setDamage(50);
        assertEquals(50, sword.getDamage());
    }

    @Test
    public void canAttack() {
        sword.attack(troll);
        assertEquals(20, troll.getHealth());
    }
}
