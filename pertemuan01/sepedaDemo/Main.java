public class Main {
    public static void main(String[] args) {
        sepeda spd1 = new sepeda();
        sepeda spd2 = new sepeda();
        sepedaGunung spd3 = new sepedaGunung();

        spd1.setMerek("Polygone");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.cekStatus();
        
        spd2.setMerek("Wiim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.cekStatus();

        spd3.setMerek("Polygone");
        spd3.tambahKecepatan(5);
        spd3.gantiGear(7);
        spd3.setTipeSuspensi("Gas suspensi");
        spd3.cekStatus();

    }
}
