
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 0 or 1");
      int c = sc.nextInt();
      
      
      do{
          System.out.println("Enter Marks");
          int marks = sc.nextInt();
          
          if(marks>=90){
              System.out.println("This is Good");
          }
          else if(marks>=60 || marks<=89){
              System.out.println("This is also Good");
          }
          else if (marks>=35 || marks>0){
              System.out.println("This is Good as Well");
          }
          else{
              System.out.println("Pls Enter Marks Umder 100");
          }    
      }while(c==0);
      
      
      
    }
}
