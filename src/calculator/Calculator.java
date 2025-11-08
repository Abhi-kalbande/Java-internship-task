package calculator;

public class Calculator {

    public static int add(int a, int b) {
        int result = a + b;
        Logger.log("ADD " + a + " + " + b + " = " + result);
        return result;
    }

    public static int subtract(int a, int b) {
        int result = a - b;
        Logger.log("SUB " + a + " - " + b + " = " + result);
        return result;
    }

    public static int multiply(int a, int b) {
        int result = a * b;
        Logger.log("MUL " + a + " * " + b + " = " + result);
        return result;
    }

    public static double divide(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("Cannot divide by zero");
        double result = a / b;
        Logger.log("DIV " + a + " / " + b + " = " + result);
        return result;
    }
}
