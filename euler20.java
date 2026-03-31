import java.util.*;
import java.math.BigInteger;
class FactorialSum {
    public static BigInteger fact(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(n).multiply(fact(n - 1));
        }
    }

    public static void main(String[] args) {
        int n = 100;
        BigInteger facto = fact(n);
        String digits = facto.toString();
        int sum = 0;
        for (int i = 0; i < digits.length(); i++) {
            sum += Character.getNumericValue(digits.charAt(i));
        }
        System.out.println(sum);
    }
}
//Output:648
