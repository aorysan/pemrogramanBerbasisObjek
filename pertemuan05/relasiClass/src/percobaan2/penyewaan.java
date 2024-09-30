package percobaan2;

public class penyewaan {
    private int hari;
    private Mobil mobil;
    private Sopir sopir;
    private Pelanggan pelanggan;

    public penyewaan(int hari) {
        this.hari = hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public int getHari() {
        return hari;
    }

    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari); 
    }

    public void showData() {
        System.out.println("Nama : " + pelanggan.getNama());
        System.out.println("Sopir : " + pelanggan.getSopir().getNama());
        System.out.println("Mobil : " + pelanggan.getMobil().getMerk());
        System.out.println("Hari : " + getHari());
        System.out.println("Biaya Total : " + hitungBiayaTotal());
    }
}
