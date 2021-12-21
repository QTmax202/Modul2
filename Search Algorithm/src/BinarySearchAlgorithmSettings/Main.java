package BinarySearchAlgorithmSettings;

import static BinarySearchAlgorithmSettings.BinarySearch.binarySearch;
import static BinarySearchAlgorithmSettings.BinarySearch.list;

public class Main {
    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));
        System.out.println(binarySearch(list, 73));
        System.out.println(binarySearch(list, 55));
    }
}