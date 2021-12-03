import java.util.Scanner;

public class ExHienThiLoiChao {
    public static void main(String[] args) {
        Scanner name1 = new Scanner(System.in);

        System.out.print("you name: ");
        String name = name1.nextLine();

        System.out.printf("Hello %s",name);
    }
}
