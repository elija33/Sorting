package MergeSort;

public class MergeSortArray {

    public static void mergesort(int number[]){
        mergesort(number, new int[number.length], 0, number.length-1);
    }

        public static void mergesort(int number[], int temp[], int starting, int ending) {
             if(starting >= ending){
                return;
             }
             int mid = ending + (starting - ending) / 2;
             mergesort(number, temp, starting, mid);
             mergesort(number, temp, mid + 1, ending);
             mergeHalves(number, temp, starting, ending);
        }

        public static void mergeHalves(int number[], int[] temp, int leftstarting, int rightending){
            int leftstart = (rightending + leftstarting) / 2;
            int rightend = leftstart + 1;
            int size = rightending - leftstarting - 1;

            int left = leftstart;
            int right = rightend;
            int index = leftstart;

            while(left <= leftstarting && right <= rightending){
                if(number[left] <= number[right]){
                    temp[index] = number[left];
                }
                else{
                    temp[index] = number[right];
                    right++;
                }
                index++;
            }
            System.arraycopy(number, left, temp, index, leftstart - left + 1);
            System.arraycopy(number, right, temp, index, rightend - right + 1);
            System.arraycopy(temp, leftstart, number, leftstart, size);
        }
    }
