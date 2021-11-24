// taking name input and printing it on screen 
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        System.out.println("How Many Names You Want to Enter");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String names[] = new String[size];
        
        System.out.println("Enter Names :");
        for(int i=0;i<size;i++){
            names[i] = sc.next();
        }
        
        System.out.println("Names are :");
        for(int j=0;j<size;j++){
            System.out.println(names[j]);
        }
        
    }
}
