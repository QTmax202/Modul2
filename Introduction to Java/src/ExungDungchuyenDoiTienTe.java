import java.util.Scanner;

public class ExungDungchuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner USD = new Scanner(System.in);
        System.out.print("Your monney (USD): ");
        float usd = USD.nextFloat();
        float vnd = usd * 23000;
        System.out.printf("Your monney (VND): %.0f",vnd);
    }
}