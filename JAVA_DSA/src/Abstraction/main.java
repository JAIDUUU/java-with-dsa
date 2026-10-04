package Abstraction;


abstract class Bird{
    abstract void fly();

    abstract void eat();
}

class sparrow extends Bird{
    @Override
    void fly() {
        System.out.println("sparrow fly");
    }

    @Override
    void eat() {
        System.out.println("sparrow eat");
    }
}
public class main {

    public static void main(String[] args) {

    }
}
