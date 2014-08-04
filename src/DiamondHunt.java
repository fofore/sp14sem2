import org.w3c.dom.css.Counter;


public class DiamondHunt {
    public static void main (String[] args) {

        String in00 = "><<><>>><";
        System.out.println(countDiamonds(in00));

        String in10 = ">>>><<";
        System.out.println(countDiamonds(in10));

        String in20 = "<<<<<<<<<>>>>>>>>>";
        System.out.println(countDiamonds(in20));

        String in30 = "><<><><<>>>><<>><<><<>><<<>>>>>><<<";
        System.out.println(countDiamonds(in30));

    }

    public static int countDiamonds(String mine) {
    	String ds = "<>";
    	String t = "";
    	int counter = 0;
    	while (mine.contains(ds)){
    		mine = mine.replaceFirst(ds, t);
    		counter ++;
		}
    	return counter;
    }
}
