public class mainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.turnOnOff();
        fan1.setSpeed(3);
        fan1.setColor("yellow");
        fan1.setRadius(10);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
