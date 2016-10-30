package arrays;

import java.io.FileNotFoundException;
import java.util.Stack;

public class NextGreaterElement extends ArrayPrinter{

	public NextGreaterElement() throws FileNotFoundException {
		super();
	}

	public static void main(String[] args) throws FileNotFoundException {
		new NextGreaterElement().start();
	}
	
	public void start(){
		sc.close();
		//printArray(arr);
		
		Stack<Integer> st = new Stack<>();
		
		for(int a:arr){
			if(st.isEmpty())
				st.push(a);
			else if(st.peek() < a){
				System.out.print(a+" ");
				st.pop();
				st.push(a);
			}
			else
				st.push(a);
		}
		
		while(!st.isEmpty()){
			System.out.print("-1 ");
			st.pop();
		}
	}
	
}
