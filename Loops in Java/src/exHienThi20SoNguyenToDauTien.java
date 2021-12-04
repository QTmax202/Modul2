public class exHienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int count = 0;
        int N = 2;
        while (count < 20) {
            boolean check = true;
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
                System.out.println(N);
            }
            N++;

        }
    }
}
