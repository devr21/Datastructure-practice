package arrays;

import java.io.FileNotFoundException;

public class MaxLenBitonicArray extends ArrayPrinter{

	public MaxLenBitonicArray() throws FileNotFoundException {
		super();
	}

	public static void main(String[] args) throws FileNotFoundException {
		new MaxLenBitonicArray().start();
	}
	
	public void start(){
		
		sc.close();
		
		int[] inc = new int[arr.length];
		int[] dec = new int[arr.length];
		inc[0] = 1;
		for(int i=1;i<arr.length;i++){
			
			if (arr[i] >= arr[i-1]) 
				inc[i] = inc[i-1]+1;
			else
				inc[i] = 1;
			
		}
		dec[arr.length-1] = 1;
		for(int i=arr.length-2;i>=0;i--)
			if(arr[i] >= arr[i+1])
				dec[i] = dec[i+1]+1;
			else
				dec[i] = 1;
		//printArray(arr);
		printArray(inc);
		printArray(dec);
		int maxLen = inc[0]+dec[0]-1;
		for(int i=1;i<arr.length;i++)
			maxLen = maxLen>(inc[i]+dec[i]-1)?maxLen:(inc[i]+dec[i]-1);
			
			System.out.println(maxLen);
		
	}
	
}
