public class Main {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();

        Mahasiswa budi = new Mahasiswa("Budi");
        Sarjana dimas = new Sarjana("Dimas");
        PascaSarjana bambang = new PascaSarjana("Bambang");

        // pakRektor.beriSertifikatCumlaude(budi);
        // pakRektor.beriSertifikatCumlaude(dimas);
        // pakRektor.beriSertifikatCumlaude(bambang);

        pakRektor.beriSertifikatMawapres(dimas);
        pakRektor.beriSertifikatMawapres(bambang);
    }
}