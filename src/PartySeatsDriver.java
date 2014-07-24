import java.util.*;

public class PartySeatsDriver {
public static void main(String [] args){
PartySeats test;
int mark = 0;
int counter = 0;
String[] tmpVal;
boolean result;
counter ++;
String[] in00 = {"BOB boy", "SAM girl", "DAVE boy", "JO girl"};
String[] out0 = {"HOST", "JO", "BOB", "HOSTESS", "DAVE", "SAM"};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in00);
System.out.println("Output expected: " + out0 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out0);
System.out.println(Arrays.deepToString(tmpVal));
System.out.println(Arrays.deepToString(out0));
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in10 = {"JOHN boy"};
String[] out1 = {};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in10);
System.out.println("Output expected: " + out1 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out1);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in20 = {"JOHN boy", "CARLA girl"};
String[] out2 = {};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in20);
System.out.println("Output expected: " + out2 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out2);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in30 = {"BOB boy", "SUZIE girl", "DAVE boy", "JO girl", "AL boy", "BOB boy", "CARLA girl", "DEBBIE girl"};
String[] out3 = {"HOST", "CARLA", "AL", "DEBBIE", "BOB", "HOSTESS", "BOB", "JO", "DAVE", "SUZIE"};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in30);
System.out.println("Output expected: " + out3 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out3);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in40 = {"X girl", "T boy", "J girl", "G boy", "J girl", "G boy", "J girl", "G boy", "J girl", "G boy", "J girl", "G boy", "J girl", "G boy", "J girl", "G boy", "J girl", "G boy", "J girl", "G boy", "J girl", "G boy", "J girl", "G boy", "J girl", "G boy", "J girl", "G boy", "J girl", "G boy", "J girl", "G boy", "J girl", "G boy", "J girl", "G boy", "J girl", "G boy", "J girl", "G boy", "J girl", "G boy", "J girl", "G boy", "J girl", "G boy", "J girl", "G boy"};
String[] out4 = {"HOST", "J", "G", "J", "G", "J", "G", "J", "G", "J", "G", "J", "G", "J", "G", "J", "G", "J", "G", "J", "G", "J", "G", "J", "G", "HOSTESS", "G", "J", "G", "J", "G", "J", "G", "J", "G", "J", "G", "J", "G", "J", "G", "J", "G", "J", "G", "J", "G", "J", "T", "X"};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in40);
System.out.println("Output expected: " + out4 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out4);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in50 = {"A boy", "S boy", "AA boy", "K boy", "ZZ girl", "YY girl", "XX girl", "VV girl"};
String[] out5 = {"HOST", "VV", "A", "XX", "AA", "HOSTESS", "K", "YY", "S", "ZZ"};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in50);
System.out.println("Output expected: " + out5 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out5);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in60 = {"BOB boy", "AM girl", "DAVE boy", "JO girl"};
String[] out6 = {"HOST", "AM", "BOB", "HOSTESS", "DAVE", "JO"};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in60);
System.out.println("Output expected: " + out6 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out6);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in70 = {"ROB boy", "AM girl", "DAVE boy", "JO girl"};
String[] out7 = {"HOST", "AM", "DAVE", "HOSTESS", "ROB", "JO"};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in70);
System.out.println("Output expected: " + out7 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out7);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in80 = {"AM girl", "ROB boy", "AM girl", "DAVE boy", "JO girl"};
String[] out8 = {};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in80);
System.out.println("Output expected: " + out8 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out8);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in90 = {"AM girl", "ROB boy", "JIM boy", "AM girl", "DAVE boy", "JO girl"};
String[] out9 = {};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in90);
System.out.println("Output expected: " + out9 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out9);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in100 = {"ROB boy", "AM girl", "JO girl", "DAVE boy"};
String[] out10 = {"HOST", "AM", "DAVE", "HOSTESS", "ROB", "JO"};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in100);
System.out.println("Output expected: " + out10 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out10);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in110 = {"BOB boy", "SAM girl", "DAVE boy", "JOHN boy", "BILL boy", "DEE girl", "JUNE girl", "JO girl", "A boy", "B boy", "C girl", "D girl"};
String[] out11 = {"HOST", "C", "A", "D", "B", "DEE", "BILL", "HOSTESS", "BOB", "JO", "DAVE", "JUNE", "JOHN", "SAM"};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in110);
System.out.println("Output expected: " + out11 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out11);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in120 = {"BOB boy", "SAM girl", "DAVE boy", "JOHN boy", "BILL boy", "DEE girl", "JUNE girl", "JO girl", "A boy", "B boy", "C boy", "D girl"};
String[] out12 = {};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in120);
System.out.println("Output expected: " + out12 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out12);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in130 = {"BOB boy", "SAM boy", "DAVE boy", "JOHN boy", "BILL boy", "DEE boy", "JUNE girl", "JO girl", "A girl", "B girl", "C girl", "D girl"};
String[] out13 = {"HOST", "A", "BILL", "B", "BOB", "C", "DAVE", "HOSTESS", "DEE", "D", "JOHN", "JO", "SAM", "JUNE"};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in130);
System.out.println("Output expected: " + out13 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out13);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in140 = {"BOB girl", "SAM girl", "DAVE boy", "JOHN boy", "BILL boy", "DEE girl", "JUNE girl", "JO girl", "A boy", "B boy", "C girl", "D boy"};
String[] out14 = {"HOST", "BOB", "A", "C", "B", "DEE", "BILL", "HOSTESS", "D", "JO", "DAVE", "JUNE", "JOHN", "SAM"};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in140);
System.out.println("Output expected: " + out14 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out14);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in150 = {"BOB boy", "SAM girl", "DAVE boy", "JOHN boy", "BILL boy", "DEE girl", "JUNE girl", "JO girl", "A boy", "B boy", "C girl", "D girl", "D boy", "D boy", "D girl", "D girl"};
String[] out15 = {"HOST", "C", "A", "D", "B", "D", "BILL", "D", "BOB", "HOSTESS", "D", "DEE", "D", "JO", "DAVE", "JUNE", "JOHN", "SAM"};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in150);
System.out.println("Output expected: " + out15 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out15);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in160 = {"BOB boy", "DEE girl", "JUNE girl", "JO girl", "A boy", "B boy", "C girl", "D girl"};
String[] out16 = {};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in160);
System.out.println("Output expected: " + out16 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out16);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in170 = {"BOB boy", "SAM girl", "DAVE boy", "JOHN girl", "BILL boy", "DEE girl", "JUNE boy", "JO girl", "A boy", "B girl", "C boy", "D girl"};
String[] out17 = {"HOST", "B", "A", "D", "BILL", "DEE", "BOB", "HOSTESS", "C", "JO", "DAVE", "JOHN", "JUNE", "SAM"};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in170);
System.out.println("Output expected: " + out17 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out17);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in180 = {"BOB boy", "SAM girl", "DAVEDAVEDAVEDAVEDAVE boy", "JOHN boy", "BILL boy", "DEE boy", "JUNE girl", "JO girl", "A boy", "B girl", "C girl", "D girl"};
String[] out18 = {"HOST", "B", "A", "C", "BILL", "D", "BOB", "HOSTESS", "DAVEDAVEDAVEDAVEDAVE", "JO", "DEE", "JUNE", "JOHN", "SAM"};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in180);
System.out.println("Output expected: " + out18 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out18);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in190 = {"BOB boy", "SAM girl", "DAVE boy", "C girl", "D girl"};
String[] out19 = {};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in190);
System.out.println("Output expected: " + out19 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out19);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in200 = {"JOHN boy", "CARLA girl"};
String[] out20 = {};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in200);
System.out.println("Output expected: " + out20 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out20);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in210 = {"A boy", "B girl", "C boy", "D girl", "E boy", "F girl"};
String[] out21 = {};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in210);
System.out.println("Output expected: " + out21 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out21);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in220 = {"BOB boy", "SAM girl", "DAVE boy", "JO girl"};
String[] out22 = {"HOST", "JO", "BOB", "HOSTESS", "DAVE", "SAM"};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in220);
System.out.println("Output expected: " + out22 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out22);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in230 = {"ALOK girl", "AMIT girl", "SURESH girl"};
String[] out23 = {};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in230);
System.out.println("Output expected: " + out23 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out23);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in240 = {"BOB boy", "BOB boy", "JILL boy", "JILL boy"};
String[] out24 = {};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in240);
System.out.println("Output expected: " + out24 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out24);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in250 = {"A boy", "G boy", "E boy", "Y girl", "U girl", "R girl"};
String[] out25 = {};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in250);
System.out.println("Output expected: " + out25 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out25);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in260 = {"A boy", "B boy", "C boy", "D girl", "E girl", "F girl"};
String[] out26 = {};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in260);
System.out.println("Output expected: " + out26 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out26);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in270 = {"ABC girl", "BXC boy", "ALJS girl", "SDF boy", "AEEEE boy", "ABEEE boy"};
String[] out27 = {};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in270);
System.out.println("Output expected: " + out27 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out27);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in280 = {"BOB boy", "ACE boy", "TOM boy", "GILL girl", "ANA girl", "JANNY girl"};
String[] out28 = {};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in280);
System.out.println("Output expected: " + out28 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out28);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in290 = {"ALICE boy", "BOB girl"};
String[] out29 = {};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in290);
System.out.println("Output expected: " + out29 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out29);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in300 = {"JANE girl", "MIKE boy", "BOYD boy", "SEAGIRL girl"};
String[] out30 = {"HOST", "JANE", "BOYD", "HOSTESS", "MIKE", "SEAGIRL"};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in300);
System.out.println("Output expected: " + out30 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out30);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in310 = {"A boy", "B boy", "C boy", "W girl", "R girl", "T girl"};
String[] out31 = {};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in310);
System.out.println("Output expected: " + out31 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out31);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in320 = {"BOB boy", "SUZIE girl", "DAVE boy", "JO girl", "AL boy", "BOB boy", "CARLA girl", "DEBBIE girl"};
String[] out32 = {"HOST", "CARLA", "AL", "DEBBIE", "BOB", "HOSTESS", "BOB", "JO", "DAVE", "SUZIE"};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in320);
System.out.println("Output expected: " + out32 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out32);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in330 = {"A boy", "B boy", "C boy", "E girl", "F girl", "T girl"};
String[] out33 = {};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in330);
System.out.println("Output expected: " + out33 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out33);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in340 = {"BOB boy", "SAM girl", "DAVE boy", "JO girl", "HOWARD boy", "JANE girl"};
String[] out34 = {};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in340);
System.out.println("Output expected: " + out34 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out34);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String[] in350 = {"TEST girl", "TEST girl", "TEST girl", "TEST boy", "TEST boy", "TEST boy"};
String[] out35 = {};
System.out.println("testing with input: ");
test = new PartySeats();
tmpVal = test.seating(in350);
System.out.println("Output expected: " + out35 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out35);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
    }
}
