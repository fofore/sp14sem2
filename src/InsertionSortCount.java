import java.util.SortedMap;


public class InsertionSortCount {
	public static void main(String[] args) {
		int[] in1 = {20,40,30,10};	
		System.out.println(countMoves(in1));
		
		int[] in2 = {-1,1,0};
		System.out.println(countMoves(in2));
		
		int[] in3 = {-1000,0,1000};
		System.out.println(countMoves(in3));
	}

	public static int countMoves(int[] A) {
		int counter = 0;
		for (int i = 1; i < A.length; i++) {
			for (int j = 0; j < i; j++) {
				//smaller than how many infront them, then summary them
				if (A[i] < A[j] ) {
					counter += 1;
				}
			}
		}
		return counter;
	}
}
