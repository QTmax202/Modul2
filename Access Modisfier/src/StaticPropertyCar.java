public class StaticPropertyCar {
    private String name;
    private String engine;

    public static int numberOfCars;

    public StaticPropertyCar(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
    public static void main(String[] args) {

        StaticPropertyCar car1 = new StaticPropertyCar("Mazda 3","Skyactiv 3");

        System.out.println(StaticPropertyCar.numberOfCars);

        StaticPropertyCar car2 = new StaticPropertyCar("Mazda 6","Skyactiv 6");

        System.out.println(StaticPropertyCar.numberOfCars);

    }
}
