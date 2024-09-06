package latihan3;

public class Persegi {
    public int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public void printSisi() {
        System.out.println("Panjang dari sisi persegi adalah " + this.sisi);
    }

    public int hitungLuas() {
        int luas = this.sisi *= this.sisi;
        System.out.println("Luas persegi adalah " + this.sisi);

        return luas;
    }

    public int hitungKeliling() {
        int keliling = this.sisi *= 4;
        System.out.println("Keliling persegi adalah " + this.sisi);

        return keliling;
    }
}
