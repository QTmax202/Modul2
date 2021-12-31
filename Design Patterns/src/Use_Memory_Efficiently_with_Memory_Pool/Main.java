package Use_Memory_Efficiently_with_Memory_Pool;

public class Main {

    public static void main(String[] args) {
        Gun gun=new Gun();
        System.out.println("Start");
        gun.fire();
        System.out.println("Game over");
        System.out.println("Tocal bullet created: " + Bullet.count);
//        Gun gun1 =new Gun();
//        System.out.println("Start");
//        gun1.fireInPool();
//        System.out.println("Game over");
//        System.out.println("Tocal bullet created: " + Bullet.count);
    }
}
