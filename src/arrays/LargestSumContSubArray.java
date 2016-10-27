package arrays;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LargestSumContSubArray {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new FileInputStream(new File("input.txt")));
		int []arr = new int[sc.nextInt()];
		
		for(int i=1;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		
		int max_here = 0;
		int max_so_far = 0;
		
		for(int a:arr){
			max_here += a;
			if(max_here < 0)
				max_here = 0;
			else if(max_here > max_so_far)
				max_so_far = max_here;
		}
		
		System.out.println(max_so_far);
		
	}
	
}
