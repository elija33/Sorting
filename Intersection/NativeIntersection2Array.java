package Intersection;

public class NativeIntersection2Array {
    public static void Intersection(int number[], int num[]){
        for(int i = 0; i<number.length-1; i++){
            if(i > 0 && number[i] == number[i-1])
                continue;
                for(int j= 0; j < num.length - 1; j++)
                    if(number[i] == num[j]){
                        System.out.println(number[i]+" ");
                        break;
                }
            }
        }
    public static void main(String[] args) {
        int number[] = {3,5,10,10,10,15,15,20};
        int num[] = {5,10,10,15,30};

        int newnumber = number.length;
        int newnum = num.length;
        Intersection(number, num);
    }
}
