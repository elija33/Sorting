package BubbleSort;

public class EfficiBubbleSort {
    public static void bubbleSort(int number[]){
        boolean swapped;

        for(int i = 0; i<number.length; i++){
            swapped = false;
            for(int j = 0; j<number.length; j++){
                if(number[j] > number[j + 1]){

                    // swapping 
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j+1] = temp;

                    swapped = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5,6};
        int numbers[] = {2,4,1,3,5,0};
        for(int i = 0; i<4; i++){
            System.out.println(number[i] + " ");
        }
    }
}
