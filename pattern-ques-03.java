//pattern question number 3

public class MyClass {
    public static void main(String args[]) {
      int n = 4;
      int i = 1;
      int j = 1;
      
       for(i=1;i<=n;i++){
           for(j=1;j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
