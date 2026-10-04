package Transport;

public class Main {
    public static void main(String[] args) {
        Car c =new Car("maruti","2011",4,4,"automatic");
        c.startEngine();
        c.startAC();
        c.stopEngine();

        MotorCycle m=new MotorCycle("Ninja","2025",2,"curved","self");
        m.startEngine();
        m.wheelie();
        m.wheelie();
    }
}
