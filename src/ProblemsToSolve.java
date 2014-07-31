
public class ProblemsToSolve {
    public static void main (String[] args) {

        int[] in00 = {1, 2, 3};
        int in01 = 2;
        System.out.println(minNumber(in00,in01));

        int[] in10 = {1, 2, 3, 4, 5};
        int in11 = 4;
        System.out.println(minNumber(in10,in11));

        int[] in20 = {10, 1, 12, 101};
        int in21 = 100;
        System.out.println(minNumber(in20,in21));

        int[] in30 = {10, 1};
        int in31 = 9;
        System.out.println(minNumber(in30,in31));

        int[] in40 = {6, 2, 6, 2, 6, 3, 3, 3, 7};
        int in41 = 4;
        System.out.println(minNumber(in40,in41));

    }

    public static int minNumber(int[] pleasantness, int variety) {
    	return variety;
    }
}
