package arrays;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DutchNationalFlag extends ArrayPrinter{

	public DutchNationalFlag() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws FileNotFoundException {
		new DutchNationalFlag().start();
	}

	public void start(){
		sc.close();
		
		int lo = 0,mid = 0,hi=arr.length-1 ;		
		
		while(mid <= hi){
			if(arr[mid] == 0){
				swap(arr,mid,lo);
				mid++;
				lo++;
			}	
			else if(arr[mid] == 1)
				mid++;
			else if(arr[mid] == 2){
				swap(arr,mid,hi);
				hi--;
				
			}
			
		}
		
		printArray(arr);
	}
	
	public static void swap(int[] arr,int a,int b){
		
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}
	
}
