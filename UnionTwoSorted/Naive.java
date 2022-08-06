package UnionTwoSorted;

import java.util.Arrays;

public class Naive {
    public static void Union(int number[], int numbers[]){

    //ceater a temp array and add both the number array and the numbers array into the temp array
        int temp[] = new int[number.length-1 + numbers.length-1];

    // for loop that gos thought the number array
        for(int i = 0; i<number.length -1; i++){

            //copy the number array into the temp array
            temp[i] = number[i];

            //for loop tha gos thought numbers array 
            for(int j= 0; j<numbers.length-1; j++){

            // copy numbers array into the temp beining from the number array.
                temp[number.length-1 + i] = numbers[i];

            // sorting the temp array.
                Arrays.sort(temp);
            }
        // for loop to go thought both number and numbers 
            for(int k= 0; i<number.length+ numbers.length; k++){
            
            //checking if their is not duplcas
                if(k==0 || temp[k] != temp[k-1]){
                    System.out.println(temp[k]+ " ");
                }
            }
        }
    }
}
