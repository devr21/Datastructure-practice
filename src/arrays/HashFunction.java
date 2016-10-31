package arrays;

import java.util.Arrays;

public class HashFunction {

	String[] arr;
	int size;
	int itemsInArray = 0;
	
	public static void main(String[] args) {
		HashFunction func = new HashFunction(30);
		/*String[] el = {"1","5","17","21","26"};
		func.hashFunction(el, func.arr);*/
		
		String[] el = {"100","510","170","214","268","398","235",
				"802","900","723","699","1","999","890","725","998","978","988","990","984",
				"320","321","400","450","50","660","624"};
		
		func.hashFunction2(el, func.arr);
		
		func.printArray();
	}
	
	public void printArray(){
		for(String a:arr)
			System.out.print(a+" ");
		System.out.println();
	}
	
	public void hashFunction2(String[] strings,String[] array){
		for(int n=0;n<strings.length;n++){
			
			String newVal = strings[n];
			int arrayIndex = Integer.parseInt(newVal)%29;
			
			System.out.println("Modulus index= "+arrayIndex+ " for Value "+newVal);
			
			while(array[arrayIndex] != "-1"){
				++arrayIndex;
				System.out.println("Collision try "+arrayIndex+" instead");
				arrayIndex %= size;
			}
			
			array[arrayIndex] = newVal;
		}
	}
	
	public void hashFunction(String[] strings,String[] array){
		
		
		for(int n=0;n<strings.length;n++){
			String newElVal = strings[n];
			array[Integer.parseInt(newElVal)] = newElVal;
		}
		
	}
	
	HashFunction(int size){
		this.size = size;
		arr = new String[size];
		Arrays.fill(arr, "-1");
	}
	
}
