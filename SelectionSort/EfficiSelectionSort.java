package SelectionSort;

public class EfficiSelectionSort {
    public static void SelectionSort(int number[]){
        for(int i = 0; i < number.length - 1; i++){
            int mid = i;
            for(int j = i + 1; j < number.length -1; j++){
                if(number[j] < number[mid]){
                    mid = j;
                }
            }

            int temp = number[i];
            number[i] = number[mid];
            number[mid] = temp;
        }
    }
    public static void main(String[] args) {
        int number[] = {2,1,4,3,5};
        SelectionSort(number);

        for(int i = 0; i<number.length; i++){
            System.out.println(number[i] + " ");
        }
    }
}
