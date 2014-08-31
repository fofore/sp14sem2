
public class RugSizes {

	public static void main(String[] args) {
		//int in0 = 4;
		//System.out.println(rugCount(in0));
		
		int in1 = 30;
		System.out.println(rugCount(in1));
		
	}
	
	public static int rugCount(int area) {
		int counter = 0;
		for (int i = 1; i <= Math.pow(area, 0.5); i++) {
		    //the length of the i 
			if (area % i == 0) {
				if(i % 2 == 0 && (area / i)%2 == 0 && i != area / i){
					continue;
				}
				//System.out.println(i);
				counter ++;
			}
		}
		return counter;
	}
}
