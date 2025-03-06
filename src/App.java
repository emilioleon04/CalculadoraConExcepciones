import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);

        try {
            
            int result = 0;
            int operand1, operand2;

            System.out.println("Ingrese el primer número:");
            if (input.hasNextInt()) {
                operand1 = input.nextInt();
            } else {
                throw new NumberFormatException("Entrada incorrecta: " + input.next());
            }

            System.out.println("Ingrese el segundo número:");
            if (input.hasNextInt()) {
                operand2 = input.nextInt();
            } else {
                throw new NumberFormatException("Entrada incorrecta: " + input.next());
            }

            System.out.println("Ingrese operación a realizar:\n+\n-\n*\n/");
            char operator = input.next().charAt(0);

        switch (operator) {
            case '+': result = operand1 + operand2;
                break;
            case '-': result = operand1 - operand2;
                break;
            case '*': result = operand1 * operand2;
                break;
            case '/': if (operand2 == 0) {throw new ArithmeticException ("No se puede dividir un número entre 0");}
                else result = operand1 / operand2; }

                System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        }
}

