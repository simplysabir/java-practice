//calculator

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        
        System.out.println("Enter Number a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        System.out.println("Enter Number b");
        int b = sc.nextInt();
        
        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;
        
        System.out.println("1 for Addition\n2 for Substraction\n3 for Multiplication\n4 for division\n5 for modulo\n");
        System.out.println("Enter Number Between 1 to 5");
        int calc = sc.nextInt();
        
        switch(calc){
            case 1: System.out.println(sum);
            break;
            case 2: System.out.println(sub);
            break;
            case 3: System.out.println(mul);
            break;
            case 4: System.out.println(div);
            break;
            case 5: System.out.println(mod);
            break;
            default : System.out.println("Enter Number Between 1 to 5 only");
        }
        
        

    }
}
