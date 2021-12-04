import java.util.Scanner;

public class TimUocSoChungLonNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("In a: ");
        int a = Math.abs(input.nextInt());

        System.out.print("In b: ");
        int b = Math.abs(input.nextInt());

        if ( a==0 || b==0 ){
            System.out.println("Khong co uoc chung lon nhat !");
        } else {
            while (a != b){
                if (a > b){
                    a = a -b;
                } else {
                    b = b- a;
                }
            }
        }
        System.out.printf("Uoc chung lon nhat la %d",a);
    }
}
