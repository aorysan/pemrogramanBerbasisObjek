package tugas;

public class Dosen extends Pegawai {
    private int jumlahSKS, tarifSKS;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public int getTarif() {
        return tarifSKS;
    }

    public void setTarif(int tarifSKS) {
        this.tarifSKS = tarifSKS;
    }

    public int getSKS() {
        return jumlahSKS;
    }

    public void setSKS(int sks) {
        this.jumlahSKS = sks;
    }

    public void print() {
        System.out.println("SKS\t: " + getSKS());
        System.out.println("Tarif\t: " + getTarif());
        super.print();
        System.out.println();
    }
}
