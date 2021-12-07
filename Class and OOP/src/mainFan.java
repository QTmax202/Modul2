public class mainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(2, 10, "Yellow");
        Fan fan2 = new Fan(3, 5, "blue");
        fan1.turnOnOff();
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
