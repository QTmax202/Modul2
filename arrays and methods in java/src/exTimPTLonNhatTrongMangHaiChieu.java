import java.util.Scanner;

public class exTimPTLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap so dong phan tu ");
        int num1 = input.nextInt();
        System.out.print("Nhap so cot phan tu ");
        int num2 = input.nextInt();

        int[][] arr = new int[num1][num2];

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.printf("Phan tu thu [%d][%d]: ",i,j);
                arr[i][j] = input.nextInt();
            }
        }

        int index1 = 0, index2 =0, max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]){
                    max = arr[i][j];
                    index1 = i;
                    index2 = j;
                }
            }
        }

        System.out.printf("Phan tu lon nhat trong mang Array[%d][%d]= %d",index1,index2,arr[index1][index2]);
    }
}
