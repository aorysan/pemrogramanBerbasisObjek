package percobaan4;

public class Main {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mr. Krab"); 
        Penumpang b = new Penumpang("54321", "Budi");
        Gerbong gerbong = new Gerbong("A", 10);

        gerbong.setPenumpang(p, 1); 
        System.out.println(gerbong.info()); 
        
        gerbong.setPenumpang(b, 1); 
        System.out.println(gerbong.info()); 
    }
}
