package BucketSort;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class BucketSort {
    public static void bucketSort(int number[], int n, int k) { 
        
        int max_val= number[0];
        for(int i=1;i<n;i++)
            max_val=Math.max(max_val,number[i]); 
        max_val++;
        
        @SuppressWarnings("unchecked") 
        Vector<Integer>[] buckets = new Vector[n]; 
  
        for (int i = 0; i < n; i++) { 
            buckets[i] = new Vector<Integer>(); 
        } 
   
        for (int i = 0; i < n; i++) { 
            int idx = (number[i] * k)/max_val; 
            buckets[(int)idx].add(number[i]); 
        } 
  
        for (int i = 0; i < k; i++) { 
            Collections.sort(buckets[i]); 
        } 
  
        int index = 0; 
        for (int i = 0; i < k; i++) { 
            for (int j = 0; j < buckets[i].size(); j++) { 
                number[index++] = buckets[i].get(j); 
            } 
        } 
    }
    public static void main (String[] args) 
    {
        int number[] = { 30,40,10,80,5,12,70 };
        int num = number.length; int k=4;
        bucketSort(number, num, k); 
   
        for (int i = 0; i < num; i++) 
            System.out.print(number[i] + " ");
        
    }
}
