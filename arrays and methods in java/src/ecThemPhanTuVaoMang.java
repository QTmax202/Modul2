import java.util.Scanner;

public class ecThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap phan tu can chen: ");
        int num = input.nextInt(), index;

        int[] arr ={1,2,3,4,5,6,7,8,9,10};

        do {
            System.out.print("Nhap thu tu can chen: ");
            index = input.nextInt();
            int[] array = new int[arr.length+1];
            for (int i = 0; i < index-1; i++) {
                array[i] = arr[i];
            }
            for (int i = arr.length; i > index-1; i--) {
                array[i] = arr[i-1];
            }
            array[array.length-1]=arr[arr.length-1];
            array[index-1] = num;

            System.out.print("new Array= {");
            for (int i = 0; i < array.length-1; i++) {
                System.out.print(array[i]+",");
            }
            System.out.print(array[array.length-1]+"}");
        } while (index <= -1 || index >= arr.length);
    }
}
