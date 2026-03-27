import java.math.BigInteger;
class Grid {
  public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 20;
        int m = 20;
        BigInteger numerator = factorial(n + m);
        BigInteger denominator = factorial(n).multiply(factorial(m));
        BigInteger paths = numerator.divide(denominator);
        
        System.out.println("Total paths: " + paths);
    }
}
