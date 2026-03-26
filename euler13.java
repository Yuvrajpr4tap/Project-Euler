import java.math.BigInteger;
import java.util.*;

class LargeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> numbers = new ArrayList<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (!line.isEmpty()) {
                numbers.add(line);
            }
        }

        BigInteger sum = BigInteger.ZERO;

        for (String num : numbers) {
            sum = sum.add(new BigInteger(num));
        }

        String sumStr = sum.toString();

        System.out.println("Full Sum: " + sumStr);

        if (sumStr.length() >= 10) {
            System.out.println("First 10 digits: " + sumStr.substring(0, 10));
        } else {
            System.out.println("First digits: " + sumStr);
        }
    }
}
//Output:5537376230
