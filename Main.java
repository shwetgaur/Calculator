package lab1;
/**
 SHWET GAUR
 23070126126
 AIML-B2z
 */

 public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        Calculator calculator = new Calculator();
        
        int choice;
        do {
            choice = userInput.getOperationChoice();
            switch (choice) {
                case 1:
                    double num1 = userInput.getDoubleInput("Enter first number: ");
                    double num2 = userInput.getDoubleInput("Enter second number: ");
                    System.out.println("Addition: " + calculator.add(num1, num2));
                    break;
                case 2:
                    num1 = userInput.getDoubleInput("Enter first number: ");
                    num2 = userInput.getDoubleInput("Enter second number: ");
                    System.out.println("Subtraction: " + calculator.subtract(num1, num2));
                    break;
                case 3:
                    num1 = userInput.getDoubleInput("Enter first number: ");
                    num2 = userInput.getDoubleInput("Enter second number: ");
                    System.out.println("Multiplication: " + calculator.multiply(num1, num2));
                    break;
                case 4:
                    num1 = userInput.getDoubleInput("Enter first number: ");
                    num2 = userInput.getDoubleInput("Enter second number: ");
                    System.out.println("Division: " + calculator.divide(num1, num2));
                    break;
                case 5:
                    int n = userInput.getIntInput("Enter the number of terms for Fibonacci: ");
                    System.out.println("Fibonacci Sequence: " + calculator.fibonacci(n));
                    break;
                case 6:
                    double[] array = userInput.getArrayInput();
                    System.out.println("Mean: " + calculator.mean(array));
                    break;
                case 7:
                    array = userInput.getArrayInput();
                    System.out.println("Mode: " + calculator.mode(array));
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);
    }
}
