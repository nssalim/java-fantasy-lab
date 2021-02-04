package weapons;

import enemies.Orc;
import enemies.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClubTest {
    Club club;
    Troll troll;

    @Before
    public void before() {
        club = new Club(10);
        troll = new Troll(60);
    }

    @Test
    public void canGetDamage() {
        assertEquals(10, club.getDamage());
    }

    @Test
    public void canSetDamage() {
        club.setDamage(20);
        assertEquals(20, club.getDamage());
    }

    @Test
    public void canAttack() {
        club.attack(troll);
        assertEquals(50, troll.getHealth());
    }
}
