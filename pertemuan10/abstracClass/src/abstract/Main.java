public class Main {
    public static void main(String[] args) {
        Kucing spinhx = new Kucing();
        Ikan marlin = new Ikan();

        Orang ani = new Orang("Ani");
        Orang budi = new Orang("Budi");

        ani.peliharaHewan(spinhx);
        budi.peliharaHewan(marlin);

        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}
