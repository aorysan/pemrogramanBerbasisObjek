package tugas;

public class Zombie implements Destroyable {
    private int health, level, maxHP;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
        this.maxHP = health;
    }

    public void heal() {

    }
    
    public void setHP(int health) {
        this.health += health;
    
        if(this.health > this.maxHP) {
            this.health = this.maxHP;
        }
    }

    public void status() {
        System.out.println("Lv : " + this.level);
        System.out.println("HP : " + this.health + "\n");
    }

    public int getHP() {
        return this.health;
    }

    public int getLevel() {
        return this.level;
    }

    public int getMaxHP() {
        return this.maxHP;
    }

    public void setHPAttacked (int health) {
        this.health -= health;
    }

    public void attacked() {

    }
}
