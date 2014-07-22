
public class SnowyWinter {

	public static void main(String[] args) {
		int [] s1 = {17,85,57};
		int [] e1 = {33,86,84};
		System.out.println(snowyHighwayLength(s1, e1));
		
		
		int [] s2 = {45,100,125,10,15,35,30,9};
		int [] e2 = {46,200,175,20,25,45,40,10};
		System.out.println(snowyHighwayLength(s2, e2));

		
		int [] s3 = {4387,711,2510,1001,4687,3400,5254,584,284,1423,3755,929,2154,5719,1326,2368,554};
		int [] e3 = {7890,5075,2600,6867,7860,9789,6422,5002,4180,7086,8615,9832,4169,7188,9975,8690,1423};
		System.out.println(snowyHighwayLength(s3, e3));
		
		
		int [] s4 = {4906,5601,5087,1020,4362,2657,6257,5509,5107,5315,277,6801,2136,2921,5233,5082,497,8250,3956,5720};
		int [] e4 = {4930,9130,9366,2322,4687,4848,8856,6302,5496,5438,829,9053,4233,4119,9781,8034,3956,9939,4908,5928};
		System.out.println(snowyHighwayLength(s4, e4));

		int [] s5 = {51,807,943,4313,8319,3644,481,220,2161,448,465,1657,6290,22,6152,647,3185,4474,2168};
		int [] e5 = {1182,912,1832,7754,9557,7980,4144,3194,7129,5535,1172,2043,6437,7252,9508,4745,8313,8020,4017};
		System.out.println(snowyHighwayLength(s5, e5));
		
		
		int [] s6 = {8786,7391,201,4414,5822,5872,157,1832,7487,7518,2267,1763,3984,3102,7627,4099,524,1543,1022,3060};
		int [] e6 = {9905,7957,3625,6475,9314,9332,4370,8068,8295,8177,7772,2668,7191,8480,9211,4802,2625,1924,9970,4180};
		System.out.println(snowyHighwayLength(s6, e6));
	}
	
	public static int snowyHighwayLength(int[] startPoints, int[] endPoints) {
		int length = 0;
		int [] highway = new int[10001];
		for (int i = 0; i < startPoints.length; i++) {
			for (int j = startPoints[i]; j < endPoints[i]; j++) {
				highway[j] = 1;
			}
		}
		
		for (int k = 0; k < highway.length; k++) {
			if (highway[k] == 1) {
				length ++;
			}
		}
		return length;
	}
}
