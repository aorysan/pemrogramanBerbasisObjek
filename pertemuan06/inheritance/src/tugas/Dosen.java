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
        this.tarifSKS = sks;
    }
}
