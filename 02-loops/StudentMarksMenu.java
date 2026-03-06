import java.util.Scanner;
public class StudentMarksMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter 1 to input marks or 0 to stop:");
            choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Enter student's marks (0-100):");
                int marks = sc.nextInt();
                if (marks<0 || marks > 100) {
                    System.out.println("Invalid marks. Please enter a value between 0 and 100.");
                }
               
                else if(marks >= 90){
                    System.out.println("This is Good");
                }
                else if(marks >= 60){
                    System.out.println("This is also Good");
                }
                else if(marks >= 0){
                    System.out.println("This is Good as well");
                }
                else{
                    System.out.println("Invalid marks");
                }
            }

        } while(choice != 0);

        
    }
}
