package arrays;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SortedPivotedArray {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		Scanner sc = new Scanner(new FileInputStream(new File("input.txt")));
		int[] arr = new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++)
			arr[i] = sc.nextInt();
		int key = sc.nextInt();
		sc.close();
		
		System.out.println(search(arr,0,arr.length-1,key));
		
	}
	
	public static int search(int[] arr,int l,int h,int key){
		if(l > h)return -1;
		
		int mid = (l+h)/2;
		
		if(arr[mid] == key) return mid;
		
		if(arr[h] <= arr[mid]){
			if(key >= arr[l] && key <= arr[mid])
				return search(arr,l,mid-1,key);
			
			return search(arr,mid+1,h,key);
		}
			
		if(key >= arr[mid+1] && key <= arr[h] )
			return search(arr,mid+1,h,key);
		return search(arr,l,mid-1,key);
	}
	
}
