public class Rektor {

    public void beriSertifikatCumlaude(Sarjana sarjana) {
        System.out.println("Saya Rektor, memberikan sertifikat cumlaude");
        System.out.println("Selamat! Silahkan perkenalkan diri Anda...");

        sarjana.kuliahDiKampus();
        sarjana.lulus();
        sarjana.meraihIPKTinggi();
        
        System.out.println("------------------------------------------");
    }
    
    public void beriSertifikatCumlaude(PascaSarjana pascaSarjana) {
        System.out.println("Saya Rektor, memberikan sertifikat cumlaude");
        System.out.println("Selamat! Silahkan perkenalkan diri Anda...");
        
        pascaSarjana.kuliahDiKampus();
        pascaSarjana.lulus();
        pascaSarjana.meraihIPKTinggi();
        
        System.out.println("------------------------------------------");
    }

    public void beriSertifikatMawapres(PascaSarjana mahasiswa) {
        System.out.println("Saya rektor, memberikan sertifikat mawapres");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");

        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();

        System.out.println("-----------------------------------------");
    }

    public void beriSertifikatMawapres(Sarjana mahasiswa) {
        System.out.println("Saya rektor, memberikan sertifikat mawapres");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");

        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();

        System.out.println("-----------------------------------------");
    }
    
}
