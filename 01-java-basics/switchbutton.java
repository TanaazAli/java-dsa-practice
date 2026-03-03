import java.util.Scanner;
       public class switchbutton {
           public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
               System.out.println("Enter button number:");
               int button = sc.nextInt();
               switch(button){
                   case 1:
                   System.out.println("button one is pressed");
                   break;
                   case 2:
                   System.out.println("button two is pressed");
                   break;
                   case 3:
                   System.out.println("button three is pressed");
                   break;
                   default:
                   System.out.println("Invalid button");
               }
           }
    
}
