package enemies;

public abstract class Enemy {

    private int health;

    public Enemy(int health){
        this.health = health;
    }

    public int getHealth(){
        return health;
    }

    public void takeDamage(int damage){
        this.health -= damage;
    }
}
