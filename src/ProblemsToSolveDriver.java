import java.util.*;

public class ProblemsToSolveDriver {
public static void main(String [] args){
ProblemsToSolve test;
int mark = 0;
int counter = 0;
int tmpVal;
boolean result;
counter ++;
int[] in00 = {1, 2, 3};
int in01 = 2;
int out0 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in00, in01);
System.out.println("Output expected: " + out0 + " Output recieved: " + tmpVal );
result = tmpVal == out0;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in10 = {1, 2, 3, 4, 5};
int in11 = 4;
int out1 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in10, in11);
System.out.println("Output expected: " + out1 + " Output recieved: " + tmpVal );
result = tmpVal == out1;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in20 = {10, 1, 12, 101};
int in21 = 100;
int out2 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in20, in21);
System.out.println("Output expected: " + out2 + " Output recieved: " + tmpVal );
result = tmpVal == out2;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in30 = {10, 1};
int in31 = 9;
int out3 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in30, in31);
System.out.println("Output expected: " + out3 + " Output recieved: " + tmpVal );
result = tmpVal == out3;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in40 = {1};
int in41 = 1;
int out4 = 1;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in40, in41);
System.out.println("Output expected: " + out4 + " Output recieved: " + tmpVal );
result = tmpVal == out4;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in50 = {1, 1};
int in51 = 1;
int out5 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in50, in51);
System.out.println("Output expected: " + out5 + " Output recieved: " + tmpVal );
result = tmpVal == out5;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in60 = {2, 2, 2};
int in61 = 1;
int out6 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in60, in61);
System.out.println("Output expected: " + out6 + " Output recieved: " + tmpVal );
result = tmpVal == out6;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in70 = {1, 4, 1, 2};
int in71 = 1;
int out7 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in70, in71);
System.out.println("Output expected: " + out7 + " Output recieved: " + tmpVal );
result = tmpVal == out7;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in80 = {5, 5, 4, 1, 4};
int in81 = 4;
int out8 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in80, in81);
System.out.println("Output expected: " + out8 + " Output recieved: " + tmpVal );
result = tmpVal == out8;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in90 = {5, 2, 5, 1, 5, 5};
int in91 = 2;
int out9 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in90, in91);
System.out.println("Output expected: " + out9 + " Output recieved: " + tmpVal );
result = tmpVal == out9;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in100 = {6, 1, 4, 7, 4, 6, 7};
int in101 = 3;
int out10 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in100, in101);
System.out.println("Output expected: " + out10 + " Output recieved: " + tmpVal );
result = tmpVal == out10;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in110 = {6, 4, 1, 4, 8, 5, 5, 2};
int in111 = 4;
int out11 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in110, in111);
System.out.println("Output expected: " + out11 + " Output recieved: " + tmpVal );
result = tmpVal == out11;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in120 = {6, 2, 6, 2, 6, 3, 3, 3, 7};
int in121 = 4;
int out12 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in120, in121);
System.out.println("Output expected: " + out12 + " Output recieved: " + tmpVal );
result = tmpVal == out12;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in130 = {8, 3, 10, 10, 5, 1, 6, 5, 4, 7};
int in131 = 5;
int out13 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in130, in131);
System.out.println("Output expected: " + out13 + " Output recieved: " + tmpVal );
result = tmpVal == out13;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in140 = {1, 8, 11, 3, 9, 7, 8, 9, 10, 5, 10};
int in141 = 3;
int out14 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in140, in141);
System.out.println("Output expected: " + out14 + " Output recieved: " + tmpVal );
result = tmpVal == out14;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in150 = {9, 2, 12, 10, 5, 4, 8, 2, 2, 4, 1, 1};
int in151 = 8;
int out15 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in150, in151);
System.out.println("Output expected: " + out15 + " Output recieved: " + tmpVal );
result = tmpVal == out15;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in160 = {7, 7, 8, 10, 9, 4, 12, 2, 4, 8, 12, 3, 6};
int in161 = 9;
int out16 = 5;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in160, in161);
System.out.println("Output expected: " + out16 + " Output recieved: " + tmpVal );
result = tmpVal == out16;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in170 = {13, 14, 12, 14, 3, 5, 2, 12, 9, 3, 13, 11, 1, 13};
int in171 = 13;
int out17 = 8;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in170, in171);
System.out.println("Output expected: " + out17 + " Output recieved: " + tmpVal );
result = tmpVal == out17;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in180 = {12, 13, 6, 1, 5, 12, 11, 5, 13, 3, 1, 14, 11, 9, 1};
int in181 = 13;
int out18 = 7;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in180, in181);
System.out.println("Output expected: " + out18 + " Output recieved: " + tmpVal );
result = tmpVal == out18;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in190 = {7, 4, 14, 13, 3, 5, 14, 3, 14, 13, 10, 10, 3, 3, 4, 4};
int in191 = 11;
int out19 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in190, in191);
System.out.println("Output expected: " + out19 + " Output recieved: " + tmpVal );
result = tmpVal == out19;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in200 = {16, 8, 8, 11, 5, 8, 2, 6, 9, 12, 8, 2, 6, 4, 5, 6, 8};
int in201 = 3;
int out20 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in200, in201);
System.out.println("Output expected: " + out20 + " Output recieved: " + tmpVal );
result = tmpVal == out20;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in210 = {9, 5, 8, 15, 18, 15, 2, 7, 13, 17, 13, 2, 6, 7, 1, 14, 17, 13};
int in211 = 13;
int out21 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in210, in211);
System.out.println("Output expected: " + out21 + " Output recieved: " + tmpVal );
result = tmpVal == out21;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in220 = {19, 8, 11, 17, 4, 15, 19, 17, 8, 13, 17, 11, 1, 18, 6, 19, 4, 14, 11};
int in221 = 8;
int out22 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in220, in221);
System.out.println("Output expected: " + out22 + " Output recieved: " + tmpVal );
result = tmpVal == out22;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in230 = {9, 11, 2, 7, 3, 1, 15, 2, 15, 14, 15, 4, 13, 7, 3, 12, 17, 7, 4, 3};
int in231 = 11;
int out23 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in230, in231);
System.out.println("Output expected: " + out23 + " Output recieved: " + tmpVal );
result = tmpVal == out23;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in240 = {18, 3, 14, 17, 14, 1, 2, 8, 8, 16, 10, 10, 12, 11, 11, 14, 14, 14, 6, 20, 4};
int in241 = 7;
int out24 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in240, in241);
System.out.println("Output expected: " + out24 + " Output recieved: " + tmpVal );
result = tmpVal == out24;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in250 = {2, 8, 20, 9, 10, 13, 9, 1, 10, 17, 17, 6, 12, 9, 2, 8, 16, 22, 22, 19, 11, 21};
int in251 = 17;
int out25 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in250, in251);
System.out.println("Output expected: " + out25 + " Output recieved: " + tmpVal );
result = tmpVal == out25;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in260 = {17, 21, 16, 18, 6, 18, 22, 19, 8, 8, 21, 9, 22, 23, 5, 15, 4, 23, 5, 14, 19, 21, 11};
int in261 = 18;
int out26 = 9;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in260, in261);
System.out.println("Output expected: " + out26 + " Output recieved: " + tmpVal );
result = tmpVal == out26;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in270 = {6, 16, 18, 20, 6, 10, 9, 9, 3, 4, 22, 5, 3, 12, 11, 22, 1, 18, 23, 23, 24, 4, 4, 21};
int in271 = 19;
int out27 = 6;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in270, in271);
System.out.println("Output expected: " + out27 + " Output recieved: " + tmpVal );
result = tmpVal == out27;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in280 = {13, 13, 18, 6, 1, 1, 9, 8, 17, 22, 11, 16, 11, 21, 12, 6, 3, 8, 18, 6, 14, 15, 14, 15, 22};
int in281 = 11;
int out28 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in280, in281);
System.out.println("Output expected: " + out28 + " Output recieved: " + tmpVal );
result = tmpVal == out28;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in290 = {23, 10, 24, 13, 9, 25, 25, 10, 17, 9, 19, 3, 5, 17, 13, 23, 1, 13, 14, 21, 14, 16, 26, 6, 12, 19};
int in291 = 18;
int out29 = 7;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in290, in291);
System.out.println("Output expected: " + out29 + " Output recieved: " + tmpVal );
result = tmpVal == out29;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in300 = {1, 4, 2, 10, 26, 11, 21, 19, 12, 27, 13, 26, 5, 24, 15, 14, 10, 15, 20, 22, 16, 26, 13, 26, 17, 24, 13};
int in301 = 8;
int out30 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in300, in301);
System.out.println("Output expected: " + out30 + " Output recieved: " + tmpVal );
result = tmpVal == out30;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in310 = {23, 22, 2, 24, 19, 4, 7, 23, 22, 16, 22, 25, 3, 7, 26, 23, 14, 14, 21, 18, 18, 4, 18, 1, 1, 12, 17, 11};
int in311 = 18;
int out31 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in310, in311);
System.out.println("Output expected: " + out31 + " Output recieved: " + tmpVal );
result = tmpVal == out31;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in320 = {17, 25, 22, 26, 21, 10, 22, 27, 17, 12, 11, 11, 4, 12, 7, 2, 27, 6, 3, 15, 11, 1, 12, 5, 29, 21, 28, 24, 1};
int in321 = 18;
int out32 = 7;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in320, in321);
System.out.println("Output expected: " + out32 + " Output recieved: " + tmpVal );
result = tmpVal == out32;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in330 = {26, 15, 16, 6, 16, 2, 30, 21, 30, 5, 28, 9, 2, 11, 29, 19, 6, 18, 20, 29, 8, 2, 24, 13, 6, 17, 2, 6, 7, 3};
int in331 = 22;
int out33 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in330, in331);
System.out.println("Output expected: " + out33 + " Output recieved: " + tmpVal );
result = tmpVal == out33;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in340 = {23, 21, 1, 21, 2, 22, 27, 30, 10, 31, 5, 4, 6, 22, 31, 25, 5, 24, 12, 5, 19, 1, 10, 9, 11, 11, 5, 3, 26, 10, 24};
int in341 = 27;
int out34 = 5;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in340, in341);
System.out.println("Output expected: " + out34 + " Output recieved: " + tmpVal );
result = tmpVal == out34;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in350 = {9, 14, 12, 13, 30, 30, 1, 8, 13, 20, 24, 27, 9, 25, 31, 12, 29, 28, 11, 2, 19, 5, 15, 32, 22, 24, 5, 15, 22, 32, 30, 10};
int in351 = 22;
int out35 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in350, in351);
System.out.println("Output expected: " + out35 + " Output recieved: " + tmpVal );
result = tmpVal == out35;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in360 = {4, 8, 33, 9, 18, 24, 31, 29, 8, 27, 33, 1, 8, 29, 31, 17, 16, 1, 14, 24, 7, 30, 16, 16, 13, 29, 9, 25, 21, 18, 5, 4, 32};
int in361 = 24;
int out36 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in360, in361);
System.out.println("Output expected: " + out36 + " Output recieved: " + tmpVal );
result = tmpVal == out36;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in370 = {22, 1, 28, 6, 6, 25, 3, 28, 3, 19, 27, 18, 7, 28, 23, 26, 14, 15, 33, 32, 34, 21, 5, 11, 20, 17, 3, 28, 21, 25, 6, 23, 34, 1};
int in371 = 32;
int out37 = 11;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in370, in371);
System.out.println("Output expected: " + out37 + " Output recieved: " + tmpVal );
result = tmpVal == out37;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in380 = {8, 33, 31, 33, 26, 3, 7, 18, 20, 35, 25, 28, 11, 31, 17, 20, 19, 16, 12, 26, 23, 2, 9, 23, 7, 35, 7, 20, 30, 29, 22, 2, 8, 26, 11};
int in381 = 30;
int out38 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in380, in381);
System.out.println("Output expected: " + out38 + " Output recieved: " + tmpVal );
result = tmpVal == out38;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in390 = {25, 35, 34, 6, 27, 32, 28, 32, 25, 11, 19, 3, 27, 14, 24, 2, 24, 32, 25, 15, 10, 25, 9, 25, 14, 7, 24, 30, 14, 18, 20, 24, 20, 17, 25, 8};
int in391 = 32;
int out39 = 7;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in390, in391);
System.out.println("Output expected: " + out39 + " Output recieved: " + tmpVal );
result = tmpVal == out39;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in400 = {14, 28, 14, 18, 8, 31, 36, 34, 35, 27, 34, 19, 13, 16, 1, 7, 32, 30, 2, 12, 22, 27, 13, 4, 30, 10, 35, 8, 32, 19, 26, 34, 11, 29, 26, 16, 7};
int in401 = 28;
int out40 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in400, in401);
System.out.println("Output expected: " + out40 + " Output recieved: " + tmpVal );
result = tmpVal == out40;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in410 = {36, 38, 11, 24, 12, 37, 1, 29, 9, 2, 19, 12, 4, 22, 8, 29, 14, 23, 25, 22, 9, 32, 2, 4, 25, 26, 25, 17, 35, 22, 21, 13, 30, 35, 23, 32, 18, 24};
int in411 = 32;
int out41 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in410, in411);
System.out.println("Output expected: " + out41 + " Output recieved: " + tmpVal );
result = tmpVal == out41;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in420 = {9, 37, 25, 30, 32, 16, 27, 7, 30, 5, 8, 38, 18, 32, 26, 5, 19, 1, 20, 19, 28, 38, 30, 20, 27, 26, 34, 7, 2, 12, 27, 23, 7, 29, 13, 31, 6, 8, 24};
int in421 = 37;
int out42 = 10;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in420, in421);
System.out.println("Output expected: " + out42 + " Output recieved: " + tmpVal );
result = tmpVal == out42;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in430 = {29, 11, 12, 26, 40, 16, 32, 14, 23, 35, 3, 17, 32, 36, 30, 32, 26, 31, 38, 6, 4, 21, 8, 33, 24, 35, 19, 24, 19, 16, 14, 8, 25, 21, 15, 14, 17, 20, 21, 14};
int in431 = 30;
int out43 = 6;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in430, in431);
System.out.println("Output expected: " + out43 + " Output recieved: " + tmpVal );
result = tmpVal == out43;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in440 = {36, 30, 20, 20, 3, 18, 11, 12, 24, 35, 5, 27, 18, 12, 39, 26, 14, 17, 6, 28, 21, 4, 2, 13, 13, 11, 39, 39, 1, 36, 6, 26, 32, 29, 19, 14, 11, 29, 1, 41, 32};
int in441 = 33;
int out44 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in440, in441);
System.out.println("Output expected: " + out44 + " Output recieved: " + tmpVal );
result = tmpVal == out44;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in450 = {32, 40, 33, 11, 21, 9, 12, 20, 4, 42, 36, 7, 38, 12, 18, 37, 33, 35, 7, 26, 1, 15, 21, 30, 15, 15, 14, 25, 40, 39, 8, 38, 4, 12, 1, 31, 30, 11, 16, 23, 18, 19};
int in451 = 41;
int out45 = 12;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in450, in451);
System.out.println("Output expected: " + out45 + " Output recieved: " + tmpVal );
result = tmpVal == out45;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in460 = {17, 30, 33, 2, 42, 39, 5, 24, 40, 6, 38, 17, 30, 23, 30, 24, 18, 23, 14, 12, 20, 25, 16, 29, 42, 20, 14, 16, 24, 19, 31, 11, 2, 41, 39, 4, 35, 8, 9, 30, 37, 38, 27};
int in461 = 40;
int out46 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in460, in461);
System.out.println("Output expected: " + out46 + " Output recieved: " + tmpVal );
result = tmpVal == out46;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in470 = {43, 28, 33, 9, 14, 36, 27, 43, 38, 39, 37, 23, 24, 2, 25, 1, 24, 4, 33, 22, 43, 12, 31, 12, 9, 2, 29, 42, 12, 1, 21, 24, 42, 40, 27, 15, 30, 14, 28, 24, 10, 17, 26, 44};
int in471 = 43;
int out47 = 23;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in470, in471);
System.out.println("Output expected: " + out47 + " Output recieved: " + tmpVal );
result = tmpVal == out47;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in480 = {17, 30, 33, 9, 25, 41, 20, 24, 2, 1, 5, 37, 10, 42, 33, 36, 28, 10, 35, 28, 27, 43, 15, 6, 45, 35, 12, 41, 22, 28, 5, 6, 34, 21, 45, 33, 41, 20, 34, 38, 29, 2, 44, 44, 30};
int in481 = 44;
int out48 = 14;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in480, in481);
System.out.println("Output expected: " + out48 + " Output recieved: " + tmpVal );
result = tmpVal == out48;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in490 = {9, 41, 4, 14, 19, 4, 30, 26, 10, 19, 8, 43, 37, 25, 42, 26, 39, 34, 39, 33, 45, 28, 32, 3, 19, 6, 41, 1, 13, 46, 46, 28, 1, 24, 22, 22, 8, 35, 31, 35, 41, 9, 11, 7, 14, 19};
int in491 = 42;
int out49 = 13;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in490, in491);
System.out.println("Output expected: " + out49 + " Output recieved: " + tmpVal );
result = tmpVal == out49;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in500 = {13, 16, 17, 13, 12, 41, 27, 31, 3, 20, 22, 27, 1, 3, 29, 45, 37, 2, 33, 47, 37, 44, 39, 29, 43, 38, 10, 22, 20, 30, 13, 31, 14, 44, 33, 31, 28, 36, 37, 3, 25, 14, 10, 10, 23, 46, 5};
int in501 = 35;
int out50 = 6;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in500, in501);
System.out.println("Output expected: " + out50 + " Output recieved: " + tmpVal );
result = tmpVal == out50;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in510 = {34, 13, 31, 4, 33, 28, 39, 16, 15, 8, 45, 30, 14, 43, 31, 11, 6, 7, 43, 34, 6, 18, 42, 15, 28, 47, 22, 27, 47, 5, 29, 25, 41, 14, 14, 11, 3, 14, 16, 18, 8, 46, 33, 48, 27, 20, 28, 11};
int in511 = 42;
int out51 = 14;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in510, in511);
System.out.println("Output expected: " + out51 + " Output recieved: " + tmpVal );
result = tmpVal == out51;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in520 = {14, 49, 32, 10, 12, 39, 5, 34, 35, 4, 39, 26, 24, 25, 20, 27, 5, 22, 39, 46, 5, 16, 15, 15, 48, 21, 23, 12, 26, 18, 44, 47, 20, 21, 13, 49, 9, 3, 35, 18, 46, 9, 25, 26, 15, 45, 36, 24, 3};
int in521 = 30;
int out52 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in520, in521);
System.out.println("Output expected: " + out52 + " Output recieved: " + tmpVal );
result = tmpVal == out52;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in530 = {1, 2, 39, 3, 1, 3, 34, 18, 23, 48, 28, 24, 45, 21, 35, 28, 23, 24, 21, 36, 8, 28, 25, 10, 38, 11, 29, 42, 27, 21, 41, 18, 36, 28, 29, 13, 34, 15, 30, 33, 23, 39, 41, 23, 43, 50, 29, 45, 27, 9};
int in531 = 39;
int out53 = 6;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in530, in531);
System.out.println("Output expected: " + out53 + " Output recieved: " + tmpVal );
result = tmpVal == out53;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in540 = {5};
int in541 = 1;
int out54 = 1;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in540, in541);
System.out.println("Output expected: " + out54 + " Output recieved: " + tmpVal );
result = tmpVal == out54;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in550 = {3, 20, 21};
int in551 = 29;
int out55 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in550, in551);
System.out.println("Output expected: " + out55 + " Output recieved: " + tmpVal );
result = tmpVal == out55;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in560 = {49, 33, 7, 4, 32};
int in561 = 30;
int out56 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in560, in561);
System.out.println("Output expected: " + out56 + " Output recieved: " + tmpVal );
result = tmpVal == out56;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in570 = {37, 8, 63, 35, 2, 13, 2};
int in571 = 13;
int out57 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in570, in571);
System.out.println("Output expected: " + out57 + " Output recieved: " + tmpVal );
result = tmpVal == out57;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in580 = {28, 74, 84, 49, 24, 35, 21, 42, 56};
int in581 = 10;
int out58 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in580, in581);
System.out.println("Output expected: " + out58 + " Output recieved: " + tmpVal );
result = tmpVal == out58;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in590 = {87, 75, 63, 108, 82, 95, 27, 67, 98, 16, 32};
int in591 = 95;
int out59 = 11;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in590, in591);
System.out.println("Output expected: " + out59 + " Output recieved: " + tmpVal );
result = tmpVal == out59;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in600 = {51, 117, 80, 41, 90, 29, 23, 129, 32, 105, 19, 117, 2};
int in601 = 59;
int out60 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in600, in601);
System.out.println("Output expected: " + out60 + " Output recieved: " + tmpVal );
result = tmpVal == out60;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in610 = {73, 49, 3, 22, 18, 114, 143, 29, 81, 68, 4, 39, 28, 79, 86};
int in611 = 133;
int out61 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in610, in611);
System.out.println("Output expected: " + out61 + " Output recieved: " + tmpVal );
result = tmpVal == out61;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in620 = {42, 162, 28, 130, 57, 109, 145, 10, 133, 86, 127, 38, 129, 59, 134, 45, 128};
int in621 = 165;
int out62 = 17;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in620, in621);
System.out.println("Output expected: " + out62 + " Output recieved: " + tmpVal );
result = tmpVal == out62;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in630 = {171, 63, 90, 61, 73, 76, 116, 176, 108, 119, 38, 52, 85, 170, 163, 71, 70, 90, 48};
int in631 = 189;
int out63 = 19;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in630, in631);
System.out.println("Output expected: " + out63 + " Output recieved: " + tmpVal );
result = tmpVal == out63;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in640 = {107, 163, 119, 46, 104, 62, 186, 165, 47, 125, 18, 155, 110, 119, 191, 31, 6, 115, 117, 201, 2};
int in641 = 201;
int out64 = 21;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in640, in641);
System.out.println("Output expected: " + out64 + " Output recieved: " + tmpVal );
result = tmpVal == out64;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in650 = {209, 226, 161, 127, 61, 169, 172, 59, 46, 42, 58, 137, 84, 73, 193, 104, 24, 34, 192, 123, 72, 69, 27};
int in651 = 121;
int out65 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in650, in651);
System.out.println("Output expected: " + out65 + " Output recieved: " + tmpVal );
result = tmpVal == out65;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in660 = {191, 240, 34, 78, 40, 207, 62, 53, 100, 77, 191, 6, 191, 66, 235, 73, 86, 194, 242, 199, 242, 100, 20, 27, 31};
int in661 = 125;
int out66 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in660, in661);
System.out.println("Output expected: " + out66 + " Output recieved: " + tmpVal );
result = tmpVal == out66;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in670 = {217, 182, 210, 102, 41, 215, 1, 20, 190, 249, 59, 70, 12, 224, 139, 46, 117, 216, 160, 230, 8, 91, 252, 190, 241, 217, 89};
int in671 = 200;
int out67 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in670, in671);
System.out.println("Output expected: " + out67 + " Output recieved: " + tmpVal );
result = tmpVal == out67;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in680 = {96, 246, 257, 128, 170, 52, 212, 270, 79, 152, 249, 110, 88, 142, 263, 70, 6, 99, 1, 175, 11, 113, 197, 203, 269, 207, 166, 175, 255};
int in681 = 251;
int out68 = 9;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in680, in681);
System.out.println("Output expected: " + out68 + " Output recieved: " + tmpVal );
result = tmpVal == out68;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in690 = {223, 283, 294, 192, 26, 207, 160, 25, 212, 31, 131, 148, 1, 249, 138, 286, 42, 219, 273, 306, 183, 112, 210, 175, 36, 101, 131, 62, 43, 253, 87};
int in691 = 211;
int out69 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in690, in691);
System.out.println("Output expected: " + out69 + " Output recieved: " + tmpVal );
result = tmpVal == out69;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in700 = {82, 225, 161, 304, 46, 154, 48, 140, 134, 306, 66, 5, 203, 122, 167, 304, 14, 226, 169, 184, 161, 265, 219, 264, 308, 327, 86, 11, 49, 15, 116, 208, 73};
int in701 = 262;
int out70 = 7;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in700, in701);
System.out.println("Output expected: " + out70 + " Output recieved: " + tmpVal );
result = tmpVal == out70;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in710 = {87, 112, 16, 154, 114, 151, 253, 340, 255, 253, 61, 283, 110, 209, 15, 152, 11, 142, 105, 155, 199, 326, 169, 321, 124, 249, 247, 198, 319, 221, 58, 269, 29, 213, 283};
int in711 = 293;
int out71 = 5;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in710, in711);
System.out.println("Output expected: " + out71 + " Output recieved: " + tmpVal );
result = tmpVal == out71;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in720 = {57, 159, 365, 111, 234, 46, 190, 322, 204, 215, 149, 200, 32, 119, 141, 16, 266, 361, 30, 170, 251, 189, 328, 50, 344, 217, 196, 38, 271, 20, 254, 42, 218, 71, 321, 163, 347};
int in721 = 336;
int out72 = 9;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in720, in721);
System.out.println("Output expected: " + out72 + " Output recieved: " + tmpVal );
result = tmpVal == out72;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in730 = {221, 11, 153, 318, 78, 157, 113, 264, 361, 143, 11, 192, 89, 134, 146, 281, 107, 127, 225, 88, 236, 4, 133, 144, 266, 363, 127, 22, 336, 286, 240, 180, 302, 321, 247, 314, 112, 180, 239};
int in731 = 270;
int out73 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in730, in731);
System.out.println("Output expected: " + out73 + " Output recieved: " + tmpVal );
result = tmpVal == out73;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in740 = {94, 41, 231, 245, 229, 169, 84, 336, 109, 342, 99, 94, 90, 174, 162, 322, 214, 251, 126, 145, 86, 89, 80, 219, 179, 95, 162, 221, 11, 353, 172, 384, 53, 193, 408, 389, 106, 108, 30, 61, 249};
int in741 = 305;
int out74 = 16;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in740, in741);
System.out.println("Output expected: " + out74 + " Output recieved: " + tmpVal );
result = tmpVal == out74;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in750 = {376, 288, 375, 87, 395, 90, 408, 31, 401, 358, 270, 272, 59, 219, 158, 166, 392, 130, 377, 388, 309, 39, 141, 279, 37, 166, 398, 409, 300, 192, 428, 229, 101, 331, 326, 202, 14, 34, 324, 172, 57, 424, 95};
int in751 = 387;
int out75 = 16;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in750, in751);
System.out.println("Output expected: " + out75 + " Output recieved: " + tmpVal );
result = tmpVal == out75;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in760 = {22, 427, 115, 209, 288, 26, 45, 338, 39, 21, 404, 51, 108, 207, 245, 56, 272, 251, 388, 395, 164, 63, 356, 384, 20, 50, 259, 388, 406, 270, 326, 118, 420, 151, 338, 258, 243, 196, 160, 348, 301, 247, 104, 194, 135};
int in761 = 441;
int out76 = 45;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in760, in761);
System.out.println("Output expected: " + out76 + " Output recieved: " + tmpVal );
result = tmpVal == out76;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in770 = {267, 206, 129, 210, 225, 281, 382, 296, 368, 96, 278, 169, 94, 454, 232, 335, 104, 455, 68, 114, 420, 58, 304, 20, 232, 177, 9, 267, 341, 228, 202, 369, 259, 307, 329, 418, 76, 166, 24, 122, 158, 217, 405, 465, 308, 231, 255};
int in771 = 444;
int out77 = 15;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in770, in771);
System.out.println("Output expected: " + out77 + " Output recieved: " + tmpVal );
result = tmpVal == out77;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in780 = {270, 479, 223, 160, 455, 458, 278, 403, 269, 169, 350, 246, 180, 317, 316, 488, 274, 207, 144, 278, 284, 39, 319, 234, 120, 388, 200, 5, 165, 121, 120, 154, 470, 238, 487, 337, 101, 70, 130, 203, 441, 465, 413, 451, 87, 169, 48, 51, 123};
int in781 = 386;
int out78 = 12;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in780, in781);
System.out.println("Output expected: " + out78 + " Output recieved: " + tmpVal );
result = tmpVal == out78;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in790 = {5, 10, 11, 5, 2, 1};
int in791 = 9;
int out79 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in790, in791);
System.out.println("Output expected: " + out79 + " Output recieved: " + tmpVal );
result = tmpVal == out79;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in800 = {3, 5, 5, 5, 5, 5, 5, 1};
int in801 = 4;
int out80 = 5;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in800, in801);
System.out.println("Output expected: " + out80 + " Output recieved: " + tmpVal );
result = tmpVal == out80;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in810 = {1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2};
int in811 = 2;
int out81 = 50;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in810, in811);
System.out.println("Output expected: " + out81 + " Output recieved: " + tmpVal );
result = tmpVal == out81;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in820 = {5, 1, 1, 5, 10};
int in821 = 9;
int out82 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in820, in821);
System.out.println("Output expected: " + out82 + " Output recieved: " + tmpVal );
result = tmpVal == out82;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in830 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
int in831 = 1;
int out83 = 50;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in830, in831);
System.out.println("Output expected: " + out83 + " Output recieved: " + tmpVal );
result = tmpVal == out83;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in840 = {1, 2};
int in841 = 100;
int out84 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in840, in841);
System.out.println("Output expected: " + out84 + " Output recieved: " + tmpVal );
result = tmpVal == out84;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in850 = {3, 3, 3, 1, 3, 3, 5};
int in851 = 4;
int out85 = 5;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in850, in851);
System.out.println("Output expected: " + out85 + " Output recieved: " + tmpVal );
result = tmpVal == out85;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in860 = {1, 2, 3};
int in861 = 50;
int out86 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in860, in861);
System.out.println("Output expected: " + out86 + " Output recieved: " + tmpVal );
result = tmpVal == out86;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in870 = {1};
int in871 = 20;
int out87 = 1;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in870, in871);
System.out.println("Output expected: " + out87 + " Output recieved: " + tmpVal );
result = tmpVal == out87;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in880 = {1, 1, 1, 2, 2, 2, 3, 3, 3};
int in881 = 3;
int out88 = 9;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in880, in881);
System.out.println("Output expected: " + out88 + " Output recieved: " + tmpVal );
result = tmpVal == out88;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in890 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
int in891 = 2;
int out89 = 50;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in890, in891);
System.out.println("Output expected: " + out89 + " Output recieved: " + tmpVal );
result = tmpVal == out89;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in900 = {10, 10, 6, 5, 10, 10, 14, 16, 18};
int in901 = 8;
int out90 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in900, in901);
System.out.println("Output expected: " + out90 + " Output recieved: " + tmpVal );
result = tmpVal == out90;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in910 = {6, 2, 6, 2, 6, 2, 6, 2};
int in911 = 5;
int out91 = 8;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in910, in911);
System.out.println("Output expected: " + out91 + " Output recieved: " + tmpVal );
result = tmpVal == out91;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in920 = {3, 6, 2, 2, 6};
int in921 = 4;
int out92 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in920, in921);
System.out.println("Output expected: " + out92 + " Output recieved: " + tmpVal );
result = tmpVal == out92;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in930 = {5, 8, 8, 5, 5, 5, 2};
int in931 = 6;
int out93 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in930, in931);
System.out.println("Output expected: " + out93 + " Output recieved: " + tmpVal );
result = tmpVal == out93;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in940 = {1};
int in941 = 10;
int out94 = 1;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in940, in941);
System.out.println("Output expected: " + out94 + " Output recieved: " + tmpVal );
result = tmpVal == out94;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in950 = {3, 3, 3, 4, 4, 4, 5, 5, 5};
int in951 = 2;
int out95 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in950, in951);
System.out.println("Output expected: " + out95 + " Output recieved: " + tmpVal );
result = tmpVal == out95;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in960 = {3, 4, 2, 3};
int in961 = 2;
int out96 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in960, in961);
System.out.println("Output expected: " + out96 + " Output recieved: " + tmpVal );
result = tmpVal == out96;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in970 = {100, 800, 500};
int in971 = 701;
int out97 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in970, in971);
System.out.println("Output expected: " + out97 + " Output recieved: " + tmpVal );
result = tmpVal == out97;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in980 = {55, 98, 65, 58, 87, 81, 191, 3, 2, 48, 116, 49, 255, 150, 84, 217, 302, 353, 83, 325, 87, 498, 318, 356, 290, 330, 338, 126, 455, 185, 592, 16, 593, 156, 639, 367, 638, 540, 308, 635, 429, 227, 227, 192, 900, 509, 872, 401, 490, 910};
int in981 = 765;
int out98 = 23;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in980, in981);
System.out.println("Output expected: " + out98 + " Output recieved: " + tmpVal );
result = tmpVal == out98;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in990 = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
int in991 = 10;
int out99 = 12;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in990, in991);
System.out.println("Output expected: " + out99 + " Output recieved: " + tmpVal );
result = tmpVal == out99;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1000 = {10};
int in1001 = 3;
int out100 = 1;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1000, in1001);
System.out.println("Output expected: " + out100 + " Output recieved: " + tmpVal );
result = tmpVal == out100;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1010 = {6, 2, 6, 2, 6, 3, 3, 3, 7};
int in1011 = 1000;
int out101 = 9;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1010, in1011);
System.out.println("Output expected: " + out101 + " Output recieved: " + tmpVal );
result = tmpVal == out101;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1020 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int in1021 = 100;
int out102 = 14;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1020, in1021);
System.out.println("Output expected: " + out102 + " Output recieved: " + tmpVal );
result = tmpVal == out102;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1030 = {950, 951, 952, 953, 954, 955, 956, 957, 958, 959, 960, 961, 962, 963, 964, 965, 966, 967, 968, 969, 970, 971, 972, 973, 974, 975, 976, 977, 978, 979, 980, 981, 982, 983, 984, 985, 986, 987, 988, 989, 990, 991, 992, 993, 994, 995, 996, 997, 0, 999};
int in1031 = 100;
int out103 = 25;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1030, in1031);
System.out.println("Output expected: " + out103 + " Output recieved: " + tmpVal );
result = tmpVal == out103;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1040 = {1};
int in1041 = 49;
int out104 = 1;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1040, in1041);
System.out.println("Output expected: " + out104 + " Output recieved: " + tmpVal );
result = tmpVal == out104;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1050 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
int in1051 = 49;
int out105 = 26;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1050, in1051);
System.out.println("Output expected: " + out105 + " Output recieved: " + tmpVal );
result = tmpVal == out105;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1060 = {6, 2, 6, 2, 6, 3, 3, 3, 7};
int in1061 = 10;
int out106 = 9;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1060, in1061);
System.out.println("Output expected: " + out106 + " Output recieved: " + tmpVal );
result = tmpVal == out106;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1070 = {10, 1, 20};
int in1071 = 15;
int out107 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1070, in1071);
System.out.println("Output expected: " + out107 + " Output recieved: " + tmpVal );
result = tmpVal == out107;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1080 = {1, 2, 3, 4, 5, 6};
int in1081 = 900;
int out108 = 6;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1080, in1081);
System.out.println("Output expected: " + out108 + " Output recieved: " + tmpVal );
result = tmpVal == out108;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1090 = {1};
int in1091 = 3;
int out109 = 1;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1090, in1091);
System.out.println("Output expected: " + out109 + " Output recieved: " + tmpVal );
result = tmpVal == out109;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1100 = {1, 2, 3, 4, 5};
int in1101 = 100;
int out110 = 5;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1100, in1101);
System.out.println("Output expected: " + out110 + " Output recieved: " + tmpVal );
result = tmpVal == out110;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1110 = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
int in1111 = 100;
int out111 = 50;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1110, in1111);
System.out.println("Output expected: " + out111 + " Output recieved: " + tmpVal );
result = tmpVal == out111;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1120 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
int in1121 = 5;
int out112 = 50;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1120, in1121);
System.out.println("Output expected: " + out112 + " Output recieved: " + tmpVal );
result = tmpVal == out112;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1130 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 10};
int in1131 = 100;
int out113 = 49;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1130, in1131);
System.out.println("Output expected: " + out113 + " Output recieved: " + tmpVal );
result = tmpVal == out113;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1140 = {50, 49, 51, 48, 52, 47};
int in1141 = 5;
int out114 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1140, in1141);
System.out.println("Output expected: " + out114 + " Output recieved: " + tmpVal );
result = tmpVal == out114;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1150 = {2, 1, 6};
int in1151 = 4;
int out115 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1150, in1151);
System.out.println("Output expected: " + out115 + " Output recieved: " + tmpVal );
result = tmpVal == out115;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1160 = {2, 2, 2, 2, 1, 6};
int in1161 = 4;
int out116 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1160, in1161);
System.out.println("Output expected: " + out116 + " Output recieved: " + tmpVal );
result = tmpVal == out116;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1170 = {1, 0, 3};
int in1171 = 2;
int out117 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1170, in1171);
System.out.println("Output expected: " + out117 + " Output recieved: " + tmpVal );
result = tmpVal == out117;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1180 = {50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50};
int in1181 = 1;
int out118 = 50;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1180, in1181);
System.out.println("Output expected: " + out118 + " Output recieved: " + tmpVal );
result = tmpVal == out118;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1190 = {160, 528, 415, 493, 570, 362, 289, 431, 886, 781, 452, 719, 584, 335, 375, 20, 286, 548, 155, 700, 692, 702, 59, 841};
int in1191 = 528;
int out119 = 5;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1190, in1191);
System.out.println("Output expected: " + out119 + " Output recieved: " + tmpVal );
result = tmpVal == out119;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1200 = {10, 10, 1, 10, 10, 10, 10, 20, 10, 10, 10, 10};
int in1201 = 15;
int out120 = 5;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1200, in1201);
System.out.println("Output expected: " + out120 + " Output recieved: " + tmpVal );
result = tmpVal == out120;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1210 = {1, 1, 1, 1, 1, 1, 1};
int in1211 = 3;
int out121 = 7;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1210, in1211);
System.out.println("Output expected: " + out121 + " Output recieved: " + tmpVal );
result = tmpVal == out121;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1220 = {2, 1, 1, 2, 4};
int in1221 = 3;
int out122 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1220, in1221);
System.out.println("Output expected: " + out122 + " Output recieved: " + tmpVal );
result = tmpVal == out122;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1230 = {10, 10, 10, 10, 20};
int in1231 = 9;
int out123 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1230, in1231);
System.out.println("Output expected: " + out123 + " Output recieved: " + tmpVal );
result = tmpVal == out123;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1240 = {10, 10, 10, 10};
int in1241 = 9;
int out124 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1240, in1241);
System.out.println("Output expected: " + out124 + " Output recieved: " + tmpVal );
result = tmpVal == out124;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1250 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 43, 43, 43, 43, 43, 43, 50};
int in1251 = 49;
int out125 = 26;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1250, in1251);
System.out.println("Output expected: " + out125 + " Output recieved: " + tmpVal );
result = tmpVal == out125;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1260 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
int in1261 = 51;
int out126 = 50;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1260, in1261);
System.out.println("Output expected: " + out126 + " Output recieved: " + tmpVal );
result = tmpVal == out126;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1270 = {5, 5, 5, 1, 5, 5, 5, 10};
int in1271 = 9;
int out127 = 5;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1270, in1271);
System.out.println("Output expected: " + out127 + " Output recieved: " + tmpVal );
result = tmpVal == out127;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1280 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1000};
int in1281 = 999;
int out128 = 26;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1280, in1281);
System.out.println("Output expected: " + out128 + " Output recieved: " + tmpVal );
result = tmpVal == out128;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1290 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 999};
int in1291 = 1000;
int out129 = 50;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1290, in1291);
System.out.println("Output expected: " + out129 + " Output recieved: " + tmpVal );
result = tmpVal == out129;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1300 = {2, 2, 2, 2, 2, 2};
int in1301 = 1000;
int out130 = 6;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1300, in1301);
System.out.println("Output expected: " + out130 + " Output recieved: " + tmpVal );
result = tmpVal == out130;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1310 = {2, 2, 2, 2, 2, 2, 6, 2, 6, 2, 6, 3, 3, 3, 7};
int in1311 = 1000;
int out131 = 15;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1310, in1311);
System.out.println("Output expected: " + out131 + " Output recieved: " + tmpVal );
result = tmpVal == out131;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1320 = {2, 3, 4, 1, 7};
int in1321 = 4;
int out132 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1320, in1321);
System.out.println("Output expected: " + out132 + " Output recieved: " + tmpVal );
result = tmpVal == out132;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1330 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
int in1331 = 999;
int out133 = 27;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1330, in1331);
System.out.println("Output expected: " + out133 + " Output recieved: " + tmpVal );
result = tmpVal == out133;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1340 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 1, 2, 30, 31, 34, 45, 6, 7, 45, 34, 23, 45, 34, 23, 67, 45, 34, 45, 2, 4, 6, 78, 3, 4, 5, 6, 7, 8, 9, 2};
int in1341 = 999;
int out134 = 50;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1340, in1341);
System.out.println("Output expected: " + out134 + " Output recieved: " + tmpVal );
result = tmpVal == out134;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1350 = {14, 10, 12, 1, 101};
int in1351 = 100;
int out135 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1350, in1351);
System.out.println("Output expected: " + out135 + " Output recieved: " + tmpVal );
result = tmpVal == out135;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1360 = {10, 101, 12, 1};
int in1361 = 100;
int out136 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1360, in1361);
System.out.println("Output expected: " + out136 + " Output recieved: " + tmpVal );
result = tmpVal == out136;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1370 = {6, 5, 4, 3, 7, 3, 8, 2, 9, 10, 1, 11};
int in1371 = 10;
int out137 = 7;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1370, in1371);
System.out.println("Output expected: " + out137 + " Output recieved: " + tmpVal );
result = tmpVal == out137;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1380 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2};
int in1381 = 2;
int out138 = 50;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1380, in1381);
System.out.println("Output expected: " + out138 + " Output recieved: " + tmpVal );
result = tmpVal == out138;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1390 = {10, 10, 10, 10, 10};
int in1391 = 10;
int out139 = 5;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1390, in1391);
System.out.println("Output expected: " + out139 + " Output recieved: " + tmpVal );
result = tmpVal == out139;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1400 = {10, 1, 12, 101};
int in1401 = 100;
int out140 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1400, in1401);
System.out.println("Output expected: " + out140 + " Output recieved: " + tmpVal );
result = tmpVal == out140;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1410 = {1};
int in1411 = 100;
int out141 = 1;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1410, in1411);
System.out.println("Output expected: " + out141 + " Output recieved: " + tmpVal );
result = tmpVal == out141;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1420 = {1, 2, 3};
int in1421 = 500;
int out142 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1420, in1421);
System.out.println("Output expected: " + out142 + " Output recieved: " + tmpVal );
result = tmpVal == out142;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1430 = {1, 3, 5, 3, 3, 3, 3, 3};
int in1431 = 4;
int out143 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1430, in1431);
System.out.println("Output expected: " + out143 + " Output recieved: " + tmpVal );
result = tmpVal == out143;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1440 = {1, 4, 51, 34, 13, 134, 134, 51, 43, 53, 74, 74, 32, 90, 64, 74, 78, 35, 122, 124, 213, 313, 142, 423, 231, 314, 123, 123, 141, 431, 234, 413, 12, 3, 41, 32, 41, 412, 312, 231, 312, 312, 312, 341, 231, 312, 312, 342, 312, 1000};
int in1441 = 900;
int out144 = 26;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1440, in1441);
System.out.println("Output expected: " + out144 + " Output recieved: " + tmpVal );
result = tmpVal == out144;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1450 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
int in1451 = 40;
int out145 = 21;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1450, in1451);
System.out.println("Output expected: " + out145 + " Output recieved: " + tmpVal );
result = tmpVal == out145;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1460 = {2, 1, 3};
int in1461 = 2;
int out146 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1460, in1461);
System.out.println("Output expected: " + out146 + " Output recieved: " + tmpVal );
result = tmpVal == out146;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1470 = {19, 52, 3, 36, 54, 34, 60};
int in1471 = 34;
int out147 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1470, in1471);
System.out.println("Output expected: " + out147 + " Output recieved: " + tmpVal );
result = tmpVal == out147;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1480 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49};
int in1481 = 200;
int out148 = 49;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1480, in1481);
System.out.println("Output expected: " + out148 + " Output recieved: " + tmpVal );
result = tmpVal == out148;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1490 = {3};
int in1491 = 2;
int out149 = 1;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1490, in1491);
System.out.println("Output expected: " + out149 + " Output recieved: " + tmpVal );
result = tmpVal == out149;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1500 = {12, 9, 8, 10, 1};
int in1501 = 11;
int out150 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1500, in1501);
System.out.println("Output expected: " + out150 + " Output recieved: " + tmpVal );
result = tmpVal == out150;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1510 = {1};
int in1511 = 1;
int out151 = 1;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1510, in1511);
System.out.println("Output expected: " + out151 + " Output recieved: " + tmpVal );
result = tmpVal == out151;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1520 = {1, 2, 3, 4};
int in1521 = 4;
int out152 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1520, in1521);
System.out.println("Output expected: " + out152 + " Output recieved: " + tmpVal );
result = tmpVal == out152;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1530 = {18, 1, 2, 3, 100};
int in1531 = 50;
int out153 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1530, in1531);
System.out.println("Output expected: " + out153 + " Output recieved: " + tmpVal );
result = tmpVal == out153;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1540 = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 58, 5, 5, 5, 5, 5, 5, 1, 7};
int in1541 = 6;
int out154 = 7;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1540, in1541);
System.out.println("Output expected: " + out154 + " Output recieved: " + tmpVal );
result = tmpVal == out154;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1550 = {10, 10, 10, 10, 10, 10, 10, 2, 12};
int in1551 = 10;
int out155 = 6;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1550, in1551);
System.out.println("Output expected: " + out155 + " Output recieved: " + tmpVal );
result = tmpVal == out155;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1560 = {1, 2, 3, 4, 5};
int in1561 = 4;
int out156 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1560, in1561);
System.out.println("Output expected: " + out156 + " Output recieved: " + tmpVal );
result = tmpVal == out156;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1570 = {100, 100, 100, 100, 100, 100, 100, 100, 1, 100};
int in1571 = 50;
int out157 = 5;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1570, in1571);
System.out.println("Output expected: " + out157 + " Output recieved: " + tmpVal );
result = tmpVal == out157;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1580 = {2, 1, 1, 2, 3};
int in1581 = 2;
int out158 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1580, in1581);
System.out.println("Output expected: " + out158 + " Output recieved: " + tmpVal );
result = tmpVal == out158;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1590 = {2, 1, 2, 2, 3};
int in1591 = 2;
int out159 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1590, in1591);
System.out.println("Output expected: " + out159 + " Output recieved: " + tmpVal );
result = tmpVal == out159;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1600 = {2, 2, 1, 2, 3};
int in1601 = 2;
int out160 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1600, in1601);
System.out.println("Output expected: " + out160 + " Output recieved: " + tmpVal );
result = tmpVal == out160;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1610 = {1, 2, 3, 4, 5, 6, 7, 8};
int in1611 = 100;
int out161 = 8;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1610, in1611);
System.out.println("Output expected: " + out161 + " Output recieved: " + tmpVal );
result = tmpVal == out161;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1620 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
int in1621 = 100;
int out162 = 50;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1620, in1621);
System.out.println("Output expected: " + out162 + " Output recieved: " + tmpVal );
result = tmpVal == out162;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1630 = {3, 1, 2, 3, 5};
int in1631 = 3;
int out163 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1630, in1631);
System.out.println("Output expected: " + out163 + " Output recieved: " + tmpVal );
result = tmpVal == out163;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1640 = {5, 3, 6, 4, 2};
int in1641 = 4;
int out164 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1640, in1641);
System.out.println("Output expected: " + out164 + " Output recieved: " + tmpVal );
result = tmpVal == out164;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1650 = {10, 9, 12};
int in1651 = 2;
int out165 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1650, in1651);
System.out.println("Output expected: " + out165 + " Output recieved: " + tmpVal );
result = tmpVal == out165;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1660 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
int in1661 = 1000;
int out166 = 50;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1660, in1661);
System.out.println("Output expected: " + out166 + " Output recieved: " + tmpVal );
result = tmpVal == out166;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1670 = {0, 1, 2, 3, 4};
int in1671 = 1000;
int out167 = 5;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1670, in1671);
System.out.println("Output expected: " + out167 + " Output recieved: " + tmpVal );
result = tmpVal == out167;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1680 = {1};
int in1681 = 5;
int out168 = 1;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1680, in1681);
System.out.println("Output expected: " + out168 + " Output recieved: " + tmpVal );
result = tmpVal == out168;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1690 = {1, 2, 3, 4, 5};
int in1691 = 50;
int out169 = 5;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1690, in1691);
System.out.println("Output expected: " + out169 + " Output recieved: " + tmpVal );
result = tmpVal == out169;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1700 = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
int in1701 = 10;
int out170 = 50;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1700, in1701);
System.out.println("Output expected: " + out170 + " Output recieved: " + tmpVal );
result = tmpVal == out170;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1710 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
int in1711 = 10;
int out171 = 10;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1710, in1711);
System.out.println("Output expected: " + out171 + " Output recieved: " + tmpVal );
result = tmpVal == out171;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1720 = {1, 2, 3};
int in1721 = 3;
int out172 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1720, in1721);
System.out.println("Output expected: " + out172 + " Output recieved: " + tmpVal );
result = tmpVal == out172;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1730 = {3};
int in1731 = 3;
int out173 = 1;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1730, in1731);
System.out.println("Output expected: " + out173 + " Output recieved: " + tmpVal );
result = tmpVal == out173;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1740 = {1, 2, 3, 4};
int in1741 = 11;
int out174 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1740, in1741);
System.out.println("Output expected: " + out174 + " Output recieved: " + tmpVal );
result = tmpVal == out174;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1750 = {1, 2, 3};
int in1751 = 4;
int out175 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1750, in1751);
System.out.println("Output expected: " + out175 + " Output recieved: " + tmpVal );
result = tmpVal == out175;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1760 = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
int in1761 = 2;
int out176 = 13;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1760, in1761);
System.out.println("Output expected: " + out176 + " Output recieved: " + tmpVal );
result = tmpVal == out176;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1770 = {6, 6, 6, 6, 6, 6, 6, 5, 12};
int in1771 = 7;
int out177 = 6;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1770, in1771);
System.out.println("Output expected: " + out177 + " Output recieved: " + tmpVal );
result = tmpVal == out177;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1780 = {2, 1, 1, 1, 2, 2, 6};
int in1781 = 5;
int out178 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1780, in1781);
System.out.println("Output expected: " + out178 + " Output recieved: " + tmpVal );
result = tmpVal == out178;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1790 = {10, 1, 2, 11, 101};
int in1791 = 100;
int out179 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1790, in1791);
System.out.println("Output expected: " + out179 + " Output recieved: " + tmpVal );
result = tmpVal == out179;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1800 = {5, 5, 5, 1, 10};
int in1801 = 5;
int out180 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1800, in1801);
System.out.println("Output expected: " + out180 + " Output recieved: " + tmpVal );
result = tmpVal == out180;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1810 = {1, 1, 1, 1, 1, 1, 1, 1, 1};
int in1811 = 4;
int out181 = 9;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1810, in1811);
System.out.println("Output expected: " + out181 + " Output recieved: " + tmpVal );
result = tmpVal == out181;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1820 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 4, 4, 4, 4, 7, 7, 7, 8, 8, 8, 5, 5, 12, 1, 12, 12, 45, 7, 5, 6, 1, 4, 2, 5, 7, 3, 13, 2, 14, 15, 17};
int in1821 = 12;
int out182 = 19;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1820, in1821);
System.out.println("Output expected: " + out182 + " Output recieved: " + tmpVal );
result = tmpVal == out182;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1830 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
int in1831 = 100;
int out183 = 10;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1830, in1831);
System.out.println("Output expected: " + out183 + " Output recieved: " + tmpVal );
result = tmpVal == out183;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1840 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 100, 0};
int in1841 = 100;
int out184 = 7;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1840, in1841);
System.out.println("Output expected: " + out184 + " Output recieved: " + tmpVal );
result = tmpVal == out184;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1850 = {1, 2, 3, 11};
int in1851 = 10;
int out185 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1850, in1851);
System.out.println("Output expected: " + out185 + " Output recieved: " + tmpVal );
result = tmpVal == out185;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1860 = {2, 1, 3, 4, 12};
int in1861 = 10;
int out186 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1860, in1861);
System.out.println("Output expected: " + out186 + " Output recieved: " + tmpVal );
result = tmpVal == out186;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1870 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 10};
int in1871 = 10;
int out187 = 7;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1870, in1871);
System.out.println("Output expected: " + out187 + " Output recieved: " + tmpVal );
result = tmpVal == out187;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1880 = {0};
int in1881 = 2;
int out188 = 1;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1880, in1881);
System.out.println("Output expected: " + out188 + " Output recieved: " + tmpVal );
result = tmpVal == out188;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1890 = {2, 1, 4};
int in1891 = 2;
int out189 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1890, in1891);
System.out.println("Output expected: " + out189 + " Output recieved: " + tmpVal );
result = tmpVal == out189;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1900 = {2, 2, 1, 3};
int in1901 = 2;
int out190 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1900, in1901);
System.out.println("Output expected: " + out190 + " Output recieved: " + tmpVal );
result = tmpVal == out190;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1910 = {1, 1, 1, 1, 0, 10, 1, 1};
int in1911 = 10;
int out191 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1910, in1911);
System.out.println("Output expected: " + out191 + " Output recieved: " + tmpVal );
result = tmpVal == out191;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1920 = {6, 1, 2, 5, 7};
int in1921 = 100;
int out192 = 5;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1920, in1921);
System.out.println("Output expected: " + out192 + " Output recieved: " + tmpVal );
result = tmpVal == out192;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1930 = {6, 2, 6, 2, 6, 3, 3, 3, 7};
int in1931 = 4;
int out193 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1930, in1931);
System.out.println("Output expected: " + out193 + " Output recieved: " + tmpVal );
result = tmpVal == out193;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1940 = {1, 2, 4, 5, 3};
int in1941 = 5;
int out194 = 5;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1940, in1941);
System.out.println("Output expected: " + out194 + " Output recieved: " + tmpVal );
result = tmpVal == out194;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1950 = {1, 5, 5, 1, 0};
int in1951 = 5;
int out195 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1950, in1951);
System.out.println("Output expected: " + out195 + " Output recieved: " + tmpVal );
result = tmpVal == out195;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1960 = {3, 2, 6, 2, 6, 3, 3, 3, 7};
int in1961 = 4;
int out196 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1960, in1961);
System.out.println("Output expected: " + out196 + " Output recieved: " + tmpVal );
result = tmpVal == out196;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1970 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int in1971 = 1000;
int out197 = 50;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1970, in1971);
System.out.println("Output expected: " + out197 + " Output recieved: " + tmpVal );
result = tmpVal == out197;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1980 = {0, 0, 0, 0, 4};
int in1981 = 4;
int out198 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1980, in1981);
System.out.println("Output expected: " + out198 + " Output recieved: " + tmpVal );
result = tmpVal == out198;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1990 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
int in1991 = 50;
int out199 = 50;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in1990, in1991);
System.out.println("Output expected: " + out199 + " Output recieved: " + tmpVal );
result = tmpVal == out199;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2000 = {6, 2, 100};
int in2001 = 5;
int out200 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2000, in2001);
System.out.println("Output expected: " + out200 + " Output recieved: " + tmpVal );
result = tmpVal == out200;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2010 = {9, 100, 8, 400};
int in2011 = 72;
int out201 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2010, in2011);
System.out.println("Output expected: " + out201 + " Output recieved: " + tmpVal );
result = tmpVal == out201;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2020 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 12, 13, 14, 15, 16, 17, 18, 19, 130, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 27, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46};
int in2021 = 500;
int out202 = 49;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2020, in2021);
System.out.println("Output expected: " + out202 + " Output recieved: " + tmpVal );
result = tmpVal == out202;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2030 = {1, 0, 1, 1, 3};
int in2031 = 3;
int out203 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2030, in2031);
System.out.println("Output expected: " + out203 + " Output recieved: " + tmpVal );
result = tmpVal == out203;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2040 = {4, 3, 3, 3, 5};
int in2041 = 2;
int out204 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2040, in2041);
System.out.println("Output expected: " + out204 + " Output recieved: " + tmpVal );
result = tmpVal == out204;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2050 = {1, 2, 4, 1};
int in2051 = 3;
int out205 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2050, in2051);
System.out.println("Output expected: " + out205 + " Output recieved: " + tmpVal );
result = tmpVal == out205;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2060 = {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47};
int in2061 = 1;
int out206 = 47;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2060, in2061);
System.out.println("Output expected: " + out206 + " Output recieved: " + tmpVal );
result = tmpVal == out206;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2070 = {1, 5, 9};
int in2071 = 6;
int out207 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2070, in2071);
System.out.println("Output expected: " + out207 + " Output recieved: " + tmpVal );
result = tmpVal == out207;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2080 = {1, 2, 2, 0, 4, 2, 2, 5};
int in2081 = 4;
int out208 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2080, in2081);
System.out.println("Output expected: " + out208 + " Output recieved: " + tmpVal );
result = tmpVal == out208;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2090 = {10, 1, 12, 156};
int in2091 = 100;
int out209 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2090, in2091);
System.out.println("Output expected: " + out209 + " Output recieved: " + tmpVal );
result = tmpVal == out209;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2100 = {1, 2, 3, 5, 6, 8};
int in2101 = 15;
int out210 = 6;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2100, in2101);
System.out.println("Output expected: " + out210 + " Output recieved: " + tmpVal );
result = tmpVal == out210;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2110 = {24, 2, 3, 4, 5, 6, 7, 26, 28, 39, 40};
int in2111 = 24;
int out211 = 5;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2110, in2111);
System.out.println("Output expected: " + out211 + " Output recieved: " + tmpVal );
result = tmpVal == out211;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2120 = {1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1};
int in2121 = 3;
int out212 = 13;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2120, in2121);
System.out.println("Output expected: " + out212 + " Output recieved: " + tmpVal );
result = tmpVal == out212;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2130 = {1, 9, 8, 4, 3, 2, 6, 14, 100, 43, 2, 23, 43, 1, 3, 4, 5, 8, 1, 2, 3, 19, 34, 44, 24, 90, 91, 109, 156, 43, 65, 34, 87, 543, 23, 42, 77, 87, 88, 12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int in2131 = 1000;
int out213 = 50;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2130, in2131);
System.out.println("Output expected: " + out213 + " Output recieved: " + tmpVal );
result = tmpVal == out213;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2140 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int in2141 = 100;
int out214 = 10;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2140, in2141);
System.out.println("Output expected: " + out214 + " Output recieved: " + tmpVal );
result = tmpVal == out214;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2150 = {10, 9, 9, 10, 11};
int in2151 = 2;
int out215 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2150, in2151);
System.out.println("Output expected: " + out215 + " Output recieved: " + tmpVal );
result = tmpVal == out215;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2160 = {10, 1, 2, 10, 15};
int in2161 = 13;
int out216 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2160, in2161);
System.out.println("Output expected: " + out216 + " Output recieved: " + tmpVal );
result = tmpVal == out216;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2170 = {3, 4, 1};
int in2171 = 2;
int out217 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2170, in2171);
System.out.println("Output expected: " + out217 + " Output recieved: " + tmpVal );
result = tmpVal == out217;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2180 = {3, 4, 0};
int in2181 = 2;
int out218 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2180, in2181);
System.out.println("Output expected: " + out218 + " Output recieved: " + tmpVal );
result = tmpVal == out218;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2190 = {0, 0, 2};
int in2191 = 1;
int out219 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2190, in2191);
System.out.println("Output expected: " + out219 + " Output recieved: " + tmpVal );
result = tmpVal == out219;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2200 = {2, 0, 2, 2, 4};
int in2201 = 3;
int out220 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2200, in2201);
System.out.println("Output expected: " + out220 + " Output recieved: " + tmpVal );
result = tmpVal == out220;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2210 = {6, 7, 1};
int in2211 = 6;
int out221 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2210, in2211);
System.out.println("Output expected: " + out221 + " Output recieved: " + tmpVal );
result = tmpVal == out221;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2220 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int in2221 = 100;
int out222 = 50;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2220, in2221);
System.out.println("Output expected: " + out222 + " Output recieved: " + tmpVal );
result = tmpVal == out222;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2230 = {1, 1, 1, 1, 1};
int in2231 = 5;
int out223 = 5;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2230, in2231);
System.out.println("Output expected: " + out223 + " Output recieved: " + tmpVal );
result = tmpVal == out223;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2240 = {2, 4, 3, 2, 5, 2, 3, 5, 2, 3, 5, 2, 3, 5, 2, 3, 5, 7, 6, 7, 8, 4, 4, 6, 3, 4, 2, 4, 5, 6, 3, 4, 4, 2, 5, 6, 3, 4, 5, 3, 50, 24, 21, 42, 43, 55, 23, 4, 43};
int in2241 = 1000;
int out224 = 49;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2240, in2241);
System.out.println("Output expected: " + out224 + " Output recieved: " + tmpVal );
result = tmpVal == out224;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2250 = {1, 0, 3, 5, 1000};
int in2251 = 500;
int out225 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2250, in2251);
System.out.println("Output expected: " + out225 + " Output recieved: " + tmpVal );
result = tmpVal == out225;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2260 = {1, 5};
int in2261 = 20;
int out226 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2260, in2261);
System.out.println("Output expected: " + out226 + " Output recieved: " + tmpVal );
result = tmpVal == out226;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2270 = {1, 1, 1};
int in2271 = 1000;
int out227 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2270, in2271);
System.out.println("Output expected: " + out227 + " Output recieved: " + tmpVal );
result = tmpVal == out227;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2280 = {6, 4, 9};
int in2281 = 5;
int out228 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2280, in2281);
System.out.println("Output expected: " + out228 + " Output recieved: " + tmpVal );
result = tmpVal == out228;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2290 = {1, 3, 6, 2, 0, 3, 5, 3, 4, 9, 10, 4, 8, 2, 1, 3, 1, 8, 8, 1, 8, 9, 3, 9, 7, 4, 0, 6, 3, 6, 2, 4, 9, 3, 7, 4, 5, 9, 0, 10, 2, 1, 6, 7, 6, 0, 4, 9, 8};
int in2291 = 10;
int out229 = 6;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2290, in2291);
System.out.println("Output expected: " + out229 + " Output recieved: " + tmpVal );
result = tmpVal == out229;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2300 = {5, 2, 7, 3, 5, 3, 10, 2, 2};
int in2301 = 9;
int out230 = 9;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2300, in2301);
System.out.println("Output expected: " + out230 + " Output recieved: " + tmpVal );
result = tmpVal == out230;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2310 = {1, 2, 3};
int in2311 = 1000;
int out231 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2310, in2311);
System.out.println("Output expected: " + out231 + " Output recieved: " + tmpVal );
result = tmpVal == out231;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2320 = {1000, 1000, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50};
int in2321 = 1000;
int out232 = 50;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2320, in2321);
System.out.println("Output expected: " + out232 + " Output recieved: " + tmpVal );
result = tmpVal == out232;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2330 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50};
int in2331 = 1000;
int out233 = 50;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2330, in2331);
System.out.println("Output expected: " + out233 + " Output recieved: " + tmpVal );
result = tmpVal == out233;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2340 = {10, 11, 2, 10, 20};
int in2341 = 15;
int out234 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2340, in2341);
System.out.println("Output expected: " + out234 + " Output recieved: " + tmpVal );
result = tmpVal == out234;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2350 = {1};
int in2351 = 2;
int out235 = 1;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2350, in2351);
System.out.println("Output expected: " + out235 + " Output recieved: " + tmpVal );
result = tmpVal == out235;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2360 = {100, 99, 101, 98, 102, 97, 103, 96, 1, 100, 100, 100, 100, 800, 100, 99, 101, 98, 102, 97, 103, 96, 1, 100, 100, 100, 100, 800, 100, 99, 101, 98, 102, 97, 103, 96, 1, 100, 100, 100, 100, 800};
int in2361 = 900;
int out236 = 42;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2360, in2361);
System.out.println("Output expected: " + out236 + " Output recieved: " + tmpVal );
result = tmpVal == out236;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2370 = {6, 4, 4, 7, 8};
int in2371 = 4;
int out237 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2370, in2371);
System.out.println("Output expected: " + out237 + " Output recieved: " + tmpVal );
result = tmpVal == out237;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2380 = {6, 7, 4, 4, 8};
int in2381 = 4;
int out238 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2380, in2381);
System.out.println("Output expected: " + out238 + " Output recieved: " + tmpVal );
result = tmpVal == out238;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2390 = {1, 2, 3, 4, 5, 6};
int in2391 = 40;
int out239 = 6;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2390, in2391);
System.out.println("Output expected: " + out239 + " Output recieved: " + tmpVal );
result = tmpVal == out239;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2400 = {1, 0, 0, 0, 5};
int in2401 = 3;
int out240 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2400, in2401);
System.out.println("Output expected: " + out240 + " Output recieved: " + tmpVal );
result = tmpVal == out240;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2410 = {2, 110, 15, 4, 45, 39};
int in2411 = 250;
int out241 = 6;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2410, in2411);
System.out.println("Output expected: " + out241 + " Output recieved: " + tmpVal );
result = tmpVal == out241;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2420 = {5, 1, 15, 4};
int in2421 = 50;
int out242 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2420, in2421);
System.out.println("Output expected: " + out242 + " Output recieved: " + tmpVal );
result = tmpVal == out242;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2430 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
int in2431 = 2;
int out243 = 11;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2430, in2431);
System.out.println("Output expected: " + out243 + " Output recieved: " + tmpVal );
result = tmpVal == out243;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2440 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49};
int in2441 = 100;
int out244 = 49;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2440, in2441);
System.out.println("Output expected: " + out244 + " Output recieved: " + tmpVal );
result = tmpVal == out244;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2450 = {1, 2, 3, 4, 5};
int in2451 = 70;
int out245 = 5;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2450, in2451);
System.out.println("Output expected: " + out245 + " Output recieved: " + tmpVal );
result = tmpVal == out245;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2460 = {10, 10, 10, 1, 10, 10, 100};
int in2461 = 95;
int out246 = 5;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2460, in2461);
System.out.println("Output expected: " + out246 + " Output recieved: " + tmpVal );
result = tmpVal == out246;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2470 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int in2471 = 20;
int out247 = 10;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2470, in2471);
System.out.println("Output expected: " + out247 + " Output recieved: " + tmpVal );
result = tmpVal == out247;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2480 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
int in2481 = 5;
int out248 = 15;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2480, in2481);
System.out.println("Output expected: " + out248 + " Output recieved: " + tmpVal );
result = tmpVal == out248;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2490 = {10, 1, 100};
int in2491 = 99;
int out249 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2490, in2491);
System.out.println("Output expected: " + out249 + " Output recieved: " + tmpVal );
result = tmpVal == out249;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2500 = {1, 2, 3};
int in2501 = 100;
int out250 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2500, in2501);
System.out.println("Output expected: " + out250 + " Output recieved: " + tmpVal );
result = tmpVal == out250;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2510 = {25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 2, 27, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 4, 3, 27, 26, 28, 49};
int in2511 = 47;
int out251 = 26;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2510, in2511);
System.out.println("Output expected: " + out251 + " Output recieved: " + tmpVal );
result = tmpVal == out251;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2520 = {5, 4, 9, 5, 5, 5, 10};
int in2521 = 5;
int out252 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2520, in2521);
System.out.println("Output expected: " + out252 + " Output recieved: " + tmpVal );
result = tmpVal == out252;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2530 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 11, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
int in2531 = 111;
int out253 = 50;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2530, in2531);
System.out.println("Output expected: " + out253 + " Output recieved: " + tmpVal );
result = tmpVal == out253;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2540 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int in2541 = 1000;
int out254 = 50;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2540, in2541);
System.out.println("Output expected: " + out254 + " Output recieved: " + tmpVal );
result = tmpVal == out254;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2550 = {2, 2, 99};
int in2551 = 98;
int out255 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2550, in2551);
System.out.println("Output expected: " + out255 + " Output recieved: " + tmpVal );
result = tmpVal == out255;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2560 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 999, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4};
int in2561 = 1;
int out256 = 19;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2560, in2561);
System.out.println("Output expected: " + out256 + " Output recieved: " + tmpVal );
result = tmpVal == out256;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2570 = {5, 6, 5, 5, 6, 5, 2};
int in2571 = 4;
int out257 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2570, in2571);
System.out.println("Output expected: " + out257 + " Output recieved: " + tmpVal );
result = tmpVal == out257;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2580 = {4, 7, 1, 2, 3, 4, 5};
int in2581 = 6;
int out258 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2580, in2581);
System.out.println("Output expected: " + out258 + " Output recieved: " + tmpVal );
result = tmpVal == out258;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2590 = {1, 3, 3};
int in2591 = 100;
int out259 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2590, in2591);
System.out.println("Output expected: " + out259 + " Output recieved: " + tmpVal );
result = tmpVal == out259;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2600 = {5, 6, 6, 2, 1};
int in2601 = 5;
int out260 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2600, in2601);
System.out.println("Output expected: " + out260 + " Output recieved: " + tmpVal );
result = tmpVal == out260;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2610 = {11, 231, 21, 324, 2, 5, 6, 7, 454, 2};
int in2611 = 399;
int out261 = 5;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2610, in2611);
System.out.println("Output expected: " + out261 + " Output recieved: " + tmpVal );
result = tmpVal == out261;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2620 = {1, 2, 3, 4};
int in2621 = 10;
int out262 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2620, in2621);
System.out.println("Output expected: " + out262 + " Output recieved: " + tmpVal );
result = tmpVal == out262;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2630 = {3, 1, 7};
int in2631 = 6;
int out263 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2630, in2631);
System.out.println("Output expected: " + out263 + " Output recieved: " + tmpVal );
result = tmpVal == out263;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2640 = {2, 1, 1, 1, 3};
int in2641 = 2;
int out264 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2640, in2641);
System.out.println("Output expected: " + out264 + " Output recieved: " + tmpVal );
result = tmpVal == out264;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2650 = {4, 3, 4, 4, 10, 1, 1, 1};
int in2651 = 5;
int out265 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2650, in2651);
System.out.println("Output expected: " + out265 + " Output recieved: " + tmpVal );
result = tmpVal == out265;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2660 = {1, 3, 5, 4};
int in2661 = 4;
int out266 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2660, in2661);
System.out.println("Output expected: " + out266 + " Output recieved: " + tmpVal );
result = tmpVal == out266;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2670 = {1, 2, 3, 4, 5};
int in2671 = 10;
int out267 = 5;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2670, in2671);
System.out.println("Output expected: " + out267 + " Output recieved: " + tmpVal );
result = tmpVal == out267;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2680 = {1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 999};
int in2681 = 1;
int out268 = 26;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2680, in2681);
System.out.println("Output expected: " + out268 + " Output recieved: " + tmpVal );
result = tmpVal == out268;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2690 = {4, 3, 2, 1, 6};
int in2691 = 4;
int out269 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2690, in2691);
System.out.println("Output expected: " + out269 + " Output recieved: " + tmpVal );
result = tmpVal == out269;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2700 = {6, 3, 10, 5, 9, 7};
int in2701 = 7;
int out270 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2700, in2701);
System.out.println("Output expected: " + out270 + " Output recieved: " + tmpVal );
result = tmpVal == out270;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2710 = {6, 6, 5, 2, 6, 3, 3, 3, 7, 5, 45, 3, 4, 34, 34, 34, 43, 5, 54, 4, 45, 4, 7, 5, 68, 7, 6, 8, 34, 2, 78, 5, 7, 87, 4, 12, 34, 54, 67, 78, 89, 90, 67, 34, 23, 78, 23, 43, 56, 56};
int in2711 = 1000;
int out271 = 50;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2710, in2711);
System.out.println("Output expected: " + out271 + " Output recieved: " + tmpVal );
result = tmpVal == out271;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2720 = {1, 2, 3};
int in2721 = 10;
int out272 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2720, in2721);
System.out.println("Output expected: " + out272 + " Output recieved: " + tmpVal );
result = tmpVal == out272;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2730 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
int in2731 = 6;
int out273 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2730, in2731);
System.out.println("Output expected: " + out273 + " Output recieved: " + tmpVal );
result = tmpVal == out273;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2740 = {0, 1, 2, 3, 4};
int in2741 = 100;
int out274 = 5;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2740, in2741);
System.out.println("Output expected: " + out274 + " Output recieved: " + tmpVal );
result = tmpVal == out274;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2750 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int in2751 = 4;
int out275 = 13;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2750, in2751);
System.out.println("Output expected: " + out275 + " Output recieved: " + tmpVal );
result = tmpVal == out275;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2760 = {1, 2, 3};
int in2761 = 5;
int out276 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2760, in2761);
System.out.println("Output expected: " + out276 + " Output recieved: " + tmpVal );
result = tmpVal == out276;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2770 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
int in2771 = 10;
int out277 = 50;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2770, in2771);
System.out.println("Output expected: " + out277 + " Output recieved: " + tmpVal );
result = tmpVal == out277;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2780 = {6, 2, 6, 2, 6, 3, 3, 3, 7};
int in2781 = 50;
int out278 = 9;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2780, in2781);
System.out.println("Output expected: " + out278 + " Output recieved: " + tmpVal );
result = tmpVal == out278;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2790 = {5, 7, 2, 3, 3, 1};
int in2791 = 4;
int out279 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2790, in2791);
System.out.println("Output expected: " + out279 + " Output recieved: " + tmpVal );
result = tmpVal == out279;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2800 = {5, 7, 4, 6, 1};
int in2801 = 4;
int out280 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2800, in2801);
System.out.println("Output expected: " + out280 + " Output recieved: " + tmpVal );
result = tmpVal == out280;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2810 = {1, 1, 3, 1};
int in2811 = 2;
int out281 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2810, in2811);
System.out.println("Output expected: " + out281 + " Output recieved: " + tmpVal );
result = tmpVal == out281;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2820 = {3, 1, 3, 3, 5};
int in2821 = 4;
int out282 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2820, in2821);
System.out.println("Output expected: " + out282 + " Output recieved: " + tmpVal );
result = tmpVal == out282;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2830 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 44, 45, 46, 47, 48, 49, 50};
int in2831 = 500;
int out283 = 50;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2830, in2831);
System.out.println("Output expected: " + out283 + " Output recieved: " + tmpVal );
result = tmpVal == out283;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2840 = {2, 1, 7};
int in2841 = 5;
int out284 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2840, in2841);
System.out.println("Output expected: " + out284 + " Output recieved: " + tmpVal );
result = tmpVal == out284;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2850 = {2, 1, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 55, 2, 5, 5, 5, 5, 3, 5, 5, 5, 5, 5, 1, 5, 5, 5, 4, 5, 5, 5, 5, 6, 5, 55, 5, 5, 5, 5, 5, 5, 5, 5, 3, 3, 3, 3, 3, 3};
int in2851 = 100;
int out285 = 50;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2850, in2851);
System.out.println("Output expected: " + out285 + " Output recieved: " + tmpVal );
result = tmpVal == out285;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2860 = {2, 1, 3, 4, 5};
int in2861 = 4;
int out286 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2860, in2861);
System.out.println("Output expected: " + out286 + " Output recieved: " + tmpVal );
result = tmpVal == out286;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2870 = {1, 1, 1};
int in2871 = 6;
int out287 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2870, in2871);
System.out.println("Output expected: " + out287 + " Output recieved: " + tmpVal );
result = tmpVal == out287;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2880 = {1, 2, 3, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, 240, 300, 2, 5, 7, 9, 0, 12};
int in2881 = 600;
int out288 = 31;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2880, in2881);
System.out.println("Output expected: " + out288 + " Output recieved: " + tmpVal );
result = tmpVal == out288;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2890 = {1, 1, 9, 1, 1, 1, 1, 1, 1, 1, 9};
int in2891 = 10;
int out289 = 11;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2890, in2891);
System.out.println("Output expected: " + out289 + " Output recieved: " + tmpVal );
result = tmpVal == out289;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2900 = {6, 5, 4, 1, 9};
int in2901 = 8;
int out290 = 4;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2900, in2901);
System.out.println("Output expected: " + out290 + " Output recieved: " + tmpVal );
result = tmpVal == out290;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in2910 = {4, 0, 5};
int in2911 = 5;
int out291 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in2910, in2911);
System.out.println("Output expected: " + out291 + " Output recieved: " + tmpVal );
result = tmpVal == out291;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
    }
}
