package SortingAlgorithmSettings;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] list = {4, 2, 5, -2, -3, -7, 11, 10, -5};
        bubbleSort(list);
        System.out.println(Arrays.toString(list));
    }

    public  static  void bubbleSort(int[] list){
        boolean check = true;
        for (int i = 1; i < list.length && check; i++){
            check = false;
            for (int j = 0; j < list.length - i; j++){
              if (list[j] > list[j+1]){
                  int temp = list[j];
                  list[j] = list[j+1];
                  list[j+1] = temp;
                  check = true;
              }
            }
        }
    }
}
