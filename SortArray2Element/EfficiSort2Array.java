package SortArray2Element;

public class EfficiSort2Array {
    public static void sort(int number[]){
        int i=-1,j=number.length;
        while(true)
        {
            do{
                i++;
            }
            while(number[i]<0);
            do{
                j--;
            }
            while(number[j]>=0);
            if(i>=j)return;
            
            //swapping arr[i] & arr[j]
            int temp = number[i];
            number[i] = number[j];
            number[j]=temp;
            
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
