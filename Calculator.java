
package lab1;
import java.util.Arrays;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public String fibonacci(int n) {
        if (n <= 0) {
            return "Invalid input. Please enter a positive integer.";
        }
        StringBuilder result = new StringBuilder("0");
        int a = 0, b = 1;
        for (int i = 1; i < n; i++) {
            result.append(", ").append(b);
            int next = a + b;
            a = b;
            b = next;
        }
        return result.toString();
    }

    public double mean(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public double mode(double[] array) {
        Arrays.sort(array);
        double mode = array[0];
        int maxCount = 1, count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    mode = array[i - 1];
                }
                count = 1;
            }
        }
        if (count > maxCount) {
            mode = array[array.length - 1];
        }
        return mode;
    }
}
