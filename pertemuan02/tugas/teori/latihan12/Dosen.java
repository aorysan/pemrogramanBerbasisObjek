package latihan12;

public class Dosen {
    public String nama;
    private Mahasiswa siswa;

    public Dosen(String nama) {
        this.nama = nama;
    }

    public int inputNilai(Mahasiswa siswa, int nilai) {
        siswa.nilai = nilai;
        return nilai;
    }

    public void printData() {
        System.out.println("Nama Dosen : " + this.nama);
    }
}
