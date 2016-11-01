package sorting;

public class MinHeap{

	int[] arr;
	int capacity;
	int heapSize;
	
	public MinHeap(int capacity){
		this.capacity = capacity;
		arr = new int[capacity];
		heapSize = 0;
	}
	
	public static void main(String[] args) {
		MinHeap h = new MinHeap(20);
		h.insertKey(3);
	    h.insertKey(2);
	    h.deleteKey(1);
	    h.insertKey(15);
	    h.insertKey(5);
	    h.insertKey(4);
	    h.insertKey(45);
	    
	    h.printArray(h.arr);
	    System.out.println(h.extractMin());
	    h.printArray(h.arr);
	    System.out.println(h.getMin());
	    h.decreaseKey(2, 1);
	    h.printArray(h.arr);
	    System.out.println(h.getMin());
	    h.printArray(h.arr);
	    
	}
	
	public int getMin(){return arr[0];}

	public void printArray(int[] arr){
		for(int i=0;i<heapSize;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	public int parent(int i){
		return (i-1)/2;
	}
	
	public int left(int i){
		return 2*i+1;
	}
	
	public int right(int i){
		return 2*i+2;
	}
	
	public void insertKey(int a){
		
		heapSize++;
		int i = heapSize-1;
		arr[i] = a;
		
		while(i != 0 && arr[parent(i)] > arr[i]){
			swap(i,parent(i));
			i = parent(i);
		}
	}
	
	public void deleteKey(int i){
		decreaseKey(i,Integer.MIN_VALUE);
		extractMin();
	}

	private int extractMin() {
		if(heapSize == 0)
			return Integer.MIN_VALUE;
		else if(heapSize == 1){
			heapSize--;
			return arr[0];
		}
		
		int root = arr[0];
		arr[0] = arr[--heapSize];
		heapify(0);
		
		return root;
	}

	private void heapify(int i) {
		int l = left(i);
		int r = right(i);
		int smallest = i;
		
		if(l < heapSize && arr[l] < arr[smallest])
			smallest = l;
		if(r < heapSize && arr[r] < arr[smallest])
			smallest = r;
		if(i != smallest){
			swap(smallest,i);
			heapify(smallest);
		}
	}

	private void decreaseKey(int i, int value) {
		arr[i] = value;
		
		while(i != 0 && arr[parent(i)] > arr[i]){
			swap(i,parent(i));
			i = parent(i);
		}
	}

	private void swap(int i, int parent) {
		int temp = arr[i];
		arr[i] = arr[parent];
		arr[parent] = temp;
	}
	
}
