public class Loops {
    public static void main(javaString[] args) {

        //Example 1: Print Numbers from 1 to 5
//        for (int day=1 ; day<=5;day++){
//            System.out.println(day);
//        }


        //Example 2: Print Even Numbers from 2 to 10
//        for (int i =2;i<=10;i++){
//            System.out.println(i);
//        }


        //Example 3: Print a Message 3 Times
//        for (int attempt=1;attempt<=3;attempt++){
//            System.out.println("again you go for jee");
//        }


        //Example 4: Print Numbers from 1 to 5 Using while
//        int count=1;
//        while (count<=5){
//            System.out.println(count);
//            count++;
//        }


        // Example 5: Countdown Using while
//        int timeleft=10;
//        while (timeleft>=1){
//            System.out.println(timeleft+"s");
//            timeleft--;
//        }


        //Basic do-while
//        int revisonRound=1;
//        do{
//            System.out.println("revision round :"+revisonRound);
//            revisonRound++;
//        } while (revisonRound<=3);


        //Example 7: do-while Runs At Least Once
//        int rollNo=10;
//        do {
//            System.out.println("roll no :"+rollNo);
//            rollNo ++;
//        }while (rollNo<5);


        //Example 8: Infinite while Loop
//        while (true){
//            System.out.println("fahter");
//        }



        //Example 9: Infinite for Loop
//        for(;;){
//            System.out.println("father");
//        }\


        //Example 10: Print a Small Square Pattern
//        for(int row=1;row<=3;row++){
//            for (int column=1;column<=3;column++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //Example 11: Stop at 4
//        for(int i=1;i<=5;i++){
//            if( i==4){
//                break;
//            }
//            System.out.println(i);
//        }


        //Example 12: Skip 3
        for(int i=1;i<=6;i++){
            if( i==3){
                continue;

            }
            System.out.println(i);
        }


    }
}
