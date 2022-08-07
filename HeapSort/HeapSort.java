package HeapSort;

public class HeapSort {
    public void buildheap(int number[]){
        for (int i = number.length / 2 - 1; i >= 0; i--) 
		    heapify(number, number.length, i);
    }
	
	public void sort(int number[]) 
	{ 
		//int number = number.length; 

		buildheap(number, number.length); 
 
		for (int i=number.length-1; i>0; i--) 
		{ 
			 
			int temp = number[0]; 
			number[0] = number[i]; 
			number[i] = temp; 

			heapify(number, i, 0); 
		} 
	} 

	public void heapify(int arr[], int n, int i) 
	{ 
		int largest = i;  
		int l = 2*i + 1; 
		int r = 2*i + 2; 

		if (l < n && arr[l] > arr[largest]) 
			largest = l; 
 
		if (r < n && arr[r] > arr[largest]) 
			largest = r; 

		if (largest != i) 
		{ 
			int swap = arr[i]; 
			arr[i] = arr[largest]; 
			arr[largest] = swap; 

			heapify(arr, n, largest); 
		} 
	} 

	public static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 
 
	public static void main(String args[]) 
	{ 
		int arr[] = {12, 11, 13, 5, 6, 7}; 
		int n = arr.length; 

		HeapSort ob = new HeapSort(); 
		ob.sort(arr); 

		System.out.println("Sorted array is"); 
		printArray(arr); 
	} 
}
