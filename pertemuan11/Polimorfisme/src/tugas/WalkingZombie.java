package tugas;

public class WalkingZombie extends Zombie{
    public WalkingZombie(int health, int level) {
        super(health, level);
    }

    public void heal() {
        if(getLevel() == 1) {
            setHP((int)(getMaxHP() * 0.2));
            System.out.println("Walking Zombie " + "Healed...");
        } else if(getLevel() == 2) {
            setHP((int)(getMaxHP() * 0.3));
            System.out.println("Walking Zombie " + "Healed...");
        } else if(getLevel() == 3) {
            setHP((int)(getMaxHP() * 0.4));
            System.out.println("Walking Zombie " + "Healed...");
        }
    }

    public void attacked() {
        setHPAttacked((int)(getMaxHP() * 0.02));
    }

    public void status() {
        System.out.println("Walking Zombie Status");
        super.status();
    }
}
