import java.util.Scanner;

public class PTBacNhat {
    public static void main(String[] args) {
        System.out.println("Giai Phuwng trinh Bac Nhat");
        Scanner scanner = new Scanner(System.in);

        System.out.print("A: ");
        double a = scanner.nextDouble();

        System.out.print("B: ");
        double b = scanner.nextDouble();

        if( a==0){
            if ( b == 0 ){
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nhiem");
            }
        }else{
        System.out.println("Phuong trinh co nghiem X= "+(-b/a));
        }
    }
}
