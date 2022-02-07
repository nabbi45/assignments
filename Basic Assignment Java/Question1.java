import java.util.*;

public class Question1{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    int temp = num;
    int a, sum=0;

    while(num>0){
      a = num%10;
      num = num/10;
      sum = sum + a*a*a;
    }
    if(sum==temp){
      System.out.println("Given number is armstrong number");
    }
    else{
      System.out.println("Given number is not armstrong number");
    }
  }
}
