import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap nam: ");
        int year = scanner.nextInt();
        boolean check = false;

        if ( year % 4 == 0){
            if ( year % 100 == 0){
                if( year % 400 == 0){
                    check = true;
                }
            }else {
                check = true;
            }
        }
        if (check){
            System.out.printf("%d la nam nhuan",year);
        } else {
            System.out.printf("%d ko phai la nam nhuan",year);
        }
    }
}
