import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double F,C;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice){
                case 1 :
                    System.out.print("In Fahrenheit: ");
                    F = input.nextDouble();
                    System.out.printf("Fahrenheit to Celsius: %.2f",DoFToDoC(F));
                    break;
                case 2 :
                    System.out.print("In Celsius: ");
                    C = input.nextDouble();
                    System.out.printf("Celsius to Fahrenheit: %.2f",DoCToDoF(C));
                    break;
                case 0 :
                    System.exit(0);
                    break;
            }
            System.out.println("");
        } while (choice != 0);
    }
    public static double DoCToDoF(double DoC){
        double DoF = (9.0 / 5) * DoC + 32;
        return DoF;
    }

    public static double DoFToDoC(double DoF){
        double DoC = (5.0 / 9) * (DoF - 32);
        return DoC;
    }
}
