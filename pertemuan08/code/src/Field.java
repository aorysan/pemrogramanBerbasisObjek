import jenisTanaman.Plant;

public class Field {
    private Plant item[] = new Plant[10];

    public int getUkuran() {
        return item.length;
    }

    public void displayPetak() {
        for (int i = 0; i < item.length; i++) {
            if (item[i] != null) {
                System.out.println(item[i].getName());
            } else {
                System.out.println("Lahan Kosong");
            }
        }
    }

    public Plant getTempat(int place) {
        return item[place];
    }

    public void setTempat(int item, Plant tanaman) {
        this.item[item] = tanaman;
    }

    public void progress() {
        for (int i = 0; i < item.length; i++) {
            if (this.item[i] != null) {
                this.item[i].countDown();
            }
        }
    }

    public void diPanen(int item) {
        this.item[item] = null;
    }

    public int getItemLength() {
        return item.length;
    }
}
