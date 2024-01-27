import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);

            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();

            System.out.println("Выберите оператор (+, -, *, /):");
            char operation = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            Calculator calculator = Calculator.getInstance();
            double result = 0;
            try {
                switch (operation) {
                    case '+':
                        result = calculator.add(num1, num2);
                        break;
                    case '-':
                        result = calculator.subtract(num1, num2);
                        break;
                    case '*':
                        result = calculator.multiply(num1, num2);
                        break;
                    case '/':
                        result = calculator.divide(num1, num2);
                        break;
                    default:
                        Logger.getInstance().warning("Недопустимая операция.");
                        return;
                }
                Logger.getInstance().info(num1 + " " + operation + " " + num2 + " = " + result);
            } catch (IllegalArgumentException e) {
                Logger.getInstance().error(e.getMessage());
            }
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    } 
}