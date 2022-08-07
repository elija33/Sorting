package CountingSort;

public class EfficientCountSort {
    public static void countSort(int number[], int num, int k) 
    { 
        int[] count = new int[k];
        for(int i=0; i<k; i++)
            count[i] = 0;
        for(int i=0; i < num; i++)
            count[number[i]]++;
            
        for(int i = 1; i < k; i++)
        count[i] = count[i-1] + count[i];
    
        int[] output=new int[num];
        for(int i = num - 1; i >= 0; i--){
            output[count[number[i]] - 1] = number[i];
            count[number[i]]--;
        }
        for(int i = 0; i < num; i++)
            number[i]=output[i];
    }

    public static void main(String[] args) {
        int number[] = {};
        int num = number.length; 
        int k = 5;
        countSort(number, num, k);
    }
}
