package Sort3ArrayElement;

public class EfficiSort3Array {
    public static int Sort3ArrayElement(int number[]){

    // set a vauable to start the beginning of the arrays.
        int starting = 0; 

    // set a vauable to ending the last element of the arrays.
        int ending = number.length - 1; 
    
    // set a vauable to mid to  0, to get the middling of the arrays.
        int mid = 0;
        
    //compair the middling array element to the end element of the array.
        while(mid <= ending){

    // Using switch case, 
            switch(number[mid]){
                case 0:
                    int temp = number[starting];

                    number[starting] = number[mid];

                    number[mid] = temp;

                    starting++;
                    mid++;

                case 1:
                    temp = number[ending];
                    number[ending] = number[mid];
                    number[mid] = temp;

                    ending--;
                    break;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = new int[]{};
        Sort3ArrayElement(number);
        for(int num : number){
            System.out.println(num+ " ");
        }
    }
}
