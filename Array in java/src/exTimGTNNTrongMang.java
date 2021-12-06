import java.util.Scanner;

public class exTimGTNNTrongMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap so phan tu: ");
        int size = input.nextInt();

        double[] array =new double[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Phan tu thu %d trong mang: ",i+1);
            array[i] = input.nextDouble();
        }

        double min = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
                index = i;
            }
        }
        System.out.printf("Gia tri mho nhat trong mang Array[%d]= "+min,index);
    }
}
