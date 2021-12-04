import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("In money: ");
        double money = input.nextDouble();

        System.out.print("In month: ");
        int month = input.nextInt();

        System.out.print("In percentage: ");
        double e = input.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * ((e / 100) / 12) * month;
        }
        System.out.printf("Total of interest %.2f",totalInterest);
    }
}
