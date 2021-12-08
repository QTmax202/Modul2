package Fan;

public class Fan {
    int speed;
    double radius;
    boolean turnOnOff;
    String color;

    public Fan() {
        this.speed = 1;
        this.turnOnOff = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int setSpeed(int speed){
        this.speed = speed;
        return this.speed;
    }

    public String setColor(String color){
        this.color = color;
        return this.color;
    }

    public double setRadius(double radius){
        this.radius = radius;
        return this.radius;
    }

    public boolean turnOnOff() {
        this.turnOnOff =!this.turnOnOff;
        return this.turnOnOff;
    }

    public String Speed() {
        switch (this.speed){
            case 1:
                return "Tốc độ quạt chậm";
            case 2:
                return "Tốc độ quạt trung bình";
            case 3:
                return "Tốc độ quạt nhanh";
            default:
                return null;
        }
    }

    public String toString() {
        if (this.turnOnOff){
            return Speed() + ", Radius: " + this.radius + ", Color: " + this.color + ", Quạt đang bật" ;
        } else {
            return "Radius: " + this.radius + ", Color: " + this.color + ", Quạt đang tắt";
        }
    }
}
