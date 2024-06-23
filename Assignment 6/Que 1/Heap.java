public class Heap {
	private int SIZE;
	public Heap() {
		 SIZE = 0;
	}
	
	public void addHeap(int arr[]) {
		//1. increase the SIZE of heap
		SIZE++;
		//2. add value at first empty location(index)
		//arr[SIZE] = value;
		//3. adjust the position of newly added element with all its ancestors
		int ci = SIZE;
		int pi = ci / 2;
		while(pi >= 1) {
			//3.1 stop if child is less than parent
			if(arr[ci] > arr[pi])
				break;
			//3.2 swap parent and child if child is greater than parent
			int temp = arr[ci];
			arr[ci] = arr[pi];
			arr[pi] = temp;
			//3.3 update child and parent indices
			ci = pi;
			pi = ci / 2;
		}
	}
	
	public int deleteHeap(int arr[]) {
		//1. swap first and last element of heap
		int max = arr[1];
		arr[1] = arr[SIZE];
		arr[SIZE] = max;
		//3. decrease the size of heap 
		SIZE--;
		//4. adjust the position of root element upto leap nodes
		int pi = 1;
		int ci = pi * 2;
		while(ci <= SIZE) {
			//4.1 find index of maximum child
			if((ci + 1) <= SIZE && arr[ci + 1] < arr[ci])
				ci = ci + 1;
			//4.2 if parent is greater than max child
			if(arr[pi] < arr[ci])
				break;
			//4.3 swap parent and max child if parent is less than max child
			int temp = arr[ci];
			arr[ci] = arr[pi];
			arr[pi] = temp;
			//4.4 update child and parent indices
			pi = ci;
			ci = pi * 2;
		}
		
		// return maximum element (element to be deleted)
		return max;
	}
	
	public void heapSort(int arr[]) {
		//1. create heap
		for(int i = 1 ; i < arr.length ; i++)
			addHeap(arr);
		//2. delete heap
		for(int i = 1 ; i < arr.length ; i++)
			deleteHeap(arr);
	}
}
























