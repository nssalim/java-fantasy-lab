package casters;

import goodpets.IDefend;

public class Warlock extends Mage {

    public Warlock(String name, int health, ISpell spell, IDefend defend) {
        super(name, health, spell, defend);
    }
}
