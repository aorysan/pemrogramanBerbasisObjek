package percobaan4;

public class Gerbong {
    private String kode;
    private Kursi kursi[];

    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.kursi = new Kursi[jumlah];

        this.initKursi();
    }

    public String getKursi() {
        return kode;
    }

    public String getKode() {
        return this.kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {
        if(this.kursi[nomor - 1].getPenumpang() == null) {
            this.kursi[nomor - 1].setPenumpang(penumpang); 
        } else {
            System.out.println("Kursi ini telah diisi. Anda akan dipindahkan ke kursi kosong");

            this.kursi[nomor].setPenumpang(penumpang); 
        }
    }

    private void initKursi() {
        for (int i = 0; i < kursi.length; i++) {
            this.kursi[i] = new Kursi(String.valueOf(i + 1));
        } 
    } 

    public String info() {
        String info = ""; 
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : this.kursi) {
            info += kursi.info(); 
        }
        return info; 
    } 

}
