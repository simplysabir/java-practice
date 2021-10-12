//java exercise 1 question no. 3
//Take Radius as a Input and Print area 

import java.util.*;
public class MyClass {
    public static double circleFer(double n){
        double area = n * 2 * 3.14 ;
        System.out.println(area);
        return area;
        
    }
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Radius ");
      double n = sc.nextDouble();
      circleFer(n);
      
    }
}
