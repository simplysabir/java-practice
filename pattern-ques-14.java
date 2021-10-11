//pattern question 14
public class MyClass {
    public static void main(String args[]) {
    int n = 4; 
    //upper half i++
    for(int i=1;i<=n;i++){
        //for spaces
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        
        //for stars
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
        
    }
    //lower half i--
    for(int i=n;i>=1;i--){
        {
        //for spaces
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        
        //for stars
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
        
    }
    }
    
    
    
    }
}
