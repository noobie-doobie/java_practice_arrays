import java.util.*;
import java.io.*;

public class MyClass {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      int n =scan.nextInt();
      int max_int_value=0;
      int min_int_of_array=0;
      int[] array= new int[n];
      for(int i=0;i<array.length;i++){
          array[i]=scan.nextInt();
      }
      
      for(int i=0;i<array.length;i++){
          if(max_int_value>array[i]){
              int max_int_vale=max_int_value;
           }
          else {
              max_int_value=array[i];
              }
               if(min_int_of_array<array[i]){
                min_int_of_array=min_int_of_array;
            }
            else{
                min_int_of_array=array[i];
            }
        }
        System.out.println(min_int_of_array);
        System.out.println(max_int_value);
      
    }
}