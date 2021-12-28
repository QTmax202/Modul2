package Find_prime_numbers;

public class OptimizedPrimeFactorization extends Thread {
    @Override
    public void run() {
        int N = 100;
        boolean isPrime = true;
        for (int i = 2; i <= N; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
            isPrime = true;
        }
    }
}
