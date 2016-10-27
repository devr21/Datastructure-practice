package arrays;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PairSum {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new FileInputStream(new File("input.txt")));
		int []arr = new int[sc.nextInt()];
		arr[0] = sc.nextInt();
		int max = arr[0];
		for(int i=1;i<arr.length;i++){
			arr[i] = sc.nextInt();
			max = max<arr[i]?arr[i]:max;
		}
		
		int sum = sc.nextInt();
		boolean[] binmap = new boolean[max+1]; // works for positive numbers, for negative use map<int,boolean>
		
		for(int a:arr){
			int temp = sum - a;
			if(temp >= 0 && binmap[temp] == true){
				System.out.println("Found the pair "+a+" & "+temp);
				break;
			}
			binmap[a] = true;
		}
		
	}
	
}
