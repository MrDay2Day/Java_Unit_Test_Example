package code;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Calculator calculator = new Calculator();
        System.out.println("Addition: " + calculator.add(5, 3));
        try {
            System.out.println("Division: " + calculator.divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
