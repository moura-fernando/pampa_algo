
public class MainSort {

	
	public static void main(String[] args) {
		System.out.println("#SORT RESULTS#");
		System.out.println();
		
		System.out.println("* Selection Sort *");
		int selection[] = {10,3,4,6,2,1,7,5,8,9};
		SelectionSort.selectionSort(selection);
		SortHelper.printArray(selection);
		System.out.println();
		
		System.out.println();
		System.out.println("* Insertion Sort *");
		int insertion[] = {1,7,4,6,2,10,3,5,9,8};
		InsertionSort.insertionSort(insertion);
		SortHelper.printArray(insertion);
		System.out.println();
		
		System.out.println();
		System.out.println("* Bubble Sort *");
		int bubble[] = {10,3,4,6,2,1,7,5,8,9};
		BubbleSort.bubbleSort(bubble);
		SortHelper.printArray(bubble);
		System.out.println();
		
	}
}
