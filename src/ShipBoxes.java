
public class ShipBoxes {

	public static void main(String[] args) {
		int [] in01 = {1,4,9};
		int [] in02 = {1,4,9};
		System.out.println(bestCost(in01, in02));
		
		int [] in11 = {1,1,1};
		int [] in12 = {1,1,1};
		System.out.println(bestCost(in11, in12));
		
		int [] in21 = {1, 9000, 9000};
		int [] in22 = {40, 40, 40};
		System.out.println(bestCost(in21, in22));
	}

	public static int bestCost(int[] box1, int[] box2) {
		int [] bigBox = {0,0,0};
		int cost = Integer.MAX_VALUE;
		for (int i = 0; i < box1.length; i++) {
			for (int j = 0; j < box2.length; j++) {
				bigBox[0] = box1[i] + box2[j];
				bigBox[1] = Math.max(box1[(i+1)%3], box2[(j+1)%3]);
				bigBox[2] = Math.max(box1[(i+2)%3], box2[(j+2)%3]);
				cost = Math.min(cost, bestThisShap(bigBox));
				
				bigBox[0] = box1[i] + box2[j];
				bigBox[1] = Math.max(box1[(i+1)%3], box2[(j+2)%3]);
				bigBox[2] = Math.max(box1[(i+2)%3], box2[(j+1)%3]);
				cost = Math.min(cost, bestThisShap(bigBox));
			}
		}
		return cost;
	}
	
	public static int bestThisShap(int [] box) {
		int area = Integer.MAX_VALUE;
		int curArea = 0;
		for (int i = 0; i < box.length; i++) {
			curArea = 2*box[i]*box[(i+1)%3] + 2*box[i]*box[(i+2)%3] + 4*box[(i+1)%3]*box[(i+2)%3];
			area = Math.min(area, curArea);
		}
		return area;
	}
}
