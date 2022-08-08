package MinimumDifferenceArray;

import java.util.Scanner;

public class NavieMinimumDiffArray {
    int getMinDiff(int number[]){
        int res = Integer.MAX_VALUE;
        for(int i = 1; i < number.length; i++){
            for(int j = 0;j < i;j++){
                res = Math.min(res, Math.abs(number[i] - number[j]));
            }
        }
        return res;
    }
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int number[] = new int[n];
		
		for(int i = 0; i < n; i++)
		number[i] = sc.nextInt();
		
		NavieMinimumDiffArray gfg = new NavieMinimumDiffArray();
		System.out.println(gfg.getMinDiff(number));
	}
}
