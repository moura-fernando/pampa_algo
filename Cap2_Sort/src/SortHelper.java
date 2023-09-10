import java.util.Arrays;

public class SortHelper {

	public static void printArray(int[] numbers) {	
		Arrays.stream(numbers).forEach(number -> System.out.print(number+" "));
}
}
