import jenisTanaman.Plant;
import waktu.Time;

public class Player {
    private int uang = 100, energi = 100;
    private Field lahan = new Field();
    private Plant inventory[] = new Plant[10];
    private Time waktu = new Time();

    public void planting(Plant tanaman) {
        for (int i = 0; i < this.lahan.getUkuran(); i++) {
            if(lahan.getTempat(i) == null){
                if(this.energi >= 10) {
                    lahan.setTempat(i, tanaman);
                    this.energi -= 10;
                    System.out.println(lahan.getTempat(i).getName() + " Planted\n");
                    this.inventory[i] = null;
                    break;
                }
            }
        }
    }

    public void panen(int item) {
        for (int i = 0; i < inventory.length; i++) {
            if(this.inventory[i] == null) {
                if(this.energi >= 20) {
                    this.energi -= 20;
                    this.inventory[i] = lahan.getTempat(item);
                    this.lahan.diPanen(item);
                    System.out.println(inventory[i].getName() + " telah dipanen\n");
                    break;
                }
            }
        }
    }

    public void gainEnergi() {
        lahan.progress();
        waktu.nextDay();
        this.energi = 100;
        System.out.println("IShoMa telah selesai\n");
    }

    public void beli(Plant item) {
        if(this.uang >= item.getHargaBeli()) {
            for (int i = 0; i < inventory.length; i++) {
                if(this.inventory[i] == null) {
                    this.inventory[i] = item;
                    this.uang -= item.getHargaBeli();
                    System.out.println(item.getName() + " telah dibeli!\n");
                    break;
                }
            }
        } else {
            System.out.println("Uang tidak mencukupi");
        }
    }

    public void displayInventory() {
        for(int i = 0; i < inventory.length; i++) {
            if(inventory[i] != null) {
                System.out.println((i+1) + ". " + inventory[i].getName());
            } else {
                System.out.println("X");
            }
        }
    }

    public void displayLahan() {
        for(int i = 0; i < lahan.getItemLength(); i++) {
            if(lahan.getTempat(i) != null) {
                System.out.println((i+1) + ". " + lahan.getTempat(i).getName());
            } else {
                System.out.println("X");
            }
        }
    }

    public void jual(int item) {
        this.uang += inventory[item].getHargaJual();
        inventory[item] = null;
        System.out.println("Telah dijual\n");
    }

    public Plant getInventory(int item) {
        return this.inventory[item];
    }

    public Field getLahan() {
        return lahan;
    }

    public int getWaktuPanen(int index) {
        return lahan.getTempat(index).getWaktu();
    }
}