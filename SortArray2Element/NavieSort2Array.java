package SortArray2Element;

public class NavieSort2Array {

    public static void sort(int number[]){
        int temp[] = new int[number.length];
        int sum = 0;

        for(int j = 0; j < number.length; j++){
            if(number[j] < 0){
                temp[sum++] = number[j];
                for(int k = 0; k < number.length; k++){
                    if(number[k] >= 0){
                        temp[sum++] = number[k];
                        for(int i = 0; i < number.length; i++){
                            number[i] = temp[i];
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int number[] = new int[]{13,-12,18,-10};
        sort(number);
        for(int num : number){
            System.out.println(num+ " ");
        }
    }
}
