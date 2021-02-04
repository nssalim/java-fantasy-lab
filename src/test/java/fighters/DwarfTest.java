package fighters;

import org.junit.Before;
import org.junit.Test;
import weapons.Axe;

import static org.junit.Assert.*;

public class DwarfTest {

    Dwarf dwarf;
    Axe axe;

    @Before
    public void before()  {
        dwarf = new Dwarf("Gimli", 100);
        axe = new Axe(7);
    }

    @Test
    public void canGetName() {
        assertEquals("Gimli", dwarf.getName());
    }

    @Test
    public void canSetName() {
        dwarf.setName("Sleepy");
        assertEquals("Sleepy", dwarf.getName());
    }

    @Test
    public void canGetHealth() {
        assertEquals(100, dwarf.getHealth());
    }

    @Test
    public void canSetHealth() {
        dwarf.setHealth(50);
        assertEquals(50, dwarf.getHealth());
    }

    @Test
    public void weaponsListStartsWorking() {
        assertEquals(0, dwarf.getWeapons().size());
    }

    @Test
    public void canAddWeapon() {
        dwarf.addWeapon(axe);
        assertEquals(1, dwarf.getWeapons().size());
    }
}