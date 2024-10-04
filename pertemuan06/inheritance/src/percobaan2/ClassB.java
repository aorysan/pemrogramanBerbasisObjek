package percobaan2;

public class ClassB extends ClassA {
    private int z;

    public void getNilaiZ() {
        System.out.println("Nilai z = " + z);
    }

    public void getJumlah() {
        System.out.println("Jumlah = " + (getX() + getY() + z));
    }

    public void setNilaiZ(int z) {
        this.z = z;
    }
}
