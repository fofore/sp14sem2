
public class WhiteHats {
	public static void main(String[] args) {
		int [] in00 = {2,1,1};
		System.out.println(whiteNumber(in00));
		
		int [] in1 = {2,2,2};
		System.out.println(whiteNumber(in1));
		
		int [] in2 = {0,0};
		System.out.println(whiteNumber(in2));
		
		int [] in3 = {1, 1, 1, 2};
		System.out.println(whiteNumber(in3));
		
		int [] in4 = {10, 10};
		System.out.println(whiteNumber(in4));
		
		
	}

	public static int whiteNumber(int [] count) {
		int max = 0;
		//check all counts, if one counter bigger than all people, it's wrong, then get the max number
		for (int i = 0; i < count.length; i++) {
			if (count[i] >= count.length) {
				return -1;
			}
			
			max = Math.max(max, count[i]);
		}
		
		int bNumber = 0;
		int wNumber = 0;
		for (int i = 0; i < count.length; i++) {
			if (count[i] == max) {
				bNumber ++;
			}else if (count[i] == max -1) {
				wNumber ++;
			}
		}
		if ((bNumber == count.length - max) && (wNumber == max)) {
			return max;
		}else if (bNumber == count.length) {
			if (max == count.length - 1) {
				return max + 1;
			}else if (max == 0) {
				return 0;
			}else {
				return -1;
			}
		}else {
			return -1;
		}

	}
}
