package UnionTwoSorted;

public class EfficientUnionTwo {
    public static void UnionTwoSorted(int number[], int numb[]){
        int i = 0;
        int j = 0;
        while(i<number.length && j<numb.length){
            if(i>0 && number[i-1] == number[i]){
                i++;
                continue;
            }
            if(j>0 && numb[j-1] == numb[j]){
                j++;
                continue;
            }
            if(number[i]<numb[j]){
                System.out.println(number[i]+ " ");
            }
            else if(number[i]>numb[j]){
                System.out.println(numb[j]+ " ");
                j++;
            }
            else{
                System.out.println(number[i]+ " ");
                i++;
                j++;
            }
            while(i<number.length){
                if(i==0 || number[i] != number[i - 1]){
                    System.out.println(number[i]+ " ");
                    i++;
                }
            }
            while(j<numb.length){
                if(j == 0 || numb[j] != numb[j - 1]){
                    System.out.println(numb[j]+ " ");
                }
            }
        }
    }
}
