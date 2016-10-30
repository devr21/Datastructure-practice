package arrays;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MaxDiffLargestSmallest {

	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new FileInputStream(new File("input.txt")));
		
		int[] arr = new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++)
			arr[i] = sc.nextInt();
		
		sc.close();
		
		int maxd = 0;
		int s = arr[0];
		
		for(int i=0;i<arr.length;i++){
			if(arr[i] > s){
				int temp = arr[i] - s;
				maxd = maxd>temp?maxd:temp;
				
			}
			else
				s = arr[i];
		}	
		System.out.println(maxd);
	}
	
}
