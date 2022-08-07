package HoarePartition;

public class HoarePartition {
    public static int partition(int number[], int starting, int ending)
    {   
        int pivot = number[starting];
        int i = starting-1, j = ending + 1;
        while(true){
            do{
                i++;
            }while(number[i]<pivot);
            do{
                j--;
            }while(number[j]>pivot);
            if(i >= j)return j;
            int temp = number[i];
            number[i] = number[j];
            number[j] = temp;
        }
    }
    
    static void qSort(int arr[],int starting, int ending){
        if(starting < ending){
            int p=partition(arr, starting, ending);
            qSort(arr, starting, p);
            qSort(arr,p+1, ending);
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{8,4,7,9,3,10,5};
        
        int n = arr.length;
        qSort(arr,0,n-1);
        
	    for(int x: arr)
	        System.out.print(x+" ");
    }
}
