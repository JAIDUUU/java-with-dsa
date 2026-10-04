package PRACTICE1;

import java.util.Scanner;

public class Easy {
    static void main(String[] args) {

        //1)Write a Java program to print your name, age, and city.
//        String name="zaid";
//        int age=29;
//        String city="tamil";
//
//        System.out.println("name : "+name);
//        System.out.println("age : "+age);
//        System.out.println("city : "+city);

        //2) Take two integers as input and print their sum, difference, product, and quotient.
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter first number");
//        int a =sc.nextInt();
//        System.out.println("enter second number");
//        int b = sc.nextInt();
//        System.out.println("sum: "+a+b);
//        System.out.println("Difference = " + (a - b));
//        System.out.println("Product = " + (a * b));
//        System.out.println("Quotient = " + (a / b));

        //3)Check whether an integer is positive, negative, or zero.
//        System.out.println("enter the integer");
//        int x= sc.nextInt();
//        if (x>0){
//            System.out.println("positive");
//        } else if (x==0) {
//            System.out.println("zero");
//        }
//        else {
//            System.out.println("negative");
//        }

        //4) Check whether a number is even or odd.
//        System.out.println("enter a number");
//        int x= sc.nextInt();
//        if (x % 2 == 0) {
//            System.out.println("Even");
//        }
//        else {
//            System.out.println("Odd");
//        }


        //5) Find the largest of two numbers.
//        System.out.println("enter a ");
//        int a=sc.nextInt();
//        System.out.println("enter b ");
//        int b=sc.nextInt();
//
//        if (a>b){
//            System.out.println("a is greater");
//        }
//        else {
//            System.out.println("b is largest");
//        }

        //6) Find the largest of three numbers using if-else.
//        System.out.println("enter a ");
//        int a=sc.nextInt();
//        System.out.println("enter b ");
//        int b=sc.nextInt();
//        System.out.println("enter c ");
//        int c=sc.nextInt();
//
//        if(a>b && a>c){
//            System.out.println("a is largest number");
//        }
//        else if (b>a && b>c) {
//            System.out.println("b is largest number");
//        }
//        else {
//            System.out.println("c is largest number");
//        }

        //7)Check whether a given year is a leap year.
//        System.out.println("enter the year");
//        int year= sc.nextInt();
//        if (year%400==0 || year%4==0 && year%100!=0){
//            System.out.println("Leap year");
//        }
//        else {
//            System.out.println("not leap year");
//        }


        //8)Convert Celsius to Fahrenheit.
//        System.out.println("enter the temperature in Celsius");
//        double c = sc.nextDouble();
//        double f=(c*9/5)+32;
//        System.out.println("temperature in Fahrenheit: "+f);
//


        //9) Calculate Simple Interest using principal, rate, and time.
//        System.out.println("enter the principal");
//        double principle= sc.nextDouble();
//        System.out.println("enter the rate ");
//        double rate= sc.nextDouble();
//        System.out.println("enter the Time");
//        double Time= sc.nextDouble();
//
//        double SI=(principle*rate*Time)/100;
//
//        System.out.println("simple interest"+SI);

        //10)Swap two numbers using a temporary variable.
//        System.out.println("enter the number a");
//        int num1= sc.nextInt();
//        System.out.println("enter the number b");
//        int num2= sc.nextInt();
//
//        int temp=num1;
//        num1 =num2;
//        num2=temp;
//
//        System.out.println("a :"+num1);
//        System.out.println("b: "+num2);


        //11)Swap two numbers without using a third variable.
//        System.out.println("enter the number a");
//        int num1= sc.nextInt();
//        System.out.println("enter the number b");
//        int num2= sc.nextInt();
//        num1=num2+num1;
//        num2=num1-num2;
//        num1=num1-num2;
//
//        System.out.println("a="+num1);
//        System.out.println("b="+num2);


        //12)Print numbers from 1 to N using a for loop.
//        System.out.println("enter the N: ");
//        int x= sc.nextInt();
//        for(int i=0;i<=x;i++){
//            System.out.println(i);
//        }


        //13) Print numbers from N to 1.
//        System.out.println("enter the N: ");
//        int x= sc.nextInt();
//        for(int i=x;i>=1;i--){
//            System.out.println(i);
//        }


        //14) Print all even numbers from 1 to N.
//        System.out.println("enter the N: ");
//        int x= sc.nextInt();
//        for(int i=1;i<=x;i++){
//           if(i%2==0){
//               System.out.println(i);
//           }
//        }

        //15. Sum from 1 to N
//        System.out.println("enter the number for n");
//        int x = sc.nextInt();
//        int sum = 0;
//        for (int i = 0; i <= x; i++) {
//            sum += i;
//        }
//        System.out.println("sum is " + sum + " from N: " + x);

        //16) Find the factorial of a number.
//        System.out.println("enter the number");
//        int fact= sc.nextInt();
//        int factorial=1;
//        for (int i =1;i<=fact;i++){
//            factorial=i*factorial;
//        }
//        System.out.println(factorial);

        //17) Print the multiplication table of a number.
//        System.out.println("enter the table number");
//        int x= sc.nextInt();
//        for (int i=0;i<=10;i++){
//            System.out.println(x+" * "+i+" = " + (x*i));
//        }


        //18) Count the digits in an integer.
//        System.out.println("enter the integer");
//        int x= sc.nextInt();
//        int count=0;
//        for (int i=0;i<=x;i++){
//            x=x/10;
//            count+=1;
//        }
//        System.out.println(count);

        //19) Find the sum of digits of a number.
//        System.out.println("enter the integer");
//        int x= sc.nextInt();
//        int sum=0;
//        for (int i=0;i<=x;i++){
//            int one_digit=x%10;
//            x=x/10;
//            sum+=one_digit;
//
//        }
//        System.out.println(sum);
        //20) Reverse an integer.
//        System.out.println("enter the number");
//        int n= sc.nextInt();
//        int Reverse=0;
//        for (int i=0;i<=n;i++){
//            int digit=n%10;
//            Reverse=Reverse*10+digit;
//            n=n/10;
//        }
//        System.out.println(Reverse);



    }


}


