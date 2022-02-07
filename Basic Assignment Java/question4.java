import java.util.*;

/**
 * question4
 */
public class question4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sub1 = sc.nextInt();
    int sub2 = sc.nextInt();
    int sub3 = sc.nextInt();

    if(sub1>60 && sub2>60){
      if(sub3>60){
        System.out.println("Passed");
      }
      else{
        System.out.println("Promoted");
      }
    }
    else{
      System.out.println("Failed");
    }
  }
}
