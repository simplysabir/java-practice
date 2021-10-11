 //Functi0on to add two numbers. 
import java.util.*;
public class Function {
    public static int addTwoNum(int a, int b){//functon banaya void ki jagah type likhne ka wrna error aayefga
        
        return a+b;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        
        int b = sc.nextInt();
        
        int sum = addTwoNum(a,b);
        System.out.println(sum);
    }
}
