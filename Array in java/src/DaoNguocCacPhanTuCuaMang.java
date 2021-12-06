import java.util.Arrays;
import java.util.Scanner;

public class DaoNguocCacPhanTuCuaMang {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner input = new Scanner(System.in);

        System.out.print("In size: ");
        size = input.nextInt();

        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("In element "+(i+1)+" : ");
            arr[i] = input.nextInt();
        }

        System.out.println("Element in array ="+ Arrays.toString(arr));

        for (int i = 0; i < arr.length/2 ; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length-1-i]=temp;
        }

        System.out.println("");
        System.out.println("Reverse array ="+ Arrays.toString(arr));
    }
}