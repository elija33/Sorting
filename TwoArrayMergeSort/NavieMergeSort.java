package TwoArrayMergeSort;

import java.util.Arrays;

public class NavieMergeSort {
    public static int MergeSort(int firstarray[], int secondarray[]){

    // create a temp array and copy both firstarray and secondarray into the temp array
        int temp[] = new int[firstarray.length + secondarray.length];

        // for loop thought the firstarray
        for(int i = 0; i<firstarray.length - 1; i++){
            // coping the fistarray into temp
            temp[i] = firstarray[i];
            //for loop thought the second array
            for(int j = 0; j<secondarray.length; j++){
                // copy the secondarray in the temp array
                temp[firstarray.length + i] = secondarray[i];
                // sort the temparray out 
                Arrays.sort(temp);
                // loop thought the firstarray and secondarray
                for(int k = 0; k<(firstarray.length + secondarray.length); k++);{
                    System.out.println(temp[i]);
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
}

