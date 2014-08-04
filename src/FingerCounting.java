
public class FingerCounting {
    public static void main (String[] args) {

        int in00 = 2;
        int in01 = 3;
        System.out.println(maxNumber(in00,in01));

        int in10 = 1;
        int in11 = 0;
        System.out.println(maxNumber(in10,in11));

        int in20 = 5;
        int in21 = 0;
        System.out.println(maxNumber(in20,in21));

        int in30 = 2;
        int in31 = 48;
        System.out.println(maxNumber(in30,in31));

        int in40 = 5;
        int in41 = 973;
        System.out.println(maxNumber(in40,in41));

        int in50 = 3;
        int in51 = 99999;
        System.out.println(maxNumber(in50,in51));

    }

    public static int maxNumber(int weakFinger, int maxCount) {
    	int [] fa = {1,2,3,4,5,4,3,2};
    	int res = 0;
    	while (true) {
    		if (fa[res % fa.length] == weakFinger) {
    			maxCount --;
    			if (maxCount < 0) {
					break;
				}
    		}
    		res ++;
		}
    	return res;
    }
}
