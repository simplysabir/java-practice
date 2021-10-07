//pattern question number 4

public class MyClass {
    public static void main(String args[]) {
      int n = 4;
      int i = n;
      int j = 1;
      
       for(i=n;i>=1;i--){
           for(j=1;j<=i;j++){
               System.out.print("*");
               
           }
           System.out.println();
       }
    }
}
