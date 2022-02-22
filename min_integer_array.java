import java.io.*;
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int [] array = new int[m];
        double min=Double.POSITIVE_INFINITY;
        for(int i=0; i<array.length; i++){
            array[i] = scan.nextInt();
            if (min>array[i]){
                min=array[i];
            }
            else{
                min=min;
            }
        }
        System.out.println(min);
    }
}