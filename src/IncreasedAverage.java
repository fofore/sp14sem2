
public class IncreasedAverage {
	public static void main(String[] args) {
		int[] set1 = { 1, 2, 3 };
		int[] set2 = { 4, 5, 6 };
		System.out.println(numIncrease(set1, set2));
		
		int[] set3 = { 3, 100, 90 };
		int[] set4 = { 5, 1, 18, 29 };
		System.out.println(numIncrease(set3, set4));
		
		
		int[] set5 = { 1, 1, 1, 1, 1, 5 };
		int[] set6 = { -10, -9, -8, -7, -6 };
		System.out.println(numIncrease(set5, set6));
		
		
		int[] set7 = { 12, 94, 53, 43, 58, 85, 55, 83, 47, 57 };
		int[] set8 = { 23, 100, 98, 27, 9, 70, 39, 39, 54 };
		System.out.println(numIncrease(set7, set8));
	}

	public static int numIncrease(int[] set1, int[] set2) {
		float mean1 = calMean(set1);
		float mean2 = calMean(set2);
		System.out.println(mean1);
		System.out.println(mean2);
		int[] desSet = (mean1 > mean2) ? set1 : set2;
		float big = (mean1 > mean2) ? mean1 : mean2;
		float small = (mean1 < mean2) ? mean1 : mean2;
		int count = 0 ;
		for (int i = 0; i < desSet.length; i++) {
			//here is very important, must be <= big, and should not be ==
			//modify 2, must use the float as the result of the divide calcualting
			if ((desSet[i] < big) && (desSet[i] > small)) {
				count ++;
			}
		}
		return count;
	}
	
	public static float calMean(int[] set) {
		int sum = 0;
		for (int i = 0; i < set.length; i++) {
			sum += set[i];
		}
		return sum/(float)set.length;
	}
}
