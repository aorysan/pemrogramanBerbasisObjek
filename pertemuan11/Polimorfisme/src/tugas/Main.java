package tugas;

public class Main {
    public static void main(String[] args) {
        WalkingZombie wz = new WalkingZombie(100, 2);
        JumpingZombie jz = new JumpingZombie(100, 2);
        Barrier b = new Barrier(200);
        Plant p = new Plant();

        wz.status();
        jz.status();
        b.status();

        for (int i = 0; i < 45; i++) {
            p.attacking(wz);
            p.attacking(jz);
            p.attacking(b);
        }

        System.out.println("-------------------------------");

        wz.status();
        jz.status();
        b.status();

        System.out.println("-------------------------------");
        
        wz.heal();
        jz.heal();
        b.heal();
        
        System.out.println("-------------------------------");
        
        wz.status();
        jz.status();
        b.status();
        
    }
}
