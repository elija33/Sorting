package Sort3ArrayElement;

public class Naviesort3Array {
    public static int Sort3Array(int number[]){
        // create temp array
        int temp[] = new int[number.length];
        int x = 0;

    // for loop that gos though the array 
        for(int i= 1; i < number.length; i++){

    // After going thought the array, look for 0's
            if(number[i] == 0){

        //if 0's is find, copy it into the temp array
                temp[i++] = number[i];
            }

        // for loop that gos though the array 
            for(int j = 1; j < number.length; j++){

        // After going thought the array, look for 1's
                if(number[j] == 1){

        //if 1's is find, copy it into the temp array
                    temp[i++] = number[j];
                }
            }

        // for loop that gos though the array 
            for(int k = 1; k < number.length; k++){

        // After going thought the array, look for 2's
                if(number[k] == 2){

            //if 2's is find, copy it into the temp array
                    temp[i++] = number[k];
                }
            }
            for(int n = 1; n < number.length; n++){
                number[n] = temp[n];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = new int[]{0,1,1,2,0,1,1,2};
        Sort3Array(number);
        for(int num : number){
            System.out.println(num+ " ");
        }
    }
}
