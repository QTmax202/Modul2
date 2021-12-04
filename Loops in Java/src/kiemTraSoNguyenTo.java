import java.util.Scanner;

public class kiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("In number:");
        int num = number.nextInt();
        if (num < 2) {
            System.out.printf("%d khong phai la so  nguyen to",num);
        } else {
            boolean check = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.printf("%d la so  nguyen to",num);
            } else{
                System.out.printf("%d khong phai la so  nguyen to",num);
            }
        }
    }
}
