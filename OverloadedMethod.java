package Class19HwMethodsOverloaded;

public class OverloadedMethod {
        /*Create 1 class with a static method that has 3 overloaded forms.
        Then call each overloaded method with specific arguments and observe result.
         */
        public static void printMessage() {
            System.out.println("Hello!");
        }

    public static void printMessage(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void printMessage(String firstName, String lastName) {
        System.out.println("Hello, " + firstName + " " + lastName + "!");
    }
}

