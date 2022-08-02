package CollectionsSort;

import java.util.*;

public class collectionsort {
    public static void main(String[] args) {

        // Create a list of strings
        List<Integer> numbner = new ArrayList<Integer>();
        numbner.add(10);
        numbner.add(8);
        numbner.add(5);
        numbner.add(2);
        numbner.add(8);
        numbner.add(3);
        numbner.add(7);
        numbner.add(6);
        numbner.add(1);
        numbner.add(9);

        //The list is sorted in the natural order
        Collections.sort(numbner);

        // Print out the sorted list
        System.out.println(numbner);

        //Sorting the list in reverse order
        Collections.sort(numbner, Collections.reverseOrder());

        //Print out the reverse order list.
        System.out.println(numbner);
    }
}
