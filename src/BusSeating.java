import java.awt.List;
import java.util.ArrayList;


public class BusSeating {

	public static void main(String[] args) {
		String bus1row1 = "----------";
		String bus1row2 = "----------";
		System.out.println(getArrangement(bus1row1, bus1row2));
		
		String bus2row1 = "XXX-X-XX-X";
		String bus2row2 = "-XXXX---XX";
		System.out.println(getArrangement(bus2row1, bus2row2));
		
		String bus3row1 = "XXXXXXXXXX";
		String bus3row2 = "-XX-XX-X--";
		System.out.println(getArrangement(bus3row1, bus3row2));
		
		String bus4row1 = "XXX-X-XX-X";
		String bus4row2 = "XXX-X-XX-X";
		System.out.println(getArrangement(bus4row1, bus4row2));
		
		
		String bus5row1 = "XXXXXXXXX-";
		String bus5row2 = "--XXXXXXXX";
		System.out.println(getArrangement(bus5row1, bus5row2));
	}
	
	public static double getArrangement(String leftRow, String rightRow) {
		double distance = 0;
		double minimum ;
		ArrayList<Integer> row1 = transformToPoint(leftRow);
		ArrayList<Integer> row2 = transformToPoint(rightRow);
		int psize = row1.size() + row2.size();
		int [][]  points = new int[psize][2];
		//System.out.println(row1);
		for (int i = 0; i < row1.size(); i++) {
			points[i][0] = 0;
			points[i][1] = row1.get(i);
		}
		for (int j = row1.size(); j < psize; j++) {
			points[j][0] = 2;
			points[j][1] = row2.get(j - row1.size());
		}


		minimum = countDistance(points[0], points[1], points[2]);
		for (int i = 0; i < points.length - 2; i++) {
			for (int j = i + 1; j < points.length - 1; j++) {
				for (int k = j + 1; k < points.length; k++) {
					distance = countDistance(points[i], points[j], points[k]);
					//System.out.println(countDistance(points[i], points[j], points[k]));
					if (distance < minimum) {
						minimum = distance;
					}
				}
			}
			
		}

		return minimum;
	}
	
	public static double countDistance(int [] a, int [] b, int [ ] c) {
		return calLength(a, b) + calLength(b, c) + calLength(a, c);
	}
	public static double calLength(int [] a, int [] b) {
		double l1 = Math.pow((double)(a[0] - b[0]), 2) + Math.pow((double)(a[1] - b[1]), 2);
		return Math.pow(l1, 0.5);
	}
	
	public static ArrayList transformToPoint(String row) {
		ArrayList<Integer> rowList = new ArrayList<Integer>();
		char [] rowChar = row.toCharArray();
		for (int i = 0; i < rowChar.length; i++) {
			if (rowChar[i] == '-') {
				rowList.add(i);
			}
		}
		//System.out.println(rowList);
		return rowList;
	}
	
}
