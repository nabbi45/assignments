import java.util.*;

/**
 * question5
 */
public class question5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ctc = sc.nextInt();

    if(ctc<=180000){
      System.out.println("Nil");
    }

    else if(ctc>=181001&&ctc<=300000){
      float tax = (ctc*10)/100;
      System.out.println("Tax is "+tax);
    }

    else if(ctc>=300001 && ctc<=500000){
      float tax = (ctc*20)/100;
      System.out.println("Tax is "+tax);
    }

    else if(ctc>=500001 && ctc<=1000000){
      float tax = (ctc*30)/100;
      System.out.println("Tax is "+tax);
    }

    else{
      System.out.println("Please enter valid ctc");
    }
  }
}
