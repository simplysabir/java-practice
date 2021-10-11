//making of function and calling it. 
import java.util.*;
public class Function {
    public static void printMyName(String name){//functon banaya
        System.out.println(name);
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name :");
        String name = sc.next();
        
        printMyName(name);//calling of function
      
    }
}
