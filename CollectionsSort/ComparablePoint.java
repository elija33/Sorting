package CollectionsSort;

import java.io.*;
import java.util.*;

//A user-defined Point class implementing.
// Comparable interface.

class Point implements Comparable<Point>{
    int number;
    int numbers;

    public Point(int number, int numbers){
        this.number = number;
        this.numbers = numbers;
    }
    
    public int compareTo(Point P){
        return this.number - P.number;
    }
}

public class ComparablePoint{

    public static void main(String[] args) {

        // Create a list of Integers
        List<Point> list = new ArrayList<Point>();
        list.add(new Point(5, 10));
        list.add(new Point(2, 20));
        list.add(new Point(10, 30));
        list.add(new Point(5, 40));
        list.add(new Point(10, 10));

        Collections.sort(list);

        // Displaying the comparablePoint
        for(Point c: list)
            System.out.println(c.number + " " + c.numbers);
    }
}
