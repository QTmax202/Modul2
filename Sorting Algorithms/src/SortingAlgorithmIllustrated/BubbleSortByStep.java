package SortingAlgorithmIllustrated;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = input.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            System.out.printf("Enter %d values: ",i+1);
            list[i] = input.nextInt();
        }

        System.out.print(Arrays.toString(list));
        System.out.println();
        bubbleSortByStep(list);
        System.out.print(Arrays.toString(list));
    }

    public static  void bubbleSortByStep(int[] list){
        boolean check = true;
        for (int i = 1; i < list.length & check; i++) {
            check = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    check = true;
                }
            }
        }
        if (!check) {
            System.out.println("Array may be sorted !");
        }
    }
}
