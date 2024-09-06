package tugas.pertanyaan4;

public class Barang {
    private String kode, namaBarang;
    private int hargaDasar, stok;
    private float diskon;

    Barang(String kode, String namaBarang, int hargaDasar, float diskon) {
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.hargaDasar = hargaDasar;
        this.diskon = diskon;
    }

    public float hargaJual() {
        return (hargaDasar - (hargaDasar * diskon));
    }

    public void tampilData() {
        System.out.println("Kode\t\t: " + kode);
        System.out.println("Nama\t\t: " + namaBarang);
        System.out.println("Harga Dasar\t: Rp." + hargaDasar);
        System.out.println("Diskon\t\t: " + (diskon*10) + "%");
        System.out.println("Harga Jual\t: Rp." + hargaJual());
        System.out.println("Stok\t\t: " + stok);
        System.out.println();
    }

    public int tambah(int stok) {
        return this.stok += stok;
    }

    public int kurang(int stok) {
        return this.stok -= stok;
    }

    public String getName() {
        return namaBarang;
    }

    public int getStok() {
        return stok;
    }
}
