public class Karyawan {
    private String nama, nip, golongan;
    private double gaji;

    public void setGaji(double gaji){
        this.gaji = gaji;
    }

    public double getGaji(){
        return gaji;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public String getNip(){
        return nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;

        switch (golongan.charAt(0)) {
            case '1':
                this.gaji=5000000;
            break;
            case '2':
                this.gaji=3000000;
            break;
            case '3':
                this.gaji=2000000;
            break;
            case '4':
                this.gaji=1000000;
            break;
            case '5':
                this.gaji=750000;
            break;
        }
    }

    public String getGolongan() {
        return golongan;
    }
}
