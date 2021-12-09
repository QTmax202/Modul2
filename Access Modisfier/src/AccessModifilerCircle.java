public class AccessModifilerCircle {
    private double radius = 1.0;
    private String color = "red";

    public AccessModifilerCircle(){}

    public AccessModifilerCircle(double radius){
        this.radius = radius;
    }

    public AccessModifilerCircle(double radius, String color){
        this.radius =radius;
        this.color =color;
    }

    public String getColor(){
        return this.color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI* Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "AccessModifilerCircle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        AccessModifilerCircle circle1 = new AccessModifilerCircle();
        System.out.println(circle1);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());

        AccessModifilerCircle circle2 = new AccessModifilerCircle(7.3);
        System.out.println(circle2);
        System.out.println(circle2.getRadius());
        System.out.println(circle2.getArea());

        AccessModifilerCircle circle3 = new AccessModifilerCircle(7.3,"blue");
        System.out.println(circle3);
        System.out.println(circle3.getRadius());
        System.out.println(circle3.getArea());
    }
}
