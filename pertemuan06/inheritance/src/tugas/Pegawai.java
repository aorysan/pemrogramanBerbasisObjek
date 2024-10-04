package tugas;

public class Pegawai {
    private String nip, nama, alamat;
    private int gaji;

    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public void print() {
        System.out.println("NIP\t: " + getNip());
        System.out.println("Nama\t: " + getNama());
        System.out.println("Alamat\t: " + getAlamat());
        System.out.println("Gaji\t: " + getGaji());
        System.out.println();
    }
}
