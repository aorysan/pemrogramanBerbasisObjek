public class sepeda {
    private String merek;
    private int kecepatan, gear;

    public void setMerek(String newValue) {
        this.merek = newValue;
    }

    public void gantiGear(int newValue) {
        this.gear = newValue;
    }

    public void tambahKecepatan(int increment) {
        this.kecepatan += increment;
    }

    public void rem(int decrement) {
        this.kecepatan -= decrement;
    }

    public void cekStatus() {
        System.out.println("Merek : " + this.merek);
        System.out.println("Kecepatan : " + this.kecepatan);
        System.out.println("Gear : " + this.gear);
        System.out.println();
    }
}