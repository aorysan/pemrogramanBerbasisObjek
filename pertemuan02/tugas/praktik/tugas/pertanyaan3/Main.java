package tugas.pertanyaan3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jari-jari\t: ");
        int jari = input.nextInt();
        l1.setR(jari);

        int menu;
        do{
            menu();
            System.out.print("Masukkan pilihan\t: ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    double luas = l1.hitungLuas();
                    System.out.println("Luas\t\t: " + luas);
                    break;
                    
                case 2:
                    double keliling = l1.hitungKeliling();
                    System.out.println("Keliling\t: " + keliling);
                    break;
            }

        } while(menu != 3);

        input.close();
    }

    static void menu() {
        System.out.println("1. Hitung Luas");
        System.out.println("2. Hitung Keliling");
        System.out.println("3. Exit");
    }
}
