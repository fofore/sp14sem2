import java.util.*;

public class ShipBoxesDriver {
public static void main(String [] args){
ShipBoxes test;
int mark = 0;
int counter = 0;
int tmpVal;
boolean result;
counter ++;
int[] in00 = {1, 4, 9};
int[] in01 = {1, 4, 9};
int out0 = 140;
System.out.println("testing with input: ");
test = new ShipBoxes();
tmpVal = test.bestCost(in00, in01);
System.out.println("Output expected: " + out0 + " Output recieved: " + tmpVal );
result = tmpVal == out0;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in10 = {10000, 10000, 10000};
int[] in11 = {10000, 10000, 10000};
int out1 = 1200000000;
System.out.println("testing with input: ");
test = new ShipBoxes();
tmpVal = test.bestCost(in10, in11);
System.out.println("Output expected: " + out1 + " Output recieved: " + tmpVal );
result = tmpVal == out1;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in20 = {314, 159, 262};
int[] in21 = {271, 818, 282};
int out2 = 1483466;
System.out.println("testing with input: ");
test = new ShipBoxes();
tmpVal = test.bestCost(in20, in21);
System.out.println("Output expected: " + out2 + " Output recieved: " + tmpVal );
result = tmpVal == out2;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in30 = {1, 1, 1};
int[] in31 = {1, 1, 1};
int out3 = 12;
System.out.println("testing with input: ");
test = new ShipBoxes();
tmpVal = test.bestCost(in30, in31);
System.out.println("Output expected: " + out3 + " Output recieved: " + tmpVal );
result = tmpVal == out3;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in40 = {1, 9000, 9000};
int[] in41 = {40, 40, 40};
int out4 = 164214000;
System.out.println("testing with input: ");
test = new ShipBoxes();
tmpVal = test.bestCost(in40, in41);
System.out.println("Output expected: " + out4 + " Output recieved: " + tmpVal );
result = tmpVal == out4;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in50 = {9627, 9344, 3773};
int[] in51 = {5652, 5696, 5646};
int out5 = 669089316;
System.out.println("testing with input: ");
test = new ShipBoxes();
tmpVal = test.bestCost(in50, in51);
System.out.println("Output expected: " + out5 + " Output recieved: " + tmpVal );
result = tmpVal == out5;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in60 = {3285, 9049, 7352};
int[] in61 = {1391, 3122, 6053};
int out6 = 318705840;
System.out.println("testing with input: ");
test = new ShipBoxes();
tmpVal = test.bestCost(in60, in61);
System.out.println("Output expected: " + out6 + " Output recieved: " + tmpVal );
result = tmpVal == out6;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in70 = {1857, 3875, 5935};
int[] in71 = {5651, 3546, 7847};
int out7 = 282384980;
System.out.println("testing with input: ");
test = new ShipBoxes();
tmpVal = test.bestCost(in70, in71);
System.out.println("Output expected: " + out7 + " Output recieved: " + tmpVal );
result = tmpVal == out7;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in80 = {595, 3423, 3181};
int[] in81 = {3779, 1834, 9227};
int out8 = 151279196;
System.out.println("testing with input: ");
test = new ShipBoxes();
tmpVal = test.bestCost(in80, in81);
System.out.println("Output expected: " + out8 + " Output recieved: " + tmpVal );
result = tmpVal == out8;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in90 = {4924, 9230, 904};
int[] in91 = {5355, 9133, 1219};
int out9 = 183518540;
System.out.println("testing with input: ");
test = new ShipBoxes();
tmpVal = test.bestCost(in90, in91);
System.out.println("Output expected: " + out9 + " Output recieved: " + tmpVal );
result = tmpVal == out9;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in100 = {5367, 4548, 548};
int[] in101 = {5503, 1254, 14};
int out10 = 66464564;
System.out.println("testing with input: ");
test = new ShipBoxes();
tmpVal = test.bestCost(in100, in101);
System.out.println("Output expected: " + out10 + " Output recieved: " + tmpVal );
result = tmpVal == out10;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in110 = {4086, 1440, 3451};
int[] in111 = {6510, 9955, 5144};
int out11 = 399544420;
System.out.println("testing with input: ");
test = new ShipBoxes();
tmpVal = test.bestCost(in110, in111);
System.out.println("Output expected: " + out11 + " Output recieved: " + tmpVal );
result = tmpVal == out11;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in120 = {4817, 1091, 7468};
int[] in121 = {5355, 2401, 9625};
int out12 = 245103390;
System.out.println("testing with input: ");
test = new ShipBoxes();
tmpVal = test.bestCost(in120, in121);
System.out.println("Output expected: " + out12 + " Output recieved: " + tmpVal );
result = tmpVal == out12;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in130 = {2316, 5275, 1301};
int[] in131 = {4423, 5514, 3712};
int out13 = 187491120;
System.out.println("testing with input: ");
test = new ShipBoxes();
tmpVal = test.bestCost(in130, in131);
System.out.println("Output expected: " + out13 + " Output recieved: " + tmpVal );
result = tmpVal == out13;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in140 = {5929, 4836, 7469};
int[] in141 = {2525, 2418, 5740};
int out14 = 327557686;
System.out.println("testing with input: ");
test = new ShipBoxes();
tmpVal = test.bestCost(in140, in141);
System.out.println("Output expected: " + out14 + " Output recieved: " + tmpVal );
result = tmpVal == out14;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in150 = {6570, 6076, 5880};
int[] in151 = {7595, 3, 1835};
int out15 = 324635290;
System.out.println("testing with input: ");
test = new ShipBoxes();
tmpVal = test.bestCost(in150, in151);
System.out.println("Output expected: " + out15 + " Output recieved: " + tmpVal );
result = tmpVal == out15;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in160 = {3873, 2657, 6313};
int[] in161 = {22, 50, 5258};
int out16 = 124121612;
System.out.println("testing with input: ");
test = new ShipBoxes();
tmpVal = test.bestCost(in160, in161);
System.out.println("Output expected: " + out16 + " Output recieved: " + tmpVal );
result = tmpVal == out16;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in170 = {7137, 8699, 9997};
int[] in171 = {4838, 2899, 205};
int out17 = 571456796;
System.out.println("testing with input: ");
test = new ShipBoxes();
tmpVal = test.bestCost(in170, in171);
System.out.println("Output expected: " + out17 + " Output recieved: " + tmpVal );
result = tmpVal == out17;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in180 = {3072, 1173, 5733};
int[] in181 = {8249, 173, 420};
int out18 = 88113704;
System.out.println("testing with input: ");
test = new ShipBoxes();
tmpVal = test.bestCost(in180, in181);
System.out.println("Output expected: " + out18 + " Output recieved: " + tmpVal );
result = tmpVal == out18;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in190 = {1143, 6181, 6808};
int[] in191 = {1106, 3775, 6302};
int out19 = 170387156;
System.out.println("testing with input: ");
test = new ShipBoxes();
tmpVal = test.bestCost(in190, in191);
System.out.println("Output expected: " + out19 + " Output recieved: " + tmpVal );
result = tmpVal == out19;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in200 = {5596, 3856, 958};
int[] in201 = {5792, 7881, 5173};
int out20 = 313687334;
System.out.println("testing with input: ");
test = new ShipBoxes();
tmpVal = test.bestCost(in200, in201);
System.out.println("Output expected: " + out20 + " Output recieved: " + tmpVal );
result = tmpVal == out20;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in210 = {8066, 6929, 7160};
int[] in211 = {5291, 2741, 2490};
int out21 = 495893528;
System.out.println("testing with input: ");
test = new ShipBoxes();
tmpVal = test.bestCost(in210, in211);
System.out.println("Output expected: " + out21 + " Output recieved: " + tmpVal );
result = tmpVal == out21;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in220 = {6591, 9417, 818};
int[] in221 = {7891, 9167, 6510};
int out22 = 517764276;
System.out.println("testing with input: ");
test = new ShipBoxes();
tmpVal = test.bestCost(in220, in221);
System.out.println("Output expected: " + out22 + " Output recieved: " + tmpVal );
result = tmpVal == out22;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in230 = {951, 874, 282};
int[] in231 = {2087, 6038, 2672};
int out23 = 82459616;
System.out.println("testing with input: ");
test = new ShipBoxes();
tmpVal = test.bestCost(in230, in231);
System.out.println("Output expected: " + out23 + " Output recieved: " + tmpVal );
result = tmpVal == out23;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in240 = {3411, 4445, 742};
int[] in241 = {2832, 7134, 718};
int out24 = 89419668;
System.out.println("testing with input: ");
test = new ShipBoxes();
tmpVal = test.bestCost(in240, in241);
System.out.println("Output expected: " + out24 + " Output recieved: " + tmpVal );
result = tmpVal == out24;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in250 = {695, 4861, 9830};
int[] in251 = {8022, 5203, 327};
int out25 = 143653364;
System.out.println("testing with input: ");
test = new ShipBoxes();
tmpVal = test.bestCost(in250, in251);
System.out.println("Output expected: " + out25 + " Output recieved: " + tmpVal );
result = tmpVal == out25;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
    }
}
