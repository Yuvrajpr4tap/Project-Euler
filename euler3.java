class lpf {
    public static void main(String[] args) {
        long num = 600851475143L;
        long factor = 2;
        long lastFactor = 1;

        while (num > 1) {
            if (num % factor == 0) {
                lastFactor = factor;
                num /= factor;
                while (num % factor == 0) {
                    num /= factor;
                }
            }
            factor = (factor == 2) ? 3 : factor + 2; // check only odd numbers after 2
        }

        System.out.println("Largest prime factor: " + lastFactor);
    }
}
