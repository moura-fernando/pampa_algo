public class SelectionSort {
	
	/**
	 * Percorre o array para buscar o menor elemento e ao encontra-lo troca com
	 * o primeiro elemento do array (se nao for ele mesmo).
	 * Repete-se a operação até o último elemento do array.
	 * 
	 * @return Array ordenado
	 */
	public static void selectionSort(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			int miniIndex = i;
			for (int j = i+1; j < a.length; j++) {
				if (a[j] < a[miniIndex]) {
					miniIndex = j;
				}
			}
			if (miniIndex != i) {
				int buffer = a[i];
				a[i] = a[miniIndex];
				a[miniIndex] = buffer;
			}
		}
	}
   
}
