package casters;

import enemies.Enemy;
import players.Player;
import goodpets.IDefend;

public abstract class Mage extends Player {

    private ISpell spell;
    private IDefend defend;

    public Mage(String name, int health, ISpell spell, IDefend defend){
        super(name, health);
        this.spell = spell;
        this.defend = defend;
    }

    public void setSpell(ISpell spell){
        this.spell = spell;
    }

    public void setDefend(IDefend defend){
        this.defend = defend;
    }

    public void defend(Enemy enemy){
        this.defend.defend(enemy);
    }

    public void cast(Enemy enemy){
        this.spell.cast(enemy);
    }

}
