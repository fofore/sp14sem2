import java.awt.print.Printable;
import java.util.Arrays;


public class TallPeople {
    public static void main (String[] args) {

        String[] in00 = {"9 2 3","4 8 7"};
        System.out.println(Arrays.toString(getPeople(in00)));

        String[] in10 = {"1 2","4 5","3 6"};
        System.out.println(Arrays.toString(getPeople(in10)));

        String[] in20 = {"1 1", "1 1"};
        System.out.println(Arrays.toString(getPeople(in20)));

    }

    public static int[] getPeople(String[] people) {
    	int [] shorts = new int[people.length];
    	for (int i = 0; i < shorts.length; i++) {
			 shorts[i] = Integer.MAX_VALUE;
		}
    	for (int i = 0; i < people.length; i++) {
			for (int j = 0; j < people[i].length(); j++) {
				if (people[i].charAt(j) != ' ') {
					shorts[i] = Math.min(shorts[i], people[i].charAt(j) - 48);
				}
			}
		}
		System.out.println(Arrays.toString(shorts));
    	
    	int [] talls = new int[people[0].length()];
    	for (int i = 0; i < talls.length; i++) {
			talls[i] = 0;
		}
    	for (int i = 0; i < people[0].length(); i++) {
    		if (people[0].charAt(i) != ' ') {
    			for (int j = 0; j < people.length; j++) {
    				talls[i] = Math.max(talls[i], people[j].charAt(i) - 48);
			 	}
			}
		}
    	System.out.println(Arrays.toString(talls));
    	int [] res = new int[2];
    	
    	res[0] = 0;
    	for (int i = 0; i < shorts.length; i++) {
			res[0] = Math.max(res[0], shorts[i]);
		}
    	res[1] = Integer.MAX_VALUE;
    	for (int i = 0; i < talls.length; i++) {
    		if (talls[i] != 0) {
    			res[1] = Math.min(res[1], talls[i]);
			}
		}
    	return res;
    }
}
