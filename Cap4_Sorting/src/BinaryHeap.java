

public class BinaryHeap {
	int[] arr;
	int sizeOfTree;


	public BinaryHeap(int size) {
		arr = new int[size+1];
		this.sizeOfTree = 0;
	}


	public int sizeOfArray() {
		return arr.length;
	}


	public void deleteheap() {
		arr = null;
		System.out.println("Heap has been deleted !");
	}


	public void insertInHeap(int value) {
		arr[sizeOfTree+1] = value;
		sizeOfTree++;
		HeapifyBottomToTop(sizeOfTree);
	}


	public int extractHeadOfHeap() {
		if(sizeOfTree == 0) {
			return -1;
		}else {
			int extractedValue = arr[1];
			arr[1] = arr[sizeOfTree];
			sizeOfTree--;
			HeapifyTopToBottom(1);
			return extractedValue;
		}
	}

	public void HeapifyBottomToTop(int index) {
		int parent = index / 2;
		if (index <= 1) {
			return;
		}
		if (arr[index] < arr[parent]) {
			int tmp = arr[index];
			arr[index] = arr[parent];
			arr[parent] = tmp;
		}
		HeapifyBottomToTop(parent);
	}

	
	public void HeapifyTopToBottom(int index) {
		int left  = index*2;
		int right = (index*2)+1;
		int smallestChild = 0;

		if (sizeOfTree < left) { 			
			return;
		}else if (sizeOfTree == left) { 			
			if(arr[index] > arr[left]) {
				int tmp = arr[index];
				arr[index] = arr[left];
				arr[left] = tmp;
			}
			return;
		}else { 
			if(arr[left] < arr[right]) { 
				smallestChild = left;
			}else {
				smallestChild = right;
			}
			if(arr[index] > arr[smallestChild]) { 
				int tmp = arr[index];
				arr[index] = arr[smallestChild];
				arr[smallestChild] = tmp;
			}
		}
		HeapifyTopToBottom(smallestChild);
	}





}
