package tugas.soal1;

public class Segitiga {
    private int sudut;

    public int totalSudut(int a) {
        sudut = 180;
        return sudut -= a;
    }
    public int totalSudut(int a, int b) {
        sudut = 180;
        return sudut -= a + b;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }
    
    public double keliling(int sisiA, int sisiB) {
        return (Math.sqrt((sisiA * sisiA) + (sisiB * sisiB))) + sisiA + sisiB;
    }
}
