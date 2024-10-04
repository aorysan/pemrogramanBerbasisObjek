package tugas;

public class Main {
    public static void main(String[] args) {
        
        Dosen bambang = new Dosen("12345", "Bambang", "Bandung");
        Dosen wahyu = new Dosen("23456", "Wahyu", "Wonogiri");
        Dosen supratman = new Dosen("34567", "Supratman", "Surabaya");
        DaftarGaji daftargaji = new DaftarGaji(5);

        daftargaji.addPegawai(bambang);
        daftargaji.addPegawai(wahyu);
        daftargaji.addPegawai(supratman);

        bambang.setGaji(2000000);
        wahyu.setGaji(3000000);
        supratman.setGaji(4000000);

        bambang.setSKS(2);
        wahyu.setSKS(3);
        supratman.setSKS(4);

        bambang.print();
        wahyu.print();
        supratman.print();

        daftargaji.printGaji();
    }
}
