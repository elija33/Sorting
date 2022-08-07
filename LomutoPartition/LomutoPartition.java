package LomutoPartition;

public class LomutoPartition {
    static int iPartition(int number[], int starting, int ending)
    {   
        int pivot=number[ending];
        int i=starting-1;
        for(int j=starting;j<=ending-1;j++){
            if(number[j]<pivot){
                i++;
                int temp=number[i];
                number[i]=number[j];
                number[j]=temp;
            }
        }
        int temp=number[i+1];
        number[i+1]=number[ending];
        number[ending]=temp;
        return i+1;
    }
    public static void main (String[] args) 
    {
        int number[] = new int[]{10,80,30,90,40,50,70};
        
        //int n = arr.length;
        iPartition(number,0,number.length-1);
        
	    for(int num: number)
	        System.out.print(num+" ");
        
    }
}
