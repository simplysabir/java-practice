//pattern question 10

public class MyClass {
    public static void main(String args[]) {
        int n = 4;
        //upper half
       for(int i=1;i<=n;i++){
           //first half
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           //for spaces
           int spaces = 2*(n-i);
           for(int j=1;j<=spaces;j++){
               System.out.print(" ");
           }
           //second half
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
       }
       //reverse part / lower half
       for(int i=n;i>=1;i--){
           //firdst half
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           //for spaces
           int spaces = 2*(n-i);
           for(int j=1;j<=spaces;j++){
               System.out.print(" ");
           }
           
           //seconmd half
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
       }
       
       
       
       
       
    }
}
