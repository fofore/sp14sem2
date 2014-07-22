
public class Elections  {
	public static void main(String[] args) {
		String[] likeli1 = {"1222","1122","1222"};
		System.out.println(visit(likeli1));
		
		String[] likeli2 = {"1222111122","2222222111","11111222221222222222"};
		System.out.println(visit(likeli2));

		String[] likeli3 = {"111","112","121","122","211","212","221","222"};
		System.out.println(visit(likeli3));

		String[] likeli4 = {"1122","1221","1212","2112","2121","2211"};
		System.out.println(visit(likeli4));

		String[] likeli5 = {"11112222111121","1211221212121","112111222","11122222222111","112121222","1212122211112"};
		System.out.println(visit(likeli5));

		
	}

	public static int visit(String[] likelihoods) {
		int index = 0;
		double percent = 0;
		int vote = 0;
		double curPercent = 0;
		for (int i = 0; i < likelihoods.length; i++) {
			for (int j = 0; j < likelihoods[i].length(); j++) {
				if (likelihoods[i].charAt(j) == '1') {
					vote += 1;
				}
			}
			curPercent = (double)vote / likelihoods[i].length();
			if (i == 0) {
				percent = curPercent;  
			}
			//System.out.println((double)vote / likelihoods[i].length());
			if (curPercent < percent) {
				index = i;
				percent = curPercent;
			}
			//System.out.println(percent);
			vote = 0;
		}
		return index;
	}
}
