package latihan3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int panjangSisi;

        System.out.print("Silahkan masukkan panjang sisi : ");
        panjangSisi = input.nextInt();

        Persegi persegi = new Persegi(panjangSisi);
        persegi.printSisi();

        int menu;

        do{
            menu();
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    persegi.hitungLuas();
                    break;
            
                case 2:
                    persegi.hitungKeliling();
                    break;
            }
        } while (menu != 3);
    }

    public static void menu() {
        System.out.print("Silahkan pilih menu Anda");
        System.out.println("1. Hitung Luas");
        System.out.println("2. Hitung Keliling");
        System.out.println("3. Exit");
    }
}
