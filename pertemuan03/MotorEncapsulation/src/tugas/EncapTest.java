package tugas;

public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
    
        encap.setName("John");
        encap.setAge(17);
        
        System.out.println("Name : " + encap.getName());
        System.out.println("Age : " + encap.getAge());
        
        encap.setAge(34);
        System.out.println("Name : " + encap.getName());
        System.out.println("Age : " + encap.getAge());
    }
}
