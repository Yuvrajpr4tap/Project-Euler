class Collatz {
    public static void main(String[] args) {
        int maxSequenceLength = 0;
        long startingNumberWithMax = 0;
        int limit = 1000000;
        int[] cache = new int[limit + 1];

        for (int i = 1; i < limit; i++) {
            long n = i;
            int count = 0;

            while (n != 1) {
                if (n < i) {
                    count += cache[(int)n];
                    break;
                }
                
                if (n % 2 == 0) n /= 2;
                else n = 3 * n + 1;
                count++;
            }

            if (n == 1) count++; 
            cache[i] = count;
            if (count > maxSequenceLength) {
                maxSequenceLength = count;
                startingNumberWithMax = i;
            }
        }
        System.out.println("Starting number: " + startingNumberWithMax);
        System.out.println("Max length: " + maxSequenceLength);
    }
}
//Output:Starting number: 837799 Max length: 525
