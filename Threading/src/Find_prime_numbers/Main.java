package Find_prime_numbers;

public class Main {
    public static void main(String[] args) {
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization();
        LazyPrimeFactorization lazyPrimeFactorization =new LazyPrimeFactorization();

        optimizedPrimeFactorization.start();
        lazyPrimeFactorization.start();
    }
}
