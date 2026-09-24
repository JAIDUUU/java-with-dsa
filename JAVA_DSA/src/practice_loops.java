public class practice_loops {
    public static void main(javaString[] args) {

//        Practice Questions
//        1.Print numbers from 1 to 10 using for loop.
//        2.Print numbers from 10 to 1 using while loop.
//        3.Print first 5 even numbers using for loop.
//        4.Print multiplication table of 7.
//        5.Use do-while to print a menu at least once.
//        6.Print sum of numbers from 1 to n.
//        7.Print square pattern of size n using nested loops.
//        8.Print only odd numbers from 1 to 20 using continue.
//        9.Stop loop when value becomes 6 using break


//        for(int i=1;i<=10;i++){
//            System.out.println(i);
//        }


//        int x=10;
//        while (x>=1){
//            System.out.println(x);
//            x--;
//        }


//        for(int i=2;i<=10;i=i+2){
//            System.out.println(i);
//        }

//        for(int i=1;i<=10;i++){
//            System.out.println(i*7);
//        }


//        int i=1;
//        do{
//            System.out.println("student " +i);
//            i++;
//        }while (i<10);

//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter the no for sum to 1");
//        int sums=sc.nextInt();
//        int totalsum=0;
//        for (int i=1;i<=sums;i++){
//            totalsum+=i;
//        }
//        System.out.println(totalsum);



//        for(int i=1;i<=4;i++){
//            for (int j=1;j<=4;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        for (int i=1;i<=20;i++){
//            for (;i<=20;i=i+2){
//                System.out.println(i);
//                continue;
//            }
//        }
    for (int i = 1; i <= 10; i++) {
        if (i == 6) {
            break;
            }
        System.out.println(i);
        }


    }
}
