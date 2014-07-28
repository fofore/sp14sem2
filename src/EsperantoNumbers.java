
public class EsperantoNumbers {
	public static void main(String[] args) {
		int in0 = 1;
		System.out.println(nameThisNumber(in0));
		
		int in1 = 90;
		System.out.println(nameThisNumber(in1));
		
		int in2 = 11;
		System.out.println(nameThisNumber(in2));
		
		int in3 = 57;
		System.out.println(nameThisNumber(in3));
	}
	

	public static String nameThisNumber(int x) {
		String [] numStrings = {"", "unu", "du", "tri", "kvar", "kvin", "ses", "sep", "ok", "nau", "dek"};
		return (x / 10 == 1 ? "" : numStrings[x/10]) + (x/10 == 0 ? "" : numStrings[10] + (x%10 == 0 ? "" : " ")) + numStrings[x%10];
	}

}
