public class methods_problem {
    public static void main(String[] args) {

        PRINT_WELCOME_MESSAGE();

        System.out.println(ADD(2, 4));

        System.out.println(IS_EVEN(10));

        System.out.println(GET_MAXIMUM(4, 5));

        System.out.println(CALCULATE_PERCENTAGE(1112, 1800));

        DISPLAY(10);
        DISPLAY("Zaid");

        int x = 50;
        System.out.println("Before method: " + x);
        UPDATE_VALUE(x);
        System.out.println("After method: " + x);
    }

    // Q1 Create a method PRINT_WELCOME_MESSAGE() that prints a simple welcome/greeting message.
    static void PRINT_WELCOME_MESSAGE() {
        System.out.println("Hello, how are you?");
    }

    // Q2 Create a method ADD(int a, int b) that takes two integers and returns their sum.
    static int ADD(int a, int b) {
        return a + b;
    }

    // Q3 Create a method IS_EVEN(int number) that checks whether a number is even or not and returns true or false.
    static boolean IS_EVEN(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Q4 Create a method GET_MAXIMUM(int a, int b) that takes two integers and returns the larger number.
    static int GET_MAXIMUM(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Q5Create a method CALCULATE_PERCENTAGE(int obtained, int total) that calculates and returns the percentage.
    static float CALCULATE_PERCENTAGE(int obtained, int total) {
        float percentage = ((float) obtained / total) * 100;
        return percentage;
    }

    // Q6Create two overloaded methods named DISPLAY():
    //One should accept an int parameter.
    //One should accept a String parameter.
    //Both methods should display the value passed to them.
    static void DISPLAY(int number) {
        System.out.println("Integer: " + number);
    }

    static void DISPLAY(String text) {
        System.out.println("String: " + text);
    }

    // Q7 Q7. Update Value
    //
    //Create a method UPDATE_VALUE(int x) that changes the value of x inside the method. Call it from main()
    // and verify whether the original variable in main() changes or not.
    static void UPDATE_VALUE(int x) {
        x = 44;
        System.out.println("Inside method: " + x);
    }
}