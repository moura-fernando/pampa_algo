
public class InsertionSort {
	
	/**
	 * Compara o próximo com os elementos ja visitados e ordenados e insere o mesmo 
	 * na ordem certa. Repetindo a operação até o final do array
	 * 
	 * @return array ordenado
	 */
	public static void insertionSort(int[] a) {
		
		for (int i = 1; i < a.length; i++) {
			int buffer = a[i];
			int j = i;
			while ( j > 0 && a[j-1] > buffer ) {
				a[j] = a[j-1];
				j--;
			}
			a[j] = buffer;
		}
	}
}
