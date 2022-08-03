package InsertionSort;

public class NavieInsertionSort {
    public static int InsertionSort(int number[]){
        for(int i = 1; i<number.length; i++){
            int num = number[i];
            int numbs = i - 1;
            while(numbs >= 0 && number[j] > num){
                number[numbs + 1] = number[numbs];
                numbs--;
            }
            number[numbs+1] = num;
        }
    }
    public static void main(String[] args) {
        
    }
}
