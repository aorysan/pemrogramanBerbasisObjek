package tugas.pertanyaan4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Barang brg1 = new Barang("001", "Pensil", 3000, 0.3f);
        Barang brg2 = new Barang("002", "Penghapus", 2000, 0.2f);
        Barang brg3 = new Barang("003", "Penggaris", 4000, 0.2f);

        Scanner ii = new Scanner(System.in);
        Scanner is = new Scanner(System.in);

        int menu;
        do {
            menu();
            menu = ii.nextInt();
            System.out.println();

            switch (menu) {
                case 1:
                
                    System.out.println("- " + brg1.getName());
                    System.out.println("- " + brg2.getName());
                    System.out.println("- " + brg3.getName());
                    System.out.print("Pilih barang Anda : ");
                    String nama = is.nextLine();

                    do{
                        if(nama.equalsIgnoreCase(brg1.getName())) {
                            System.out.print("Masukan jumlah : ");
                            int qty = ii.nextInt();
                            brg1.tambah(qty);
                            System.out.println("Stok telah ditambahkan");
                            break;
                        } else if(nama.equalsIgnoreCase(brg2.getName())) {
                            System.out.print("Masukan jumlah : ");
                            int qty = ii.nextInt();
                            brg2.tambah(qty);
                            System.out.println("Stok telah ditambahkan");
                            break;
                        } else if(nama.equalsIgnoreCase(brg3.getName())) {
                            System.out.print("Masukan jumlah : ");
                            int qty = ii.nextInt();
                            brg3.tambah(qty);
                            System.out.println("Stok telah ditambahkan");
                            break;
                        }
                    } while (!nama.equalsIgnoreCase(brg1.getName()) || !nama.equalsIgnoreCase(brg2.getName()) || !nama.equalsIgnoreCase(brg3.getName()));

                    break;

                case 2:

                    System.out.println("- " + brg1.getName());
                    System.out.println("- " + brg2.getName());
                    System.out.println("- " + brg3.getName());

                    System.out.print("Masukkan nama barang yang ingin dikurangi : ");
                    nama = is.nextLine();

                    do{
                        if(nama.equalsIgnoreCase(brg1.getName())) {
                            System.out.print("Masukan jumlah : ");
                            int qty = ii.nextInt();
                            
                            if(qty > brg1.getStok()) {
                                System.out.println("Stok tidak mencukupi");
                                break;
                            }

                            brg1.kurang(qty);
                            System.out.println("Stok telah dikurangi");
                            break;
                        } else if(nama.equalsIgnoreCase(brg2.getName())) {
                            System.out.print("Masukan jumlah : ");
                            int qty = ii.nextInt();
                            
                            if(qty > brg1.getStok()) {
                                System.out.println("Stok tidak mencukupi");
                                break;
                            }
                            
                            brg2.kurang(qty);
                            System.out.println("Stok telah dikurangi");
                            break;
                        } else if(nama.equalsIgnoreCase(brg3.getName())) {
                            System.out.print("Masukan jumlah : ");
                            int qty = ii.nextInt();

                            if(qty > brg1.getStok()) {
                                System.out.println("Stok tidak mencukupi");
                                break;
                            }

                            brg3.kurang(qty);
                            System.out.println("Stok telah dikurangi");
                            break;
                        }
                    } while (!nama.equalsIgnoreCase(brg1.getName()) || !nama.equalsIgnoreCase(brg2.getName()) || !nama.equalsIgnoreCase(brg3.getName()));

                    break;

                case 3:
                    brg1.tampilData();
                    brg2.tampilData();
                    brg3.tampilData();
            } 
        } while(menu != 4);

        ii.close();
        is.close();
    }

    static void menu() {
        System.out.println();
        System.out.println("1. Tambahkan");
        System.out.println("2. Kurangi");
        System.out.println("3. Tampil Data");
        System.out.println("4. Exit");
        System.out.print("Pilih Menu : ");
    }
}
