import java.util.Scanner;
  public class calculator {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter a");
           int a= sc.nextInt();
              System.out.println("Enter b");
              int b= sc.nextInt();
              System.out.println("Enter operator (+, -, *, /):" );
                char operator = sc.next().charAt(0);
                switch(operator){
                    case '+':
                    int sum = a + b;
                    System.out.println("Sum: " + sum);
                    break;
                    case '-':
                    int diff = a - b;
                    System.out.println("Difference: " + diff);
                    break;
                    case '*':
                    int prod = a * b;
                    System.out.println("Product: " + prod);
                    break;
                    case '/':
                    if (b != 0) {
                        int quot = a / b;
                        System.out.println("Quotient: " + quot);
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                    break;
                    default:
                    System.out.println("Invalid operator");
                }
}
  }