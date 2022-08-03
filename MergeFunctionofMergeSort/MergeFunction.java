package MergeFunctionofMergeSort;

public class MergeFunction {
    public static int MergeFunctionSort(int number[]){
        int low = 0;
        int mid = number.length - 1/ 2;
        int high = number.length -1;
        int left[] = new int[mid - low + 1];
        int right[] = new int[high + mid];
        int i = 0;
        int j = 0;
        while(i < left.length-1 && j < right.length-1){
            if(left[i] <= right[j]){
                System.out.println(left[i++]+ " ");
            }
            else{
                System.out.println(right[j++]+ " ");
            }
        }
        while(i < left.length-1){
            System.out.println(left[i++]+" ");
        }
        while(j<right.length-1){
            System.out.println(right[j++]+" ");
        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
}
