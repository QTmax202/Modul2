import java.util.Scanner;

public class exHienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("In choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    rec();
                    break;
                case 2:
                    triangle1();
                    break;
                case 3:
                    triangle2();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("chon lai di!");
            }
        }
    }

    public static void rec() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void triangle1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void triangle2() {
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}


