
public class DancingSentence {
	public static void main(String[] args) {
		String sr1 = "This is a dancing sentence";
		System.out.println(makeDancing(sr1));
		String sr2 = " This   is         a  dancing   sentence  ";
		makeDancing(sr2);
		System.out.println(makeDancing(sr2));
		String sr3 = "aaaaaaaaaaa";
		makeDancing(sr3);
		System.out.println(makeDancing(sr3));
		String sr4 = "z";
		makeDancing(sr4);
		System.out.println(makeDancing(sr4));

	}
	
	public static String makeDancing(String sentence){
		char[] thechar = sentence.toCharArray();
		int charnum = 1 ;
		for (int i = 0; i < thechar.length; i++) {
			if (thechar[i] != ' ') {
				if (charnum % 2 == 1) {
					thechar[i] = Character.toUpperCase(thechar[i]);
				}
				charnum ++;
			}
		}
		String str = new String(thechar);
		return str;
	}
}
