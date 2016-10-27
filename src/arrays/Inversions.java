package arrays;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Inversions {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new FileInputStream(new File("input.txt")));
		
		int[] arr = new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++)
			arr[i] = sc.nextInt();
		
		sc.close();
		int[] temp = new int[arr.length];
		System.out.println(mergeSort(arr,temp,0,arr.length-1));
		
	}
	
	public static int mergeSort(int[] arr,int[] temp,int l,int h){
		
		int mid,invCount=0;
		
		if(l < h){
			mid = (l+h)/2;
			
			invCount = mergeSort(arr,temp,l,mid);
			invCount += mergeSort(arr,temp,mid+1,h);
			
			invCount += merge(arr,temp,l,mid+1,h);
		}
		return invCount;
	}
	
	public static int merge(int[] arr,int[] temp,int l,int mid,int h){
		int i,j,k;
		int count=0;
		
		i=l;
		j=mid;
		k=i;
		
		while((i<=mid-1) && (j <= h)){
			if(arr[i] <= arr[j]){
				temp[k++] = arr[i++];		
			}
			else{
				temp[k++] = arr[j++];
				count += (mid-i);
			}
		}
		
		while(i<=(mid-1)){
			temp[k++] = arr[i++];
		}
		while(j <= h){
			temp[k++] = arr[j++];
		}
		
		for(int u=l;u<=h;u++)
			arr[u] = temp[u];
		
		
		return count;
	}
	
}
