package tugas;

public class pensilKayu extends pensil {
    private int panjang;

    public pensilKayu(String merek, String warna, int panjang) {
        super(merek, warna);
        this.panjang = panjang;
    }

    public void cetak() {
        super.cetak();
        System.out.println("Panjang : " + this.panjang);
    }

    public void raut(boolean isRaut) {
        if (isRaut) {
            System.out.println("Pensil kayu diraut");
            this.panjang--;
        } else {
            System.out.println("Gagal diraut");
        }
    }
}
