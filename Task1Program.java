import java.util.Scanner;

public class Task1Program {
    public static void main(String[] args) {

        // Variable type declaration

        double num1, num2, result;
        char oper;
        String choice;
        Scanner sc = new Scanner(System.in);

        do {

            // Getting input's from the User

            System.out.println("Enter the 1st number:");
            num1 = sc.nextDouble();

            System.out.println("Enter the operator (+, -, *,/):");
            oper = sc.next().charAt(0);

            System.out.println("Enter the 2nd number:");
            num2 = sc.nextDouble();

            //Switch case for different operation's

            switch (oper) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result = " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result = " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result = " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid operator.");
            }
            
            // Using while loop to run the operation until user exist

            System.out.print("Do you want to perform another operation? (y/n): ");
            choice = sc.next();

        // checking the user prefarance to run or exit the operation's
        
        } while (choice.equalsIgnoreCase("y"));  

        System.out.println("Calculator exited.");
        sc.close();
    }
}

