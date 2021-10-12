//java exercise question no. 4
//Take 2 Number as a Input and Return The Greatest Among Them

import java.util.*;
public class MyClass {
    public static void retGreat(int a, int b ){
        if(a==b){
            System.out.println("Both are Equal so no one is Greatest");
        }
        else if(a>b){
            System.out.println(a);
        }
        else if(a<b){
            System.out.println(b);
        }
        else{
            System.out.println(" Enter Valid Numbers ");
        }
        
        return ;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a & b");
        int a = sc.nextInt();
        
        int b = sc.nextInt();
        
        retGreat(a,b);
      
      
    }
}
