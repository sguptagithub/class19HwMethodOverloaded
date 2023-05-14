package Class19HwMethodsOverloaded;

public class TestOverLoadedMethod {
    public static void main(String[] args) {
        OverloadedMethod.printMessage();
        // Output: Hello!

        OverloadedMethod.printMessage("Alice");
        // Output: Hello, Alice!

        OverloadedMethod.printMessage("Bob", "Smith");
        // Output: Hello, Bob Smith!
    }
}

