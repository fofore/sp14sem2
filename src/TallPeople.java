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
    	int tINs = 0;
    	int sINt = Integer.MAX_VALUE;
    	int min = Integer.MAX_VALUE;
    	int max = 0;
    	
    	for (int i = 0; i < people.length; i++) {
    		for (int j = 0; j < people[i].length(); j++) {
				if (people[i].charAt(j) != ' ') {
					max = Math.max(max, people[i].charAt(j) - 48);
					System.out.println(max);
					min = Math.min(min, people[i].charAt(j) - 48);
				}
				tINs = Math.max(tINs, min);
				sINt = Math.min(sINt, max);
			}
		}
    	
    	int [] res = {tINs, sINt};
    	return res;
    }
}
