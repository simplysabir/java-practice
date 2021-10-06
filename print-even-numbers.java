
//program to print all even numbers till n 
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        System.out.println(" Enter Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int count = 0;
        
        int i = 1;
        for(i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total Even Numbers are : ");
        System.out.println(count);
    
    }
}
