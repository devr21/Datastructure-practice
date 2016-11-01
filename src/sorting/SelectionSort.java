package sorting;

import java.io.FileNotFoundException;

import arrays.ArrayPrinter;

public class SelectionSort extends ArrayPrinter{

	public SelectionSort() throws FileNotFoundException {
		super();
	}

	public static void main(String[] args) throws FileNotFoundException {
		new SelectionSort().start();
	}
	
	public void start(){
		sc.close();
		
		for(int i=0;i<arr.length;i++){
			
			int minIdx=i ;
			
			for(int j=i;j<arr.length;j++){
				if(arr[j] < arr[minIdx])
					minIdx = j;
			}
			
			swap(i,minIdx);
		}
		
		printArray(arr);
		
	}
	
	public void swap(int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}
