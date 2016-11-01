package sorting;

import java.io.FileNotFoundException;

import arrays.ArrayPrinter;

public class InsertionSort extends ArrayPrinter{

	public InsertionSort() throws FileNotFoundException {
		super();
	}

	public static void main(String[] args) throws FileNotFoundException {
		new InsertionSort().start();
	}
	
	public void start(){
		
		for(int i=1;i<arr.length;i++){
			
			int key = arr[i];
			int j = i-1;
			
			while(j >= 0 && arr[j] > key){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
		printArray(arr);
		
	}
	
}
