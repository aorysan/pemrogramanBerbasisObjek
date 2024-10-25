package waktu;

public class Weather {
    public void getCuaca(int cuaca) {
        if(cuaca == 1) {
            System.out.println("Cuaca cerah");
        } else if(cuaca == 2) {
            System.out.println("Cuaca hujan");
        } else {
            System.out.println("Cuaca mendung");
        }
    }
}
