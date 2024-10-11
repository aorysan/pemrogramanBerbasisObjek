public class Main {
    public static void main(String[] args) {
        System.out.println("Program Testing Class Manager & Staff");
        System.out.println();

        Manager manager[] = new Manager[2];
        Staff staff1[] = new Staff[2];
        Staff staff2[] = new Staff[3];

        manager[0] = new Manager();
        manager[0].setNama("Tedjo");
        manager[0].setNip("101");
        manager[0].setGolongan("1");
        manager[0].setTunjangan(5000000);
        manager[0].setBagian("Administrasi");
        manager[0].setStaff(staff1);
        
        manager[1] = new Manager();
        manager[1].setNama("Atika");
        manager[1].setNip("102");
        manager[1].setGolongan("1");
        manager[1].setTunjangan(2500000);
        manager[1].setBagian("Pemasaran");

        staff1[0] = new Staff();
        staff1[0].setNama("Usman");
        staff1[0].setNip("0003");
        staff1[0].setGolongan("2");
        staff1[0].setLembur(10);
        staff1[0].setGajiLembur(10000);

        staff1[1] = new Staff();
        staff1[1].setNama("Anugrah");
        staff1[1].setNip("0005");
        staff1[1].setGolongan("2");
        staff1[1].setLembur(10);
        staff1[1].setGajiLembur(55000);

        staff2[0] = new Staff();
        staff2[0].setNama("Hendra");
        staff2[0].setNip("0004");
        staff2[0].setGolongan("3");
        staff2[0].setLembur(15);
        staff2[0].setGajiLembur(5500);

        staff2[1] = new Staff();
        staff2[1].setNama("Arie");
        staff2[1].setNip("0006");
        staff2[1].setGolongan("4");
        staff2[1].setLembur(5);
        staff2[1].setGajiLembur(100000);
        
        staff2[2] = new Staff();
        staff2[2].setNama("Mentari");
        staff2[2].setNip("0007");
        staff2[2].setGolongan("3");
        staff2[2].setLembur(6);
        staff2[2].setGajiLembur(20000);

        manager[0].print();
        manager[1].print();
        
    }
}
