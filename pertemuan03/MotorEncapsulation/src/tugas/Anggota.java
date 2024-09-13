package tugas;

public class Anggota {
    private String id, nama;
    private int saldo, limit;

    public Anggota(String id, String nama, int limit) {
        this.id = id;
        this.nama = nama;
        this.limit = limit;
    }

    public String getNama() {
        return this.nama;
    }

    public int getLimitPinjaman() {
        return this.limit;
    }

    public int getJumlahPinjaman(){
        return this.saldo;
    }

    public int angsur(int angsuran) {
        if(angsuran > this.saldo) {
            angsuran -= this.saldo;
            System.out.println("Kembalian : " + angsuran);
            return angsuran;
        } else if(angsuran == this.saldo) {
            this.saldo -= angsuran;
            System.out.println("Angsuran sudah lunas");
            return this.saldo;
        } else if(angsuran < (0.1*this.saldo)) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
            return this.saldo;
        } else {
            this.saldo -= angsuran;
            System.out.println("Sisa angsuran : " + this.saldo);
            return this.saldo;
        }
    }

    public int pinjam(int saldo) {
        if(saldo > this.limit) {
            System.out.println("Saldo melebihi limit pinjaman");
            return this.saldo;
        } else {
            return this.saldo += saldo;
        }
    }
}
