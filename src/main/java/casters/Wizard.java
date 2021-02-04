package casters;

import goodpets.IDefend;

public class Wizard extends Mage {

    public Wizard(String name, int health, ISpell spell, IDefend defend) {
        super(name, health, spell, defend);
    }
}
