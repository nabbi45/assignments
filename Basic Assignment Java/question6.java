import java.util.*;

/**
 * question6
 */
public class question6 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String userId = "user";
    String password = "user123";
    int counter = 3;

    while(counter>0){
      System.out.println("Please enter your user ID ");
      String user = sc.nextLine();
      sc.nextLine();
      System.out.println("Please enter your password ");
      String pass = sc.nextLine();

      if(userId==user&&password==pass){
        System.out.println("Welcome");
        break;
      }
      else{
        counter = counter - 1;
      }
    }
    System.out.println("Contact Admin");
  }
}
