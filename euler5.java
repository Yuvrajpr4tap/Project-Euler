class sm {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Compute LCM using GCD
    public static long lcm(long a, int b) {
        return (a * b) / gcd((int)a, b);
    }

    public static void main(String[] args) {
        long result = 1;

        for (int i = 2; i <= 20; i++) {
            result = lcm(result, i);
        }

        System.out.println("Smallest number divisible by all numbers from 1 to 20: " + result);
    }
}
