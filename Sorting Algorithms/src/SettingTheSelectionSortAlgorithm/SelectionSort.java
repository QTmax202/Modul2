package SettingTheSelectionSortAlgorithm;

import java.util.Arrays;

public class SelectionSort {

    public static  void  selectionSort(double[] list){
        for (int i = 0; i < list.length; i++) {
            double min = list[i];
            int index = i;
            for (int j = i; j < list.length; j++) {
                if (min > list[j]){
                    min = list[j];
                    index = j;
                }
            }
            if (index != i){
                list[index] = list[i];
                list[i] = min;
            }
        }
    }

    public static void main(String[] args) {
        double[] list = {1, 6, 9 , 7.3, 6.9, 3, 4, 5.6};
        selectionSort(list);
        System.out.println(Arrays.toString(list));
    }
}
