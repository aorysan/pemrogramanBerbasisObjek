package tugas;

public class pensil {
    private String merek, warna;

    public pensil(String merek, String warna) {
        this.merek = merek;
        this.warna = warna;
    }

    public void cetak() {
        System.out.println();
        System.out.println("Merek : " + this.merek);
        System.out.println("Warna : " + this.warna);
    }

    public void tulis() {
        System.out.println("Tulisan : " + this.merek + " " + this.warna);
    }
}
