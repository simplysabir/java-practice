//pattern question 13
public class MyClass {
    public static void main(String args[]) {
    int n = 5;  
    //outer loop is for Row Always
    for(int i=1;i<=n;i++){
        //for spaces
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        
        //for first half
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        
        //sexcond half
        for(int j=2;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    
    
    
    
    }
}
