package Find_prime_numbers;

public class LazyPrimeFactorization extends Thread {
    @Override
    public void run() {
        int n = 100;
        boolean check = true;
        for (int i = 0; i <= n; i++) {
            if (i < 2){
                check = false;
            } else if (i == 2){
                check = true;
//                break;
            } else if (i % 2 == 0){
                check = false;
            } else {
                for (int j = 3; j < (i-1); j+=2) {
                    if (i % j == 0){
                        check = false;
                        break;
                    }
                }
            }
            if (check){
                System.out.println(i+"-");
            }
            check = true;
        }
    }
}
