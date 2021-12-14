public class Fan {
    int speed, radius;
    boolean turnOnOff;
    String color;

    public Fan( int speed, int radius, String color) {
        this.speed = speed;
        this.turnOnOff = false;
        this.radius = radius;
        this.color = color;
    }

    public boolean turnOnOff() {
        return !this.turnOnOff;
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
            return "Radius: " + this.radius + ", Color: " + this.color + "Quạt đang tắt";
        }
    }
}
