import java.util.Scanner;

public class TimGTLNTrongMang {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner input = new Scanner(System.in);

        System.out.print("In size: ");
        size = input.nextInt();

        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("In element " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }

        System.out.print("Property list: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
        int max = arr[0], index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i + 1;
            }
        }
        System.out.printf("The largest property value in the list is %d, at position %d", max, index);
    }
}
