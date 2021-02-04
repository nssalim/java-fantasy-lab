package fighters;

import org.junit.Before;
import org.junit.Test;
import weapons.Club;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class KnightTest {
    Knight knight;
    Sword sword;

    @Before
    public void before()  {
        knight = new Knight("Arthur", 150);
        sword = new Sword(80);
    }

    @Test
    public void canGetName() {
        assertEquals("Arthur", knight.getName());
    }

    @Test
    public void canSetName() {
        knight.setName("Lancelot");
        assertEquals("Lancelot", knight.getName());
    }

    @Test
    public void canGetHealth() {
        assertEquals(150, knight.getHealth());
    }

    @Test
    public void canSetHealth() {
        knight.setHealth(180);
        assertEquals(180, knight.getHealth());
    }

    @Test
    public void weaponsListStartsEmpty() {
        assertEquals(0, knight.getWeapons().size());
    }

    @Test
    public void canAddWeapon() {
        knight.addWeapon(sword);
        assertEquals(1, knight.getWeapons().size());
    }
}
