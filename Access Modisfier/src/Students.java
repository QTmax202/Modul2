import java.util.Scanner;

public class Students {
    private String name = "John";
    private String classes = "C02";

    public Students(){
    }

    public Students(String name, String classes){
        this.classes = classes;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Students[] obj = new Students[3];
        Students obj1 = new Students();
        Students obj2 = new Students("QT_247202","C10");
        Students obj3 = CreStudents(input);

        obj[0] = obj1;
        obj[1] = obj2;
        obj[2] = obj3;

        for (Students i: obj) {
            System.out.println(i);
        }

        InClass(input,obj2);

        for (Students i: obj) {
            System.out.println(i);
        }
    }

    public static void InClass(Scanner input, Students students){
        System.out.print("In name: ");
        students.setName(input.nextLine());
        System.out.print("In class: ");
        students.setClasses(input.nextLine());
    }

    public static Students CreStudents(Scanner input){
        System.out.print("In name: ");
        String name = input.nextLine();
        System.out.print("In Class: ");
        String classes = input.nextLine();
        return new Students(name,classes);
    }
}