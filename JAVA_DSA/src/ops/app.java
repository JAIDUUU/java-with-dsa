package ops;

public class app {
    public static void main(String[] args) {
        System.out.println("Hello world");

        //default constructor
//        Student A = new Student();
//        A.age = 19;
//        A.id = 494;
//        A.name = "zaid";
//        A.nos = 5;
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//        A.bunk();
//        A.sleep();
//        A.study();

        //personilesed ctor
//        Student A=new Student(1,45,"zaid",3);
//        System.out.println(A.name);
//        System.out.println(A.id);
//        System.out.println(A.age);
//        System.out.println(A.nos);
//
//        A.bunk();
//        A.sleep();
//        A.study();



        //copy ctor
//        Student B=new Student(A);
//        System.out.println(B.name);
//        System.out.println(B.age);
//        System.out.println(B.id);
//        System.out.println(B.nos);
//
//        B.sleep();
//        B.study();
//        B.bunk();


        //Encapsulation
        Student A = new Student(1,12,"rahul",3,"tina");
        System.out.println(A.name);
         System.out.println(A.getAge());
         System.out.println(A.id);
         System.out.println(A.nos);
         System.out.println(A.getName());

         A.bunk();
         A.study();
         A.sleep();
//         A.gfChatting();

    }
}
