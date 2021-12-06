import java.util.Scanner;

public class exXoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 5, 5, 7, 8, 9, 10};

        Scanner input = new Scanner(System.in);
        System.out.print("Nhap phan tu can xoa: ");
        int num = input.nextInt();

        for (int i = 0; i < arr.length; i++) {
            while (num == arr[i]) {
                for (int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
            }
        }

        System.out.print("new Array= {");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[arr.length-1]+"}");
    }
}
