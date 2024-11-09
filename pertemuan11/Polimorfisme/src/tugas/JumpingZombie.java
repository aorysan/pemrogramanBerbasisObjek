package tugas;

public class JumpingZombie extends Zombie{
    public JumpingZombie(int x, int y) {
        super(x, y);
    }

    public void heal() {
        if(getLevel() == 1) {
            setHP((int)(getMaxHP() * 0.3));
            System.out.println("Jumping Zombie " + "Healed...");
        } else if(getLevel() == 2) {
            setHP((int)(getMaxHP() * 0.4));
            System.out.println("Jumping Zombie " + "Healed...");
        } else if(getLevel() == 3) {
            setHP((int)(getMaxHP() * 0.5));
            System.out.println("Jumping Zombie " + "Healed...");
        }
    }

    public void attacked() {
        setHPAttacked((int)(getMaxHP() * 0.01));
    }

    public void status() {
        System.out.println("Jumping Zombie Status");
        super.status();
    }
}
