package CalculateTheComplexityOfTheAlgorithm;

import java.util.Scanner;

public class AlgorithmComplexity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = input.nextLine();

        int[] frequentChar = new int[255];

        for (int i = 0; i < str.length(); i++) {
            int ascii = str.charAt(i);

            frequentChar[ascii] += 1;
        }

        int max = 0;
        char character = (char) 255;
        for (int i = 0; i < 255; i++) {
            if (frequentChar[i] > max){
                max = frequentChar[i];
                character = (char) i;
            }
        }
        System.out.println(character+"/---/"+max);
    }
}
