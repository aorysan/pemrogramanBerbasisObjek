import jenisTanaman.Plant;

public class Shop {
    private Plant tanaman[] = new Plant[3];

    public void addTanaman(Plant tanaman) {
        for (int i = 0; i < this.tanaman.length; i++) {
            if (this.tanaman[i] == null) {
                this.tanaman[i] = tanaman;
                break;
            }
        }
    }

    public Plant getTanaman(int item) {
        return this.tanaman[item];
    }

    public void displayBuy() {
        for (int i = 0; i < tanaman.length; i++) {
            System.out.println((i+1) + ". " + tanaman[i].getName());
        }
        System.out.print("Silahkan pilih tanaman yang ingin dibeli : ");
    }

    public int getListLength() {
        return this.tanaman.length;
    }
}
