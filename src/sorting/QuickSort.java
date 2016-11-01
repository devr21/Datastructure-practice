package sorting;

import java.io.FileNotFoundException;

import arrays.ArrayPrinter;

public class QuickSort extends ArrayPrinter{

	public QuickSort() throws FileNotFoundException {
		super();
	}

	public static void main(String[] args) throws FileNotFoundException {
		new QuickSort().start();
	}
	
	public void start(){
		sort(arr,0,arr.length-1);
		printArray(arr);
	}

	private void sort(int[] arr, int l, int r) {
		if(l < r){
			
			int pi = partition(arr,l,r);
			sort(arr,l,pi-1);
			sort(arr,pi+1,r);
		}
	}
	
	public void swap(int l, int r){
		int temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
	}
	public int partition(int[] arr,int l,int r){
		
		int pivot = arr[r];
		int i = l;
		
		for(int j=l;j<=r-1;j++){
			
			if(arr[j] <= pivot){
				
				swap(i,j);
				i++;
			}
			
		}
		swap(i,r);
		
		return i;
	}
	
}
