package latihan12;

public class Mahasiswa{
    public String nama, nim;
    public int nilai;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void printData() {
        System.out.println("Nama Mahasiswa : " + this.nama + "\nNim : " + this.nim);
        System.out.println("Nilai : " + this.nilai);
    }
}