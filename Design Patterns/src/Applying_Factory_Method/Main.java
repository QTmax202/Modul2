package Applying_Factory_Method;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shape = new ShapeFactory();

        Shape s1 = shape.getShape("circle");
        System.out.println("circle");
        s1.draw();
        Shape s2 = shape.getShape("square");
        System.out.println("square");
        s2.draw();
        Shape s3 = shape.getShape("rectangle");
        System.out.println("rectangle");
        s3.draw();
    }
}
