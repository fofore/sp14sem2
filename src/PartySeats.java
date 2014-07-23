/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String[] in0 = {"BOB boy","SUZIE girl","DAVE boy","JO girl","AL boy","BOB boy","CARLA girl","DEBBIE girl"};
		//ArrayList<String> out0 = new ArrayList<String>();
		System.out.println(Arrays.deepToString(seating(in0)));
		
		String[] in1 = {"JOHN boy","CARLA girl"};
		System.out.println(Arrays.deepToString(seating(in1)));

		String[] in2 = {"JOHN boy"};
		System.out.println(Arrays.deepToString(seating(in2)));

		String[] in3 = {"BOB boy","SAM girl","DAVE boy","JO girl"};
		System.out.println(Arrays.deepToString(seating(in3)));
	
	}
    
    public static String [] seating(String[] attendees)
	{
		int boyl = 4;
		int girll = 5;
		ArrayList<String> boylist = new ArrayList<String>();
		ArrayList<String> girllist = new ArrayList<String>();
		ArrayList<String> seatslist = new ArrayList<String>();
		for (int i = 0; i < attendees.length; i++){
			if(attendees[i].contains("boy")){
				boylist.add(attendees[i].substring(0,attendees[i].length()-boyl));
			}else{
				girllist.add(attendees[i].substring(0,attendees[i].length()-girll));
			}
		}
		
		for (int i = 0; i < boylist.size(); i++){
			//System.out.println(boylist.get(i).toString());	
  			//System.out.println(girllist.get(i).toString());	
		}
		
		Collections.sort(boylist);
		Collections.sort(girllist);
		
		for (int i = 0; i < boylist.size(); i++){
			//System.out.println(boylist.get(i).toString());	
  			//System.out.println(girllist.get(i).toString());	
		}
		
		if(boylist.size() != girllist.size() || boylist.size()%2 != 0){
			return seatslist.toArray(new String[seatslist.size()]);
		}
		
		seatslist.add("HOST");
		for (int i = 0; i < boylist.size() / 2; i++){
			seatslist.add(girllist.get(i));
			seatslist.add(boylist.get(i));
		}
		seatslist.add("HOSTNESS");
		for (int i = boylist.size() / 2; i < boylist.size(); i++){
			seatslist.add(boylist.get(i));
			seatslist.add(girllist.get(i));
		}		
		
		return seatslist.toArray(new String[seatslist.size()]);
	}
}
