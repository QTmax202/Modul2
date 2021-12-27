package product_manage_saves_to_binary_files;

import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Manager manager = new Manager();
        int choine;

        do {
            System.out.println("---Menu---");
            System.out.println("1. Them san pham");
            System.out.println("2. Hien thi tat ca san pham");
            System.out.println("3. Tim kiem san pham thong qua id");
            System.out.println("4. Xoa san pham thong qua id");
            System.out.println("0. Exit");
            System.out.print("Nhap lua chon: ");
            choine = input.nextInt();

            switch (choine) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println(manager.createProducts());
                    break;
                case 2:
                    manager.displayProduct();
                    break;
                case 3:
                    System.out.print("Nhap ma san pham muon tim: ");
                    int id = input.nextInt();
                    manager.findProduct(id);
                    break;
                case 4:
                    System.out.print("Nhap ma san pham muon xoa: ");
                    int id1 = input.nextInt();
                    manager.deleteProduct(id1);
                    break;
            }
        } while (choine != 0);
    }
}
