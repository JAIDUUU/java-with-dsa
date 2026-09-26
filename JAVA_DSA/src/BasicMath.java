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
        System.out.println("factorial of "+digit+"this number is: "+Factorial(digit));







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

}