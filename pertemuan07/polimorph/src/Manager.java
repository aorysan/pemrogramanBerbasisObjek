public class Manager extends Karyawan {
    private String bagian;
    private double tunjangan;
    private Staff st[];

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return this.tunjangan;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public String getBagian() {
        return this.bagian;
    }

    public void setStaff(Staff st[]) {
        this.st = st;
    }

    public void viewStaff() {
        System.out.println();
        
        for (int i = 0; i < st.length; i++) {
            st[i].print();
        }

        System.out.println();
    }

    public void print() {
        System.out.println("Manager : " + this.getBagian());
        System.out.println("NIP : " + this.getNip());
        System.out.println("Nama : " + this.getNama());
        System.out.println("Golongan : " + this.getGolongan());
        System.out.println("Tunjangan : " + this.getTunjangan());
        System.out.println("Gaji : " + this.getGaji());
        System.out.println("Bagian : " + this.getBagian());
        System.out.println();
    }
}
