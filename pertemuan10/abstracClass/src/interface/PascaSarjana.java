public class PascaSarjana extends Mahasiswa implements iCumlaude {
    public PascaSarjana(String nama) {
        super(nama);
    }

    public void lulus() {
        System.out.println("Aku sudah menyelesaikan tesis");
    }

    public void meraihIPKTinggi() {
        System.out.println("IPKku 3.71");
    }

    public void menjuaraiKompetisi() {
        System.out.println("Saya Menjuarai kompetisi INTERNASIONAL");
    }

    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal internasional");
    }
}
