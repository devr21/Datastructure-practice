package arrays;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Median2SortedArray {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new FileInputStream(new File("input.txt")));
		int[] arr1 = new int[sc.nextInt()];
		int[] arr2 = new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++)
			arr1[i] = sc.nextInt();
		
		for(int i=0;i<arr2.length;i++)
			arr2[i] = sc.nextInt();
		
		sc.close();
		
		System.out.println(median(arr1,arr2,arr1.length));
		
	}
	
	public static int median(int[] arr1,int[] arr2,int n){
		
		if(n == 0) return -1;
		
		if(n == 1) return (arr1[0]+arr2[0])/2;
		
		if(n == 2) return (Math.max(arr1[0],arr2[0])+Math.min(arr1[1], arr2[1]))/2;
		
		int m1 = median(arr1,n);
		int m2 = median(arr2,n);
		
		
		
		return 0;
	}
	
	public static int median(int[] arr1,int n){
		
		if(n%2 == 0)
			return (arr1[n/2]+arr1[n/2-1])/2;
		else
			return arr1[n/2];
	}
}
