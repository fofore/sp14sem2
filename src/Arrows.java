
public class Arrows {

	public static void main(String[] args) {
		String aString = "<--->--==>";
		System.out.println(longestArrow(aString));
		String aString1 = "<<<<<<<<<<";
		System.out.println(longestArrow(aString1));
		String aString2 = "----==-";
		System.out.println(longestArrow(aString2));
		String aString3 = "<----=====>";
		System.out.println(longestArrow(aString3));
		String aString4 = "<=<==<===<====<=====<======<=======<==============";
		System.out.println(longestArrow(aString4));
		String aString5 = "-=-<-<=><>=>=>>==->><>>-<>=>==-<=->=<<-->--><<-<==";
		System.out.println(longestArrow(aString5));
	}
	
	public static int longestArrow(String s) {
		char [] sChar = s.toCharArray();
		int count = -1;
		int leftLength = -1;
		int rightLength = -1;
		for (int i = 0; i < sChar.length; i++) {
			if (sChar[i] == '<') {
				leftLength = leftArrowLength(i, sChar);
				if (leftLength > count) {
					count = leftLength;
				}
				//System.out.println(leftLength);
			}else if (sChar[i] == '>') {
				rightLength = rightArrowLength(i, sChar);
				if (rightLength > count) {
					count = rightLength;
				}
				//System.out.println(rightLength);
			}else {
				continue;
			}
		}

		return count;
	}
	
	public static int  leftArrowLength(int aIndex, char [] sChar) {
		int count = 1;
		if ((aIndex + 1) == sChar.length) return count;
		if (sChar[aIndex + 1] == '<' || sChar[aIndex + 1] == '>')  return count;
		for (int i = aIndex + 1; i < sChar.length; i++) {
			if (sChar[i] == sChar[aIndex + 1]) {
				count ++;
			}else {
				return count;
			}
		}	
		return count;
	}
	
	public static int rightArrowLength(int aIndex, char [] sChar) {
		int count = 1;
		if (aIndex  == 0) return count;
		if (sChar[aIndex - 1] == '<' || sChar[aIndex - 1] == '>')  return count;
		for (int i = aIndex - 1; i >= 0; i--) {
			if (sChar[i] == sChar[aIndex - 1]) {
				count ++;
			}else {
				return count;
			}
		}	
		return count;	
	}
}
