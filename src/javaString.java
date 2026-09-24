import java.util.Locale;
import java.util.Scanner;

public class javaString {
    public static void main(String[] args) {

        // Method 1
        String str1 = "hello";

        // Method 2
        String str2 = new String("hello");

        System.out.println(str1);
        System.out.println(str2);

        // String Basics

        // 1. Length of String
        // String str = "CodeHelp";
        // System.out.println(str.length());

        // 2. Access Characters
        // System.out.println(str.charAt(0));
        // System.out.println(str.charAt(3));

        // Strings are Immutable
        // Once a string is created, it cannot be changed.

        // String str = "hello";
        // str.concat(" World");
        // System.out.println(str);

        // Comparing Strings
        String strr1 = "Zaid";
        String strr2 = "ZAID";

        // ❌ Wrong way
        // if (strr1 == strr2) {
        //     System.out.println("same");
        // }

        // ✅ Correct way
        if (strr1.equals(strr2)) {
            System.out.println("same");
        }

        // Taking String Input
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();          // single word
        // String fullname = sc.nextLine();  // full line

        // next() -> one word
        // nextLine() -> full line

        // Common String Methods
        String str = "HEllo";

        // 1. length()
        System.out.println(str.length());

        // 2. charAt(i)
        System.out.println(str.charAt(1));

        // 3. equals()
        System.out.println(str.equals("Hello"));

        // 4. toLowerCase()
        System.out.println(str.toLowerCase());

        // 5. toUpperCase()
        System.out.println(str.toUpperCase());

        // 6. concat()
        System.out.println(str.concat(" World"));

        //Problem 1: Print Each Character
        String prob="Zaid papa13";
        for (int i =0;i<prob.length()-1;i++){
            System.out.println(prob.charAt(i));
        }

        //Problem 2: Count Length Without length()
//        int count=0;
//        for (int x=0;x<prob.length()-1;x++){
//            count++;
//        }
//        System.out.println(count);

        //Problem 3: Count Vowels
        String vowal="xsagszvxcbvdyvsabeoafdvcx sz cxnvsaahvxsz";
        String lowercon=vowal.toLowerCase();
        int count=0;
        for (int z=0;z<lowercon.length()-1;z++){
            char ch=lowercon.charAt(z);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++;

        }
        System.out.println(count);

        //Problem 4: Reverse a String
//        String reverse="zaid";
//        String reversed="";
//
//        for (int r=reverse.length()-1;r>=0;r--){
//            reversed=reversed + reverse.charAt(r);
//
//        }
//        System.out.println(reversed);


        //Problem 5: Check Palindrome
        String palindrome="papaiiapap";
        String palindroned="";

        for (int p=palindrome.length()-1;p>=0;p++){
            palindroned=palindroned+palindrome.charAt(p);
        }
        if (palindrome.equals((palindroned))){
            System.out.println("yes this is paladirom ");
        }
        else {
            System.out.println(("this is not paladrome"));
        }
    }
}