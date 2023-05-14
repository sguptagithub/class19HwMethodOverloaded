package Class19HwMethodsOverloaded;

public class TestOverLoad2 {

    public static void main(String[] args) {
        OverLoad2 om = new OverLoad2();

        om.callPrintMessage();
        // Output: Hello!

        om.callPrintMessage("Alice");
        // Output: Hello, Alice!

        om.callPrintMessage("Bob", "Smith");
        // Output: Hello, Bob Smith!
    }
}

