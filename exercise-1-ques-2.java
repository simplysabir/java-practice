//java exercise 1 question no. 2
//function to print summ of all odd numbers till n
import java.util.*;
public class MyClass {
    public static void sumOfOdd(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
        
            if(i%2!=0){
                sum = sum + i;
            } 
            
        }
        System.out.println(sum);
        return ;
    }
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
                System.out.println(" Enter Number ");

        int n = sc.nextInt();
        sumOfOdd(n);
        
      
    }
}
