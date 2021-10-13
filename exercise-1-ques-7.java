//java exercise 1 question 7
//have to change some thing.  it is taking number one by one but we want user to enter all Number First 
import java.util.*;
public class MyClass {
    public static void find(int a){
        int j = 0;
        int k = 0;
        int l = 0;
        if(a==0){
            j++;
        }
        else if(a%2==-1){
            l++;
        }
        else{
            k++;
        }
        
        System.out.println("Total Number of Zeros are\n" + j);
                System.out.println("Total Number of Positive  are\n" + k);
                        System.out.println("Total Number of Negatives are\n" + l);


        return ;
    }
    public static void main(String args[]) {
        
      Scanner sc = new Scanner(System.in);
      System.out.println("How Many Number You Want to Enter ");
      int n = sc.nextInt();
      
      System.out.println("Start Entering Number");
      for(int i=1;i<=n;i++){
          
      int a = sc.nextInt();
      find(a);
    }
    
    } 
}
