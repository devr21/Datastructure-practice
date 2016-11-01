package sorting;

import java.io.FileNotFoundException;

import arrays.ArrayPrinter;

public class MergeSort extends ArrayPrinter{

	public MergeSort() throws FileNotFoundException {
		super();
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		new MergeSort().start();
	}
	
	public void start(){
		
		sort(arr,0,arr.length-1);
		printArray(arr);
	}
	
	public void sort(int[] arr,int l,int r){
		
		if(l<r){
			
			int m = (l+r)/2;
			sort(arr,l,m);
			sort(arr,m+1,r);
			merge(arr,l,m,r);
			
		}
		
	}
	
	public void merge(int[] arr,int l,int m,int r){
		int n1 = m-l+1;
		int n2 = r-m;
		
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		for(int i=0;i<n1;i++)
			left[i] = arr[l+i];
		for(int i=0;i<n2;i++)
			right[i] = arr[m+1+i];
		
		int i=0,j=0;
		int k=l;
		while(i < n1 && j < n2){
			if(left[i] <= right[j])
				arr[k] = left[i++];
			else
				arr[k] = right[j++];
			k++;
		}
		
		while(i<n1)
			arr[k++] = left[i++];
		while(j < n2)
			arr[k++] = right[j++];
		
	}
	
}
