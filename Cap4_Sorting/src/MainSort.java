
public class MainSort {

	
	public static void main(String[] args) {
		System.out.println("#SORT RESULTS#");
		System.out.println();
		
		System.out.println("* Merge Sort *");
		int array[] = {10,3,4,6,2,1,7,5,8,9};
		MergeSort.mergeSort(array, 0, array.length-1);
		MergeSort.printArray(array);
		System.out.println();
		
		System.out.println();
		System.out.println("* Quick Sort *");
		int array2[] = {1,7,4,6,2,10,3,5,9,8};
		QuickSort.quickSort(array2, 0, array2.length -1);
		QuickSort.printArray(array2);
		System.out.println();
		
		System.out.println();
		System.out.println("* Heap Sort *");
		int array3[] = {10,3,4,6,2,1,7,5,8,9};
		HeapSort hs = new HeapSort(array3);
		hs.sort();
		hs.printArray();
		System.out.println();
		
	}
}
