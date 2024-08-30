package tugas;

public class kertas {
    private int panjang, lebar;

    public kertas(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void cetak() {
        System.out.println();
        System.out.println("Panjang : " + this.panjang);
        System.out.println("Lebar : " + this.lebar);
    }

    public boolean lipat(boolean isLipat) {
        if(isLipat == true) {
            this.panjang = this.panjang * 2;
            this.lebar = this.lebar * 2;
            System.out.println("Kertas dilipat");
            return true;
        } else {
            System.out.println("Gagal lipat");
            return false;
        }
    }

    public boolean sobek(boolean isSobek) {
        if(isSobek == true) {
            this.panjang = this.panjang * 2;
            this.lebar = this.lebar * 2;
            System.out.println("Kertas disobek");
            return true;
        } else {
            System.out.println("Gagal sobek");
            return false;
        }
    }
}
