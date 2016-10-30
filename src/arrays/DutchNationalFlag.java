package arrays;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DutchNationalFlag extends ArrayPrinter{

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new FileInputStream(new File("input.txt")));
		
		int[] arr = new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++)
			arr[i] = sc.nextInt();
			
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
