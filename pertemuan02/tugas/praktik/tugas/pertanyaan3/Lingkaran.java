package tugas.pertanyaan3;

public class Lingkaran {
    private double phi = 3.14;
    private double r;

    public double hitungLuas() {
        return phi * r * r;
    }

    public double hitungKeliling() {
        return 2 * phi * r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
