package tugas;

public class Barrier implements Destroyable{
    private int strength, maxStrength;

    public Barrier(int strength) {
        this.strength = strength;
        this.maxStrength = strength;
    }
    
    public int getStrength() {
        return this.strength;
    }
    
    public void attacked() {
        setStrengthAttacked((int)(getStrength() * 0.03));
    }

    public void setStrengthAttacked(int strength) {
        this.strength -= strength;
    }

    public void status() {
        System.out.println("Barrier Status");
        System.out.println("Strength : " + getStrength());
    }

    public void heal() {
        this.strength += (int)(this.maxStrength * 0.7);
        if(this.strength > this.maxStrength) {
            this.strength = this.maxStrength;
        }
            
        System.out.println("Barrier Healed...");
    }
}
