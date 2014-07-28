import java.lang.reflect.Array;
import java.util.Arrays;


public class GrabbingTaxi {
	public static void main(String[] args) {
		int[] in0 = {};
		int[] in1 = {};
		int in2 = 3;
		int in3 = 2;
		int in4 = 10;
		int in5 = 2;
		System.out.println(minTime(in0, in1, in2, in3, in4, in5));
		
		
		int[] in10 = {-2, -2};
		int[] in11 = {0 , 2};
		int in12 = -4;
		int in13 = -2;
		int in14 = 15;
		int in15 = 3;
		System.out.println(minTime(in10, in11, in12, in13, in14, in15));
	}

	public static int minTime(int[] tXs, int[] tYs, int gX, int gY, int walkTime, int taxiTime) {
		//System.out.printf(" %d %d %d %d\n", gX, gY, walkTime, taxiTime);
		//System.out.println(Arrays.toString(tXs));
		//System.out.println(Arrays.toString(tYs));

		int taxiTotal = 0;
		int walkTotal = 0;
		int res = (Math.abs(gX) + Math.abs(gY)) * walkTime;
		for (int i = 0; i < tYs.length; i++) {
			walkTotal = (Math.abs(tXs[i]) + Math.abs(tYs[i])) * walkTime;
			taxiTotal = (Math.abs(tXs[i] - gX) + Math.abs(tYs[i] - gY)) * taxiTime;
			res = Math.min(res, walkTotal + taxiTotal);
		}
		return res;
	}

}
