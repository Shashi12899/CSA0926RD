public class UncaughtExceptionDemo {

    // Demonstrates an uncaught exception
    public static void uncaughtExceptionDemo() {
        System.out.println("===== Uncaught Exception Demonstration =====");
        System.out.println("Before Exception");

        // This line causes an ArithmeticException
        int result = 100 / 0;

        // This line will never execute
        System.out.println("Result: " + result);
        System.out.println("End of Uncaught Exception Demo");
    }

    // Demonstrates a handled exception
    public static void handledExceptionDemo() {
        System.out.println("\n===== Handled Exception Demonstration =====");
        System.out.println("Before Exception");

        try {
            int result = 100 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught Successfully!");
            System.out.println("Exception Type : " + e.getClass().getSimpleName());
            System.out.println("Message        : " + e.getMessage());
        }

        System.out.println("Program continues execution...");
        System.out.println("End of Handled Exception Demo");
    }

    public static void main(String[] args) {

        // Run the handled example first
        handledExceptionDemo();

        System.out.println("\n-----------------------------------------");
        System.out.println("Now demonstrating an uncaught exception...");
        System.out.println("-----------------------------------------");

        // This will terminate the program
        uncaughtExceptionDemo();
    }
}