import java.io.*;
import java.util.*;

public class MyClass {
    public static void main(String args[]) {
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();
     int count=0;
     
    
     int[] array = new int [n];
     for(int i=0;i<array.length;i++){
         array [i] = scan.nextInt();
     }
          
          for (int i=1;i<array.length;i++){
               if (array[i-1]==array[i]) {
                  count = count+1;
                  
               } 
             // System.out.println(count);
               }
                System.out.println(count);
    }
}

     
     
        
        
        
        
    
