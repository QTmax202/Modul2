import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("In width: ");
        double width = input.nextDouble();

        System.out.print("In height: ");
        double height = input.nextDouble();

        Rectangle rectangle = new Rectangle(width,height);

        System.out.println("Your Rectangle: "+rectangle.display());
        System.out.println("Perimeter of the Rectabgle: "+rectangle.getPerimeter());
        System.out.print("Area of the Rectabgle: "+rectangle.getArea());
    }
}

