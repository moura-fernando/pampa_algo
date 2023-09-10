
public class BubbleSort {
	
	/**
	 * Compara pares de elementos do inicio ao fim do array sempre
	 * fazendo o swap caso os elementos estejam desordenados.
	 * 
	 * Percorre até o final do array realizando sempre a mesma operação.
	 * 
	 * Ao termino, se recomeça a comparação par a par, até alcançar a penultima 
	 * posição do array e assim por diante. Até o último loop onde iremos comparar
	 * apenas a posição 0 com a posiçao 1 do array. 
	 * 
	 * @return array ordenado
	 */
	public static void bubbleSort(int[] a) {
		int size = a.length;
		for (int i = 0; i < size-1; i++) {	
			for (int j = 0; j < size-i-1; j++) {
				if (a[j] > a[j+1]) {
				    int buffer = a[j];
					a[j]= a[j+1];
					a[j+1]= buffer;
				}
			}
		}
	}
}
