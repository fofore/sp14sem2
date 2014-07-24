
public class Inchworm {
	public static void main(String[] args) {
		int in01 = 11;
		int in02 = 2;
		int in03 = 4;
		System.out.println(lunchtime(in01, in02, in03));
		
		
		int in11 = 12;
		int in12 = 6;
		int in13 = 4;
		System.out.println(lunchtime(in11, in12, in13));
		
		int in21 = 20;
		int in22 = 3;
		int in23 = 7;
		System.out.println(lunchtime(in21, in22, in23));
	}

	public static int lunchtime(int branch, int rest, int leaf) {
		int bigger = Math.max(rest, leaf);
		while ((bigger % Math.min(rest, leaf) != 0) || bigger % Math.max(rest, leaf) != 0) {
			bigger++;
		}
		return branch/bigger + 1;
	}
}
