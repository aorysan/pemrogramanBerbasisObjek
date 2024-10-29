import jenisTanaman.Cabai;
import jenisTanaman.Timun;
import jenisTanaman.Tomat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sci = new Scanner(System.in);
        
        Cabai chili = new Cabai("Cabai Merah", 2, 8, 12);
        Timun cucumber = new Timun("Timun", 3, 7, 13);
        Tomat tomato = new Tomat("Tomat", 2, 8, 12);
        Shop toko = new Shop();
        Player mc = new Player();

        toko.addTanaman(chili);
        toko.addTanaman(tomato);
        toko.addTanaman(cucumber);

        clearConsole();

        System.out.println("+============================+");
        System.out.println("|        Harvest Moon        |");
        System.out.println("+============================+");

        int choice = 0;
        do{
            menu();
            choice = sci.nextInt();
            clearConsole();

            switch (choice) {
                case 1:
                    System.out.println("1. Beli");
                    System.out.println("2. Jual");
                    System.out.print("Masukkan pilihan Anda : ");
                    choice =  sci.nextInt();

                    if(choice == 1) {
                        toko.displayBuy();
                        choice = sci.nextInt();
                        mc.beli(toko.getTanaman(choice - 1));
                    } else {
                        mc.displayInventory();
                        choice = sci.nextInt();
                        mc.jual(choice-1);
                    }

                    break;

                case 2:
                    System.out.println("1. Tanam");
                    System.out.println("2. Panen");
                    System.out.print("Masukkan pilihan Anda : ");
                    choice =  sci.nextInt();

                    if(choice == 1) {
                        mc.displayInventory();
                        System.out.print("Silahkan pilih tanaman yang ingin Anda tanam : ");
                        choice = sci.nextInt();
                        mc.planting(mc.getInventory(choice-1));
                    } else if (choice == 2) {
                        mc.displayLahan();
                        System.out.print("Silahkan pilih tanaman yang ingin Anda panen : ");
                        choice = sci.nextInt();

                        int waktuPanen = mc.getWaktuPanen(choice-1);

                        if(waktuPanen == 0) {
                            mc.panen(choice-1);
                        } else {
                            System.out.println("Belum waktunya panen\n");
                        }
                    }

                    break;

                case 3:
                    System.out.println("1. Lahan");
                    System.out.println("2. Karakter");
                    System.out.println("3. Inventory");
                    choice = sci.nextInt();

                    if(choice == 1) {
                        mc.displayLahan();
                    } else if (choice == 2) {
                        mc.displayStatus();
                    } else {
                        mc.displayInventory();
                    }
                    System.out.println();
                    break;

                case 4:
                    mc.gainEnergi();
                    break;
            }
        } while(choice < 5);

        sci.close();

    }

    static void menu() {
        System.out.println("1. Toko");
        System.out.println("2. Plant");
        System.out.println("3. Status");
        System.out.println("4. Istirahat");
        System.out.println("5. Keluar");
        System.out.print("Silahkan pilih menu Anda : ");
    }

    static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        // Mengatur kursor ke posisi awal
        System.out.flush();
    }
}
