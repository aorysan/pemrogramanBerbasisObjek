public class sepedaGunung extends sepeda {
    private String tipeSuspensi;

    public void setTipeSuspensi (String newValue) {
        this.tipeSuspensi = newValue;
    }

    public void cekStatus() {
        super.cekStatus();
        System.out.println("Tipe Suspensi : " + this.tipeSuspensi);
    }
}
