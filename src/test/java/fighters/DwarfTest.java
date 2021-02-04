package fighters;

import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import weapons.Axe;
import weapons.IWeapon;
import weapons.Sword;

import static org.junit.Assert.*;

public class DwarfTest {

    Dwarf dwarf;
    Axe axe;
    Sword sword;
    Troll troll;

    @Before
    public void before()  {
        dwarf = new Dwarf("Gimli", 100);
        axe = new Axe(7);
        sword = new Sword(30);
        troll = new Troll(130);
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

    @Test
    public void canGetWeaponFromList() {
        dwarf.addWeapon(axe);
        dwarf.addWeapon(sword);
        IWeapon foundWeapon = dwarf.getWeapon(sword);
        assertEquals(foundWeapon, sword);

    }

    @Test
    public void canAttack() {
        dwarf.attackEnemy(troll, axe);
        assertEquals(123, troll.getHealth());
    }
}