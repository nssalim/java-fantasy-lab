package goodpets;

import enemies.Enemy;

public class Dragon implements IDefend {
    public Dragon() {

    }

    @Override
    public void defend(Enemy enemy) {
        enemy.takeDamage(60);
    }
}
