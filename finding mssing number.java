import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    
    int exp_sum=(N*(N+1)/2);
    int orig_sum=0;
    
    int [] array = new int [N];
     for (int i = 0; i <array.length-1; i++){
         array[i] = scan.nextInt();
        orig_sum = orig_sum + array[i];
        System.out.println(orig_sum);
     }
      System.out.println(exp_sum-orig_sum);
    }
}