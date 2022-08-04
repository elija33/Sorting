package Intersection;

public class EfficientIntersection {
    public static void EfficiIntersection(int number[], int num[]){

    // ceater a value i and set up to 0
        int i = 0;

    // ceater a value j and set up to 0
        int j = 0;

    // while loop to compair number and num 
        while(i<number.length-1 && j<num.length-1){
            if(i>0 && number[i-1] == number[i]){
                i++;
                continue;
            }
            if(number[i]<num[j]){
                i++;
            }
            else if(number[i]>num[j]){
                j++;
            }
            else{
                System.out.println(number[i]+ " ");
                i++; j++;
            }
        }
    }
    public static void main(String[] args) {
        int number[] = {3,5,10,10,10,15,15,20};
        int num[] = {5,10,10,15,30};

        EfficiIntersection(number, num);
    }
}
