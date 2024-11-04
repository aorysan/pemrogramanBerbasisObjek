public class Sarjana extends Mahasiswa implements iCumlaude {
    public Sarjana (String nama) {
        super(nama);
    }
    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan Skripsi");
    }
    @Override
    public void meraihIPKTinggi () {
        System.out.println("IPK ku lebih dari 3.51");
    }

    public void menjuaraiKompetisi() {
        System.out.println("Saya Menjuarai kompetisi INTERNASIONAL");
    }

    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal internasional");
    }
}
