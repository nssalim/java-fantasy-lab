package players;

import enemies.Enemy;
import weapons.IWeapon;

import java.util.ArrayList;

public abstract class Player {
    private String name;
    private int health;
    ArrayList<IWeapon> weapons;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.weapons = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ArrayList<IWeapon> getWeapons() {
        return this.weapons;
    }

    public void addWeapon(IWeapon weapon) {
        this.weapons.add(weapon);
    }

    public IWeapon getWeapon(IWeapon weapon){
        int weaponIndex = this.weapons.indexOf(weapon);
        return this.weapons.get(weaponIndex);
    }

    public void attackEnemy(Enemy enemy, IWeapon weapon){
        weapon.attack(enemy);
    }
}
