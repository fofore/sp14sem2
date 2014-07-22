
public class RosePetals {
	public static void main(String[] args) {
		int[] dice1 = {1, 2, 3, 2, 1};
		System.out.println(getScore(dice1));
		int[] dice2 = {4, 4, 5, 6, 5};
		System.out.println(getScore(dice2));
		int[] dice3 = {1, 2, 3, 3, 5};
		System.out.println(getScore(dice3));
		int[] dice4 = {3,3,3,3,3};
		System.out.println(getScore(dice4));
		int[] dice5 = {2,2,2,2,2};
		System.out.println(getScore(dice5));
	}
	public static int getScore(int[] dice) {
		int [] petalOfDice = new int [6];
		petalOfDice[2] = 2;
		petalOfDice[4] = 4;
		int score = 0;
		for (int i = 0; i < dice.length; i++) {
			score += petalOfDice[dice[i] -1];
		}
		return score;
	}
}
