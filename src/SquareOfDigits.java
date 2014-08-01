
public class SquareOfDigits {
    public static void main (String[] args) {

        String[] in00 = {"12", "34"};
        System.out.println(getMax(in00));

        String[] in10 = {"1255","3455"};
        System.out.println(getMax(in10));

        String[] in20 = {"42101","22100","22101"};
        System.out.println(getMax(in20));

        String[] in30 = {"1234567890"};
        System.out.println(getMax(in30));

        String[] in40 = {"9785409507","2055103694","0861396761","3073207669","1233049493","2300248968","9769239548","7984130001","1670020095","8894239889","4053971072"};
        System.out.println(getMax(in40));

    }

    public static int getMax(String[] data) {
    	int square = 1;
    	for (int i = 0; i < data.length; i++) {
    		for (int j = 0; j < data[0].length(); j++) {
				for (int k = data.length - 1; k > i; k--) {
					if (data[k].charAt(j) == data[i].charAt(j)) {
						if ((k - i + j) < data[0].length()) {
							if (data[k].charAt(j) == data[k].charAt(k - i + j) && 
								data[k].charAt(j) == data[i].charAt(k - i + j)) {
								square = Math.max(square, (k - i + 1)*(k - i + 1));
								//System.out.println(square);
							}
						}
					}
				}
			}
		}
    	return square;
    }
}
