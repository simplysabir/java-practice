 //pattern question 11
public class MyClass {
    public static void main(String args[]) {
    int n = 5;
    for(int i=1;i<=n;i++){
        //for spaces
        int spaces = (n-i);
        for(int j=1;j<=spaces;j++){
            System.out.print(" ");
        }
        
        //for starrs
        for(int j=1;j<=n;j++){
            System.out.print("*");
        }
        
        System.out.println();
    }
    
    
    
    }
}
