package percobaan03;

public class Barang {
    public String namaBarang;
    public String jenisBarang;
    public int stok;

    public void tampilBarang() {
        System.out.println("Nama barang\t: " + namaBarang);
        System.out.println("Jenis barang\t: " + jenisBarang);
        System.out.println("Stok\t\t: " + stok);
    }

    public int tambahStok(int barangMasuk) {
        int stokBaru = stok + barangMasuk;
        return stokBaru;
    }
}
