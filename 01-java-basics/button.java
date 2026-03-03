
import java.util.Scanner;
public class button {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter button number");
        int button = sc.nextInt();
        if (button == 1) {
            System.out.println("Button 1 is pressed");
        } else if (button == 2) {
            System.out.println("Button 2 is pressed");
        } else if (button == 3) {
            System.out.println("Button 3 is pressed");
        } else {
            System.out.println("Invalid button");
        }
        sc.close();
    }
}