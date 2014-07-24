//very ugly code to solve the problem, but it worked
public class FracCount {
	public static void main(String[] args) {
		int in00 = 1;
		int in01 = 2;
		System.out.println(position(in00, in01));
		
		int in10 = 13;
		int in11 = 15; 
		System.out.println(position(in10, in11));
	}
	
	public static int position(int numerator, int denominator) {
		int res = 0;
		boolean remove = false;
		for (int i = 2; i < denominator; i++) {
			for (int j = 1; j < i; j++) {
				remove = false;
				if (j == 1) {
					res++;
					//System.out.printf("%d/%d\n",j,i);
					continue;
				}
				if (i % j == 0) {
					continue;
				}
				for (int j2 = 2; j2 <= i/2; j2++) {
					if (j % j2 == 0 && i % j2 == 0) {
						remove = true;
					} 
				}
				if (remove) {
					continue;
				}
				//System.out.printf("%d/%d\n",j,i);
				res++;
			}
			
		}
		
		//System.out.println("from here");
		
		for (int i = 1; i <= numerator; i++) {
			remove = false;
			if (i == 1) {
				//System.out.printf("%d/%d\n",i,denominator);
				res++;
				continue;
			}
			if (denominator % i == 0) {
				continue;
			}
			for (int j = 2; j <= denominator/2; j++) {
				if (i % j == 0 && denominator % j == 0) {
					remove = true;
				}
			}
			if (remove) {
				continue;
			}
			//System.out.printf("%d/%d\n",i,denominator);
			res++;
		}
		
		return res;
	}

}
