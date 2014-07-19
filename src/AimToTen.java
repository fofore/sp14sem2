public class AimToTen {
	
	public static void main(String[] args) {
		int[] marks = {9,10,10,9};
		System.out.println(need(marks));
		int[] marks2 = {8, 9};
		System.out.println(need(marks2));
		int[] marks3 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
 						0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
 						0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
 						0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
 						0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		System.out.println(need(marks3));
		int[] marks4 = {10, 10, 10, 10};
		System.out.println(need(marks4));

	}

	public static int need(int[] marks)
	{
		int count = 0;
		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			//System.out.println(sum);
			sum += marks[i];
			System.out.println(sum);
		}
		count = (int)((9.5*marks.length - sum)*2);  //here must use () to make the tail as a whole
		if (count < 0) {
			return  0;
		}
		return count;
	}
}