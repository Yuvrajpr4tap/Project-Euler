import java.util.ArrayList;
import java.util.List;

public class AmicableSum {
    public static void main(String[] args) {
        List<Integer> ami = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            int fs = factSum(i);
            if (fs > 0 && fs <= 100000) { 
                if (i == factSum(fs) && i != fs) {
                    ami.add(i);
                }
            }
        }
        long totalSum = 0;
        for (int num : ami) {
            totalSum += num;
        }
        System.out.println("Sum of amicable numbers: " + totalSum);
    }
  
    public static int factSum(int n) {
        if (n <= 1) return 0;
        int sum = 1;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                sum += i;
                int companion = n / i;
                if (companion != i) {
                    sum += companion;
                }
            }
        }
        return sum;
    }
}
//Output:31626
