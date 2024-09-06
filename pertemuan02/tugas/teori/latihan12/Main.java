package latihan12;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Dosen Bambang = new Dosen("Bambang");
        Mahasiswa Raul = new Mahasiswa("Raul", "12345");

        Bambang.printData();
        Raul.printData();
        
        int nilai;
        System.out.print("Silahkan masukkan nilai untuk siswa Raul : ");
        nilai = input.nextInt();

        Bambang.inputNilai(Raul, nilai);
        
        Bambang.printData();
        Raul.printData();
        
    }
}
