public class AimToTen {
	
	public static void main(String[] args) {
		System.out.println("here");
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
	
	public static int  need(int [] marks) {
		return need0(marks);
	}

	public static int need0(int[] marks)
	{
		int count = 0;
		int sum = 0;
		for (int m:marks) {
			sum += m;
		}
		count = 19*marks.length - 2*sum; 
		return count < 0 ? 0 : count;
	}
	
	public static int  need1(int [] marks) {
		System.out.println("that");
		int counter = 0;
		double sum = 0;
		while ((sum / counter < 9.5) || counter < marks.length) {
			//System.out.println("loop");
			if (counter < marks.length) {
				sum += marks[counter];
			}else {
				sum += 10;
			}
			counter ++;
		}
		return counter - marks.length;
	}
	
}