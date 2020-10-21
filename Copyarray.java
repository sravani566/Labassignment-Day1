
import java.io.*;
import java.util.*;
public class Copyarray {

	
   public static void main(String[] args) {

 
      boolean[] arr = new boolean[] {true, false};

     
      System.out.println("Printing 1st array:");
      for (int i = 0; i < arr.length; i++) {
         System.out.println(arr[i]);  
      }

      
      boolean[] arr1 = Arrays.copyOf(arr, 4);
      arr1[2] = false;
      arr1[3] = true;

      
      System.out.println("Printing the new array:");
      for (int i = 0; i < arr1.length; i++) {
         System.out.println(arr1[i]);
      }
   }
}


