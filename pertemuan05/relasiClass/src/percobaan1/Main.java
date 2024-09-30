package percobaan1;

public class Main {
    public static void main(String[] args) {
        Processor p = new Processor("Intel i5", 3);
        Laptop l = new Laptop("Thinkpad", p);

        l.info();

        Processor p1 = new Processor();
        Laptop l1 = new Laptop();
        
        p1.setMerk("Intel i5");
        p1.setCache(4);
        l1.setMerk("Thinkpad");
        l1.setProc(p1);
        l1.info();

    }
}
