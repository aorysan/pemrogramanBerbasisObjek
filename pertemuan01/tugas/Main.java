package tugas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputI = new Scanner(System.in);

        kertas k = new kertas(10, 5);
        penghapus p = new penghapus("Joyko", "Hitam");
        pensilKayu pk = new pensilKayu("Joyko", "Biru", 5);
        pensilMekanik pm = new pensilMekanik("Joyko", "Putih", 5);

        
        int pilih;
        
        do{
            menu();
            pilih = inputI.nextInt();

            switch (pilih) {
                case 1:
                    k.cetak();
                    p.cetak();
                    pk.cetak();
                    pm.cetak();
                
                    break;

                case 2:
                    System.out.println("1. Pensil kayu");
                    System.out.println("2. Pensil mekanik");
                    System.out.print("Silahkan pilih pensil : ");

                    int pilihPensil = inputI.nextInt();
                    if(pilihPensil == 1){
                        pk.tulis();
                    } else if (pilihPensil == 2) {
                        pm.tulis();
                    }
                    
                    break;

                case 3:
                    p.hapus();
                    break;

                case 4:
                    System.out.println("Apakah Anda ingin melipat kertas? (1. Ya / 2. Tidak)");
                    int pilihLipat = inputI.nextInt();
                    if(pilihLipat == 1){
                        k.lipat(true);
                    } else if (pilihLipat == 2) {
                        k.lipat(false);
                    }

                    break;

                case 5:
                    System.out.println("Apakah Anda ingin sobek kertas? (1. Ya / 2. Tidak)");
                    int pilihSobek = inputI.nextInt();
                    if(pilihSobek == 1){
                        k.sobek(true);
                    } else if (pilihSobek == 2) {
                        k.sobek(false);
                    }

                    break;

                case 6:
                    p.ubahBentuk();

                    break;

                case 7:
                    System.out.println("Apakah Anda ingin push isi pensil mekanik? (1. Ya / 2. Tidak)");
                    int pilihPush = inputI.nextInt();
                    if(pilihPush == 1){
                        pm.pushIsi(true);
                    } else if (pilihPush == 2) {
                        pm.pushIsi(false);
                    }

                    break;

                case 8:
                    System.out.println("Apakah Anda ingin raut pensil kayu? (1. Ya / 2. Tidak)");
                    int pilihRaut = inputI.nextInt();
                    if(pilihRaut == 1){
                        pk.raut(true);
                    } else if (pilihRaut == 2) {
                        pk.raut(false);
                    }

                    break;
            }
        } while (pilih <= 8);
    }

    static void menu() {
        System.out.println("1. Cetak data");
        System.out.println("2. Tulis dengan pensil");
        System.out.println("3. Hapus");
        System.out.println("4. Lipat kertas");
        System.out.println("5. Sobek kertas");
        System.out.println("6. Ubah bentuk penghapus");
        System.out.println("7. Push isi pensil mekanik");
        System.out.println("8. Raut pensil kayu");
        System.out.println("9. Hentikan");
        System.out.print("Silahkan pilih menu Anda : ");
    }
}
