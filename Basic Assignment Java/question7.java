import java.util.*;
/**
 * question7
 */
public class question7 {

  public static void main(String[] args) {
    int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to search in the array ");
    int num = sc.nextInt();
    boolean flag = false;

    for(int i : arr){
      if(i == num){
        flag = true;

    break;
      }
    }
    if(flag){
        System.out.println("Value exists");
    }
    else{
    System.out.println("Value does not exist");
  }
  }
}
