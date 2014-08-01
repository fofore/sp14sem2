import java.util.*;

public class ElevatorLimitDriver {
public static void main(String [] args){
ElevatorLimit test;
int mark = 0;
int counter = 0;
int[] tmpVal;
boolean result;
counter ++;
int[] in00 = {1, 2, 3, 4, 5};
int[] in01 = {5, 4, 3, 2, 1};
int in02 = 25;
int[] out0 = {9, 25};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in00, in01, in02);
System.out.println("Output expected: " + out0 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out0);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in10 = {1, 0};
int[] in11 = {0, 1};
int in12 = 1;
int[] out1 = {0, 0};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in10, in11, in12);
System.out.println("Output expected: " + out1 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out1);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in20 = {1, 0};
int[] in21 = {0, 1};
int in22 = 2;
int[] out2 = {0, 1};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in20, in21, in22);
System.out.println("Output expected: " + out2 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out2);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in30 = {0, 1};
int[] in31 = {1, 0};
int in32 = 1;
int[] out3 = {1, 1};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in30, in31, in32);
System.out.println("Output expected: " + out3 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out3);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in40 = {0, 2};
int[] in41 = {1, 0};
int in42 = 1;
int[] out4 = {};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in40, in41, in42);
System.out.println("Output expected: " + out4 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out4);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in50 = {54, 127, 157, 39, 29, 156, 192, 60, 51, 156, 79, 175, 112, 109, 180, 3, 24, 63, 133, 100, 136, 40, 114, 98, 199, 82, 15, 105, 49, 40, 33, 193, 116, 32, 59, 177, 152, 35, 5, 30, 190, 158, 12};
int[] in51 = {54, 127, 157, 39, 29, 156, 192, 60, 51, 156, 79, 175, 112, 109, 180, 3, 24, 63, 133, 100, 136, 40, 114, 98, 199, 82, 15, 105, 49, 40, 33, 193, 116, 32, 59, 177, 152, 35, 5, 30, 190, 158, 12};
int in52 = 558;
int[] out5 = {199, 558};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in50, in51, in52);
System.out.println("Output expected: " + out5 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out5);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in60 = {175, 50, 167, 45, 62, 96, 197, 103, 140, 75, 8, 113, 68, 64, 56, 2, 31, 23, 15, 85, 17, 54, 149, 198, 97};
int[] in61 = {38, 154, 83, 138, 59, 160, 52, 20, 184, 198, 40, 138, 44, 155, 42, 144, 28, 127, 128, 90, 193, 100, 94, 18, 132};
int in62 = 367;
int[] out6 = {};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in60, in61, in62);
System.out.println("Output expected: " + out6 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out6);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in70 = {6, 85, 106, 1, 199, 76, 162, 141};
int[] in71 = {38, 68, 62, 83, 170, 12, 61, 114};
int in72 = 668;
int[] out7 = {223, 500};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in70, in71, in72);
System.out.println("Output expected: " + out7 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out7);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in80 = {159, 41, 182, 81, 7, 35, 168, 63, 131, 193, 107, 179, 105, 159, 52, 110, 61, 70, 25, 199, 179, 47, 22, 97, 112, 196, 183, 32, 182, 109, 52, 176, 64, 86, 57, 143, 146, 18, 138, 101, 81, 197, 13, 38, 166, 125, 54, 59, 44};
int[] in81 = {146, 10, 87, 92, 58, 184, 116, 84, 123, 109, 2, 198, 164, 198, 187, 11, 34, 131, 120, 102, 140, 193, 15, 174, 44, 44, 173, 44, 48, 67, 194, 36, 96, 8, 59, 155, 77, 71, 3, 148, 26, 36, 36, 51, 141, 100, 24, 63, 48};
int in82 = 900;
int[] out8 = {303, 318};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in80, in81, in82);
System.out.println("Output expected: " + out8 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out8);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in90 = {107, 15, 98, 153, 4, 19, 9, 160, 197, 122, 175, 37, 2, 190, 86, 86, 101, 128, 14, 154, 155, 2, 188, 179, 180, 66, 80};
int[] in91 = {37, 176, 192, 99, 173, 113, 46, 20, 81, 108, 154, 161, 50, 156, 81, 56, 92, 161, 39, 189, 22, 131, 142, 144, 95, 162, 131};
int in92 = 1;
int[] out9 = {};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in90, in91, in92);
System.out.println("Output expected: " + out9 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out9);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in100 = {179, 135, 104, 90, 97, 186, 187, 47, 152, 100, 119, 28, 193, 11, 103, 100, 179, 11, 80, 163, 50, 131, 103, 50, 142, 51, 112, 62, 69, 72, 88, 3, 162, 93, 190, 85, 79, 86, 146, 71, 65, 131, 179, 119, 66, 111};
int[] in101 = {134, 81, 178, 168, 86, 128, 1, 165, 62, 46, 188, 70, 104, 111, 3, 47, 144, 69, 163, 21, 101, 126, 169, 84, 146, 165, 198, 1, 65, 181, 135, 99, 100, 195, 171, 47, 16, 54, 79, 69, 6, 97, 154, 80, 151, 76};
int in102 = 954;
int[] out10 = {453, 659};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in100, in101, in102);
System.out.println("Output expected: " + out10 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out10);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in110 = {35, 125, 84, 47, 176, 71, 141, 46, 12, 174, 126, 14, 4, 58, 179, 161, 173, 148, 157, 175, 30, 53, 98, 99, 3, 100, 95, 174, 189, 23, 106, 101, 135, 70, 97, 156, 54, 156};
int[] in111 = {199, 189, 136, 29, 8, 190, 108, 111, 46, 161, 174, 188, 49, 195, 66, 177, 147, 196, 30, 76, 178, 99, 104, 160, 114, 86, 63, 92, 66, 110, 82, 192, 104, 62, 71, 52, 76, 181};
int in112 = 785;
int[] out11 = {};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in110, in111, in112);
System.out.println("Output expected: " + out11 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out11);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in120 = {165, 161, 30, 178, 178, 5, 28, 20, 159, 143, 28};
int[] in121 = {53, 113, 16, 148, 148, 63, 178, 110, 129, 160, 75};
int in122 = 859;
int[] out12 = {194, 625};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in120, in121, in122);
System.out.println("Output expected: " + out12 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out12);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in130 = {25, 163, 53, 29, 179, 81, 67, 23};
int[] in131 = {37, 161, 31, 137, 160, 162, 166, 159};
int in132 = 163;
int[] out13 = {};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in130, in131, in132);
System.out.println("Output expected: " + out13 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out13);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in140 = {164, 45, 153, 127, 141, 101, 35, 90, 146, 63, 122, 66, 10, 130, 160, 178, 83, 73, 197, 59, 58, 105, 35, 193, 167, 122, 153, 79, 71};
int[] in141 = {101, 108, 98, 6, 43, 31, 67, 11, 157, 102, 19, 13, 198, 6, 139, 36, 161, 24, 116, 15, 128, 67, 100, 24, 176, 90, 166, 17, 79};
int in142 = 971;
int[] out14 = {101, 135};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in140, in141, in142);
System.out.println("Output expected: " + out14 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out14);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in150 = {117, 100, 137, 143, 81, 21, 162, 53, 111, 6, 173, 95, 128, 100, 66, 32, 105, 139, 51, 131, 22, 190, 18, 70, 5, 172, 173, 61, 124, 143, 34, 137, 42, 116, 60, 115, 42, 22, 77, 50, 8, 187, 109, 152, 191};
int[] in151 = {35, 151, 93, 80, 19, 97, 75, 6, 30, 41, 74, 125, 111, 98, 15, 187, 83, 156, 139, 84, 155, 16, 98, 142, 40, 83, 156, 178, 153, 29, 75, 181, 77, 188, 125, 181, 103, 77, 148, 77, 171, 190, 71, 38, 66};
int in152 = 1000;
int[] out15 = {};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in150, in151, in152);
System.out.println("Output expected: " + out15 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out15);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in160 = {2};
int[] in161 = {3};
int in162 = 2;
int[] out16 = {};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in160, in161, in162);
System.out.println("Output expected: " + out16 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out16);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in170 = {696, 327, 995, 748, 124, 896, 472, 877, 652, 850, 656, 812, 978, 375, 980, 187, 13, 296, 243};
int[] in171 = {205, 451, 195, 626, 950, 99, 649, 379, 54, 599, 866, 313, 183, 216, 153, 232, 337, 114, 610};
int in172 = 955;
int[] out17 = {};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in170, in171, in172);
System.out.println("Output expected: " + out17 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out17);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in180 = {136, 559, 970, 167, 730, 628, 614, 481, 238, 442, 659, 108, 892, 685, 849, 312, 325, 331, 754, 910, 567, 49, 393, 385, 988, 9, 14, 909, 197, 255, 88, 142, 805, 131, 941};
int[] in181 = {464, 251, 730, 523, 60, 999, 435, 545, 66, 608, 635, 86, 605, 256, 631, 257, 475, 500, 819, 570, 268, 431, 969, 813, 390, 505, 428, 298, 277, 760, 769, 573, 582, 315, 836};
int in182 = 235;
int[] out18 = {};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in180, in181, in182);
System.out.println("Output expected: " + out18 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out18);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in190 = {528, 931, 787, 745, 551, 781, 820, 426, 353, 11, 577, 391, 11, 446, 949, 666, 962, 206, 564, 198, 619, 997, 793};
int[] in191 = {699, 432, 428, 379, 214, 743, 123, 532, 72, 473, 307, 561, 685, 299, 436, 825, 654, 786, 915, 439, 319, 591, 908};
int in192 = 563;
int[] out19 = {};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in190, in191, in192);
System.out.println("Output expected: " + out19 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out19);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in200 = {962, 692, 801, 531, 354, 198, 45, 420, 911, 148, 898, 563, 641, 198, 689};
int[] in201 = {508, 856, 860, 264, 557, 250, 195, 191, 218, 535, 170, 272, 997, 113, 421};
int in202 = 101;
int[] out20 = {};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in200, in201, in202);
System.out.println("Output expected: " + out20 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out20);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in210 = {269, 437, 969, 989, 469, 151, 132, 166, 636, 1000, 658, 810, 180, 855, 472, 752, 38, 1, 383, 327, 333, 590, 805, 636, 585, 896, 768, 676, 206, 96, 771, 364, 593, 904, 405, 324, 902, 23, 203, 346, 794, 306, 421, 185, 528, 655, 413};
int[] in211 = {95, 318, 84, 384, 613, 229, 974, 539, 423, 271, 86, 597, 641, 900, 7, 786, 987, 455, 540, 429, 50, 609, 631, 758, 448, 956, 278, 735, 646, 955, 195, 877, 475, 416, 597, 730, 901, 649, 578, 968, 542, 223, 640, 595, 268, 48, 974};
int in212 = 885;
int[] out21 = {};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in210, in211, in212);
System.out.println("Output expected: " + out21 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out21);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in220 = {722, 668, 984, 930, 131, 547, 572, 205, 282, 661, 82, 879, 923, 955, 770, 213, 449, 907, 863, 964, 610, 671, 867};
int[] in221 = {874, 309, 206, 968, 814, 18, 361, 856, 240, 698, 120, 302, 253, 651, 751, 118, 867, 534, 943, 585, 754, 424, 683};
int in222 = 604;
int[] out22 = {};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in220, in221, in222);
System.out.println("Output expected: " + out22 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out22);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in230 = {405, 428, 328, 180, 331, 568, 267, 682, 661, 442, 434, 777, 198, 215, 584, 344, 196};
int[] in231 = {432, 558, 117, 564, 972, 980, 565, 329, 379, 114, 441, 109, 996, 437, 925, 932, 721};
int in232 = 926;
int[] out23 = {};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in230, in231, in232);
System.out.println("Output expected: " + out23 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out23);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in240 = {865, 360, 886, 549, 325, 527};
int[] in241 = {176, 289, 937, 589, 755, 376};
int in242 = 966;
int[] out24 = {177, 206};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in240, in241, in242);
System.out.println("Output expected: " + out24 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out24);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in250 = {205, 894, 306, 26, 202, 803};
int[] in251 = {447, 448, 464, 190, 159, 518};
int in252 = 912;
int[] out25 = {690, 702};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in250, in251, in252);
System.out.println("Output expected: " + out25 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out25);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in260 = {611, 382, 772, 313, 641, 394};
int[] in261 = {316, 653, 387, 417, 653, 73};
int in262 = 994;
int[] out26 = {363, 380};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in260, in261, in262);
System.out.println("Output expected: " + out26 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out26);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in270 = {381, 330, 242, 94, 92, 748, 3, 435, 193, 469, 290, 471, 27};
int[] in271 = {355, 412, 346, 75, 182, 217, 68, 372, 218, 612, 428, 496, 570};
int in272 = 990;
int[] out27 = {603, 690};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in270, in271, in272);
System.out.println("Output expected: " + out27 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out27);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in280 = {136, 221, 351, 404, 266, 590, 6, 742, 205};
int[] in281 = {41, 267, 660, 189, 465, 295, 119, 752, 330};
int in282 = 962;
int[] out28 = {814, 867};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in280, in281, in282);
System.out.println("Output expected: " + out28 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out28);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in290 = {295, 752, 84, 439, 607, 581};
int[] in291 = {558, 664, 644, 2, 564, 451};
int in292 = 948;
int[] out29 = {927, 948};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in290, in291, in292);
System.out.println("Output expected: " + out29 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out29);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in300 = {622, 144, 607, 687, 341, 138};
int[] in301 = {142, 273, 657, 549, 314, 451};
int in302 = 914;
int[] out30 = {306, 434};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in300, in301, in302);
System.out.println("Output expected: " + out30 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out30);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in310 = {111, 516, 416, 45, 142, 564};
int[] in311 = {273, 565, 212, 264, 265, 244};
int in312 = 805;
int[] out31 = {727, 805};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in310, in311, in312);
System.out.println("Output expected: " + out31 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out31);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in320 = {534, 369, 645, 663, 542, 568};
int[] in321 = {750, 515, 164, 742, 794, 220};
int in322 = 993;
int[] out32 = {754, 857};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in320, in321, in322);
System.out.println("Output expected: " + out32 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out32);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in330 = {133, 401, 321, 141, 507, 324};
int[] in331 = {67, 64, 62, 353, 385, 545};
int in332 = 788;
int[] out33 = {67, 126};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in330, in331, in332);
System.out.println("Output expected: " + out33 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out33);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in340 = {113, 512, 47, 818, 294, 113};
int[] in341 = {63, 654, 727, 143, 629, 10};
int in342 = 997;
int[] out34 = {915, 947};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in340, in341, in342);
System.out.println("Output expected: " + out34 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out34);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in350 = {597, 148, 149, 199, 643, 159, 484};
int[] in351 = {61, 198, 52, 897, 87, 290, 151};
int in352 = 972;
int[] out35 = {314, 329};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in350, in351, in352);
System.out.println("Output expected: " + out35 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out35);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in360 = {323, 174, 317, 716, 154, 290, 510, 833};
int[] in361 = {104, 64, 291, 677, 251, 383, 229, 657};
int in362 = 986;
int[] out36 = {322, 325};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in360, in361, in362);
System.out.println("Output expected: " + out36 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out36);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in370 = {351, 545, 107, 262, 716, 127, 353};
int[] in371 = {420, 338, 117, 484, 734, 30, 551};
int in372 = 985;
int[] out37 = {828, 847};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in370, in371, in372);
System.out.println("Output expected: " + out37 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out37);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in380 = {664, 381, 329, 232, 306, 646, 46, 491};
int[] in381 = {76, 656, 439, 183, 329, 186, 178, 511};
int in382 = 921;
int[] out38 = {126, 232};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in380, in381, in382);
System.out.println("Output expected: " + out38 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out38);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in390 = {343, 338, 471, 551, 884, 22, 353};
int[] in391 = {150, 187, 885, 522, 475, 257, 399};
int in392 = 962;
int[] out39 = {592, 594};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in390, in391, in392);
System.out.println("Output expected: " + out39 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out39);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in400 = {271, 142, 58, 242, 187, 372};
int[] in401 = {236, 131, 61, 120, 247, 51};
int in402 = 844;
int[] out40 = {236, 418};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in400, in401, in402);
System.out.println("Output expected: " + out40 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out40);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in410 = {359, 496, 161, 379, 398, 200};
int[] in411 = {733, 354, 227, 492, 161, 170};
int in412 = 928;
int[] out41 = {790, 928};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in410, in411, in412);
System.out.println("Output expected: " + out41 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out41);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in420 = {602, 410, 242, 615, 406, 11};
int[] in421 = {618, 543, 121, 713, 121, 587};
int in422 = 943;
int[] out42 = {741, 784};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in420, in421, in422);
System.out.println("Output expected: " + out42 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out42);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in430 = {494, 365, 201, 853, 302, 496, 285};
int[] in431 = {372, 240, 317, 517, 307, 543, 733};
int in432 = 901;
int[] out43 = {386, 434};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in430, in431, in432);
System.out.println("Output expected: " + out43 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out43);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in440 = {0};
int[] in441 = {1000};
int in442 = 1000;
int[] out44 = {1000, 1000};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in440, in441, in442);
System.out.println("Output expected: " + out44 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out44);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in450 = {0, 2};
int[] in451 = {1, 0};
int in452 = 1;
int[] out45 = {};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in450, in451, in452);
System.out.println("Output expected: " + out45 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out45);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in460 = {2, 2, 2};
int[] in461 = {0, 0, 0};
int in462 = 4;
int[] out46 = {};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in460, in461, in462);
System.out.println("Output expected: " + out46 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out46);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in470 = {1, 1};
int[] in471 = {3, 3};
int in472 = 4;
int[] out47 = {};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in470, in471, in472);
System.out.println("Output expected: " + out47 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out47);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in480 = {0};
int[] in481 = {1};
int in482 = 5;
int[] out48 = {1, 5};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in480, in481, in482);
System.out.println("Output expected: " + out48 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out48);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in490 = {2};
int[] in491 = {3};
int in492 = 3;
int[] out49 = {3, 3};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in490, in491, in492);
System.out.println("Output expected: " + out49 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out49);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in500 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
int[] in501 = {5, 102, 5, 2, 103, 65, 24, 12, 5, 6, 11, 9};
int in502 = 30;
int[] out50 = {};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in500, in501, in502);
System.out.println("Output expected: " + out50 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out50);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in510 = {50};
int[] in511 = {100};
int in512 = 110;
int[] out51 = {100, 110};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in510, in511, in512);
System.out.println("Output expected: " + out51 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out51);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in520 = {3, 0, 0};
int[] in521 = {0, 3, 3};
int in522 = 5;
int[] out52 = {};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in520, in521, in522);
System.out.println("Output expected: " + out52 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out52);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in530 = {1, 1, 1};
int[] in531 = {0, 0, 0};
int in532 = 1;
int[] out53 = {};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in530, in531, in532);
System.out.println("Output expected: " + out53 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out53);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in540 = {179, 135, 104, 90, 97, 186, 187, 47, 152, 100, 119, 28, 193, 11, 103, 100, 179, 11, 80, 163, 50, 131, 103, 50, 142, 51, 112, 62, 69, 72, 88, 3, 162, 93, 190, 85, 79, 86, 146, 71, 65, 131, 179, 119, 66, 111};
int[] in541 = {134, 81, 178, 168, 86, 128, 1, 165, 62, 46, 188, 70, 104, 111, 3, 47, 144, 69, 163, 21, 101, 126, 169, 84, 146, 165, 198, 1, 65, 181, 135, 99, 100, 195, 171, 47, 16, 54, 79, 69, 6, 97, 154, 80, 151, 76};
int in542 = 954;
int[] out54 = {453, 659};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in540, in541, in542);
System.out.println("Output expected: " + out54 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out54);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in550 = {1};
int[] in551 = {1};
int in552 = 2;
int[] out55 = {1, 2};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in550, in551, in552);
System.out.println("Output expected: " + out55 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out55);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in560 = {50, 0, 0};
int[] in561 = {0, 50, 50};
int in562 = 50;
int[] out56 = {};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in560, in561, in562);
System.out.println("Output expected: " + out56 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out56);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in570 = {0};
int[] in571 = {100};
int in572 = 100;
int[] out57 = {100, 100};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in570, in571, in572);
System.out.println("Output expected: " + out57 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out57);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in580 = {0};
int[] in581 = {3};
int in582 = 3;
int[] out58 = {3, 3};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in580, in581, in582);
System.out.println("Output expected: " + out58 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out58);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in590 = {0};
int[] in591 = {20};
int in592 = 30;
int[] out59 = {20, 30};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in590, in591, in592);
System.out.println("Output expected: " + out59 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out59);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in600 = {2};
int[] in601 = {3};
int in602 = 5;
int[] out60 = {3, 5};
System.out.println("testing with input: ");
test = new ElevatorLimit();
tmpVal = test.getRange(in600, in601, in602);
System.out.println("Output expected: " + out60 + " Output recieved: " + tmpVal );
result = Arrays.equals(tmpVal, out60);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
    }
}
