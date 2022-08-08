package MinimumDifferenceArray;

import java.util.Arrays;
import java.util.Scanner;

public class EfficiMiniDifferArray{
    public static int MinDiff(int number[]){
        Arrays.sort(number);

        int res = Integer.MAX_VALUE;
        for(int i = 1; i < number.length; i++){
            res = Math.min(res, number[i] - number[i - 1]);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int numbe =  num.nextInt();
        int number[] = new int[numbe];

        for(int i = 0; i < numbe; i++){
            number[i] = num.nextInt();
        }

        EfficiMiniDifferArray mini = new EfficiMiniDifferArray();
        System.out.println(mini.MinDiff(number));
    }
}