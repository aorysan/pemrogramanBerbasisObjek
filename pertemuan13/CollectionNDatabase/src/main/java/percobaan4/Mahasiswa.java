package percobaan4;

public class Mahasiswa {
    private String nama, alamat, nim;

    public Mahasiswa(String nama, String alamat, String nim) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getAlamat() {
        return this.alamat;
    }
}
