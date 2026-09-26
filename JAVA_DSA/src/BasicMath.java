import java.util.Scanner;

public class BasicMath {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //problem 1
        System.out.println("Enter the number");
        int digit=sc.nextInt();
//        System.out.println("number of digit ="+Count_digit(digit));

        //problem 2
//        System.out.println("sum of this no :"+Sum_of_Digit(digit));

        //problem 3
//        System.out.println("rev number is:"+Reverse_num(digit));

        //topic
//        Even_Odd(digit);

        //problem 4
//        Palindrome(digit);

        //problem 5
//        PrimeNumber(digit);


        //Problem 6: Factorial
//        System.out.println("factorial of "+digit+"this number is: "+Factorial(digit));

        //Problem 7
//        System.out.println("Enter the second value");
//        int digit1=sc.nextInt();
//        GCD(digit,digit1);

        //Problem 8
//        System.out.println("Enter the second value");
//        int digit1=sc.nextInt();
//        LCM(digit,digit1);

        //Problem 9
//        Armstrong(digit);

        //problem 10
//        System.out.println("enter the power");
//        int power=sc.nextInt();
//        Power_num(digit,power);


        //Problem 11: Perfect Number
//        int n = 6;
//        int sum = 0;
//
//        for (int i = 1; i < n; i++) {
//            if (n % i == 0) {
//                sum = sum + i;
//            }
//        }
//
//        if (sum == n) {
//            System.out.println("Perfect Number");
//        } else {
//            System.out.println("Not Perfect Number");
//        }

        //Problem 12: Count Number of Even Digits
//        int n = 248531;
//        int count = 0;
//
//        while (n > 0) {
//            int digit = n % 10;
//
//            if (digit % 2 == 0) {
//                count++;
//            }
//
//            n = n / 10;
//        }
//
//        System.out.println("Even digits count = " + count);

        //Problem 13: Print All Prime Numbers from 1 to n
//        int n = 20;
//
//        for (int num = 2; num <= n; num++) {
//            boolean isPrime = true;
//
//            for (int i = 2; i * i <= num; i++) {
//                if (num % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//
//            if (isPrime) {
//                System.out.print(num + " ");
//            }
//        }


    }
    //Problem 1: Count Digits in a Number
//    static int Count_digit(int digit){
//        int count =0;
//        while (digit>0){
//            count++;
//            digit=digit/10;
//
//        }
//        return count;
//    }

    //Problem 2: Sum of Digits
//    static int Sum_of_Digit(int digit){
//        int sum=0;
//        while (digit>0){
//            int last_digit=digit%10;
//            digit=digit/10;
//            sum=sum+last_digit;
//
//        }
//        return sum;
//    }

    //Problem 3: Reverse a Number
//    static int Reverse_num(int digit){
//        int rev=0;
//        while (digit>0){
//            int remove_num=digit%10;
//            digit=digit/10;
//            rev=rev*10+remove_num;
//        }
//        return rev;
//    }

    //Problem 4:
    //4. Even and Odd Number
//    static void Even_Odd(int digit){
//        if (digit%2==0){
//            System.out.println("Even number");
//        }
//        else {
//            System.out.println("odd number");
//        }
//
//    }


    //Problem 4: Palindrome Number
//    static void Palindrome(int digit){
//        int rev=0;
//        int original=digit;
//        while (digit>0){
//            int rev_num=digit%10;
//            digit=digit/10;
//            rev=rev*10+rev_num;
//
//        }
//        if (rev==original){
//            System.out.println("this is palindrome no");
//        }
//        else {
//            System.out.println("this is not palindrome no");
//        }
//    }



    //Problem 5: Prime Number
//    static void PrimeNumber(int digit){
//        boolean PrimeNumber=true;
//        int num=0;
//        for(int i =2;i<digit;i++){
//            if(digit%i==0){
//                PrimeNumber =false;
//                break;
//            }
//        }
//        if (PrimeNumber){
//            System.out.println("this number is prime number");
//        }
//        else {
//            System.out.println("this is not prime number");
//        }

        //better optimization
//            boolean PrimeNumber=true;
//            int num=0;
//            for(int i =2;i*i<digit;i++){
//                if(digit%i==0){
//                    PrimeNumber =false;
//                    break;
//                }
//            }
//            if (PrimeNumber){
//                System.out.println("this number is prime number");
//            }
//            else {
//                System.out.println("this is not prime number");
//            }
//        }
//    }


    //Problem 6: Factorial
//    static int Factorial(int digit){
//        int fact=1;
//        for (int i=1;i<=digit;i++){
//            fact=fact*i;
//        }
//        return fact;
//    }



    //Problem 7: GCD (Greatest Common Divisor)
//    static void GCD(int digit,int digit1){
//        while (digit1!=0){
//            //GCD(a, b) = GCD(b, a % b)
//            int temp=digit1;
//            digit1=digit%digit1;
//            digit=temp;
//
//        }
//        System.out.println("LCD : "+digit);
//    }


    //Problem 8: LCM
    //LCM × GCD = a × b
    //LCM = (a × b) / GCD
//    static void LCM(int digit,int digit1){
//        int LCM=0;
//        int a=digit;
//        int b=digit1;
//        while (digit1!=0){
//            int temp=digit1;
//            digit1=digit%digit1;
//            digit=temp;
//
//        }
//        LCM=(a*b)/digit;
//        System.out.println("LCM is = "+LCM);
//    }


    //Problem 9: Armstrong Number
//    static void Armstrong(int digit){
//        int sum=0;
//        int original=digit;
//        while (digit!=0){
//            int i=digit%10;
//            digit=digit/10;
//            sum=i*i*i+sum;
//        }
//        if (sum==original){
//            System.out.println("Number is Armstrong "+sum);
//        }
//        else{
//            System.out.println("Not Armstrong Number");
//        }
//    }


    //Problem 10: Power of a Number
//    static void Power_num(int digit,int power){
//        int ans=1;
//        for (int i =1;i<=power;i++){
//            ans=ans*digit;
//        }
//        System.out.println("Power = " + ans);
//    }


}