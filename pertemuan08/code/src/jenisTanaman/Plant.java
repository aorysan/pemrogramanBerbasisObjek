package jenisTanaman;

public class Plant {
    private String nama;
    private int hargaJual, hargaBeli, waktuPanen;

    public Plant(String nama, int waktuPanen, int hargaBeli, int hargaJual) {
        this.nama = nama;
        this.waktuPanen = waktuPanen;
        this.hargaBeli = hargaBeli;
        this.hargaJual = hargaJual;
    }

    public int getHargaBeli() {
        return this.hargaBeli;
    }

    public int getHargaJual() {
        return this.hargaJual;
    }

    public String getName() {
        return this.nama;
    }

    public void countDown() {
        waktuPanen--;
        if(waktuPanen == 0) {
            System.out.println("Sudah waktunya panen");
        } else if (waktuPanen < 0) {
            waktuPanen = 0;
        }
    }

    public int getWaktu() {
        return this.waktuPanen;
    }

    // public void display() {
    //     System.out.println("Nama : " + this.nama);
    //     System.out.println("Lama panen : " + this.waktuPanen);
    //     System.out.println("Harga beli : " + this.hargaBeli);
    //     System.out.println("Harga jual : " + this.hargaJual);
    // }
}
