package tugas.soal2;

public class Main {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        Dosen d = new Dosen();
        
        System.out.println("Mahasiswa : ");
        m.makan();
        m.tidur();
        m.bernafas();

        System.out.println();
        
        System.out.println("Dosen : ");
        d.makan();
        d.lembur();
        d.bernafas();
    }
}
