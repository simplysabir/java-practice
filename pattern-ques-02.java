//pattern question no 2

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      int i = 1;
      int j = 1;
      int n = 4;
      int m = 5;
      
      for(i=1;i<=n;i++){
          for(j=1;j<=m;j++){
              //(i,j)
              if(i==1 || j==1 || i==n || j==m){
                  System.out.print("*")
              }else{
                  System.out.print(" "); //for giving space otherwise gap will not be formed
              }
          }
          System.out.println();
      }
      
      
      
      
    }
}
