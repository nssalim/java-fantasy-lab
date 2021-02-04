package weapons;

import enemies.Enemy;

public class Axe implements IWeapon {
    private int damage;

    public Axe(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void attack(Enemy enemy) {
        int damage = this.damage;
        enemy.takeDamage(damage);
    }

}
