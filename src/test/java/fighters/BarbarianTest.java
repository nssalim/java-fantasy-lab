package fighters;

import org.junit.Before;
import org.junit.Test;
import weapons.Axe;
import weapons.Club;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Club club;

    @Before
    public void before()  {
        barbarian = new Barbarian("Conan", 130);
        club = new Club(10);
    }

    @Test
    public void canGetName() {
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void canSetName() {
        barbarian.setName("Happy");
        assertEquals("Happy", barbarian.getName());
    }

    @Test
    public void canGetHealth() {
        assertEquals(130, barbarian.getHealth());
    }

    @Test
    public void canSetHealth() {
        barbarian.setHealth(110);
        assertEquals(110, barbarian.getHealth());
    }

    @Test
    public void weaponsListStartsEmpty() {
        assertEquals(0, barbarian.getWeapons().size());
    }

    @Test
    public void canAddWeapon() {
        barbarian.addWeapon(club);
        assertEquals(1, barbarian.getWeapons().size());
    }
}
