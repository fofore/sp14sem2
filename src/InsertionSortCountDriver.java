public class InsertionSortCountDriver {
public static void main(String [] args){
InsertionSortCount test;
int mark = 0;
int counter = 0;
int tmpVal;
boolean result;
counter ++;
int[] in00 = {20, 40, 30, 10};
int out0 = 4;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in00);
System.out.println("Output expected: " + out0 + " Output recieved: " + tmpVal );
result = tmpVal == out0;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in10 = {-1, 1, 0};
int out1 = 1;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in10);
System.out.println("Output expected: " + out1 + " Output recieved: " + tmpVal );
result = tmpVal == out1;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in20 = {-1000, 0, 1000};
int out2 = 0;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in20);
System.out.println("Output expected: " + out2 + " Output recieved: " + tmpVal );
result = tmpVal == out2;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in30 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int out3 = 0;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in30);
System.out.println("Output expected: " + out3 + " Output recieved: " + tmpVal );
result = tmpVal == out3;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in40 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
int out4 = 45;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in40);
System.out.println("Output expected: " + out4 + " Output recieved: " + tmpVal );
result = tmpVal == out4;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in50 = {2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
int out5 = 9;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in50);
System.out.println("Output expected: " + out5 + " Output recieved: " + tmpVal );
result = tmpVal == out5;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in60 = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
int out6 = 9;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in60);
System.out.println("Output expected: " + out6 + " Output recieved: " + tmpVal );
result = tmpVal == out6;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in70 = {-1000, 1000, 0};
int out7 = 1;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in70);
System.out.println("Output expected: " + out7 + " Output recieved: " + tmpVal );
result = tmpVal == out7;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in80 = {1000, -1000, 0};
int out8 = 2;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in80);
System.out.println("Output expected: " + out8 + " Output recieved: " + tmpVal );
result = tmpVal == out8;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in90 = {1000, 0, -1000};
int out9 = 3;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in90);
System.out.println("Output expected: " + out9 + " Output recieved: " + tmpVal );
result = tmpVal == out9;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in100 = {0, -1000, 1000};
int out10 = 1;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in100);
System.out.println("Output expected: " + out10 + " Output recieved: " + tmpVal );
result = tmpVal == out10;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in110 = {0, 1000, -1000};
int out11 = 2;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in110);
System.out.println("Output expected: " + out11 + " Output recieved: " + tmpVal );
result = tmpVal == out11;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in120 = {325};
int out12 = 0;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in120);
System.out.println("Output expected: " + out12 + " Output recieved: " + tmpVal );
result = tmpVal == out12;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in130 = {-1000};
int out13 = 0;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in130);
System.out.println("Output expected: " + out13 + " Output recieved: " + tmpVal );
result = tmpVal == out13;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in140 = {234, 654, 747, 34, 37, -37, 43, 235, 5, 35, 674, -23, 6, 4, 454, 3, 53, 354, 23};
int out14 = 98;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in140);
System.out.println("Output expected: " + out14 + " Output recieved: " + tmpVal );
result = tmpVal == out14;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in150 = {-989, -986, -829, -821, -749, -716, -683, -606, -540, -520, -411, -410, -400, -385, -366, -357, -353, -310, -8, 0, 78, 104, 116, 118, 221, 224, 261, 301, 351, 434, 445, 453, 482, 486, 501, 509, 577, 585, 600, 630, 636, 654, 723, 786, 809, 867, 886, 938, 950, 966};
int out15 = 0;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in150);
System.out.println("Output expected: " + out15 + " Output recieved: " + tmpVal );
result = tmpVal == out15;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in160 = {952, 923, 828, 757, 695, 656, 588, 571, 557, 547, 333, 319, 305, 269, 245, 217, 156, 154, 152, 134, 133, 72, 71, 39, 23, -3, -40, -135, -166, -176, -218, -363, -389, -442, -466, -476, -488, -512, -518, -551, -582, -593, -620, -629, -659, -744, -749, -753, -822, -880};
int out16 = 1225;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in160);
System.out.println("Output expected: " + out16 + " Output recieved: " + tmpVal );
result = tmpVal == out16;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in170 = {-861, -726, -571, -691, -725, -564, -527, -381, 672, 778, 348, 271, 279};
int out17 = 11;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in170);
System.out.println("Output expected: " + out17 + " Output recieved: " + tmpVal );
result = tmpVal == out17;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in180 = {-957, -956, -896, -122, -688, -626, -625, -419, -417, 38, -410, -389, -382, -357, -253, -186, -155, -818, -48, -19, -415, 902, 234, 244, 319, 498, 499, 607, 649, 822, 679, 678, 752, 664, 177};
int out18 = 79;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in180);
System.out.println("Output expected: " + out18 + " Output recieved: " + tmpVal );
result = tmpVal == out18;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in190 = {-210, 493, -402, -121, 474, -340, 617};
int out19 = 8;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in190);
System.out.println("Output expected: " + out19 + " Output recieved: " + tmpVal );
result = tmpVal == out19;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in200 = {-984, -980, -916, -892, -813, 9, -709, -693, -656, -615, -539, -481, -453, -381, -312, -280, -274, -258, -139, -133, 870, 371, -74, -33, -18, -781, 123, 275, 308, -80, 481, 549, 758, -114, 933, 954};
int out20 = 75;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in200);
System.out.println("Output expected: " + out20 + " Output recieved: " + tmpVal );
result = tmpVal == out20;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in210 = {-937, -912, -818, -629, -618, -589, -406, -330, -221, -183, 184, -107, -34, -19, 19, 33, -143, 220, 256, 321, 325, 336, 342, 354, 358, 395, 426, 466, 474, 479, 715, 764, 836, 936, 966, 967};
int out21 = 11;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in210);
System.out.println("Output expected: " + out21 + " Output recieved: " + tmpVal );
result = tmpVal == out21;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in220 = {17, -734, -619, -923, 671};
int out22 = 5;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in220);
System.out.println("Output expected: " + out22 + " Output recieved: " + tmpVal );
result = tmpVal == out22;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in230 = {-960, -763, -745, -704, -604, -491, -490, -396, -381, 817, -246, -177, -16, 12, 70, 90, 191, 232, 313, 322, 374, 506, 569, 590, 607, 632, 660, 678, 684, 716, 801, 802, -308, 849, 865, 913, 931, 990};
int out23 = 45;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in230);
System.out.println("Output expected: " + out23 + " Output recieved: " + tmpVal );
result = tmpVal == out23;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in240 = {-915, -845, -747, -640, -523, -505, -475, -402, -364, -342, -332, -308, -250, -242, -212, 77, 326, 962, 733, 754, 332, 1000};
int out24 = 5;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in240);
System.out.println("Output expected: " + out24 + " Output recieved: " + tmpVal );
result = tmpVal == out24;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in250 = {-898, -852, -843, -648, -497, -350, -212, 678, -171, -134, 758, -8, 124, 70, 71, 97, 17, 286, -204, 714, -120, 837, 842};
int out25 = 45;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in250);
System.out.println("Output expected: " + out25 + " Output recieved: " + tmpVal );
result = tmpVal == out25;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in260 = {-910, -847, -738, -386, -320, -316, -278, -15, -3, 57, 283, 390, 643, 971, 978};
int out26 = 0;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in260);
System.out.println("Output expected: " + out26 + " Output recieved: " + tmpVal );
result = tmpVal == out26;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in270 = {967, 931, 918, 878, 874, 791, 781, 780, 773, 756, 743, 687, -972, 590, 495, 477, 467, 289, 200, 174, 123, 120, 677, 47, 73, -231, -293, -298, -305, -309, -366, -400, -512, -865, -713, -745, -844, -595, -966, -126};
int out27 = 722;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in270);
System.out.println("Output expected: " + out27 + " Output recieved: " + tmpVal );
result = tmpVal == out27;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in280 = {821, 716, 604, -640, 297, 278, 246, 237, 195, -13, -29, -38, -217, -738, 380, -659, -724, -541, -794, -822, -953, -959};
int out28 = 205;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in280);
System.out.println("Output expected: " + out28 + " Output recieved: " + tmpVal );
result = tmpVal == out28;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in290 = {644, -960};
int out29 = 1;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in290);
System.out.println("Output expected: " + out29 + " Output recieved: " + tmpVal );
result = tmpVal == out29;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in300 = {906, 892, 864, 835, 819, 753, 710, 573, -442, 419, 203, 394, 368, 331, 260, 413, 165, 64, -45, -48, -87, -130, -142, -174, -183, -197, -198, -244, -316, -379, -404, -453, -412, 461, -452, -408, -559, -570, -640, -662, -699, -705, -712, -747};
int out30 = 883;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in300);
System.out.println("Output expected: " + out30 + " Output recieved: " + tmpVal );
result = tmpVal == out30;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in310 = {973, 924, 896, 837, 803, 790, 743, 733, 700, 615, 586, 527, 521, 477, 475, 306, 297, 250, 222, 179, 131, 99, 68, 41, -44, -67, -158, -274, -277, -290, -322, -487, -528, -545, -546, -694, -816, -825, -847, -941, -963, -974};
int out31 = 861;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in310);
System.out.println("Output expected: " + out31 + " Output recieved: " + tmpVal );
result = tmpVal == out31;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in320 = {963, 945, 944, -577, 843, 779, 759, 725, 586, 480, 479, 472, 422, 391, 312, 165, 81, 60, 36, -157, -232, -352, 872, -602, -812};
int out32 = 263;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in320);
System.out.println("Output expected: " + out32 + " Output recieved: " + tmpVal );
result = tmpVal == out32;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in330 = {647, 591, 554, 434, -269, -456, -75, -102, -137, 206, -350, 127, -546, -653, -742, -796, -883};
int out33 = 118;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in330);
System.out.println("Output expected: " + out33 + " Output recieved: " + tmpVal );
result = tmpVal == out33;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in340 = {992, 969, 930, 894, 836, 835, -831, 797, 795, 832, 693, 649, 449, 98, 28, -77, -141, -142, -393, -510, -574, -663, -726, 792, -956};
int out34 = 268;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in340);
System.out.println("Output expected: " + out34 + " Output recieved: " + tmpVal );
result = tmpVal == out34;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in350 = {928, 927, 655, -87, 631, 473, 411, 193, 116, -14, -179, -165, 642, -303, -919, -931};
int out35 = 104;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in350);
System.out.println("Output expected: " + out35 + " Output recieved: " + tmpVal );
result = tmpVal == out35;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in360 = {954, 752, 595, 570, 264, 191, 0, -57, -159, -298, -511, -730, -762, -764, -799, -857, -942};
int out36 = 136;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in360);
System.out.println("Output expected: " + out36 + " Output recieved: " + tmpVal );
result = tmpVal == out36;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in370 = {937, -893, -888, -868, -865, -838, -801, -742, -690, -595, -478, -444, -422, -415, -331, -319, -289, -283, -263, -222, -209, -181, -165, -134, -116, -73, 3, 18, 19, 133, 170, 183, 207, 301, 334, 387, 437, 448, 482, 523, 642, 696, 707, 722, 753, 788, 791, 792, 806, 884};
int out37 = 49;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in370);
System.out.println("Output expected: " + out37 + " Output recieved: " + tmpVal );
result = tmpVal == out37;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in380 = {-909, -883, -855, -851, -843, -801, -751, -690, -674, -647, -602, -560, -481, -419, -399, -360, -351, -350, -344, -341, -258, -221, -216, -176, -103, -60, 49, 124, 154, 155, 161, 169, 212, 227, 313, 370, 437, 523, 527, 538, 566, 628, 760, 782, 797, 817, 823, 849, 941, -927};
int out38 = 49;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in380);
System.out.println("Output expected: " + out38 + " Output recieved: " + tmpVal );
result = tmpVal == out38;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in390 = {1000, -909, -887, -885, -728, -659, -635, -471, -454, -452, -428, -421, -399, -367, -362, -353, -315, -284, -243, -228, -224, -129, -123, -116, -27, -15, 13, 82, 161, 198, 286, 306, 309, 328, 340, 384, 403, 440, 471, 473, 576, 602, 605, 688, 715, 772, 855, 871, 947, -1000};
int out39 = 97;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in390);
System.out.println("Output expected: " + out39 + " Output recieved: " + tmpVal );
result = tmpVal == out39;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in400 = {139, 892, 639, -196, 551, 730, -751, 14, -965, -381, -634, -838, 492, 207, 192, -790, 952, -155, 664, 722, -815, -224, 196, 157, -51, 963, -932, -181, -302, -973, -282, -770, -60, -765, -395, -972, 926, -860, -688, 960, 40, 514, 406, 248, -654, -833, -341, -892, -776, 986};
int out40 = 692;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in400);
System.out.println("Output expected: " + out40 + " Output recieved: " + tmpVal );
result = tmpVal == out40;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in410 = {-830, -749, -35, 659, 592, -908, 511, 715, 837, 401, 862, -96, 180, -356, 820, -348, -630, -65, -603, 475, -363, 268, -519, 897, 430, 641, 719, 347, -756, -250, -721};
int out41 = 239;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in410);
System.out.println("Output expected: " + out41 + " Output recieved: " + tmpVal );
result = tmpVal == out41;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in420 = {806, 997, -605, -277, 652, 281, 661, 204, 133, -826, 872, -323, 92, -17, -629, 930, -842, 327, -265, 884, 214, -160, -558, 860, -159};
int out42 = 168;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in420);
System.out.println("Output expected: " + out42 + " Output recieved: " + tmpVal );
result = tmpVal == out42;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in430 = {-313, 768, -288, 691, 590, 144, -49, -373, 980, 16, 390, 289};
int out43 = 32;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in430);
System.out.println("Output expected: " + out43 + " Output recieved: " + tmpVal );
result = tmpVal == out43;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in440 = {-39, 132, 178, 323, -642, -922, -250, -316, 739, 681, -861, 186, 240, 489, 165, -842, 57, 500, 918, -867, 936, 828, 950, -352, 561, -390, 148, 955, -204, -374, -636, -118, 652, -820, -538, -682, 793};
int out44 = 329;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in440);
System.out.println("Output expected: " + out44 + " Output recieved: " + tmpVal );
result = tmpVal == out44;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in450 = {-489, 129, 419, -116, 494, 982, 66, -226, 292, -172, 698, 765, 381, 386, -587, 32, -315, -344, 708, 927, -965, -156, -595, 238, 537, -416, 836, 215, 72, -543, 719, -924, -244, -18, -472, 220, -649, 738, -443, 502, 790, 867, -523, 731, -471, 213, 112, -300, -292, -94};
int out45 = 653;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in450);
System.out.println("Output expected: " + out45 + " Output recieved: " + tmpVal );
result = tmpVal == out45;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in460 = {311, -782};
int out46 = 1;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in460);
System.out.println("Output expected: " + out46 + " Output recieved: " + tmpVal );
result = tmpVal == out46;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in470 = {-654, 47, -461, -594, 473, 113, 739, 557, 850, -550, -852, -227, -523, 791, -721, 493, 333, -607, -106, 278, -679, 918, -601, 652, 208, -888, 391, 579, -482, -216, 590, 818, 402, 209, -204, -217, 408, 351, -182, 620, -944, -969, 539, -300, 190, 274, -209, -54, -533, -614};
int out47 = 631;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in470);
System.out.println("Output expected: " + out47 + " Output recieved: " + tmpVal );
result = tmpVal == out47;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in480 = {872, 877, 825, -797, 821, -791, 180, -251, 156, -944, -356, -430, -992, 201, -619, -257, 943, 250, -990, -334, -183, -729, 896, 111, -223, 892, -80, -269, -807, 502, 494, -914, 260, -513, 81, -457, -60, 940, -870, 330, -925, -21, 620, 533, 534};
int out48 = 479;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in480);
System.out.println("Output expected: " + out48 + " Output recieved: " + tmpVal );
result = tmpVal == out48;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in490 = {-687, 448, -104, 825, -143, -397, 756, 307, 988, 546, 781, 957, -721, -589, 898, 361, -891, -871, -202, -256, -543, -3, -170, 532};
int out49 = 153;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in490);
System.out.println("Output expected: " + out49 + " Output recieved: " + tmpVal );
result = tmpVal == out49;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in500 = {-880, -401, -883, -170, 227, -759, 818, 542, 255, 1, -52, -780, -365, 188, -885, -337, 651, 229, 552, -728, 623, 621};
int out50 = 85;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in500);
System.out.println("Output expected: " + out50 + " Output recieved: " + tmpVal );
result = tmpVal == out50;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in510 = {-627, 618, 629, 853, -752, -184, -948, 430, 435, -228, 643, -882, -202, -863, 373, 504, -816, -675, -906, -352, 131, -99, 783, -918, 896, -370, 877, -639, -572, 803, 271, 417, 422, 723, -212, -876, -664, 179, 912, -700, -41, 197, -735, -424, 358, 132};
int out51 = 512;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in510);
System.out.println("Output expected: " + out51 + " Output recieved: " + tmpVal );
result = tmpVal == out51;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in520 = {-91, 372, 107, -330, 913, 465, -338, 316, 670, 403, -555, -227, 759, -499, 766, -665, 689};
int out52 = 68;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in520);
System.out.println("Output expected: " + out52 + " Output recieved: " + tmpVal );
result = tmpVal == out52;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in530 = {-993, 114, -323, -665, -672, -577, -133, -996, 194, -299, -431, 637, -253, -832, 973, 306, 647, 40, -999, -986, 606, -329, -987, -269, 419, 545, -803, -228, 720, -784, -155, -961, 693, -474, -432, -52, -597, -78, -318, 275};
int out53 = 349;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in530);
System.out.println("Output expected: " + out53 + " Output recieved: " + tmpVal );
result = tmpVal == out53;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in540 = {-52, 646, 299, -605, -2, 750, 885, -963, -615, -1000, -976, 551, 653, 968, 363, -167, -258, 27, 924, 289, 135, 462, 523, -524, 605, -197, 303, 39, -920, -552, -687, -4, 935, -955, -134, 201, 948, -957, 499, -689, -408};
int out54 = 446;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in540);
System.out.println("Output expected: " + out54 + " Output recieved: " + tmpVal );
result = tmpVal == out54;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in550 = {987, 125, 831, 117, -167, -67, 67, -98, -438, 262, 773, 507, -909, 554, -923, -830, -252, -144, 30, -284, 668, 489, -444, -622, 253, 921, 334, 687, -775, -251, -590, -138, -145, 890, -660, -95, 857, -270, 197, 25, 612, -986, 606, 563, -169, 319, 878, -73, -669, 201};
int out55 = 621;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in550);
System.out.println("Output expected: " + out55 + " Output recieved: " + tmpVal );
result = tmpVal == out55;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in560 = {-505, 865, 587, 86, -431, -120, 678, -387, 425, 898, 1000, -191, 937, -508, -261, 126, -736, -837, 239, 980, -187, 288, -426, 361, 866, 713, -755, -162, 374, 910};
int out56 = 207;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in560);
System.out.println("Output expected: " + out56 + " Output recieved: " + tmpVal );
result = tmpVal == out56;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in570 = {608, 753, -947, -100, -713, 531, -190, 224, 85, -361, -230, 669, -963, 923, -389, -740, 301, -189, -135, 368, 612, 433, -819, -480, 187, 561, 549, -31, -112, 575, -984, -951, -812, -447, 484, -927, -538, -33, 703, 23};
int out57 = 415;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in570);
System.out.println("Output expected: " + out57 + " Output recieved: " + tmpVal );
result = tmpVal == out57;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in580 = {693, -461, -675, 705, 39, 608, 820, -379, 440, 628, -245, -771, 519, 195, -507, -391, 173, 501, -856, 779, 186};
int out58 = 115;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in580);
System.out.println("Output expected: " + out58 + " Output recieved: " + tmpVal );
result = tmpVal == out58;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in590 = {12, -221, -143, -671, -177, -482, 835, -495, 21, 127, 618, -526, -326, -689, -521, -431, -621, -531, 437, 507, -75, 308, 323, -355, 368, -841, -941, -641, 287, 628, 723, -349, -583, -860, -421, 731, 211, -584, -509, 242, 787, 192, -901, -738, -965, 753};
int out59 = 535;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in590);
System.out.println("Output expected: " + out59 + " Output recieved: " + tmpVal );
result = tmpVal == out59;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in600 = {-671};
int out60 = 0;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in600);
System.out.println("Output expected: " + out60 + " Output recieved: " + tmpVal );
result = tmpVal == out60;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in610 = {952, -174, -93, -380, 759, -894, 543, -734, -913, -957, 279, -228, -186, 902, 366, -643, 213, -102, 243, -941, -612, -761};
int out61 = 136;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in610);
System.out.println("Output expected: " + out61 + " Output recieved: " + tmpVal );
result = tmpVal == out61;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in620 = {237, 552, 605, -616, -540, -58, -360, -839, -672, -274, -144, 537, 830, -814, -703, 554, 463, 879, -959, -423, -293, 479, 577, -507, 115, -206, -676, -917, 987, 307, 962, -6, -951, 66, 623, 442, -435, 356, 75, 545, -620, 746};
int out62 = 391;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in620);
System.out.println("Output expected: " + out62 + " Output recieved: " + tmpVal );
result = tmpVal == out62;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in630 = {238, 942, 906};
int out63 = 1;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in630);
System.out.println("Output expected: " + out63 + " Output recieved: " + tmpVal );
result = tmpVal == out63;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in640 = {647, -692, -66, -532, 892, 300, -585, 54, -965, 297, 545};
int out64 = 27;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in640);
System.out.println("Output expected: " + out64 + " Output recieved: " + tmpVal );
result = tmpVal == out64;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in650 = {-444, 3, -358, 314, -578, -577, -453, 154, 817, 595, -594, 198, -570, 120, -506, -604, -744, -105, -887, -755, 115, -522, -819, 310, 790};
int out65 = 170;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in650);
System.out.println("Output expected: " + out65 + " Output recieved: " + tmpVal );
result = tmpVal == out65;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in660 = {-563, 968, 825, -445, -527, 258, -359, 528, 261};
int out66 = 16;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in660);
System.out.println("Output expected: " + out66 + " Output recieved: " + tmpVal );
result = tmpVal == out66;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in670 = {-203, 930, 908, 338, -794, -688, 570, -207, -475, -36, 700, -6, -29};
int out67 = 41;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in670);
System.out.println("Output expected: " + out67 + " Output recieved: " + tmpVal );
result = tmpVal == out67;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in680 = {606, 713, -449, 124, 193, 380, -53, 322, -332, -194, 771, 597, 333, 58, -59, -941, -426, -363, 39, 930, 488, -76, -324, -380, 111, -868, -719, 962, 359};
int out68 = 235;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in680);
System.out.println("Output expected: " + out68 + " Output recieved: " + tmpVal );
result = tmpVal == out68;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in690 = {-601, 713, 67, 476, -933, -499, 441, -263, -172, 195, -724, 793, 322, -813, 404, 584, 935, 771, -52, 612, 873, 606, -394, 746, -69, 46, -275, 454, -965, -544, 985, -811, -615, 738, -927, 10, -94, 678, 443, 528, -400, 689, 181, -989, -824, 823, -473, 555, 103, 342};
int out69 = 617;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in690);
System.out.println("Output expected: " + out69 + " Output recieved: " + tmpVal );
result = tmpVal == out69;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in700 = {-955, 412, 251, 315, -871, 307, 978, -648, -488, -163, -658, -281, 484, 349, 452, 434, 980, -264, -467, -296, -883, -708, -387};
int out70 = 133;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in700);
System.out.println("Output expected: " + out70 + " Output recieved: " + tmpVal );
result = tmpVal == out70;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in710 = {-567, 772, -124, -674, -213, -865, 962, 666, 11, -374, -916, -28, -944, 479, -507, 257, -818, -463};
int out71 = 87;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in710);
System.out.println("Output expected: " + out71 + " Output recieved: " + tmpVal );
result = tmpVal == out71;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in720 = {-83, 486, -369, -184, -257, 760, -365, 19, 140, 396, 901, -222, -410, -466, 599, 957, 514, -608, 226, 49, -70, -113, 671, -995, 120, 645, 866, -568, -610, -656, 317, -505, -750, -776};
int out72 = 335;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in720);
System.out.println("Output expected: " + out72 + " Output recieved: " + tmpVal );
result = tmpVal == out72;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in730 = {-795, 197, 343, 492, 943, 309, -815, -201};
int out73 = 14;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in730);
System.out.println("Output expected: " + out73 + " Output recieved: " + tmpVal );
result = tmpVal == out73;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in740 = {-898, -268, -294, 559, 456, 566, -303, 862, -301, 936, -8, 247, -871, -239, 837, -123, -823, 72, 207, 363, 860, 684, 666, -956, -117, -655, -197, 831, 757, 963, -763, 976, 416, -792, -158, 152, -617};
int out74 = 314;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in740);
System.out.println("Output expected: " + out74 + " Output recieved: " + tmpVal );
result = tmpVal == out74;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in750 = {150, -822, 368, -364, 214, 577, -550, -169, -864, 412, 830, 769, 751, 637, 818, 608, -17, -306, -615, -570, 86, 557, 27, -367, -693, 825, 408, 94, 21, 237, 148, 654, 319, -73};
int out75 = 271;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in750);
System.out.println("Output expected: " + out75 + " Output recieved: " + tmpVal );
result = tmpVal == out75;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in760 = {-524, 672, 4, 282, -470, -961, 650, -192, 188, 158, 369, -381, -277, -486, 678, 49, -34, -553, 70, -660, 719, 417, 882, 253};
int out76 = 120;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in760);
System.out.println("Output expected: " + out76 + " Output recieved: " + tmpVal );
result = tmpVal == out76;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in770 = {-123, -945, -285, 606, -394, -196, 987, 53, -832, -132, 146, -654, 653, -920, 958, -641, 926, -816, -855, -969};
int out77 = 107;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in770);
System.out.println("Output expected: " + out77 + " Output recieved: " + tmpVal );
result = tmpVal == out77;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in780 = {-865};
int out78 = 0;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in780);
System.out.println("Output expected: " + out78 + " Output recieved: " + tmpVal );
result = tmpVal == out78;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in790 = {961, 112, 113, -468, 526, -962, 893, -256, 10, -655};
int out79 = 30;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in790);
System.out.println("Output expected: " + out79 + " Output recieved: " + tmpVal );
result = tmpVal == out79;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in800 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
int out80 = 55;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in800);
System.out.println("Output expected: " + out80 + " Output recieved: " + tmpVal );
result = tmpVal == out80;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in810 = {20, 40, 30, 10};
int out81 = 4;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in810);
System.out.println("Output expected: " + out81 + " Output recieved: " + tmpVal );
result = tmpVal == out81;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in820 = {-5, -4, -2, 0, 6, 7};
int out82 = 0;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in820);
System.out.println("Output expected: " + out82 + " Output recieved: " + tmpVal );
result = tmpVal == out82;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in830 = {-1000, 0, 1000, 99, -99};
int out83 = 4;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in830);
System.out.println("Output expected: " + out83 + " Output recieved: " + tmpVal );
result = tmpVal == out83;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in840 = {25, 10, 38, 1, 89, 6};
int out84 = 8;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in840);
System.out.println("Output expected: " + out84 + " Output recieved: " + tmpVal );
result = tmpVal == out84;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in850 = {20, 10};
int out85 = 1;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in850);
System.out.println("Output expected: " + out85 + " Output recieved: " + tmpVal );
result = tmpVal == out85;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in860 = {90, 45, 70, 30, 15, 86, 34, 512, -1000, 433};
int out86 = 23;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in860);
System.out.println("Output expected: " + out86 + " Output recieved: " + tmpVal );
result = tmpVal == out86;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in870 = {-1, 1, 0, 4, 5, 6, 76, 12, 78, 89, 56, 45, 343, 232, 454, 565};
int out87 = 10;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in870);
System.out.println("Output expected: " + out87 + " Output recieved: " + tmpVal );
result = tmpVal == out87;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in880 = {3, 2, 1, 4};
int out88 = 3;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in880);
System.out.println("Output expected: " + out88 + " Output recieved: " + tmpVal );
result = tmpVal == out88;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in890 = {2, 8, 9, 11, 5, 10};
int out89 = 4;
System.out.println("testing with input: ");
test = new InsertionSortCount();
tmpVal = test.countMoves(in890);
System.out.println("Output expected: " + out89 + " Output recieved: " + tmpVal );
result = tmpVal == out89;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
    }
}
