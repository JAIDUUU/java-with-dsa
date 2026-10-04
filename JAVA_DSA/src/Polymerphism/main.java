package Polymerphism;

public class main {
    public static void main(String[] args){

//        print obj= new print();
//        obj.display(10);
//        obj.display(10.2);
//        obj.display("father");

        Animal a;

        //upcasting
        a=new Dogs();

        //dynamic method Dispatch
        a.Sound();

        //upcasting
        a=new Cat();

        a.Sound();

        Shape s=new Circle();
        s.display();

        s= new Rectangle();
        s.display();




    }
}
