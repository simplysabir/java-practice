//program to find area of a circle

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      
      System.out.print("Enter Radius :");
      Scanner sc = new Scanner(System.in);
      double radius = sc.nextDouble();
      
      double area = 3.14*radius*radius;
      
      System.out.println("Radius is :");
      System.out.println(radius);
      
      System.out.println("Area is :");
      System.out.println(area);
    
    }
}
