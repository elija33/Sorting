package ChocolateDistribProblem;

import java.util.Arrays;

public class ChocolateDisPro {
    public static int mindiff(int number[], int m){
        if(m > number.length){
            return -1;
        }
        Arrays.sort(number);
        int sumer = number[m - 1] - number[0];
        for(int i = 0; (i + m - 1) < number.length; i++){
            sumer = Math.min(sumer, number[i + m - 1] - number[i]);
                return sumer;
            }
            return 1;
        }
    public static void main(String[] args) {
        int number[] = new int[]{7,3,2,4,9,12,56};
        int m = 3;
        System.out.println(mindiff(number, m));
    }
}
