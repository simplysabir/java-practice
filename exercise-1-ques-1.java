//java exercise 1 question no. 1
//make a function to print average of 3 numbers
import java.util.*;
public class MyClass {
    public static void avgOfThree(int a, int b, int c){
        int avg = (a+b+c)/3;
        System.out.println(avg);
        return ;
    }
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
                System.out.println(" Enter 3 Numbers ");

        int a = sc.nextInt();
        
        int b = sc.nextInt();
        
        int c = sc.nextInt();
        avgOfThree(a,b,c);
        
      
    }
}
