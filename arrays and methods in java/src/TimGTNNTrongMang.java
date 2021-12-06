import java.util.Scanner;

public class TimGTNNTrongMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("So phan tu: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Phan tu thu %d trong mang: ",i+1);
            arr[i] = input.nextInt();
        }

        int index = min(arr);
        System.out.printf("Phan tu co GTNN trong mang la %d o vi tri thu %d trong mang",arr[index],index+1);

    }

    public static int min(int[] array){
        int index = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] < array[index]){
                index = i ;
            }
        }
        return index;
    }
}
