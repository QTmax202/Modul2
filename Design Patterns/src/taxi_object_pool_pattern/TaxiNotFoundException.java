package taxi_object_pool_pattern;

public class TaxiNotFoundException extends RuntimeException {
    public TaxiNotFoundException(String message) {
        System.out.println(message);
    }
}