package ArraySort;

import java.util.Arrays;

public class SubArraySort {
    public static void main(String[] args) 
    { 
        int[] arr = {2, 3, 45, 68, 20, 25, 40}; 

        // Sort subarray from index 1 to 3, i.e., 
        // only sort subarray {30, 20, 10} and 
        // keep other elements as it is. 
        Arrays.sort(arr, 2, 7); 

        System.out.println(Arrays.toString(arr)); 
    }
}
