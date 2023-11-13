
public class TestConversion {

	public static void main(String[] args) {
		
		String s1 = "Ferdinand";
		String s2 = "Fernando";
		
		ConvertOneStringToAnother converter = new ConvertOneStringToAnother();
		
		System.out.println(converter.findMinOperationsTD(s1, s2));
		System.out.println(converter.findMinOperationsBU(s1, s2));

	}

}
