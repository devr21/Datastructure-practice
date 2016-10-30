package arrays;

import java.io.FileNotFoundException;

public class MinLenUnsortedSubarray extends ArrayPrinter{

	public MinLenUnsortedSubarray() throws FileNotFoundException {
		super();
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		new MinLenUnsortedSubarray().start();
	}
	
	public void start(){
		sc.close();
		//printArray(arr);
		int si,li;
		int i=0;
		while(arr[i] < arr[i+1] && (i+1) < arr.length){
			i++;
		}
		si = i;
		//System.out.println(si);
		i=arr.length-1;
		while(arr[i] > arr[i-1] && (i-1) >= 0){
			i--;
		}
		li = i;
		//System.out.println(li);
		int max=arr[si],min = arr[si];
		for(i=si;i<=li;i++){
			max = max>arr[i]?max:arr[i];
			min = min<arr[i]?min:arr[i];
		}
		
		for(i=0;i<si;i++){
			if(arr[i] >= min){
				si = i;
				break;
			}
		}
		
		for(i=arr.length-1;i>li;i--)
			if(arr[i] < max){
				li = i;
				break;
			}
		
		System.out.println("si:"+si+" li:"+li);
		
	}
	
}
