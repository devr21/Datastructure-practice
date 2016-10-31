package arrays;

import java.io.FileNotFoundException;

public class MinJumpsToEnd extends ArrayPrinter{

	public MinJumpsToEnd() throws FileNotFoundException {
		super();
	}

	public static void main(String[] args) throws FileNotFoundException {
		new MinJumpsToEnd().start(); 
	}
	
	public void start(){
		sc.close();
		
		int[] jumps = new int[arr.length];
		int len = arr.length-1;
		jumps[arr.length-1] = 0;
		for(int i=arr.length-2;i>=0;i--){
			
			if(arr[i] == 0)
				jumps[i] = Integer.MAX_VALUE;
			else if(arr[i] >= len-i)
				jumps[i] = 1;
			else{
				
				int min =Integer.MAX_VALUE;
				 for (int j = i+1; (j < len+1) &&( j <= arr[i] + i); j++)
		            {
		                if (min > jumps[j])
		                    min = jumps[j];
		            } 
				
				 if(min != Integer.MAX_VALUE)
					 jumps[i] = min+1;
				 else
					 jumps[i] = min;
				 
			}
			
		}
		
		System.out.println(jumps[0]);
		
	}
	
}
