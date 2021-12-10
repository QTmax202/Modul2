package Circle_Cylinder;

public class mainCircle_Cylinder {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);
        Circle circle2 = new Circle(7,"blue");
        System.out.println(circle2);

        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);
        Cylinder cylinder2 = new Cylinder(7);
        System.out.println(cylinder2);
        Cylinder cylinder3 = new Cylinder(4,6,"Black");
        System.out.println(cylinder3);
    }
}
