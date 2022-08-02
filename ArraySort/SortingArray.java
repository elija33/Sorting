package ArraySort;

import java.util.Arrays;

public class SortingArray{
    public static void main(String[] args) {

        // set up the array number to integer
        int number[] = {4,5,6,8,1,10,20,0,11,12,11,2};

        //Set Up the array of char
        char word[] = {'A','b','d','r','T','W','c','f','a'};

        // Sorting the first array with name number
        Arrays.sort(number);

        //Printing out the first array which is numbers
        System.out.println(Arrays.toString(number));

        System.out.println();

        // Sorting the second array which is chart
        Arrays.sort(word);

        //Printing out the second array.
        System.out.println(Arrays.toString(word));
    }
}