import java.util.*;
import java.lang.Math;

/**
 * question3
 */
public class question3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Principal amount ");
    int P = sc.nextInt();
    System.out.println("Enter the rate of interest ");
    double r = sc.nextDouble();
    System.out.println("Enter the time ");
    double t = sc.nextDouble();

    double simple_interest = (P*r*t)/100;
    System.out.println("Simple interest is "+simple_interest);

    double tr = Math.pow(1+r,t);
    double compound_interest = P*tr-P;
    System.out.println("Compound Interest is "+compound_interest);

  }
}
