package Abstraction;

abstract class Animal{
    abstract void sound();

    void sleep(){
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal{

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Using_abstract {
    public static void main(String[] args) {
        Animal obj=new Dog();
        obj.sleep();
        obj.sound();

    }
}
