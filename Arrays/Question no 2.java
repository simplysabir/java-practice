// Finding the Max & Min Number in an array of Integer
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        System.out.println("How Many Numbers You Want to Enter");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];
        
        System.out.println("Enter Numbers :");
        for(int i=0;i<size;i++){
            num[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<size;i++){
            if(num[i] < min){
                min = num[i];
            }
            if(num[i] > max){
                max = num[i];
            }
            
            
        }
        System.out.println("Max number is " + max);
        System.out.println("Min number is " + min);
        
        
    }
}
