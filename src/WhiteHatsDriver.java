import java.util.*;

public class WhiteHatsDriver {
public static void main(String [] args){
WhiteHats test;
int mark = 0;
int counter = 0;
int tmpVal;
boolean result;
counter ++;
int[] in00 = {2, 1, 1};
int out0 = 2;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in00);
System.out.println("Output expected: " + out0 + " Output recieved: " + tmpVal );
result = tmpVal == out0;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in10 = {2, 2, 2};
int out1 = 3;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in10);
System.out.println("Output expected: " + out1 + " Output recieved: " + tmpVal );
result = tmpVal == out1;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in20 = {0, 0};
int out2 = 0;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in20);
System.out.println("Output expected: " + out2 + " Output recieved: " + tmpVal );
result = tmpVal == out2;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in30 = {1, 1, 1, 2};
int out3 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in30);
System.out.println("Output expected: " + out3 + " Output recieved: " + tmpVal );
result = tmpVal == out3;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in40 = {10, 10};
int out4 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in40);
System.out.println("Output expected: " + out4 + " Output recieved: " + tmpVal );
result = tmpVal == out4;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in50 = {7, 8, 7, 8, 8, 7, 8, 7, 8, 7, 8, 7, 7, 8, 7, 8};
int out5 = 8;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in50);
System.out.println("Output expected: " + out5 + " Output recieved: " + tmpVal );
result = tmpVal == out5;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in60 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1};
int out6 = 1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in60);
System.out.println("Output expected: " + out6 + " Output recieved: " + tmpVal );
result = tmpVal == out6;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in70 = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2};
int out7 = 2;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in70);
System.out.println("Output expected: " + out7 + " Output recieved: " + tmpVal );
result = tmpVal == out7;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in80 = {7, 8, 7, 8, 8, 7, 8, 7, 8, 7, 8, 7, 7, 8, 7, 8};
int out8 = 8;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in80);
System.out.println("Output expected: " + out8 + " Output recieved: " + tmpVal );
result = tmpVal == out8;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in90 = {17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17};
int out9 = 18;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in90);
System.out.println("Output expected: " + out9 + " Output recieved: " + tmpVal );
result = tmpVal == out9;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in100 = {1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
int out10 = 1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in100);
System.out.println("Output expected: " + out10 + " Output recieved: " + tmpVal );
result = tmpVal == out10;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in110 = {1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
int out11 = 1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in110);
System.out.println("Output expected: " + out11 + " Output recieved: " + tmpVal );
result = tmpVal == out11;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in120 = {5, 5, 5, 5, 5, 5, 5};
int out12 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in120);
System.out.println("Output expected: " + out12 + " Output recieved: " + tmpVal );
result = tmpVal == out12;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in130 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int out13 = 0;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in130);
System.out.println("Output expected: " + out13 + " Output recieved: " + tmpVal );
result = tmpVal == out13;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in140 = {49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49};
int out14 = 50;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in140);
System.out.println("Output expected: " + out14 + " Output recieved: " + tmpVal );
result = tmpVal == out14;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in150 = {50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50};
int out15 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in150);
System.out.println("Output expected: " + out15 + " Output recieved: " + tmpVal );
result = tmpVal == out15;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in160 = {28, 29, 29, 28, 28, 28, 28, 29, 29, 29, 29, 28, 28, 29, 28, 28, 28, 28, 29, 28, 28, 29, 29, 28, 29, 28, 28, 28, 28, 29, 28, 28, 29, 28, 28, 29, 29, 29, 28, 28, 28, 29, 28, 28, 29, 28, 29, 28, 29, 29};
int out16 = 29;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in160);
System.out.println("Output expected: " + out16 + " Output recieved: " + tmpVal );
result = tmpVal == out16;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in170 = {19, 19, 19, 19, 18, 18, 18, 18, 18, 18, 18, 18, 19, 18, 18, 19, 19, 18, 19, 18, 19, 18, 19, 19, 18, 18, 18, 18, 19, 18, 18, 19};
int out17 = 19;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in170);
System.out.println("Output expected: " + out17 + " Output recieved: " + tmpVal );
result = tmpVal == out17;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in180 = {18, 18, 17, 17, 17, 17, 18, 17, 17, 17, 17, 17, 17, 17, 18, 17, 17, 17, 18, 18, 17, 17, 18, 17, 17, 18};
int out18 = 18;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in180);
System.out.println("Output expected: " + out18 + " Output recieved: " + tmpVal );
result = tmpVal == out18;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in190 = {7, 7, 7, 7, 7, 7, 7, 7};
int out19 = 8;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in190);
System.out.println("Output expected: " + out19 + " Output recieved: " + tmpVal );
result = tmpVal == out19;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in200 = {8, 7, 8, 8, 7, 8, 7, 7, 8, 8, 8, 8, 8, 8, 7, 8, 7, 7, 8, 8, 7, 8};
int out20 = 8;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in200);
System.out.println("Output expected: " + out20 + " Output recieved: " + tmpVal );
result = tmpVal == out20;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in210 = {29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 30};
int out21 = 30;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in210);
System.out.println("Output expected: " + out21 + " Output recieved: " + tmpVal );
result = tmpVal == out21;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in220 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1};
int out22 = 1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in220);
System.out.println("Output expected: " + out22 + " Output recieved: " + tmpVal );
result = tmpVal == out22;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in230 = {20, 21, 21, 21, 20, 20, 21, 21, 21, 20, 21, 20, 20, 21, 21, 21, 20, 20, 20, 21, 20, 20, 20, 20, 20, 20, 21, 20, 20, 20, 20, 20, 20, 21, 21, 21, 21, 21};
int out23 = 21;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in230);
System.out.println("Output expected: " + out23 + " Output recieved: " + tmpVal );
result = tmpVal == out23;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in240 = {19, 19, 20, 19, 19, 20, 19, 19, 20, 19, 20, 20, 19, 19, 20, 20, 20, 19, 19, 20, 20, 20, 19, 20, 20, 19, 19, 19, 19, 19, 19, 20, 20, 20, 19, 20, 19, 20};
int out24 = 20;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in240);
System.out.println("Output expected: " + out24 + " Output recieved: " + tmpVal );
result = tmpVal == out24;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in250 = {4, 5, 5, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 5, 5, 5, 5, 5, 5, 4, 5, 5, 5, 5, 5, 5};
int out25 = 5;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in250);
System.out.println("Output expected: " + out25 + " Output recieved: " + tmpVal );
result = tmpVal == out25;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in260 = {11, 12, 11, 11, 12, 11, 11, 11, 12, 11, 11, 11, 11, 11, 11, 12};
int out26 = 12;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in260);
System.out.println("Output expected: " + out26 + " Output recieved: " + tmpVal );
result = tmpVal == out26;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in270 = {20, 21, 20, 20, 21, 21, 20, 21, 21, 21, 20, 21, 21, 20, 21, 21, 21, 21, 20, 20, 21, 20, 20, 20, 21, 20, 20, 21, 20, 21, 20, 20, 20, 20, 21, 20, 21, 20, 21, 21, 21, 20, 21, 21};
int out27 = 21;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in270);
System.out.println("Output expected: " + out27 + " Output recieved: " + tmpVal );
result = tmpVal == out27;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in280 = {2, 2, 2};
int out28 = 3;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in280);
System.out.println("Output expected: " + out28 + " Output recieved: " + tmpVal );
result = tmpVal == out28;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in290 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int out29 = 0;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in290);
System.out.println("Output expected: " + out29 + " Output recieved: " + tmpVal );
result = tmpVal == out29;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in300 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int out30 = 0;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in300);
System.out.println("Output expected: " + out30 + " Output recieved: " + tmpVal );
result = tmpVal == out30;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in310 = {26, 25, 25, 25, 26, 25, 25, 25, 26, 25, 25, 26, 25, 25, 25, 25, 25, 25, 25, 25, 26, 25, 25, 25, 25, 26, 26, 25, 26, 25, 25, 25, 25, 25, 26};
int out31 = 26;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in310);
System.out.println("Output expected: " + out31 + " Output recieved: " + tmpVal );
result = tmpVal == out31;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in320 = {26, 26, 27, 26, 26, 26, 26, 26, 26, 27, 26, 27, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 27, 26, 26, 26, 26, 26, 26, 26, 26, 27, 27};
int out32 = 27;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in320);
System.out.println("Output expected: " + out32 + " Output recieved: " + tmpVal );
result = tmpVal == out32;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in330 = {19, 19, 20, 19, 20, 20, 19, 19, 19, 19, 20, 20, 19, 19, 19, 20, 19, 19, 20, 19, 19, 19, 19, 19, 20, 20, 19, 20, 20, 19, 19, 20, 20};
int out33 = 20;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in330);
System.out.println("Output expected: " + out33 + " Output recieved: " + tmpVal );
result = tmpVal == out33;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in340 = {4, 4, 3, 3, 3, 4, 3, 4, 4, 4};
int out34 = 4;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in340);
System.out.println("Output expected: " + out34 + " Output recieved: " + tmpVal );
result = tmpVal == out34;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in350 = {16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 17, 16, 16, 16, 16, 16, 16, 17};
int out35 = 17;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in350);
System.out.println("Output expected: " + out35 + " Output recieved: " + tmpVal );
result = tmpVal == out35;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in360 = {20, 20, 20, 19, 19, 19, 20, 20, 20, 19, 20, 20, 19, 20, 20, 19, 19, 20, 20, 19, 19, 20, 20, 20, 19, 19, 20, 20, 19, 19, 19, 19, 19, 19, 19, 20, 19, 19, 20, 20};
int out36 = 20;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in360);
System.out.println("Output expected: " + out36 + " Output recieved: " + tmpVal );
result = tmpVal == out36;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in370 = {3, 3, 3, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 3, 3, 3, 3, 3, 3, 3, 2, 3, 3, 3, 3, 3, 3, 3};
int out37 = 3;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in370);
System.out.println("Output expected: " + out37 + " Output recieved: " + tmpVal );
result = tmpVal == out37;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in380 = {10, 11, 11, 10, 10, 10, 10, 11, 11, 11, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 10, 10, 10, 11, 10, 10, 11, 11, 11};
int out38 = 11;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in380);
System.out.println("Output expected: " + out38 + " Output recieved: " + tmpVal );
result = tmpVal == out38;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in390 = {9, 9, 9, 9, 9, 9, 9, 8, 9, 9, 8, 9, 9, 9, 9, 8, 9, 9, 8, 9, 9, 9, 9, 9, 8, 9, 9, 8, 8, 8, 8, 9};
int out39 = 9;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in390);
System.out.println("Output expected: " + out39 + " Output recieved: " + tmpVal );
result = tmpVal == out39;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in400 = {1, 1, 2};
int out40 = 2;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in400);
System.out.println("Output expected: " + out40 + " Output recieved: " + tmpVal );
result = tmpVal == out40;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in410 = {27, 28, 27, 28, 28, 27, 28, 27, 27, 28, 28, 28, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 27, 28, 27, 27, 27, 28, 28, 27, 28, 27, 28};
int out41 = 28;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in410);
System.out.println("Output expected: " + out41 + " Output recieved: " + tmpVal );
result = tmpVal == out41;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in420 = {41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 42, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 42, 41, 41, 41, 41, 41, 42, 42};
int out42 = 42;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in420);
System.out.println("Output expected: " + out42 + " Output recieved: " + tmpVal );
result = tmpVal == out42;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in430 = {8, 8, 7, 8, 7, 8, 7, 8, 7, 7, 7, 8, 7, 7, 8};
int out43 = 8;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in430);
System.out.println("Output expected: " + out43 + " Output recieved: " + tmpVal );
result = tmpVal == out43;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in440 = {18, 19, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 19, 18, 19, 18, 18, 19, 19, 19};
int out44 = 19;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in440);
System.out.println("Output expected: " + out44 + " Output recieved: " + tmpVal );
result = tmpVal == out44;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in450 = {14, 13, 13, 13, 13, 13, 14, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 13, 13, 13, 13, 14};
int out45 = 14;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in450);
System.out.println("Output expected: " + out45 + " Output recieved: " + tmpVal );
result = tmpVal == out45;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in460 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int out46 = 0;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in460);
System.out.println("Output expected: " + out46 + " Output recieved: " + tmpVal );
result = tmpVal == out46;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in470 = {5, 5, 5, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 5, 5, 4, 5, 5, 5, 5, 5, 5, 4, 4, 5, 5, 5, 5, 5, 5};
int out47 = 5;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in470);
System.out.println("Output expected: " + out47 + " Output recieved: " + tmpVal );
result = tmpVal == out47;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in480 = {9, 8, 8, 8, 9, 9, 8, 8, 8, 8, 9, 9, 9, 9, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 8, 9, 9};
int out48 = 9;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in480);
System.out.println("Output expected: " + out48 + " Output recieved: " + tmpVal );
result = tmpVal == out48;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in490 = {12, 11, 11, 11, 11, 12, 12, 12, 11, 11, 12, 12, 12, 12, 11, 11, 12, 12, 12, 12, 12, 11, 11, 12, 12, 12, 12, 12, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12};
int out49 = 12;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in490);
System.out.println("Output expected: " + out49 + " Output recieved: " + tmpVal );
result = tmpVal == out49;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in500 = {23, 22, 22, 22, 22, 23, 22, 22, 22, 22, 22, 22, 22, 22, 23, 22, 22, 22, 22, 22, 22, 23, 22, 22, 23, 22, 22, 23, 22, 23, 23, 0};
int out50 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in500);
System.out.println("Output expected: " + out50 + " Output recieved: " + tmpVal );
result = tmpVal == out50;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in510 = {21, 21, 21, 21, 21, 22, 21, 22, 22, 22, 21, 22, 22, 21, 22, 22, 22, 21, 21, 22, 22, 21, 22, 21, 22, 22, 22, 22, 21, 21, 21, 21, 22, 21, 21, 21, 22, 21, 21, 22, 22, 22, 21, 21};
int out51 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in510);
System.out.println("Output expected: " + out51 + " Output recieved: " + tmpVal );
result = tmpVal == out51;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in520 = {4, 4, 4, 6, 4, 4, 6};
int out52 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in520);
System.out.println("Output expected: " + out52 + " Output recieved: " + tmpVal );
result = tmpVal == out52;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in530 = {2, 2, 2, 2, 4, 4};
int out53 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in530);
System.out.println("Output expected: " + out53 + " Output recieved: " + tmpVal );
result = tmpVal == out53;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in540 = {5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 0};
int out54 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in540);
System.out.println("Output expected: " + out54 + " Output recieved: " + tmpVal );
result = tmpVal == out54;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in550 = {2, 2};
int out55 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in550);
System.out.println("Output expected: " + out55 + " Output recieved: " + tmpVal );
result = tmpVal == out55;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in560 = {1, 1, 1, 1, 1, 1, 1, 1, 8};
int out56 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in560);
System.out.println("Output expected: " + out56 + " Output recieved: " + tmpVal );
result = tmpVal == out56;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in570 = {34, 34, 33, 33, 33, 33, 34, 34, 33, 34, 33, 33, 34, 34, 33, 34, 33, 33, 34, 33, 33, 33, 33, 33, 34, 33, 33, 33, 33, 34, 32, 33, 33, 33, 33, 33, 33, 33, 34, 34, 34, 33, 33, 33, 33, 33, 33, 33, 34, 34};
int out57 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in570);
System.out.println("Output expected: " + out57 + " Output recieved: " + tmpVal );
result = tmpVal == out57;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in580 = {25, 25, 25, 25, 26, 26, 26, 26, 26, 26, 26, 25, 25, 25, 26, 25, 25, 26, 25, 25, 25, 26, 25, 25, 26, 25, 26, 25, 25, 26, 25, 26, 26, 26, 25, 26, 25, 25, 26, 25, 26, 26, 25, 25, 26, 25, 26, 26, 26};
int out58 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in580);
System.out.println("Output expected: " + out58 + " Output recieved: " + tmpVal );
result = tmpVal == out58;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in590 = {0, 0};
int out59 = 0;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in590);
System.out.println("Output expected: " + out59 + " Output recieved: " + tmpVal );
result = tmpVal == out59;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in600 = {1, 1};
int out60 = 2;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in600);
System.out.println("Output expected: " + out60 + " Output recieved: " + tmpVal );
result = tmpVal == out60;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in610 = {1, 0};
int out61 = 1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in610);
System.out.println("Output expected: " + out61 + " Output recieved: " + tmpVal );
result = tmpVal == out61;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in620 = {0, 0, 1};
int out62 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in620);
System.out.println("Output expected: " + out62 + " Output recieved: " + tmpVal );
result = tmpVal == out62;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in630 = {0, 2};
int out63 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in630);
System.out.println("Output expected: " + out63 + " Output recieved: " + tmpVal );
result = tmpVal == out63;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in640 = {4, 4, 3, 5, 4, 5};
int out64 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in640);
System.out.println("Output expected: " + out64 + " Output recieved: " + tmpVal );
result = tmpVal == out64;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in650 = {4, 3, 1, 0, 0};
int out65 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in650);
System.out.println("Output expected: " + out65 + " Output recieved: " + tmpVal );
result = tmpVal == out65;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in660 = {3, 3, 3, 3, 3};
int out66 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in660);
System.out.println("Output expected: " + out66 + " Output recieved: " + tmpVal );
result = tmpVal == out66;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in670 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0};
int out67 = 1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in670);
System.out.println("Output expected: " + out67 + " Output recieved: " + tmpVal );
result = tmpVal == out67;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in680 = {2, 2, 2};
int out68 = 3;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in680);
System.out.println("Output expected: " + out68 + " Output recieved: " + tmpVal );
result = tmpVal == out68;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in690 = {5, 0, 0, 0, 0, 0};
int out69 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in690);
System.out.println("Output expected: " + out69 + " Output recieved: " + tmpVal );
result = tmpVal == out69;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in700 = {5, 5, 5, 5, 5, 5, 5, 5};
int out70 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in700);
System.out.println("Output expected: " + out70 + " Output recieved: " + tmpVal );
result = tmpVal == out70;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in710 = {1, 1, 1, 1, 2, 2};
int out71 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in710);
System.out.println("Output expected: " + out71 + " Output recieved: " + tmpVal );
result = tmpVal == out71;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in720 = {1, 1, 1, 2};
int out72 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in720);
System.out.println("Output expected: " + out72 + " Output recieved: " + tmpVal );
result = tmpVal == out72;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in730 = {0, 0, 1, 2};
int out73 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in730);
System.out.println("Output expected: " + out73 + " Output recieved: " + tmpVal );
result = tmpVal == out73;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in740 = {3, 3, 3, 4, 4, 4, 4, 3};
int out74 = 4;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in740);
System.out.println("Output expected: " + out74 + " Output recieved: " + tmpVal );
result = tmpVal == out74;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in750 = {1, 1, 1, 1, 1, 1, 1};
int out75 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in750);
System.out.println("Output expected: " + out75 + " Output recieved: " + tmpVal );
result = tmpVal == out75;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in760 = {2, 2, 0};
int out76 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in760);
System.out.println("Output expected: " + out76 + " Output recieved: " + tmpVal );
result = tmpVal == out76;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in770 = {0, 0, 0, 3};
int out77 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in770);
System.out.println("Output expected: " + out77 + " Output recieved: " + tmpVal );
result = tmpVal == out77;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in780 = {3, 3, 3, 4, 4, 4, 4};
int out78 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in780);
System.out.println("Output expected: " + out78 + " Output recieved: " + tmpVal );
result = tmpVal == out78;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in790 = {1, 1, 1, 1, 1, 1};
int out79 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in790);
System.out.println("Output expected: " + out79 + " Output recieved: " + tmpVal );
result = tmpVal == out79;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in800 = {1, 1, 1, 3};
int out80 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in800);
System.out.println("Output expected: " + out80 + " Output recieved: " + tmpVal );
result = tmpVal == out80;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in810 = {1, 1, 2};
int out81 = 2;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in810);
System.out.println("Output expected: " + out81 + " Output recieved: " + tmpVal );
result = tmpVal == out81;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in820 = {0, 1, 2, 0};
int out82 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in820);
System.out.println("Output expected: " + out82 + " Output recieved: " + tmpVal );
result = tmpVal == out82;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in830 = {2, 2, 2, 2, 2, 2};
int out83 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in830);
System.out.println("Output expected: " + out83 + " Output recieved: " + tmpVal );
result = tmpVal == out83;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in840 = {2, 2, 2, 2, 2, 2, 2};
int out84 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in840);
System.out.println("Output expected: " + out84 + " Output recieved: " + tmpVal );
result = tmpVal == out84;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in850 = {25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24};
int out85 = 25;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in850);
System.out.println("Output expected: " + out85 + " Output recieved: " + tmpVal );
result = tmpVal == out85;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in860 = {2, 2, 2, 2};
int out86 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in860);
System.out.println("Output expected: " + out86 + " Output recieved: " + tmpVal );
result = tmpVal == out86;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in870 = {1, 1, 3, 4};
int out87 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in870);
System.out.println("Output expected: " + out87 + " Output recieved: " + tmpVal );
result = tmpVal == out87;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in880 = {1, 0};
int out88 = 1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in880);
System.out.println("Output expected: " + out88 + " Output recieved: " + tmpVal );
result = tmpVal == out88;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in890 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0};
int out89 = 1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in890);
System.out.println("Output expected: " + out89 + " Output recieved: " + tmpVal );
result = tmpVal == out89;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in900 = {4, 4, 4, 4, 4, 5, 5, 5};
int out90 = 5;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in900);
System.out.println("Output expected: " + out90 + " Output recieved: " + tmpVal );
result = tmpVal == out90;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in910 = {3, 3, 2, 3, 1};
int out91 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in910);
System.out.println("Output expected: " + out91 + " Output recieved: " + tmpVal );
result = tmpVal == out91;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in920 = {2, 2, 2, 2, 2, 2, 1};
int out92 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in920);
System.out.println("Output expected: " + out92 + " Output recieved: " + tmpVal );
result = tmpVal == out92;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in930 = {1, 1, 1};
int out93 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in930);
System.out.println("Output expected: " + out93 + " Output recieved: " + tmpVal );
result = tmpVal == out93;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in940 = {0, 1};
int out94 = 1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in940);
System.out.println("Output expected: " + out94 + " Output recieved: " + tmpVal );
result = tmpVal == out94;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in950 = {3, 3, 3, 3, 4, 4, 4};
int out95 = 4;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in950);
System.out.println("Output expected: " + out95 + " Output recieved: " + tmpVal );
result = tmpVal == out95;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in960 = {3, 0, 1};
int out96 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in960);
System.out.println("Output expected: " + out96 + " Output recieved: " + tmpVal );
result = tmpVal == out96;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in970 = {1, 2, 3};
int out97 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in970);
System.out.println("Output expected: " + out97 + " Output recieved: " + tmpVal );
result = tmpVal == out97;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in980 = {3, 3, 0, 0};
int out98 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in980);
System.out.println("Output expected: " + out98 + " Output recieved: " + tmpVal );
result = tmpVal == out98;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in990 = {1, 0, 3, 0, 0, 0};
int out99 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in990);
System.out.println("Output expected: " + out99 + " Output recieved: " + tmpVal );
result = tmpVal == out99;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1000 = {3, 3, 3, 3, 3, 3};
int out100 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1000);
System.out.println("Output expected: " + out100 + " Output recieved: " + tmpVal );
result = tmpVal == out100;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1010 = {2, 0, 0};
int out101 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1010);
System.out.println("Output expected: " + out101 + " Output recieved: " + tmpVal );
result = tmpVal == out101;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1020 = {1, 4, 1, 3};
int out102 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1020);
System.out.println("Output expected: " + out102 + " Output recieved: " + tmpVal );
result = tmpVal == out102;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1030 = {0, 1, 2};
int out103 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1030);
System.out.println("Output expected: " + out103 + " Output recieved: " + tmpVal );
result = tmpVal == out103;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1040 = {2, 2, 2, 2, 3, 4};
int out104 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1040);
System.out.println("Output expected: " + out104 + " Output recieved: " + tmpVal );
result = tmpVal == out104;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1050 = {5, 4, 4, 4, 4};
int out105 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1050);
System.out.println("Output expected: " + out105 + " Output recieved: " + tmpVal );
result = tmpVal == out105;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1060 = {1, 2};
int out106 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1060);
System.out.println("Output expected: " + out106 + " Output recieved: " + tmpVal );
result = tmpVal == out106;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1070 = {4, 4, 4, 4};
int out107 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1070);
System.out.println("Output expected: " + out107 + " Output recieved: " + tmpVal );
result = tmpVal == out107;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1080 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0};
int out108 = 1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1080);
System.out.println("Output expected: " + out108 + " Output recieved: " + tmpVal );
result = tmpVal == out108;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1090 = {2, 2, 2, 0};
int out109 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1090);
System.out.println("Output expected: " + out109 + " Output recieved: " + tmpVal );
result = tmpVal == out109;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1100 = {0, 0, 2, 2};
int out110 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1100);
System.out.println("Output expected: " + out110 + " Output recieved: " + tmpVal );
result = tmpVal == out110;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1110 = {3, 3, 3, 3, 3, 3, 3, 3};
int out111 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1110);
System.out.println("Output expected: " + out111 + " Output recieved: " + tmpVal );
result = tmpVal == out111;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1120 = {0, 0, 2};
int out112 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1120);
System.out.println("Output expected: " + out112 + " Output recieved: " + tmpVal );
result = tmpVal == out112;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1130 = {4, 0, 0, 0, 0};
int out113 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1130);
System.out.println("Output expected: " + out113 + " Output recieved: " + tmpVal );
result = tmpVal == out113;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1140 = {2, 2};
int out114 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1140);
System.out.println("Output expected: " + out114 + " Output recieved: " + tmpVal );
result = tmpVal == out114;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1150 = {2, 3, 1};
int out115 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1150);
System.out.println("Output expected: " + out115 + " Output recieved: " + tmpVal );
result = tmpVal == out115;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1160 = {2, 2, 2, 1, 1};
int out116 = 2;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1160);
System.out.println("Output expected: " + out116 + " Output recieved: " + tmpVal );
result = tmpVal == out116;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1170 = {10, 11};
int out117 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1170);
System.out.println("Output expected: " + out117 + " Output recieved: " + tmpVal );
result = tmpVal == out117;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1180 = {4, 1, 1, 1, 1};
int out118 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1180);
System.out.println("Output expected: " + out118 + " Output recieved: " + tmpVal );
result = tmpVal == out118;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1190 = {2, 2, 1, 1, 1};
int out119 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1190);
System.out.println("Output expected: " + out119 + " Output recieved: " + tmpVal );
result = tmpVal == out119;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1200 = {2, 1, 1, 3, 3};
int out120 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1200);
System.out.println("Output expected: " + out120 + " Output recieved: " + tmpVal );
result = tmpVal == out120;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1210 = {1, 1};
int out121 = 2;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1210);
System.out.println("Output expected: " + out121 + " Output recieved: " + tmpVal );
result = tmpVal == out121;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1220 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
int out122 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1220);
System.out.println("Output expected: " + out122 + " Output recieved: " + tmpVal );
result = tmpVal == out122;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1230 = {1, 1, 2, 3};
int out123 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1230);
System.out.println("Output expected: " + out123 + " Output recieved: " + tmpVal );
result = tmpVal == out123;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1240 = {0, 1, 2, 2, 3};
int out124 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1240);
System.out.println("Output expected: " + out124 + " Output recieved: " + tmpVal );
result = tmpVal == out124;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1250 = {6, 10, 6, 6, 6, 6, 6, 5, 5, 6};
int out125 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1250);
System.out.println("Output expected: " + out125 + " Output recieved: " + tmpVal );
result = tmpVal == out125;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1260 = {1, 2, 3, 0};
int out126 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1260);
System.out.println("Output expected: " + out126 + " Output recieved: " + tmpVal );
result = tmpVal == out126;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1270 = {1, 2, 3, 3, 3, 3, 3};
int out127 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1270);
System.out.println("Output expected: " + out127 + " Output recieved: " + tmpVal );
result = tmpVal == out127;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1280 = {0, 1, 1};
int out128 = 1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1280);
System.out.println("Output expected: " + out128 + " Output recieved: " + tmpVal );
result = tmpVal == out128;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1290 = {0, 1, 1, 1, 1};
int out129 = 1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1290);
System.out.println("Output expected: " + out129 + " Output recieved: " + tmpVal );
result = tmpVal == out129;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1300 = {1, 1, 2, 2, 2, 2, 2};
int out130 = 2;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1300);
System.out.println("Output expected: " + out130 + " Output recieved: " + tmpVal );
result = tmpVal == out130;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1310 = {1, 0, 1};
int out131 = 1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1310);
System.out.println("Output expected: " + out131 + " Output recieved: " + tmpVal );
result = tmpVal == out131;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1320 = {2, 0};
int out132 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1320);
System.out.println("Output expected: " + out132 + " Output recieved: " + tmpVal );
result = tmpVal == out132;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1330 = {2, 2, 2, 2, 2};
int out133 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1330);
System.out.println("Output expected: " + out133 + " Output recieved: " + tmpVal );
result = tmpVal == out133;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1340 = {3, 3, 3, 3, 3, 3, 3};
int out134 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1340);
System.out.println("Output expected: " + out134 + " Output recieved: " + tmpVal );
result = tmpVal == out134;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1350 = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
int out135 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1350);
System.out.println("Output expected: " + out135 + " Output recieved: " + tmpVal );
result = tmpVal == out135;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1360 = {4, 0, 0};
int out136 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1360);
System.out.println("Output expected: " + out136 + " Output recieved: " + tmpVal );
result = tmpVal == out136;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1370 = {0, 0, 0, 0, 1};
int out137 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1370);
System.out.println("Output expected: " + out137 + " Output recieved: " + tmpVal );
result = tmpVal == out137;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1380 = {0, 2, 2, 2, 2};
int out138 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1380);
System.out.println("Output expected: " + out138 + " Output recieved: " + tmpVal );
result = tmpVal == out138;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1390 = {3, 3, 2, 2, 2};
int out139 = 3;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1390);
System.out.println("Output expected: " + out139 + " Output recieved: " + tmpVal );
result = tmpVal == out139;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1400 = {1, 0, 1, 1};
int out140 = 1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1400);
System.out.println("Output expected: " + out140 + " Output recieved: " + tmpVal );
result = tmpVal == out140;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1410 = {2, 1, 2, 3};
int out141 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1410);
System.out.println("Output expected: " + out141 + " Output recieved: " + tmpVal );
result = tmpVal == out141;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1420 = {1, 1, 3};
int out142 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1420);
System.out.println("Output expected: " + out142 + " Output recieved: " + tmpVal );
result = tmpVal == out142;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1430 = {2, 3, 2, 2, 1};
int out143 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1430);
System.out.println("Output expected: " + out143 + " Output recieved: " + tmpVal );
result = tmpVal == out143;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1440 = {0, 0, 0, 0, 12};
int out144 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1440);
System.out.println("Output expected: " + out144 + " Output recieved: " + tmpVal );
result = tmpVal == out144;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1450 = {2, 2, 2, 2, 2, 5};
int out145 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1450);
System.out.println("Output expected: " + out145 + " Output recieved: " + tmpVal );
result = tmpVal == out145;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1460 = {20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19};
int out146 = 20;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1460);
System.out.println("Output expected: " + out146 + " Output recieved: " + tmpVal );
result = tmpVal == out146;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1470 = {1, 1, 3, 1, 2};
int out147 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1470);
System.out.println("Output expected: " + out147 + " Output recieved: " + tmpVal );
result = tmpVal == out147;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1480 = {3, 2, 1, 3};
int out148 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1480);
System.out.println("Output expected: " + out148 + " Output recieved: " + tmpVal );
result = tmpVal == out148;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1490 = {0, 1, 1, 1};
int out149 = 1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1490);
System.out.println("Output expected: " + out149 + " Output recieved: " + tmpVal );
result = tmpVal == out149;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1500 = {3, 3, 3, 3, 4};
int out150 = 4;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1500);
System.out.println("Output expected: " + out150 + " Output recieved: " + tmpVal );
result = tmpVal == out150;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1510 = {49, 49, 49, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
int out151 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1510);
System.out.println("Output expected: " + out151 + " Output recieved: " + tmpVal );
result = tmpVal == out151;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1520 = {4, 4, 4, 4, 4, 5, 5};
int out152 = 5;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1520);
System.out.println("Output expected: " + out152 + " Output recieved: " + tmpVal );
result = tmpVal == out152;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1530 = {3, 3, 3, 3, 3, 5};
int out153 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1530);
System.out.println("Output expected: " + out153 + " Output recieved: " + tmpVal );
result = tmpVal == out153;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1540 = {3, 4, 4, 4, 3};
int out154 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1540);
System.out.println("Output expected: " + out154 + " Output recieved: " + tmpVal );
result = tmpVal == out154;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1550 = {2, 4, 3, 2, 1};
int out155 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1550);
System.out.println("Output expected: " + out155 + " Output recieved: " + tmpVal );
result = tmpVal == out155;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1560 = {1, 2, 3, 4, 2};
int out156 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1560);
System.out.println("Output expected: " + out156 + " Output recieved: " + tmpVal );
result = tmpVal == out156;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1570 = {2, 1, 2};
int out157 = -1;
System.out.println("testing with input: ");
test = new WhiteHats();
tmpVal = test.whiteNumber(in1570);
System.out.println("Output expected: " + out157 + " Output recieved: " + tmpVal );
result = tmpVal == out157;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
    }
}
