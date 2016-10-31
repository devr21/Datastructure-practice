package arrays;

import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Deque;

public class MaxSubarrayK extends ArrayPrinter{

	public MaxSubarrayK() throws FileNotFoundException {
		super();
	}

	public static void main(String[] args) throws FileNotFoundException {
		new MaxSubarrayK().start();
	}
	
	public void start(){
		int k = sc.nextInt();
		sc.close();
		printArray(arr);
		
		Deque<Integer> de = new ArrayDeque<Integer>();
		int i;
		for(i=0;i<k;i++){
			
			while(!de.isEmpty() && arr[i] >= arr[de.peekLast()])
				de.pollLast();
			
			de.addLast(i);
		}
		
		for(;i<arr.length;i++){
			
			System.out.print(arr[de.getFirst()]+" ");
			
			while(!de.isEmpty() && de.getFirst() <= i-k)
				de.removeFirst();
			while(!de.isEmpty() && arr[i] >= arr[de.peekLast()])
				de.pollLast();
			
			de.addLast(i);
		}
		
		System.out.println(arr[de.getFirst()]+" ");
		
	}
	
}
