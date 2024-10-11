package tugas.soal1;

public class Main {
    public static void main(String[] args) {
        Segitiga t = new Segitiga();

        System.out.println("Besar Sudut setelah dikurangi sudut A : " + t.totalSudut(90));
        System.out.println("Besar Sudut setelah dikurangi sudut A dan B : " + t.totalSudut(30, 60));
        System.out.println("Keliling : " + t.keliling(10, 10, 10));
        System.out.println("Keliling : " + t.keliling(10, 7));
    }
}
