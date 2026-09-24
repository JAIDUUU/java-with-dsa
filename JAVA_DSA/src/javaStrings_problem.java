import java.util.Locale;
import java.util.Scanner;

public class javaStrings_problem {
    public static void main(String[] args) {

        //Count consonants in a string
//        int count=0;
//        String str="javastrinGvndvVV";
//        String new_str=str.toLowerCase();
//        for (int i =0;i<new_str.length();i++){
//            char ch = new_str.charAt(i);
//            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//                continue;
//            }
//            else {
//                count++;
//            }
//        }
//        System.out.println(count);


        //Convert string to uppercase without using method
//        String str="ZaID SAifI";
//        String result="";
//        for (int i =0;i<str.length();i++){
//            char ch=str.charAt(i);
//            if (ch>= 'a' && ch<='z'){
//                ch=(char)(ch-32);
//            }
//            result =result+ch;
//        }
//        System.out.println(result);

        //Find frequency of a character
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your word:");
//        String word = sc.nextLine();
//        System.out.println("Enter you searching count word");
//        char search=sc.next().charAt(0);
//
//        int count=0;
//        for (int i =0;i<word.length();i++){
//            char ch = word.charAt(i);
//            if (ch == search){
//                count++;
//            }
//        }
//        System.out.println(count);

        //Remove all spaces from string
//        System.out.println("Enter you string");
//        String str=sc.nextLine();
//        String result="";
//        for (int i =0;i<str.length();i++){
//            char ch=str.charAt(i);
//            if (ch!=' '){
//                result=result+ch;
//            }
//        }
//        System.out.println(result);

        //Check if string contains only digits
//        System.out.println("Enter your string");
//        String str=sc.nextLine();
//        boolean onlydigit=true;
//
//        for (int i=0;i<str.length();i++){
//            char ch =str.charAt(i);
//            if (ch>='0' && ch<='9'){
//                onlydigit =false;
//                break;
//            }
//        }
//        if (onlydigit){
//            System.out.println("this string is digit");
//        }
//        else {
//            System.out.println("this string is not digit");
//        }

        //Count words in a sentence
        System.out.println("enter your sentence");
        String str=sc.nextLine();

        String[] words=str.split("\\S+");
        System.out.println(words.length);

    }

}
