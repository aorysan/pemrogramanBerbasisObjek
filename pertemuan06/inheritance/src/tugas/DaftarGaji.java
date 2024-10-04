package tugas;

public class DaftarGaji {
    private Pegawai pegawai[];

    public DaftarGaji(int jumlahList) {
        this.pegawai = new Pegawai[jumlahList];
    }

    public void addPegawai(Pegawai pegawai) {
        for (int i = 0; i < this.pegawai.length; i++) {
            if (this.pegawai[i] == null) {
                this.pegawai[i] = pegawai;
                break;
            }
        }
    }

    public void printGaji() {
        for (int i = 0; i < this.pegawai.length; i++) {
            if (this.pegawai[i] != null) {
                System.out.println(this.pegawai[i].getNama() + "\t:" + this.pegawai[i].getGaji());
            }
        }
    }
}
