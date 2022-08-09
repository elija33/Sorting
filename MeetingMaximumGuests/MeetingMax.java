package MeetingMaximumGuests;

import java.util.Arrays;

public class MeetingMax {
    public static int MeetingMax(int number[], int numbers[]){
        Arrays.sort(number);
        Arrays.sort(numbers);

        int i = 1, j = 0, resule = 1, curr = 1;
        while(i < number.length && j < number.length){
            if(number[i] < numbers[j]){
                curr++;
                i++;
            }
            else{
                curr--;
                j++;
            }
            resule = Math.max(curr, resule);
        }
        return resule;
    }
    public static void main(String[] args) {
        int number[] = {900, 600, 700};
        int numbers[] = {1000, 800, 730};
        System.out.println(MeetingMax(number, numbers));
    }
    
}
