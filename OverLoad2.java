package Class19HwMethodsOverloaded;

public class OverLoad2 {
    /*Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.

     */
    private void printMessage() {
        System.out.println("Hello!");
    }

    private void printMessage(String name) {
        System.out.println("Hello, " + name + "!");
    }

    private void printMessage(String firstName, String lastName) {
        System.out.println("Hello, " + firstName + " " + lastName + "!");
    }

    public void callPrintMessage() {
        printMessage();
    }

    public void callPrintMessage(String name) {
        printMessage(name);
    }

    public void callPrintMessage(String firstName, String lastName) {
        printMessage(firstName, lastName);
    }
}

