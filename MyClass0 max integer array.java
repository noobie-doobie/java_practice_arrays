import java.io.*;
import java.util.*;

public class MyClass0 {
    public static void main(String args[]) {
   
  Scanner scan= new Scanner(System.in);
  //int k=scan.nextInt();
  int m = scan.nextInt();
  int[] array=new int[m];
  int max =0;
  for(int i=0;i<array.length;i++){
      array[i]=scan.nextInt();
      if(max>array[i]){
          max=max;
      }
      else{
          max=array[i];
      }
       //System.out.println(array[i]);
    }
    // for(int i=0;i<array.length-1;i++){
    //     // if((array[i+1]>array[i]) && (max<array[i+1])){
    //     if(max<array[i+1]){
    //         max = array[i+1];
            
    //         // System.out.println(max);
    //       // System.out.println(array[i+1]);
    //     }
        
    //     else if(max<array[i] ){
    //         max=array[i];
    //       // System.out.println(max);
    //     }
    //     //System.out.println(max);
        
    // }
    System.out.println(max);
}
}