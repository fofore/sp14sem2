import java.util.ArrayList;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;
import javax.swing.text.GapContent;


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
    	int min = pleasantness[0];
    	int max = pleasantness[0];
    	for (int i = 0; i < pleasantness.length; i++) {
    		min = Math.min(min, pleasantness[i]);
    		max = Math.max(max, pleasantness[i]);
		}
    	if(max - min < variety)
    	{
    		return pleasantness.length;
    	}
    	
    	int last = Integer.MAX_VALUE;
    	for (int i = 0; i < pleasantness.length; i++) {
    		for (int j = i+1; j < pleasantness.length; j++) {
				if (Math.abs(pleasantness[i] - pleasantness[j]) >= variety) {
					last = Math.min(last, j);
				}
			}
			
		}
    	ArrayList<Integer> possilbe = new ArrayList<Integer>();
    	for (int i = 0; i <= last; i++) {
    		if (Math.abs(pleasantness[last] - pleasantness[i]) >= variety) {
				possilbe.add(i);
			}
		}
    	
    	int res = Integer.MAX_VALUE;
    	int tmp = 0;
		for (int p : possilbe) {
			//System.out.println(p);
			tmp = 1 + (p % 2 == 0? p /2 : p/2 + 1);
			int gap = last - p;
			tmp += gap % 2 == 0? gap /2 : gap /2+1;
			res=Math.min(res, tmp);
		}
		return res;
    }
}
