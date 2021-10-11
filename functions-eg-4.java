//Function to Find Factorial of a Number. 
import java.util.*;
public class Function {
    public static int facOfNum(int a){//functon banaya void ki jagah int type likhne ka wrna error aayefga
        int factorial = 1;
        for(int i=a;i>=1;i--){
           factorial = factorial*i;
        }
        System.out.println(factorial);
        return factorial;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();
        
        facOfNum(a);
    }
}
