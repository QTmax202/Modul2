package BinarySearchAlgorithmSettings;

import java.util.Scanner;

public class BinarySearchMain {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11 , 45, 50 ,55 , 60, 66, 69 , 73, 79};
        int low = 0;
        int high = list.length - 1;
        int num = 45;
        System.out.println(binarySearch1(list, num, high, low));
    }

    public static int binarySearch1(int[] list, int number, int high, int low){
        int mid = (high + low) / 2;
        if (high >= low){
            if (number == list[mid]){
                return mid;
            } else if (number > list[mid]){
                int low1 = mid + 1;
                return binarySearch1(list,number, high, low1);
            } else if (number < list[mid]){
                int high1 = mid - 1;
                return binarySearch1(list, number, high1, low);
            }
        }
        return -1;
    }
}
