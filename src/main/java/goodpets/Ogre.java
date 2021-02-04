package goodpets;

import enemies.Enemy;

public class Ogre implements IDefend {

    public Ogre() {

    }

    public void defend (Enemy enemy){
        enemy.takeDamage(50);
    }



}
