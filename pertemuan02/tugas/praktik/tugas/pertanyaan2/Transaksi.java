package tugas.pertanyaan2;

public class Transaksi {
    private int id, lamaSewa, hargaTotal;
    private String namaMember, namaAdmin, namaGame;

    Transaksi(int lamaSewa, int hargaTotal, String namaMember, String namaAdmin, String namaGame) {
        this.id++;
        this.lamaSewa = lamaSewa;
        this.hargaTotal = hargaTotal;
        this.namaMember = namaMember;
        this.namaAdmin = namaAdmin;
        this.namaGame = namaGame;
    }

    public void print(){
        System.out.println("ID\t\t: " + id);
        System.out.println("Admin\t\t: " + namaAdmin);
        System.out.println("Nama\t\t: " + namaMember);
        System.out.println("Game\t\t: " + namaGame);
        System.out.println("Lama sewa\t: " + lamaSewa);
        System.out.println("Harga total\t: " + hargaTotal);
    }
}
