import java.math.BigInteger;
public class DigitSum {
    public static int sumpower(int n) {
        String s = BigInteger.TWO.pow(n).toString();
        int sum = 0;
        for (int i = 0; i < s.length(); i++)
            sum += s.charAt(i) - '0';
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumpower(1000));
    }
}
//Output:1366
