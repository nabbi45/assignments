import java.util.*;

/**
 * question9
 */
public class question9 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arrA = new int[3];
    int[] arrB = new int[3];
    int[] arrC = new int[3];

    System.out.println("Enter the marks of student A ");
    for(int i=0;i<arrA.length;i++){
      arrA[i] = sc.nextInt();

    }


        System.out.println("Enter the marks of student B ");
        for(int i=0;i<arrB.length;i++){
          arrB[i] = sc.nextInt();

  }


            System.out.println("Enter the marks of student C ");
            for(int i=0;i<arrC.length;i++){
              arrC[i] = sc.nextInt();

    }
      int totalMarks = 0;
      int totalMarksA=0, totalMarksB=0, totalMarksC=0;

       for(int i=0;i<arrA.length;i++){
         totalMarksA = arrA[i] + totalMarksA;
       }

       for(int i=0;i<arrB.length;i++){
         totalMarksB = arrB[i] + totalMarksB;
       }

       for(int i=0;i<arrC.length;i++){
         totalMarksC = arrC[i] + totalMarksC;
       }

       totalMarks = totalMarksA+totalMarksB+totalMarksC;

       double averageMarks = totalMarks/9;

       int totalA = arrA[0]+arrB[0]+arrC[0];
       int totalB = arrA[1]+arrB[1]+arrC[1];
       int totalC = arrA[2]+arrB[2]+arrC[2];



        System.out.println("Total marks of all students in all subjects "+totalMarks);
        System.out.println("Average marks of all students in all subjects "+averageMarks);
        System.out.println("Total marks scored by students in subject A " +totalA);
        System.out.println("Average marks scored by students in subject A "+totalA/3);
        System.out.println("Total marks scored by students in subject B "+totalB);
        System.out.println("Average marks scored by students in subject B "+totalB/3);
        System.out.println("Total marks scored by students in subject C "+totalC);
        System.out.println("Average marks scored by students in subject C "+totalC/3);
  }
}
