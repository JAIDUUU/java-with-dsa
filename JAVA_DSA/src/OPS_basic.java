public class OPS_basic {
    static void main(String[] args) {
//        What is an Object?
//        In simple terms, an object is an instance of a class that contains both data and
//        the methods that operate on that data.
//        You can think of it like this:
//        )-->A class is a blueprint
//        )-->An object is the real-world entity created from that blueprint

        //Class Declaration
//        class Car{
//            String brand;
//            int year;
//            void display(){
//                System.out.println("Brand: "+brand+", year: "+year);
//            }
//        }

        //Object Instantiation
//        Car car1=new Car();
//        car1.brand ="Toyata";
//        car1.year=2020;
//        car1.display();
//
//        Car car2=new Car();
//        car2.brand="Ford";
//        car2.year=2018;
//        car2.display();


        //Constructors
//        class Car{
//            String brand;
//            int year;
//            Car(){
//                System.out.println("Default constructor called");
//            }
//        }

        //Parameterized Constructor
        class  Car{
            String Brand;
            int year;

            Car(String Brand,int year){
                this.Brand=Brand;
                this.year=year;

            }
            void display(){
                System.out.println("Brand: "+Brand + ", Year: "+ year);
            }
        }


        //Using Constructor:
        Car car1=new Car("Toyota",2020);
        car1.display();

        Car car2=new Car("Ford",2018);
        car2.display();


    }
}
