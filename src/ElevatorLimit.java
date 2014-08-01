import java.util.*;


public class ElevatorLimit {
    public static void main (String[] args) {

        int[] in00 = {1,0};
        int[] in01 = {0,1};
        int in02 = 1;
        System.out.println(Arrays.toString(getRange(in00,in01,in02)));

        int[] in10 = {1,0};
        int[] in11 = {0,1};
        int in12 = 2;
        System.out.println(Arrays.toString(getRange(in10,in11,in12)));

        int[] in20 = {0,1};
        int[] in21 = {1,0};
        int in22 = 1;
        System.out.println(Arrays.toString(getRange(in20,in21,in22)));

        int[] in30 = {0,2};
        int[] in31 = {1,0};
        int in32 = 1;
        System.out.println(Arrays.toString(getRange(in30,in31,in32)));

        int[] in40 = {6, 85, 106, 1, 199, 76, 162, 141} ;
        int[] in41 = {38, 68, 62, 83, 170, 12, 61, 114} ;
        int in42 = 668;
        System.out.println(Arrays.toString(getRange(in40,in41,in42)));

        int[] in50 = {179, 135, 104, 90, 97, 186, 187, 47, 152, 100, 119, 28, 193, 11, 103, 100,179, 11, 80, 163, 50, 131, 103, 50, 142, 51, 112, 62, 69, 72, 88, 3, 162,93, 190, 85, 79, 86, 146, 71, 65, 131, 179, 119, 66, 111} ;
        int[] in51 = {134, 81, 178, 168, 86, 128, 1, 165, 62, 46, 188, 70, 104, 111, 3, 47, 144, 69, 163, 21, 101, 126, 169, 84, 146, 165, 198, 1, 65, 181, 135, 99, 100, 195, 171, 47, 16, 54, 79, 69, 6, 97, 154, 80, 151, 76} ;
        int in52 = 954;
        System.out.println(Arrays.toString(getRange(in50,in51,in52)));

        int[] in60 = {2};
        int[] in61 = {3};
        int in62 = 2;
        System.out.println(Arrays.toString(getRange(in60,in61,in62)));

    }

    public static int[] getRange(int[] enter, int[] exit, int physicalLimit) {
    	int min = Integer.MAX_VALUE;
    	int max = 0;
    	int cur = 0;
    	int [] bad_res = {};
    	int [] res = {0, 0};

    	for (int i = 0; i < exit.length; i++) {
    		cur -= exit[i];
    		min = Math.min(min, cur);
    		if (enter[i] > physicalLimit) {
				return bad_res;
			}
    		cur += enter[i];
    		max = Math.max(max, cur);
		}
    	//cant exit more than already have
    	if (Math.abs(min) > physicalLimit || Math.abs(min) > physicalLimit - max) {
			return bad_res;
		}
    	res[0] = Math.abs(min);
    	res[1] = physicalLimit - max;
    	
    	System.out.println(Arrays.toString(res));
    	return res;
    }
}
