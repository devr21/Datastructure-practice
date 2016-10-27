package arrays;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new FileInputStream(new File("input.txt")));
		
		int[] arr = new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++)
			arr[i] = sc.nextInt();
		int d = sc.nextInt();
		sc.close();
		
		printArray(leftRotate(arr,d,arr.length));
		
	}

	public static void printArray(int[] arr){
		for(int a:arr)
		System.out.print(a+" ");
	}
	
	public static int[] leftRotate(int[] arr,int d,int n){
		
		int i,j,k,temp;
		
		for(i=0;i<gcd(d,n);i++){
			temp = arr[i];
			
			j = i;
			while(true){
				k = j+d;
				if(k >= n)
					k = k-n;
				if(k == i)
					break;
				arr[j] = arr[k];
				j = k;	
			}
			arr[j] = temp;
			
		}
		
		return arr;
	}
	
	
	public static int gcd(int d,int n){
		if(n == 0)
			return d;
		else return gcd(n,d%n);
	}
}

