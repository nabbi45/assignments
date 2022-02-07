import java.util.*;

/**
 * question2
 */
public class question2 {

  public static void main(String[] args) {
    int num, a, b, sum = 0, count = 0;

    for(int i = 100; i<=999; i++){
      num = i;
      while(num>0){
        b = num%10;
        sum = sum + b*b*b;
        num = num/10;
      }
      if(sum == i){
        System.out.println(i+" ");
      }
      sum = 0;
    }
  }
}
