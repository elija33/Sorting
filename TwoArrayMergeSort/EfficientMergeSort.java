package TwoArrayMergeSort;

public class EfficientMergeSort {
    public static int MergeSort(int fistarray[], int secondarray[]){
        // create a valueable i and set up enqual to 0 from the fistarray
        int i = 0;

        // create a valueable i and set up enqual to 0 from the secondarray
        int j = 0;

    // while loop to chech if i is less than the fistarray element and j is less than the secondarray element
        while(i < fistarray.length -1 && j < secondarray.length - 1){

        //if the fistarray[i] is less than or equal to secondarray[j]
            if(fistarray[i] <= secondarray[j]){
            // start printing from the fistarray element 
                System.out.println(fistarray[i++]+ " ");
            }
            // if the secondarray[j] is less than or equal to fistarray[i]
            else{
                // stat printing from the secondarray element
                System.out.println(secondarray[j++] + " ");
            }
        }
    // after printing out all the element in the first and second array if there is a remainding in the fistarray print that out too.
        while(i < fistarray.length-1){
            System.out.println(fistarray[i++]+ " ");
        }

    // after printing out all the element in the first and second array if there is a remainding in the secondarray print that out too.
        while(j < secondarray.length - 1){
            System.out.println(secondarray[j++] + " ");
        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
}
