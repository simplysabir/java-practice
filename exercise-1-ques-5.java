//java exercise 1 question no. 5
//Take input age and display whether user is eligible for voting or not 

import java.util.*;
public class MyClass {
    public static void forVoting(int age){
        if(age>=18){
            System.out.println("Eligible For Voting");
        }
        else{
            System.out.println("Not Eligible For Voting");
        }
        return ;
        
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age : ");
        int age = sc.nextInt();
        
        forVoting(age);
        
      
      
    }
}
