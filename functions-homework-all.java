//all homework question realted to function
import java.util.*;
public class MyClass {
    //checking whether number is prime or not 
    public static void primeOrNot(int a){
        int n = a%2;
        if(n!=0){
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Number is not Prime ");
        }
        return;
    }
    
    //Checking Whether Number is Even or not
    public static void evenOrOdd(int a ){
        if(a%2==0){
            System.out.println(" Even");
        }
        else{
            System.out.println("odd");
        }
        return ;
    }
    
    //printing table of a number 
    public static int tableOfNum(int a ){
        int n=1;
        int store = 1;
        for(int i=1;i<=10;i++){
         store = a*i;
        System.out.println(store);
        }
        return store;
    }
    public static void main(String args[]) {
      
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Number");
      int a = sc.nextInt();
      tableOfNum(a);
      primeOrNot(a);
      evenOrOdd(a);
      
      
      
      
      
      
          }
}
