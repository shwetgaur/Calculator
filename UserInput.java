package lab1;
import java.util.Scanner;

public class UserInput {
    private Scanner scanner = new Scanner(System.in);

    public int getOperationChoice() {
        System.out.println("\nSelect an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Fibonacci Sequence");
        System.out.println("6. Mean of Array");
        System.out.println("7. Mode of Array");
        System.out.println("0. Exit");
        return getIntInput("Enter your choice: ");
    }

    public double getDoubleInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public double[] getArrayInput() {
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }
        return array;
    }
}
