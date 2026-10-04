package Abstraction;

interface animal{
    void sound();
}

class Cat implements animal{
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}


public class Using_interface {
    public static void main(String[] args) {
        animal x= new Cat();
        x.sound();
    }
}
