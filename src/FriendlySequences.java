public class FriendlySequences {
	
	public static void main(String[] args) {
		int[] arr1 = {112, 12, 21, 354, 534345, 345, 2221};	
		System.out.println(count(arr1));
		int [] in1 = {10, 1100, 10101, 111, 1111, 11111, 11, 1, 111};
		System.out.println(count(in1));


	}

	public static int count(int[] array)
	{
		int seqcount = 0;
		int numflags[][] = new int[array.length][10];
		for (int i = 0; i < array.length; i++) {
			for (int j =0; j < 10; j ++) {
				numflags[i][j] = 0;
			}
		}

		int mod;
		int left;
		for (int i = 0; i < array.length; i++) {
			left = array[i];
			do {
				mod = left % 10;
				left = left / 10;
				numflags[i][mod] = 1;
			}while(left >= 1);
		}

		for (int i = 0; i < array.length; i++) {
			for (int j =0; j < 10; j ++) {
				System.out.print(numflags[i][j]);
			}
			System.out.println();
		}

		int sl = 1;
		for (int i = 0; i < array.length - 1; i++) {
			if (eqaul(numflags[i], numflags[i+1])) {
				sl ++;
				System.out.println("here");
			}
			else{
				System.out.println(sl);
				seqcount += calculateSequences(sl);
				sl = 1;
			}
		}
		seqcount += calculateSequences(sl);


		return seqcount;
	}

	public static boolean eqaul(int[] arr1, int[] arr2)
	{
		for (int i = 0; i < 10; i ++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}

		return true;
	}


	public static int calculateSequences(int numcount)
	{
		int sum = 0;
		for (int i = 1; i < numcount; i++) {
			sum += i;
		}
		return sum;
	}
}