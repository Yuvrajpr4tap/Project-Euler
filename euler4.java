class LargestPalindromeProduct {
    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        int largest = 0;
        int factor1 = 0;
        int factor2 = 0;

        for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100; j--) {
                int product = i * j;
                if (product <= largest) {
                    break;  // further products will be smaller
                }
                if (isPalindrome(product)) {
                    largest = product;
                    factor1 = i;
                    factor2 = j;
                }
            }
        }

        System.out.println("Largest palindrome is: " + largest);
        System.out.println("Product of: " + factor1 + " and " + factor2);
    }
}
