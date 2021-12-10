package Circle_Cylinder;

public class Cylinder extends Circle{
    private double height = 4;

    public Cylinder(){}

    public Cylinder(double height){
        this.height = height;
    }

    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double Volume() {
        return this.height* getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "radius=" + getRadius() +
                ", color='" + getColor() +
                ", Volume='" + Volume() +
                '}';
    }
}
