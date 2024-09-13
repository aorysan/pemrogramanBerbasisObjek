public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nayalakanMesin() {
        this.kontakOn = true;
    }

    public void matikanMesin() {
        this.kontakOn = false;
        this.kecepatan = 0;
    }

    public void tambahKecepatan() {
        if(kontakOn == true && this.kecepatan < 100) {
            if(this.kecepatan < 100) {
                this.kecepatan += 50;
            } else {
                System.out.println("Kecepatan sudah maksimal\n");
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin off\n");
        }
    }

    public void kurangiKecepatan() {
        if(kontakOn == true) {
            this.kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin off\n");
        }
    }

    public void printStatus() {
        if(kontakOn == true) {
            System.out.println("Kontak on");
        } else {
            System.out.println("Kontak off");
        }

        System.out.println("Kecepatan: " + this.kecepatan + " km/jam");
    }
}
