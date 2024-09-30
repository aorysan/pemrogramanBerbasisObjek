package percobaan3;

public class mainPertanyaan {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants"); 
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis); 
        
        System.out.println(keretaApi.info()); 
    }
}
