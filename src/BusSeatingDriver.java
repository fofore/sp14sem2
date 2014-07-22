public class BusSeatingDriver {
public static void main(String [] args){
BusSeating test;
int mark = 0;
int counter = 0;
double tmpVal;
boolean result;
counter ++;
String in00 = "----------";
String in01 = "----------";
double out0 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in00, in01);
System.out.println("Output expected: " + out0 + " Output recieved: " + tmpVal );
result = tmpVal == out0;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in10 = "XXX-X-XX-X";
String in11 = "-XXXX---XX";
double out1 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in10, in11);
System.out.println("Output expected: " + out1 + " Output recieved: " + tmpVal );
result = tmpVal == out1;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in20 = "----------";
String in21 = "-XXXX---XX";
double out2 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in20, in21);
System.out.println("Output expected: " + out2 + " Output recieved: " + tmpVal );
result = tmpVal == out2;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in30 = "-X-X-X-X-X";
String in31 = "X-X-X-X-X-";
double out3 = 6.47213595499958;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in30, in31);
System.out.println("Output expected: " + out3 + " Output recieved: " + tmpVal );
result = tmpVal == out3;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in40 = "XXXXXXXXXX";
String in41 = "-XX-XX-X--";
double out4 = 6.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in40, in41);
System.out.println("Output expected: " + out4 + " Output recieved: " + tmpVal );
result = tmpVal == out4;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in50 = "XXX-X-XX-X";
String in51 = "XXX-X-XX-X";
double out5 = 6.82842712474619;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in50, in51);
System.out.println("Output expected: " + out5 + " Output recieved: " + tmpVal );
result = tmpVal == out5;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in60 = "X--X------";
String in61 = "X-XXX---XX";
double out6 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in60, in61);
System.out.println("Output expected: " + out6 + " Output recieved: " + tmpVal );
result = tmpVal == out6;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in70 = "XXXXXXXXX-";
String in71 = "--XXXXXXXX";
double out7 = 18.465755708528206;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in70, in71);
System.out.println("Output expected: " + out7 + " Output recieved: " + tmpVal );
result = tmpVal == out7;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in80 = "-X---X---X";
String in81 = "X--XXX---X";
double out8 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in80, in81);
System.out.println("Output expected: " + out8 + " Output recieved: " + tmpVal );
result = tmpVal == out8;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in90 = "XX--------";
String in91 = "XX-XX-XXXX";
double out9 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in90, in91);
System.out.println("Output expected: " + out9 + " Output recieved: " + tmpVal );
result = tmpVal == out9;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in100 = "X-XX-X--X-";
String in101 = "X-XX--XX--";
double out10 = 5.23606797749979;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in100, in101);
System.out.println("Output expected: " + out10 + " Output recieved: " + tmpVal );
result = tmpVal == out10;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in110 = "XXXXX---XX";
String in111 = "X-X-XXX-X-";
double out11 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in110, in111);
System.out.println("Output expected: " + out11 + " Output recieved: " + tmpVal );
result = tmpVal == out11;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in120 = "-X---X----";
String in121 = "-XXXX-XX--";
double out12 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in120, in121);
System.out.println("Output expected: " + out12 + " Output recieved: " + tmpVal );
result = tmpVal == out12;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in130 = "-XXX--XX--";
String in131 = "-XX-X-XX-X";
double out13 = 5.23606797749979;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in130, in131);
System.out.println("Output expected: " + out13 + " Output recieved: " + tmpVal );
result = tmpVal == out13;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in140 = "X-X-X-X-XX";
String in141 = "-XXX-X-X--";
double out14 = 6.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in140, in141);
System.out.println("Output expected: " + out14 + " Output recieved: " + tmpVal );
result = tmpVal == out14;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in150 = "--XXX-X-XX";
String in151 = "--XXX-X---";
double out15 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in150, in151);
System.out.println("Output expected: " + out15 + " Output recieved: " + tmpVal );
result = tmpVal == out15;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in160 = "XXX--XX-X-";
String in161 = "XX---XX---";
double out16 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in160, in161);
System.out.println("Output expected: " + out16 + " Output recieved: " + tmpVal );
result = tmpVal == out16;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in170 = "X-XXX-X---";
String in171 = "-XXX-X-X-X";
double out17 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in170, in171);
System.out.println("Output expected: " + out17 + " Output recieved: " + tmpVal );
result = tmpVal == out17;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in180 = "XX--XXX-XX";
String in181 = "X-X-X--X--";
double out18 = 5.23606797749979;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in180, in181);
System.out.println("Output expected: " + out18 + " Output recieved: " + tmpVal );
result = tmpVal == out18;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in190 = "X-X-XXX-XX";
String in191 = "X-----X---";
double out19 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in190, in191);
System.out.println("Output expected: " + out19 + " Output recieved: " + tmpVal );
result = tmpVal == out19;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in200 = "XX-XX-XXX-";
String in201 = "X--X---X-X";
double out20 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in200, in201);
System.out.println("Output expected: " + out20 + " Output recieved: " + tmpVal );
result = tmpVal == out20;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in210 = "XX-XXXX-XX";
String in211 = "X-XXXXXXX-";
double out21 = 13.56062329783655;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in210, in211);
System.out.println("Output expected: " + out21 + " Output recieved: " + tmpVal );
result = tmpVal == out21;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in220 = "---XX-XXXX";
String in221 = "X--X--XX--";
double out22 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in220, in221);
System.out.println("Output expected: " + out22 + " Output recieved: " + tmpVal );
result = tmpVal == out22;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in230 = "XX-X-X-XX-";
String in231 = "X--XXXX-X-";
double out23 = 5.23606797749979;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in230, in231);
System.out.println("Output expected: " + out23 + " Output recieved: " + tmpVal );
result = tmpVal == out23;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in240 = "X-XXXXX---";
String in241 = "--X-XXXX-X";
double out24 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in240, in241);
System.out.println("Output expected: " + out24 + " Output recieved: " + tmpVal );
result = tmpVal == out24;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in250 = "XXX---XX--";
String in251 = "XX---XX---";
double out25 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in250, in251);
System.out.println("Output expected: " + out25 + " Output recieved: " + tmpVal );
result = tmpVal == out25;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in260 = "---XXX----";
String in261 = "XXX-XX-X--";
double out26 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in260, in261);
System.out.println("Output expected: " + out26 + " Output recieved: " + tmpVal );
result = tmpVal == out26;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in270 = "XXXXXXXX-X";
String in271 = "X--XXX-XX-";
double out27 = 8.06449510224598;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in270, in271);
System.out.println("Output expected: " + out27 + " Output recieved: " + tmpVal );
result = tmpVal == out27;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in280 = "XX--XXX--X";
String in281 = "-------X--";
double out28 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in280, in281);
System.out.println("Output expected: " + out28 + " Output recieved: " + tmpVal );
result = tmpVal == out28;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in290 = "XX-XXX-X-X";
String in291 = "-X--X-X---";
double out29 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in290, in291);
System.out.println("Output expected: " + out29 + " Output recieved: " + tmpVal );
result = tmpVal == out29;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in300 = "X--X----X-";
String in301 = "--X-X-XX-X";
double out30 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in300, in301);
System.out.println("Output expected: " + out30 + " Output recieved: " + tmpVal );
result = tmpVal == out30;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in310 = "X--X-XXXXX";
String in311 = "X--X--X-XX";
double out31 = 5.23606797749979;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in310, in311);
System.out.println("Output expected: " + out31 + " Output recieved: " + tmpVal );
result = tmpVal == out31;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in320 = "-XXX-X-X--";
String in321 = "XX-XX-X-X-";
double out32 = 5.23606797749979;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in320, in321);
System.out.println("Output expected: " + out32 + " Output recieved: " + tmpVal );
result = tmpVal == out32;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in330 = "-XX--X--XX";
String in331 = "XXX--XX---";
double out33 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in330, in331);
System.out.println("Output expected: " + out33 + " Output recieved: " + tmpVal );
result = tmpVal == out33;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in340 = "-XX-X---X-";
String in341 = "-XXXXX-XXX";
double out34 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in340, in341);
System.out.println("Output expected: " + out34 + " Output recieved: " + tmpVal );
result = tmpVal == out34;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in350 = "X---XXX-XX";
String in351 = "--X----X-X";
double out35 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in350, in351);
System.out.println("Output expected: " + out35 + " Output recieved: " + tmpVal );
result = tmpVal == out35;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in360 = "XXX--XXXXX";
String in361 = "X-XXX-XXXX";
double out36 = 6.06449510224598;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in360, in361);
System.out.println("Output expected: " + out36 + " Output recieved: " + tmpVal );
result = tmpVal == out36;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in370 = "-XXXXXX--X";
String in371 = "XX--X-XX--";
double out37 = 5.23606797749979;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in370, in371);
System.out.println("Output expected: " + out37 + " Output recieved: " + tmpVal );
result = tmpVal == out37;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in380 = "---XX---XX";
String in381 = "X---X--X--";
double out38 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in380, in381);
System.out.println("Output expected: " + out38 + " Output recieved: " + tmpVal );
result = tmpVal == out38;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in390 = "-X--XX-X-X";
String in391 = "X-X-----X-";
double out39 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in390, in391);
System.out.println("Output expected: " + out39 + " Output recieved: " + tmpVal );
result = tmpVal == out39;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in400 = "X--XXXXX-X";
String in401 = "XXXXX-X-XX";
double out40 = 7.841619252963779;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in400, in401);
System.out.println("Output expected: " + out40 + " Output recieved: " + tmpVal );
result = tmpVal == out40;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in410 = "XX--X-XX--";
String in411 = "XX-X-XX--X";
double out41 = 5.23606797749979;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in410, in411);
System.out.println("Output expected: " + out41 + " Output recieved: " + tmpVal );
result = tmpVal == out41;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in420 = "X-X-X-X--X";
String in421 = "-XX-X-XX--";
double out42 = 5.23606797749979;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in420, in421);
System.out.println("Output expected: " + out42 + " Output recieved: " + tmpVal );
result = tmpVal == out42;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in430 = "-XXXXX--XX";
String in431 = "XXX-X---X-";
double out43 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in430, in431);
System.out.println("Output expected: " + out43 + " Output recieved: " + tmpVal );
result = tmpVal == out43;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in440 = "XXX-X-XXXX";
String in441 = "XXXX-XXXXX";
double out44 = 6.47213595499958;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in440, in441);
System.out.println("Output expected: " + out44 + " Output recieved: " + tmpVal );
result = tmpVal == out44;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in450 = "-X-XXXXX--";
String in451 = "XXX-X-X-XX";
double out45 = 6.06449510224598;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in450, in451);
System.out.println("Output expected: " + out45 + " Output recieved: " + tmpVal );
result = tmpVal == out45;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in460 = "X-X--XX--X";
String in461 = "X--XXX-X--";
double out46 = 5.23606797749979;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in460, in461);
System.out.println("Output expected: " + out46 + " Output recieved: " + tmpVal );
result = tmpVal == out46;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in470 = "XXXXXXXXXX";
String in471 = "XXX-X-X-X-";
double out47 = 8.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in470, in471);
System.out.println("Output expected: " + out47 + " Output recieved: " + tmpVal );
result = tmpVal == out47;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in480 = "XX-X--X-X-";
String in481 = "X-X-X-XX-X";
double out48 = 5.23606797749979;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in480, in481);
System.out.println("Output expected: " + out48 + " Output recieved: " + tmpVal );
result = tmpVal == out48;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in490 = "-X-XXXX-XX";
String in491 = "-X-X--XXX-";
double out49 = 6.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in490, in491);
System.out.println("Output expected: " + out49 + " Output recieved: " + tmpVal );
result = tmpVal == out49;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in500 = "X--X--X-XX";
String in501 = "XX-X-X-X-X";
double out50 = 5.23606797749979;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in500, in501);
System.out.println("Output expected: " + out50 + " Output recieved: " + tmpVal );
result = tmpVal == out50;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in510 = "X---XX---X";
String in511 = "-XXX--X---";
double out51 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in510, in511);
System.out.println("Output expected: " + out51 + " Output recieved: " + tmpVal );
result = tmpVal == out51;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in520 = "XXX--XX-XX";
String in521 = "XX--XXXX-X";
double out52 = 5.23606797749979;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in520, in521);
System.out.println("Output expected: " + out52 + " Output recieved: " + tmpVal );
result = tmpVal == out52;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in530 = "X-X-XX--X-";
String in531 = "--XX-XX-X-";
double out53 = 5.23606797749979;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in530, in531);
System.out.println("Output expected: " + out53 + " Output recieved: " + tmpVal );
result = tmpVal == out53;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in540 = "XXXXX-X--X";
String in541 = "XXXXXX--XX";
double out54 = 5.23606797749979;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in540, in541);
System.out.println("Output expected: " + out54 + " Output recieved: " + tmpVal );
result = tmpVal == out54;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in550 = "----X-X--X";
String in551 = "X---XXX-XX";
double out55 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in550, in551);
System.out.println("Output expected: " + out55 + " Output recieved: " + tmpVal );
result = tmpVal == out55;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in560 = "-XXXXXXXX-";
String in561 = "-XXXXXXXX-";
double out56 = 20.219544457292887;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in560, in561);
System.out.println("Output expected: " + out56 + " Output recieved: " + tmpVal );
result = tmpVal == out56;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in570 = "--X-X-XX--";
String in571 = "X--XX--X--";
double out57 = 5.23606797749979;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in570, in571);
System.out.println("Output expected: " + out57 + " Output recieved: " + tmpVal );
result = tmpVal == out57;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in580 = "-X--X-XXX-";
String in581 = "X-X--XXXX-";
double out58 = 5.23606797749979;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in580, in581);
System.out.println("Output expected: " + out58 + " Output recieved: " + tmpVal );
result = tmpVal == out58;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in590 = "-X-XXXX-XX";
String in591 = "XXXXXXXXX-";
double out59 = 14.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in590, in591);
System.out.println("Output expected: " + out59 + " Output recieved: " + tmpVal );
result = tmpVal == out59;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in600 = "XX-X--X--X";
String in601 = "-X-X-X-XXX";
double out60 = 5.23606797749979;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in600, in601);
System.out.println("Output expected: " + out60 + " Output recieved: " + tmpVal );
result = tmpVal == out60;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in610 = "-X--XX--X-";
String in611 = "-X--X-X--X";
double out61 = 5.23606797749979;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in610, in611);
System.out.println("Output expected: " + out61 + " Output recieved: " + tmpVal );
result = tmpVal == out61;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in620 = "-X--X-X-X-";
String in621 = "XXXX-X-X-X";
double out62 = 6.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in620, in621);
System.out.println("Output expected: " + out62 + " Output recieved: " + tmpVal );
result = tmpVal == out62;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in630 = "--XXX-X--X";
String in631 = "X-X-XX--X-";
double out63 = 5.23606797749979;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in630, in631);
System.out.println("Output expected: " + out63 + " Output recieved: " + tmpVal );
result = tmpVal == out63;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in640 = "-XXX-XXXXX";
String in641 = "--XXX-X---";
double out64 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in640, in641);
System.out.println("Output expected: " + out64 + " Output recieved: " + tmpVal );
result = tmpVal == out64;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in650 = "-XXX-X--X-";
String in651 = "-XX-XXX--X";
double out65 = 5.23606797749979;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in650, in651);
System.out.println("Output expected: " + out65 + " Output recieved: " + tmpVal );
result = tmpVal == out65;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in660 = "-X-XX--X--";
String in661 = "X-XXXXXXXX";
double out66 = 6.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in660, in661);
System.out.println("Output expected: " + out66 + " Output recieved: " + tmpVal );
result = tmpVal == out66;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in670 = "X-X-XX-X--";
String in671 = "XX-XXXXXXX";
double out67 = 6.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in670, in671);
System.out.println("Output expected: " + out67 + " Output recieved: " + tmpVal );
result = tmpVal == out67;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in680 = "XX-X-X-X--";
String in681 = "XXX-XXXXXX";
double out68 = 6.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in680, in681);
System.out.println("Output expected: " + out68 + " Output recieved: " + tmpVal );
result = tmpVal == out68;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in690 = "XXX-XX-X--";
String in691 = "XX-X-XXXXX";
double out69 = 6.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in690, in691);
System.out.println("Output expected: " + out69 + " Output recieved: " + tmpVal );
result = tmpVal == out69;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in700 = "X-X-X-X-X-";
String in701 = "-X-X-X-X-X";
double out70 = 6.47213595499958;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in700, in701);
System.out.println("Output expected: " + out70 + " Output recieved: " + tmpVal );
result = tmpVal == out70;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in710 = "XXX-X-XX-X";
String in711 = "XXX-X-XX-X";
double out71 = 6.82842712474619;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in710, in711);
System.out.println("Output expected: " + out71 + " Output recieved: " + tmpVal );
result = tmpVal == out71;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in720 = "XXXXXXXXXX";
String in721 = "-XX-XX-X--";
double out72 = 6.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in720, in721);
System.out.println("Output expected: " + out72 + " Output recieved: " + tmpVal );
result = tmpVal == out72;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in730 = "----------";
String in731 = "----------";
double out73 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in730, in731);
System.out.println("Output expected: " + out73 + " Output recieved: " + tmpVal );
result = tmpVal == out73;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in740 = "XXXXXXXXX-";
String in741 = "--XXXXXXXX";
double out74 = 18.465755708528206;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in740, in741);
System.out.println("Output expected: " + out74 + " Output recieved: " + tmpVal );
result = tmpVal == out74;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in750 = "---XXXXXXX";
String in751 = "XXXXXXXXXX";
double out75 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in750, in751);
System.out.println("Output expected: " + out75 + " Output recieved: " + tmpVal );
result = tmpVal == out75;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in760 = "------XXXX";
String in761 = "----------";
double out76 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in760, in761);
System.out.println("Output expected: " + out76 + " Output recieved: " + tmpVal );
result = tmpVal == out76;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in770 = "-XXXXXXXX-";
String in771 = "-XXXXXXXXX";
double out77 = 20.219544457292887;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in770, in771);
System.out.println("Output expected: " + out77 + " Output recieved: " + tmpVal );
result = tmpVal == out77;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in780 = "XXXXXXXXXX";
String in781 = "---XXX---X";
double out78 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in780, in781);
System.out.println("Output expected: " + out78 + " Output recieved: " + tmpVal );
result = tmpVal == out78;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in790 = "XXXXXXXXXX";
String in791 = "---XXXXXXX";
double out79 = 4.0;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in790, in791);
System.out.println("Output expected: " + out79 + " Output recieved: " + tmpVal );
result = tmpVal == out79;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in800 = "-XXXXXXXX-";
String in801 = "XXXXX-XXXX";
double out80 = 18.857300762134084;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in800, in801);
System.out.println("Output expected: " + out80 + " Output recieved: " + tmpVal );
result = tmpVal == out80;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in810 = "XXXXX-XXXX";
String in811 = "-XXXXXXXX-";
double out81 = 18.857300762134084;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in810, in811);
System.out.println("Output expected: " + out81 + " Output recieved: " + tmpVal );
result = tmpVal == out81;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in820 = "XXXXXXXXX-";
String in821 = "--XXXXXX--";
double out82 = 5.23606797749979;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in820, in821);
System.out.println("Output expected: " + out82 + " Output recieved: " + tmpVal );
result = tmpVal == out82;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in830 = "XXXXXXXXX-";
String in831 = "XXXXXXXX--";
double out83 = 5.23606797749979;
System.out.println("testing with input: ");
test = new BusSeating();
tmpVal = test.getArrangement(in830, in831);
System.out.println("Output expected: " + out83 + " Output recieved: " + tmpVal );
result = tmpVal == out83;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
    }
}
