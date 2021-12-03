import java.util.Scanner;

public class TinhChiSoCanNangCuaCoThe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight,height,bmi;
        System.out.print("You Weight: ");
        weight = scanner.nextDouble();

        System.out.print("You Height: ");
        height = scanner.nextDouble();

        bmi = weight/Math.pow(height,2);

        if ( bmi < 18.5 ){
            System.out.printf("%.2f %s",bmi,"Underweight");
        } else if ( bmi < 25 ){
            System.out.printf("%.2f %s ",bmi,"Normal");
        } else if ( bmi < 30 ){
            System.out.printf("%.2f %s ",bmi,"Overweight");
        } else {
            System.out.printf("%.2f %s",bmi,"Obese");
        }
    }
}
