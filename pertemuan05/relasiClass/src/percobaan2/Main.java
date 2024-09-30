package percobaan2;

public class Main {
    public static void main(String[] args) {
        Mobil m = new Mobil(); 
        Pelanggan p = new Pelanggan(); 
        Sopir s = new Sopir();
        m.setMerk("Avanza"); 
        m.setBiaya(350000);
        
        s.setNama("John Doe"); 
        s.setBiaya(200000); 
        
        p.setNama("Jane Doe"); 
        p.setMobil(m); 
        p.setSopir(s); 
        p.setHari(2); 
        
        penyewaan ps = new penyewaan(p.getHari());
        
        ps.showData();

        System.out.println(p.getMobil().getMerk()); 
    }

}
