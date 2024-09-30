package percobaan2;

public class Pelanggan {
    private String nama;
    private Sopir sopir;
    private Mobil mobil;
    private int hari;

    public Pelanggan(String nama, Sopir sopir, Mobil mobil, int hari) {
        this.nama = nama;
        this.sopir = sopir;
        this.mobil = mobil;
        this.hari = hari;
    }

    public Pelanggan() {

    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Sopir getSopir() {
        return sopir;
    }

    public void setSopir(Sopir sopir) {
        this.sopir = sopir;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public int getHari() {
        return hari;
    }

    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari); 
    } 
}
