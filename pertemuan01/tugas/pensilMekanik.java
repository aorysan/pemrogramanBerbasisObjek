package tugas;

public class pensilMekanik extends pensil {

    private int panjangIsi;

    public pensilMekanik(String merek, String warna, int panjangIsi) {
        super(merek, warna);
        this.panjangIsi = panjangIsi;
    }

    public void cetak() {
        super.cetak();
        System.out.println("Panjang Isi : " + this.panjangIsi);
        System.out.println();
    }

    public void pushIsi(boolean isPush) {
        if (isPush == true) {
            System.out.println("Push Isi");
            this.panjangIsi++;
        } else {
            System.out.println("Gagal push");
        }
    }
}
