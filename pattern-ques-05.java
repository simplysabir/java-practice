//pattern question no 5

public class MyClass {
    public static void main(String args[]) {
      int n = 4;
      
      
      //outer loop
      for(int i=1;i<=n;i++){
          //inner loop -> For Space Printing
          for(int j=1;j<=n-i;j++){
              System.out.print(" ");
          }
          
          //inner loop -> For Star Printing
          for(int j=1;j<=i;j++){
              System.out.print("*");
          }
          
          System.out.println();
      }
      
      
    }
}
