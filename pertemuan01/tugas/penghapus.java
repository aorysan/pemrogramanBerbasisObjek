package tugas;

public class penghapus {
    private String merek, warna;

    public penghapus(String merek, String warna) {
        this.merek = merek;
        this.warna = warna;
    }

    public void cetak() {
        System.out.println();
        System.out.println("Merek : " + this.merek);
        System.out.println("Warna : " + this.warna);
    }

    public void hapus() {
        System.out.println("Tulisan telah dihapus");
    }

    public void ubahBentuk() {
        System.out.println("Bentuk telah diubah");
    }
}
