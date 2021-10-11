//Function to Multiply two numbers. 
import java.util.*;
public class Function {
    public static int mulTwoNum(int a, int b){//functon banaya void ki jagah int type likhne ka wrna error aayefga
        
        return a*b;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();
        
        System.out.println("Enter b :");    
        int b = sc.nextInt();
        
        int sum = mulTwoNum(a,b);
        System.out.println("Multiply is : " + sum);
    }
}
