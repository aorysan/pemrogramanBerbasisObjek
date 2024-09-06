package tugas.pertanyaan2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game g1 = new Game("PUBG", 30000);
        Game g2 = new Game("ML", 20000);
        Game g3 = new Game("FF", 10000);
        Transaksi list[] = new Transaksi[5];

        Scanner ii = new Scanner(System.in);
        Scanner is = new Scanner(System.in);
        int menu;
        int jmlHistory = 0;

        do{
            menu();
            menu = ii.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama Admin\t: ");
                    String namaAdmin = is.nextLine();

                    System.out.print("Masukkan nama member\t: ");
                    String namaMember = is.nextLine();

                    System.out.println("Daftar Game : ");
                    System.out.println("1. " + g1.getnama());
                    System.out.println("2. " + g2.getnama());
                    System.out.println("3. " + g3.getnama());
                    
                    int harga = 0;
                    String namaGame;
                    
                    do{
                        System.out.print("Masukkan nama game\t: ");
                        namaGame = is.nextLine();
                        if (namaGame.equalsIgnoreCase(g1.getnama())) {
                            harga = g1.getharga();
                            break;
                        } else if(namaGame.equalsIgnoreCase(g2.getnama())) {
                            harga = g2.getharga();
                            break;
                        } else if(namaGame.equalsIgnoreCase(g3.getnama())) {
                            harga = g3.getharga();
                            break;
                        } else {
                            System.out.println("Game tidak tersedia");
                        }
                    } while (!namaGame.equalsIgnoreCase(g1.getnama()) || !namaGame.equalsIgnoreCase(g2.getnama()) || !namaGame.equalsIgnoreCase(g3.getnama()));

                    System.out.print("Masukkan lama sewa\t: ");
                    int lamaSewa = ii.nextInt();

                    list[jmlHistory] = new Transaksi(lamaSewa, harga*lamaSewa, namaMember, namaAdmin, namaGame);                    
                    jmlHistory++;

                    System.out.println("Penyewaan berhasil dilakukan");

                break;

                case 2:
                    System.out.print("Masukkan id History(1-5): ");
                    int id = is.nextInt();
                    list[id-1].print();

                break;
            }
        } while (menu < 3);

        ii.close();
        is.close();
    }

    static void menu() {
        System.out.println("1. Transaksi");
        System.out.println("2. History");
        System.out.println("2. Keluar");
        System.out.print("Silahkan pilih menu Anda: ");
    }
}
