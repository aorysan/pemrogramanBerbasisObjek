package tugas.pertanyaan2;

public class Game {
    private String nama;
    private int harga;

    public Game(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public int getharga() {
        return harga;
    }

    public String getnama() {
        return nama;
    }
}
