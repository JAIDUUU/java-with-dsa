public class BasicMath {

    public static void main(String[] args) {

        // 1. Count Digits
        int n = 12345;
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        System.out.println("Digits = " + count);


        // 2. Sum of Digits
        n = 1234;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }

        System.out.println("Sum = " + sum);


        // 3. Reverse Number
        n = 1234;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        System.out.println("Reverse = " + rev);


        // 4. Even or Odd
        n = 7;

        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }


        // 5. Palindrome
        n = 121;
        int original = n;
        rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        if (original == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }


        // 6. Prime Number
        n = 7;
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(isPrime ? "Prime" : "Not Prime");


        // 7. Factorial
        n = 5;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);


        // 8. GCD
        int a = 12;
        int b = 18;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD = " + a);


        // 9. LCM
        a = 12;
        b = 18;

        int x = a;
        int y = b;

        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        int gcd = x;
        int lcm = (a * b) / gcd;

        System.out.println("LCM = " + lcm);


        // 10. Armstrong Number
        n = 153;
        original = n;
        sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit * digit * digit;
            n = n / 10;
        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }


        // 11. Perfect Number
        n = 6;
        sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == n) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not Perfect Number");
        }


        // 12. Count Even Digits
        n = 248531;
        count = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 == 0) {
                count++;
            }

            n = n / 10;
        }

        System.out.println("Even Digits = " + count);


        // 13. Print Prime Numbers from 1 to n
        n = 20;

        for (int num = 2; num <= n; num++) {

            isPrime = true;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}