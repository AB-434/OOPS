package OOPS;
import java.util.*;
public class Array {
    public static void main(String[] args) {
         //mismatch()
         int arr1[]={1,3,5,7,9};
         int arr2[]={1,3,5,8,9};
         int index=Arrays.mismatch(arr1,arr2);
         System.out.println(index);
         //equals()
        //boolean result=Array.equals(arr1,0,3,arr2,0,3);
        //System.out.println(result);
        System.out.println(Arrays.compare(arr1,arr2));
    }
}
