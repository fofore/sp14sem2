import java.util.concurrent.Delayed;


public class SlowKeyboard {
	public static void main(String[] args) {
		String in0 = "59:56";
		System.out.println(enterTime(in0));
		
		String in1 = "16:35";
		System.out.println(enterTime(in1));
	}
	
	public static int enterTime(String time) {
		int res = 0;
		int a = 0, b =0, c = 0, d = 0;
		a = time.charAt(0) - 48;
		b = time.charAt(1) - 48;
		c = time.charAt(3) - 48;
		d = time.charAt(4) - 48;
		outerloop:
		for (int i = 1; i < 11; i++) {
			d ++;
			if (d == 10) {
				d = 0;
				c++;
			}
			if (c == 6) {
				c = 0;
				b++;
			}
			if (b == 10) {
				b = 0;
				a++;
			}
			if (a == 6) {
				a = 0;
			}
			System.out.printf("%d%d%d%d\n",a,b,c,d);
			int delay = 4 + 2*(b!=a?1:0) + 2*(c!=b?1:0) + 2*(d!=c?1:0);
			System.out.println(delay);
			if (i >= delay) {
				res = i;
				break outerloop;
			}
		}
		return res;
	}

}
