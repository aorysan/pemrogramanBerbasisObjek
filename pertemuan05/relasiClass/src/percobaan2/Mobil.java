package percobaan2;

public class Mobil {
    private String merk;
    private int biaya;

    public Mobil(String merk, int biaya) {
        this.merk = merk;
        this.biaya = biaya;
    }

    public Mobil() {

    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getBiaya() {
        return biaya;
    }

    public int setBiaya(int biaya) {
        return this.biaya = biaya;
    }

    public int hitungBiayaMobil(int hari) {
        return biaya * hari; 
    } 
    
}
