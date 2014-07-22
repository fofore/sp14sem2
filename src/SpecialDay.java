
public class SpecialDay {
	public static void main(String[] args) {
		System.out.println(howMany("THURSDAY", 4, "NOVEMBER", 23));
		System.out.println(howMany("SUNDAY", 2, "MAY", 13));
		System.out.println(howMany("TUESDAY", 5, "FEBRUARY", 29));
		System.out.println(howMany("MONDAY", 2, "OCTOBER", 6));
		System.out.println(howMany("MONDAY", 5, "FEBRUARY", 29));
	}
	
	public static String [] weekdayStrings = {"FRIDAY", "SATURDAY", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY" };
	public static String [] monthStrings = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
	public static int [] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

	public static int howMany(String weekday, int which, String month, int day) {
		int weekdayNum = 0;
		int monthNum = 0;
		for (int i = 0; i < 7; i++) {
			if (weekday == weekdayStrings[i]) {
				weekdayNum = i;
			}
		}
		for (int i = 0; i < 12; i++) {
			if (month == monthStrings[i]) {
				monthNum = i;
			}
		}
		
		int sum = 0;
		int offset = 0;
		int count = 0;
		for (int year = 2000; year <= 2100; year++) {
			//cal first day of the month
			sum = daySum(year, monthNum, 1);
			//System.out.println(sum);
			offset = weekdayNum >= (sum % 7) ? (weekdayNum + 7*(which -1) - sum% 7) : (weekdayNum + 7*which - sum % 7) ;
			sum += offset;
			if (sum == daySum(year, monthNum, day)) {
				//if in feb 29, should only be leap year, filter years that is not leap year.
				if (day == 29 && monthNum == 1) {
					if (!isLeap(year)) {
						continue;
					}
				}
				count ++;
				System.out.println("year " +year);
			}
		}
		return count;
	}
	
	public static int daySum(int year, int month, int day) {
		int res = 0;
		for (int i = 2000; i < year; i++) {
			dayOfMonth [1] = isLeap(i) ? 29 : 28;
			for (int j = 0; j < 12; j++) {
				res += dayOfMonth[j];
			}
		}
		
		dayOfMonth[1] =  isLeap(year) ? 29 : 28;
		for (int i = 0; i < month; i++) {
			res += dayOfMonth[i];
		}
		
		res += day; 

		return  res;
	}
	
	public static boolean isLeap(int year) {
		if (year % 400 == 0) {
			return true;
		}else if (year % 100 == 0) {
			return false;
		}else if (year % 4 == 0) {
			return true;
		}else {
			return false;
		}
	}
}

