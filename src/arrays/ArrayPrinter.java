package arrays;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayPrinter {

	protected  Scanner sc ;
	protected  int arr[];
	public ArrayPrinter() throws FileNotFoundException{
		sc = new Scanner(new FileInputStream(new File("input.txt")));
		arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	protected  Scanner getScanner(){
		return sc;
	}
	protected  void printArray(int[] arr){
		
		for(int a:arr)
			System.out.print(a+" ");
		System.out.println();
	}
	
}
