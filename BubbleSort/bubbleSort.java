package BubbleSort;

public class bubbleSort {
    public static void bubbleSort(int number[]){
        for(int i = 0; i<number.length - 1; i++){
            for(int j = 0; j<number.length - i -1; j++){
                if(number[j] > number[j + 1]){
                    
                    // swapping 
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int number[] = {2, 1, 4, 3};
        bubbleSort(number);
        for(int i = 0; i< 4; i++){
            System.out.println(number[i] + " ");
        }
    }    
}
