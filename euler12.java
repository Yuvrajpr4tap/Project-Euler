class Triangle {
    public static void main(String[] args) {
        int n = 1;
        while (true) {
            long val = (long) n * (n + 1) / 2;
            if (countDivisors(val) > 500) {
                System.out.println(val);
                break;
            }
            n++;
        }
    }

    public static int countDivisors(long num) {
        int count = 0;
        double sqrt = Math.sqrt(num);
        for (int i = 1; i <= sqrt; i++) {
            if (num % i == 0) {
                if (i * i == num) {
                    count += 1;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }
}
//Output:76576500
