package CountInversionsArray;

public class NavieCountInersionsArray {
    public static int InersionsArray(int number[]){
        int check = 0;
        for(int i =0; i<number.length-1; i++){
            for(int j = i + 1; j<number.length-1; j++){
                if(number[i] > number[j]){
                    check++;
                }
            }
            
        }
        return check;
    }
    public static void main(String[] args) {
        int number[] = {2,4,1,3,5};
        System.out.println(InersionsArray(number));
    }
}
