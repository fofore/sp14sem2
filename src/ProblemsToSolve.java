
public class ProblemsToSolve {
	public static void main(String[] args) {
		int [] in0 = {1, 2, 3};
		int in1 = 2;
		System.out.println(minNumber(in0, in1));
		
		int [] in10 = {1, 2, 3, 4, 5};
		int in11 = 4;
		System.out.println(minNumber(in10, in11));
		
	}


	public static int minNumber(int [] pleaseantness, int variety) {
		if (pleaseantness.length == 1) {
			return 1;
		}
		boolean noBig = true;
		for (int i = 1; i < pleaseantness.length; i++) {
			if (pleaseantness[i] >= variety) {
				noBig = false;
				if (i % 2 == 0) {
					return i / 2 + 1;
				}else {
					return i / 2 + 1 + 1;
				}
			}
		}
		if (noBig) {
			return pleaseantness.length;
		}
		return 0;
	}
}
