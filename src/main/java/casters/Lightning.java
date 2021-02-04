package casters;

import enemies.Enemy;

public class Lightning implements ISpell{

    private int damage;

    public Lightning(){
        this.damage = 90;
    }

    public int getDamage(){
        return this.damage;
    }

    public void cast(Enemy enemy){
        int spellDamage = this.damage;
        enemy.takeDamage(damage);
    }
}
