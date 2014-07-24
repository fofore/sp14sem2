import java.util.Arrays;


public class ChangingString {

	public static void main(String[] args) {
		String in01 = "ab";
		String in02 = "ba";
		int in03 = 2;
		System.out.println(distance(in01, in02, in03));
		

	}
	
	public static int distance(String A, String B, int K) {
		int res = 0;
		int [] gap = new int[A.length()];
		for (int i = 0; i < A.length(); i++) {
			gap[i] = Math.abs(A.charAt(i) - B.charAt(i));
			//System.out.println(gap[i]);
		}
		//sort the int array
		Arrays.sort(gap);
		
		//modify the string
		for (int i = gap.length - 1; i >=  gap.length - K ; i--) {
			//System.out.println(gap[i]);
			if (gap[i] != 0) {
				gap[i] = 0;	
			}else {
				gap[i] = 1;
			}
		}
		
		for (int i = 0; i < gap.length; i++) {
			System.out.println(gap[i] + " counter:" + i);
			res += gap[i];
		}
		return res;
	}
	
	public static int[] sort(int [] origin) {
		int tmp = 0;
		for (int i = 0; i < origin.length; i++) {
			for (int j = i; j < origin.length - 1; j++) {
				if (origin[j] > origin[j + 1]) {
					tmp = origin[j + 1];
					origin[j + 1] = origin[j];
					origin[j] = tmp;
				}
			}
		}
		return origin;
	}
}
