import java.util.Arrays;


public class VerticalFall {
	public static void main(String[] args) {
		int in0 = 15;
		int in1 = 10;
		String [] in2 = {"005 010 020"};
		System.out.println(dropTime(in0, in1, in2));
		
		int in00 = 15;
		int in01 = 12;
		String [] in02 = {"010 010 020","015 010 020","005 020 050"};
		System.out.println(dropTime(in00, in01, in02));

		int in10 = 50;
		int in11 = 85;
		String [] in12 ={"020 001 100","010 100 100","005 100 200"};
		System.out.println(dropTime(in10, in11, in12));
		
		int in20 = 10;
		int in21 = 1000;
		String [] in22 = {};
		System.out.println(dropTime(in20, in21, in22));
		
		int in40 = 500;
		int in41 = 800;
		String [] in42 = {"800 001 500","400 001 499","401 501 999"};
		System.out.println(dropTime(in40, in41, in42));
		
		int in50 = 645;
		int in51 = 802;
		String [] in52 = {"739 038 799","916 169 791","822 372 911","162 125 992","261 307 545",
				 "510 031 765","592 723 742","477 315 676","566 143 617","337 114 664",
				 "986 648 883","116 230 680","254 746 943","742 948 988","060 117 401",
				 "634 035 433","288 741 864","819 626 730","906 071 222","554 100 121",
				 "573 051 551","949 528 915","562 151 223","857 135 243","621 115 474",
				 "588 405 615","895 812 919","052 378 836","858 116 505","285 428 469",
				 "792 244 250","109 265 637","714 804 885","625 150 410","518 593 921",
				 "282 235 339","081 212 659","663 047 982","556 194 345","798 150 938",
				 "391 026 813","886 348 796","975 007 743","053 854 895","243 561 875"};
		System.out.println(dropTime(in50, in51, in52));
	}
	
	public static int dropTime(int x, int y, String[] obstacles) {
		int obInt[][] = new int[obstacles.length][3];
		obInt = getInt(obstacles);
		int tmp = 0;
		int count = 0;
		int have = 0;
		int originY = y;
		for (int i = 0; i < obInt.length; i++) {
			if (obInt[i][0] == y) {
				x = obInt[i][2];
				count ++;
			}
		}
		while (y != 0) {
			tmp = 0;
			for (int i = 0; i < obInt.length; i++) {
				if ((x >= obInt[i][1] && x <= obInt[i][2]) && (obInt[i][0] < y)) {
					have ++;
					if (obInt[i][0] <= y) {
						tmp = Math.max(tmp, obInt[i][0]);
					}
				}
			}
			if (have == 0) {
				y = 0;
			}
			for (int i = 0; i < obInt.length; i++) {
				if ((x >= obInt[i][1] && x <= obInt[i][2]) && (obInt[i][0] < y)) {
					if (obInt[i][0] == tmp) {
						count ++;
						have = 0;
						y = obInt[i][0];
						x = obInt[i][2];
					}
				}
			}
		}
		return originY + 5*count;
	}
	
	public static int[][] getInt(String [] obStrings) {
		int obInt[][] = new int[obStrings.length][3];
		for (int i = 0; i < obStrings.length; i++) {
			obInt[i][0] = (obStrings[i].charAt(0)-48)*100+(obStrings[i].charAt(1)-48)*10+(obStrings[i].charAt(2)-48);
			obInt[i][1] = (obStrings[i].charAt(4)-48)*100+(obStrings[i].charAt(5)-48)*10+(obStrings[i].charAt(6)-48);
			obInt[i][2] = (obStrings[i].charAt(8)-48)*100+(obStrings[i].charAt(9)-48)*10+(obStrings[i].charAt(10)-48);
		}
		return obInt;
	}
}
