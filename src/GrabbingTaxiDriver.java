import java.util.*;

public class GrabbingTaxiDriver {
public static void main(String [] args){
GrabbingTaxi test;
int mark = 0;
int counter = 0;
int tmpVal;
boolean result;
counter ++;
int[] in00 = {};
int[] in01 = {};
int in02 = 3;
int in03 = 2;
int in04 = 10;
int in05 = 2;
int out0 = 50;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in00, in01, in02, in03, in04, in05);
System.out.println("Output expected: " + out0 + " Output recieved: " + tmpVal );
result = tmpVal == out0;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in10 = {-2, -2};
int[] in11 = {0, -2};
int in12 = -4;
int in13 = -2;
int in14 = 15;
int in15 = 3;
int out1 = 42;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in10, in11, in12, in13, in14, in15);
System.out.println("Output expected: " + out1 + " Output recieved: " + tmpVal );
result = tmpVal == out1;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in20 = {3};
int[] in21 = {0};
int in22 = 5;
int in23 = 0;
int in24 = 10;
int in25 = 20;
int out2 = 50;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in20, in21, in22, in23, in24, in25);
System.out.println("Output expected: " + out2 + " Output recieved: " + tmpVal );
result = tmpVal == out2;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in30 = {3};
int[] in31 = {3};
int in32 = 5;
int in33 = 5;
int in34 = 10;
int in35 = 4;
int out3 = 76;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in30, in31, in32, in33, in34, in35);
System.out.println("Output expected: " + out3 + " Output recieved: " + tmpVal );
result = tmpVal == out3;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in40 = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
int[] in41 = {1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5};
int in42 = 5;
int in43 = 5;
int in44 = 7;
int in45 = 2;
int out4 = 30;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in40, in41, in42, in43, in44, in45);
System.out.println("Output expected: " + out4 + " Output recieved: " + tmpVal );
result = tmpVal == out4;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in50 = {-10000};
int[] in51 = {0};
int in52 = -10000;
int in53 = -10000;
int in54 = 1000;
int in55 = 100;
int out5 = 11000000;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in50, in51, in52, in53, in54, in55);
System.out.println("Output expected: " + out5 + " Output recieved: " + tmpVal );
result = tmpVal == out5;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in60 = {-200};
int[] in61 = {-100};
int in62 = 1000;
int in63 = 1000;
int in64 = 100;
int in65 = 10;
int out6 = 53000;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in60, in61, in62, in63, in64, in65);
System.out.println("Output expected: " + out6 + " Output recieved: " + tmpVal );
result = tmpVal == out6;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in70 = {-1};
int[] in71 = {-1};
int in72 = 2;
int in73 = 2;
int in74 = 10;
int in75 = 2;
int out7 = 32;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in70, in71, in72, in73, in74, in75);
System.out.println("Output expected: " + out7 + " Output recieved: " + tmpVal );
result = tmpVal == out7;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in80 = {926, -3297, -8283, -7076, 1493, 1448, -8563, -1423, -4740, -1120, 982, -95, 364, 8845, 6692, -2032, 8974, -4195, 8603, 1865, -6826, -5905, 1335, 348, 2458, 7783, -4607, 7450, 1658, -4791, -9808};
int[] in81 = {4965, 356, -28, -2368, -6247, 9618, -1736, -5702, 1579, -3936, -7615, -6556, -437, 9462, 2301, 5916, 9348, -8604, 4783, 6874, -7953, -7560, -1965, 4109, 4663, 525, -3383, -3970, -9123, -1269, 6110};
int in82 = -5294;
int in83 = 52;
int in84 = 657;
int in85 = 410;
int out8 = 3046527;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in80, in81, in82, in83, in84, in85);
System.out.println("Output expected: " + out8 + " Output recieved: " + tmpVal );
result = tmpVal == out8;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in90 = {1445};
int[] in91 = {-5730};
int in92 = 779;
int in93 = 8797;
int in94 = 62;
int in95 = 394;
int out9 = 593712;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in90, in91, in92, in93, in94, in95);
System.out.println("Output expected: " + out9 + " Output recieved: " + tmpVal );
result = tmpVal == out9;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in100 = {2575, 5602, 992, -367, 7068, 8866, -9012, -1711, -1387, 4724, 2520, 6984, 1471, -550, -1656, 3993, 2131, -5206, 8309};
int[] in101 = {-7394, -1060, 2650, 7030, -9770, -6342, -2955, -1273, 3931, 3323, 3655, -6154, -3618, -4653, -9942, -4963, -7580, 7959, 3924};
int in102 = -6592;
int in103 = -4033;
int in104 = 186;
int in105 = 582;
int out10 = 1976250;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in100, in101, in102, in103, in104, in105);
System.out.println("Output expected: " + out10 + " Output recieved: " + tmpVal );
result = tmpVal == out10;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in110 = {34, -12, 1, 0, 21, -43, -98, 11, 86, -31};
int[] in111 = {11, 5, -68, 69, -78, -49, -36, -2, 1, 70};
int in112 = -97;
int in113 = -39;
int in114 = 47;
int in115 = 13;
int out11 = 2476;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in110, in111, in112, in113, in114, in115);
System.out.println("Output expected: " + out11 + " Output recieved: " + tmpVal );
result = tmpVal == out11;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in120 = {82, -60, 57, 98, 30, -67, 84, -42, -100, 62};
int[] in121 = {-7, 90, 53, -56, -15, -87, 22, -3, -61, -30};
int in122 = 21;
int in123 = 15;
int in124 = 53;
int in125 = 2;
int out12 = 1908;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in120, in121, in122, in123, in124, in125);
System.out.println("Output expected: " + out12 + " Output recieved: " + tmpVal );
result = tmpVal == out12;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in130 = {0};
int[] in131 = {0};
int in132 = 10000;
int in133 = -10000;
int in134 = 1000;
int in135 = 1000;
int out13 = 20000000;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in130, in131, in132, in133, in134, in135);
System.out.println("Output expected: " + out13 + " Output recieved: " + tmpVal );
result = tmpVal == out13;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in140 = {0, 10000};
int[] in141 = {0, -10000};
int in142 = 10000;
int in143 = -10000;
int in144 = 1000;
int in145 = 500;
int out14 = 10000000;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in140, in141, in142, in143, in144, in145);
System.out.println("Output expected: " + out14 + " Output recieved: " + tmpVal );
result = tmpVal == out14;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in150 = {};
int[] in151 = {};
int in152 = 2938;
int in153 = 1938;
int in154 = 183;
int in155 = 38;
int out15 = 892308;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in150, in151, in152, in153, in154, in155);
System.out.println("Output expected: " + out15 + " Output recieved: " + tmpVal );
result = tmpVal == out15;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in160 = {8940, -7313, 40, -264, -2983, 9248, 8640, 1562, 2175, -3544, 3885, 9948, 9095, -284, -831, 5962, -107};
int[] in161 = {-9339, -3884, -2215, 1069, -852, -7135, 369, 5901, -300, -3980, 3066, -2160, -2171, -1066, 492, 641, 2160};
int in162 = 636;
int in163 = -4658;
int in164 = 300;
int in165 = 110;
int out16 = 901320;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in160, in161, in162, in163, in164, in165);
System.out.println("Output expected: " + out16 + " Output recieved: " + tmpVal );
result = tmpVal == out16;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in170 = {8286, 5245, 8376, 9967, 6828, -1673, -4821, 4110, 4861, -3921, -584, -3109, -2631, -7689, 8911, -3024, -7274, -7310};
int[] in171 = {-66, 6744, -441, 7414, -1084, 1725, -818, -3031, 2623, -2176, 1472, -6147, -4283, -2945, 9105, 8792, 978, -7151};
int in172 = 697;
int in173 = 3119;
int in174 = 161;
int in175 = 598;
int out17 = 614376;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in170, in171, in172, in173, in174, in175);
System.out.println("Output expected: " + out17 + " Output recieved: " + tmpVal );
result = tmpVal == out17;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in180 = {5378, 8800, -8387, 9316, 8375, -3877, -7267, 2861, -7182, -3504, 4850, 3961, 3864, 1894, 1801, -6140, 6279, 8083, -3887};
int[] in181 = {-4538, 748, -8705, -361, -3785, -9363, 1872, -7663, -2324, -1586, -6454, -7519, -9423, -4059, 9348, 4295, -3407, 9973, -9847};
int in182 = -9438;
int in183 = -9560;
int in184 = 277;
int in185 = 968;
int out18 = 5262446;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in180, in181, in182, in183, in184, in185);
System.out.println("Output expected: " + out18 + " Output recieved: " + tmpVal );
result = tmpVal == out18;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in190 = {-763, -6423, -5487, -5313, -5216, 1864, 4812, -4330, 5868, -2723, -5855, -5759, -1377, 8513, -4543, 4654, -186, -3348, -1995, 220, 2912, -5831, -6101, -779, -1238, -4502, 9727, 1026, -1880, 2693, 3055, 8418, -1690};
int[] in191 = {-1937, 6168, 3081, -548, 3498, 3864, 1165, -4579, 8284, -1344, -2357, -7476, -7711, -8973, -3893, 380, 782, 7629, 1771, 1828, -3867, 8165, -1527, 7910, -2270, 2606, 7208, -398, -7037, 7872, 1561, -2023, 7215};
int in192 = -5313;
int in193 = -1880;
int in194 = 928;
int in195 = 523;
int out19 = 4915061;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in190, in191, in192, in193, in194, in195);
System.out.println("Output expected: " + out19 + " Output recieved: " + tmpVal );
result = tmpVal == out19;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in200 = {9413, 5698, 7793, 3559, -2500, 5071, -8461, -162, -1715, -2298, -9810, 4506, 491, -3528, -3112, 4890, -2647};
int[] in201 = {-8719, -6339, 3609, -1210, -4685, 7052, 7868, 7735, -2333, 8698, -2969, 8622, 385, 7657, -4890, 4952, 6596};
int in202 = -6982;
int in203 = -1809;
int in204 = 627;
int in205 = 262;
int out20 = 3082006;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in200, in201, in202, in203, in204, in205);
System.out.println("Output expected: " + out20 + " Output recieved: " + tmpVal );
result = tmpVal == out20;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in210 = {-4943, 9503, 9459, 3675, 6384, -8624, -1599, 6867, 4125, 4798, -5637, 6187, -4796, -6592, 8956, -9745, -6360, -5541, 9664, -465, -1710, -9600, 742, 2980, -991, 1784};
int[] in211 = {1713, 7294, 4705, 7932, 1016, -8646, 9118, 5342, -6156, -4763, -2105, -2032, -5374, 7848, 3650, 8998, -1826, -9276, -6385, 6833, 677, 7587, -7079, 3926, -1202, -2450};
int in212 = -121;
int in213 = 1167;
int in214 = 76;
int in215 = 879;
int out21 = 97888;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in210, in211, in212, in213, in214, in215);
System.out.println("Output expected: " + out21 + " Output recieved: " + tmpVal );
result = tmpVal == out21;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in220 = {-6486, 4900, 1438, 8227, -9662};
int[] in221 = {-1248, 4185, -1907, -8088, -6633};
int in222 = 3312;
int in223 = 3977;
int in224 = 795;
int in225 = 456;
int out22 = 5794755;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in220, in221, in222, in223, in224, in225);
System.out.println("Output expected: " + out22 + " Output recieved: " + tmpVal );
result = tmpVal == out22;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in230 = {7137, 58, 7917, -3020, 1893, -3563, 7987, 8471, -1436, 1766, -2163, 8861, -9182};
int[] in231 = {-7436, -2584, 7098, -3774, 9179, 9592, 9142, -386, 4073, 4881, -2136, 6306, -1791};
int in232 = -4674;
int in233 = -8085;
int in234 = 650;
int in235 = 207;
int out23 = 3835531;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in230, in231, in232, in233, in234, in235);
System.out.println("Output expected: " + out23 + " Output recieved: " + tmpVal );
result = tmpVal == out23;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in240 = {622, 1363, 2748, -526, -4012, -4903, -529, 8017, -4286, -6394, 528, 4144, -5701, -5938, 4592, 9737, 9617, -6886, -5090, -9696, 1389, -8825, -7990, -5902, -3659, -8861, 7644, 3343, 5416, 3170, -2126, 1738, 3452, -7805, -1812, 7367, 6704, 9767, 8528, 5146};
int[] in241 = {-2966, 1966, 6567, 6925, -9751, -2915, -1383, -6402, 5663, 8326, 3289, -8881, -8311, -3764, 1629, 9593, -4406, 1166, -6024, 7569, -277, 8670, -9702, -889, 9336, -9328, 2024, -5366, -1941, 4676, -6119, -9718, 1991, -1746, -744, 5622, -1556, -8876, 7591, -5606};
int in242 = 8606;
int in243 = -9626;
int in244 = 345;
int in245 = 102;
int out24 = 2264502;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in240, in241, in242, in243, in244, in245);
System.out.println("Output expected: " + out24 + " Output recieved: " + tmpVal );
result = tmpVal == out24;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in250 = {-2669, -1878, 2484, -7219, -7052, -2694, 28, 6512, 9540, -1, 6346, 2759, -6472, -7491, 114, -3714, -7013, 2012, -1644, -7876, -3918, 5817, -3790, -5970, 1173, 7081, -517};
int[] in251 = {-2025, -840, 9522, 9062, 701, -1650, 3287, -1642, 6059, -1040, -822, -8375, -3278, -805, -3250, -3979, 2600, -9503, 6547, -6495, 7532, -9059, -1653, -3772, -5499, -399, 6894};
int in252 = 8630;
int in253 = -5028;
int in254 = 853;
int in255 = 677;
int out25 = 9431036;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in250, in251, in252, in253, in254, in255);
System.out.println("Output expected: " + out25 + " Output recieved: " + tmpVal );
result = tmpVal == out25;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in260 = {-7717, 1737, -6471, 1421, 4015, -7159, 6891, 7335, 8671, 8584, 6165, 3629, -8855, 7797, -1907, 5806, -7559, -7512, -7935, -9120, -6923, -7117, -7477, 8263, 5212, 1429, -365, 2294, 8848};
int[] in261 = {-9010, 2521, -3045, 6194, -3282, -5406, -5452, 1275, 2800, -9157, -4092, -9043, -656, -6076, 5516, 1900, -7886, 4734, -9928, -7222, 8087, -1727, 8565, 8453, 5894, 1057, 2092, -1307, 7173};
int in262 = -2605;
int in263 = 2340;
int in264 = 807;
int in265 = 100;
int out26 = 2231599;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in260, in261, in262, in263, in264, in265);
System.out.println("Output expected: " + out26 + " Output recieved: " + tmpVal );
result = tmpVal == out26;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in270 = {6221, 9832, -3574, -256, -6158, 9261, -1685, 7247, 5440, -1517, -29, 858, 573, 3279, -540, 7837, 7476, -6706, 235, -1370, 4193, -4858, 2829, -6455, 2643, -1480};
int[] in271 = {-7456, 8725, 3285, 7262, 3993, 2763, -6385, 5362, 872, 2510, -6260, -2641, -2643, -9961, -5283, -1889, 6688, 3724, -6885, -717, 5169, 898, -9430, 9422, 8008, 2621};
int in272 = -3781;
int in273 = 4748;
int in274 = 366;
int in275 = 440;
int out27 = 3121614;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in270, in271, in272, in273, in274, in275);
System.out.println("Output expected: " + out27 + " Output recieved: " + tmpVal );
result = tmpVal == out27;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in280 = {-7621, 2148, -401, 3187, 8092, 3791, 7800, 5699, 1272, 3764, 3267, 819, 1433};
int[] in281 = {-8639, 1135, -9903, 9671, 5026, 2567, 8344, -889, -4449, -6249, -5808, 6796, -8012};
int in282 = 9699;
int in283 = -1112;
int in284 = 831;
int in285 = 338;
int out28 = 6039897;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in280, in281, in282, in283, in284, in285);
System.out.println("Output expected: " + out28 + " Output recieved: " + tmpVal );
result = tmpVal == out28;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in290 = {543, 7818, 6860, -6070, 4514, -3516, -6777, 8137, -2885, -2956, -7269, -5364, 9957, 965, 9652, 5822, 7605, -3935, -1844, 61, -7083, 8633, -9967, 8593, 7707, 9729, -7994, -1011, 3516, -3309, -100, -1297, 2260, 5855, 1947, 7222, -8499, -2496, 8479, -9680, 4129, -922, -9721, -5036, -2800, -2367, -7137, 8347, 9718};
int[] in291 = {7334, 431, -8423, 1487, -7987, -7265, 4925, -2109, -7608, 6610, -1656, 8370, -6174, 5792, -5401, 1827, 5019, -4890, -3783, -9076, 3660, 1341, 9460, 7475, -1800, 9187, 1489, -6828, -3853, 9038, -6362, -5206, -5733, -1856, -1351, -2002, -8910, 1839, -5212, -1111, 7106, 6465, -5280, -2538, 3039, 631, -7958, 2083, -8391};
int in292 = -2412;
int in293 = 6448;
int in294 = 447;
int in295 = 168;
int out29 = 2324922;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in290, in291, in292, in293, in294, in295);
System.out.println("Output expected: " + out29 + " Output recieved: " + tmpVal );
result = tmpVal == out29;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in300 = {-863, 3138, 7381, 8748, 7001, -9578, 4361, -1327, -1549, 3246, -3203, -50, 682, 7930, -9882, -1066, 7051, -7691, -3490, 4662, -304, 1524, 459, -117, 7180, -4984, 5766, -7122, 6278, 132, 5657, -2068, 2073, 2701, 2637, -2624, 5483, 7, 9732, 3075, -7635, 6522, 9746, 260, -6652, 7795, -5811, 1581};
int[] in301 = {4100, 4769, -3677, 7642, 1122, 2753, -6397, 3821, 3076, -7446, -9253, 2628, 4933, -8363, -3007, -754, -1740, -6703, -6757, -2713, -2330, -7588, 1254, -4699, 4550, 8578, 6859, 5552, 7862, 2654, 9522, -6418, 6753, 7733, -4542, -7917, 4763, 533, -3388, 7577, -9621, 4254, 2734, 3441, 3715, -1107, -1151, 7777};
int in302 = 8515;
int in303 = -5929;
int in304 = 645;
int in305 = 503;
int out30 = 7878210;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in300, in301, in302, in303, in304, in305);
System.out.println("Output expected: " + out30 + " Output recieved: " + tmpVal );
result = tmpVal == out30;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in310 = {5356, -354, -1854, -7775, 3042, -7814, -6330, 7628, -9732, -3872, 8212, 6525, 4597, -7782, 7935, 131, 6121, 6073, -3926, 2049, 4770, 3979, -4116, -697, -1154, -6853, -2170, -1046, -2935, -5051, -4203, -8681, 1369, 4632, 2067, -4169, -7236, -3948, -4159, 513, 7469, -5075, 5069, -8869, -4391, 9112};
int[] in311 = {4293, 6085, 849, -4735, 8445, 9247, 1256, -8108, -1024, 264, -5166, 4693, -393, -3994, 3926, 5686, -8593, -5958, 8571, 3981, -6056, -6566, 8456, 8286, -8106, -617, -3836, 2213, -4987, 5850, 2082, -992, 4343, -4692, -3609, 7357, 2571, -242, -1496, 4899, -8598, -7848, 9355, 1092, 3859, 2365};
int in312 = 6348;
int in313 = 6924;
int in314 = 50;
int in315 = 304;
int out31 = 663600;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in310, in311, in312, in313, in314, in315);
System.out.println("Output expected: " + out31 + " Output recieved: " + tmpVal );
result = tmpVal == out31;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in320 = {4384, -3154, -9603, 7154, -5353, 6113, 3344, -428, 7940, 9202, -8706, 3189, 51, 9233, -5863, 1713, 9513, -773, -1305, 6134, 5109, 2308, 1884, 8988};
int[] in321 = {9456, -7339, -2520, -4387, -300, 3725, 6182, 1882, -1028, -1307, -1122, -7981, 5383, -3987, -3846, 4679, -5768, -9835, 804, -4599, 9348, 83, 2992, -3290};
int in322 = 3542;
int in323 = -8925;
int in324 = 272;
int in325 = 949;
int out32 = 3391024;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in320, in321, in322, in323, in324, in325);
System.out.println("Output expected: " + out32 + " Output recieved: " + tmpVal );
result = tmpVal == out32;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in330 = {3194, -1103, 9424, 467, -6067, 8767, -4107, 416, 6326, 8594, -7504, -162, -7547, 2577, 1487, -1961, -420, 3040, 4312, -8873, -2777, -6353, 3311, -4474};
int[] in331 = {1101, 5128, -9148, 3461, -2549, 445, -5772, 5575, 3786, 5792, 3913, -9585, 638, -9637, 168, 520, 6388, 3041, -1322, 1589, 5992, -8334, 7431, -9334};
int in332 = 3102;
int in333 = -2954;
int in334 = 96;
int in335 = 136;
int out33 = 581376;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in330, in331, in332, in333, in334, in335);
System.out.println("Output expected: " + out33 + " Output recieved: " + tmpVal );
result = tmpVal == out33;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in340 = {-8892, -1983, 9805, -5774, -7854, -1890, 2794, -55, 2577, -9914, 683, 7463, 5816, -6894, 6024, -1644, -7470, 6966, 1523, 3143, -278, -6622, 4473, 8978, 7167, -1703, -4, 2959, -9635, 693, 4722, 8962, -5879, -1849, -2438, 859};
int[] in341 = {1283, -1032, -1758, 6119, -5072, -7650, 3813, -2010, -3335, 5209, -5494, -9015, 1645, -4465, -6788, 9330, 91, 2897, 7726, -7268, -3955, -6049, -3468, -4296, 9507, 8942, 9731, -2263, -8293, -4806, 7367, 2866, 8317, -1375, 2439, -7869};
int in342 = -4089;
int in343 = -9684;
int in344 = 735;
int in345 = 963;
int out34 = 10123155;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in340, in341, in342, in343, in344, in345);
System.out.println("Output expected: " + out34 + " Output recieved: " + tmpVal );
result = tmpVal == out34;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in350 = {845, -2554, -2664, 1908, -4463, -9603, 3191, -2371, -2861, 4491, -1599, -2370, 8310, -5651, 9459, 4988, -5897, 392, -397, -4407, 5601, -7497, 868};
int[] in351 = {49, -6827, 1255, 6989, -9846, -6345, 4047, -3244, 6807, -7028, 1478, 8393, 5387, 8502, -5265, -3370, -5373, 3770, 2592, -6211, 8959, 2458, -4226};
int in352 = 4186;
int in353 = -3914;
int in354 = 453;
int in355 = 375;
int out35 = 3143982;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in350, in351, in352, in353, in354, in355);
System.out.println("Output expected: " + out35 + " Output recieved: " + tmpVal );
result = tmpVal == out35;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in360 = {-3823, -8716, -9837};
int[] in361 = {-7824, -3455, -2082};
int in362 = -7463;
int in363 = 9846;
int in364 = 258;
int in365 = 662;
int out36 = 4465722;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in360, in361, in362, in363, in364, in365);
System.out.println("Output expected: " + out36 + " Output recieved: " + tmpVal );
result = tmpVal == out36;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in370 = {3822, 9749, 6349, 9021, 47, -4316, -2017, 4559, 8826, -5663, -2275, -5134, -9769, 7620, -4306, -280, 3915, 687, -5809, -1924, 9455, -6730, 9856, 1889, 9940, 4671, 1447, -5906, 9837, -324};
int[] in371 = {1455, 5518, -4071, 2452, -8942, 3221, 5336, -5378, -7269, 2232, 4676, 6747, 6670, 4462, 3470, -2089, -8312, 1656, -3228, -9603, 2469, 1773, 5241, -5357, 3496, -4874, 2104, -2710, -3670, 3181};
int in372 = 6777;
int in373 = -3848;
int in374 = 27;
int in375 = 884;
int out37 = 286875;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in370, in371, in372, in373, in374, in375);
System.out.println("Output expected: " + out37 + " Output recieved: " + tmpVal );
result = tmpVal == out37;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in380 = {1862, -2112, 4911, 3321, 4178, 4459, -2887, -646, 7690, 5460, 8640, -6997, 4155, 9121, 1040, -2198, -8754, 9756, -3200, 8356, 9296, -6826, -9523, 895, 7854, 4980, -149, 42, -1277, 4651, 6236, 7178};
int[] in381 = {7668, -2694, -9470, -7304, -7819, 3913, 6041, 7166, -6807, -7639, 3886, 5870, 9384, -8027, 1088, 8311, -7335, 6032, -2078, 8923, -7780, -2581, -1494, 3205, -9680, 8012, -6330, -3741, -2796, -4648, 5897, 9720};
int in382 = -2917;
int in383 = -2742;
int in384 = 165;
int in385 = 255;
int out38 = 933735;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in380, in381, in382, in383, in384, in385);
System.out.println("Output expected: " + out38 + " Output recieved: " + tmpVal );
result = tmpVal == out38;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in390 = {1074, 8111, 3790, 2796, -3158, -9363, 4636, -6570, 2287, -574, 5890, 2363, 8764, 233, 6002, -3921, -3405, -3360, -2475, 6318};
int[] in391 = {-9215, -2640, 7896, -2961, 4189, -4519, 185, -9456, 1045, -5848, 2620, 198, 4012, -7202, 9764, -55, 6955, 8812, 7724, 3286};
int in392 = 7426;
int in393 = -3895;
int in394 = 687;
int in395 = 587;
int out39 = 7133979;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in390, in391, in392, in393, in394, in395);
System.out.println("Output expected: " + out39 + " Output recieved: " + tmpVal );
result = tmpVal == out39;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in400 = {9608, 3614, 539, -2928, -116, -3159, 7392, -8768, -4461, 447, 2178, 4463, -3091, 8082, -383, -6802, 6098, 3883, -4647, -1404, -4148};
int[] in401 = {6079, -3010, -7654, 2617, -8972, 8070, -281, -5184, -5189, 8384, 7851, -1076, -8196, 3205, -4698, -9734, 5795, -2549, -6381, 6112, 8134};
int in402 = 5631;
int in403 = 7021;
int in404 = 199;
int in405 = 717;
int out40 = 2517748;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in400, in401, in402, in403, in404, in405);
System.out.println("Output expected: " + out40 + " Output recieved: " + tmpVal );
result = tmpVal == out40;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in410 = {4358, -6141, 4133, -2384, 7974, 9307, 6456};
int[] in411 = {-3208, -9112, -6350, 9973, -4103, 5267, -7038};
int in412 = -1560;
int in413 = -7461;
int in414 = 375;
int in415 = 706;
int out41 = 3382875;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in410, in411, in412, in413, in414, in415);
System.out.println("Output expected: " + out41 + " Output recieved: " + tmpVal );
result = tmpVal == out41;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in420 = {-3041, -9971, -8704, -3990, 6680, 9605, -996, 9327, 7146, -1641, 5318, -2646, -8748, -6197, 4294, -7996, -6922, -2774, -8826, 466, -9151, 6053, -9918, 3353, 6025, 5993, -733, 7210, -2376, 8388, 5557, 9289, -4049, 3137, 4635, -2521, 4845, 2598, 8803, -6723, 6606, -3151, 8855, -9314, 8732, 5709, 1711, 8951, -3387};
int[] in421 = {4761, -8467, -1220, -9578, 8899, 876, -1598, -55, -3165, 4908, 3780, 8803, -3467, -6583, -9521, -7729, -4564, -2868, 3836, -9220, -2679, 6027, 7221, -3612, -8717, -2642, -5802, -1112, 2629, -542, 6833, -9962, 425, 2282, 7430, 9435, 1491, -9258, -4036, 553, -4422, 1832, -9542, -9532, 1520, -8436, -7409, -8240, 9105};
int in422 = -2105;
int in423 = 2736;
int in424 = 523;
int in425 = 789;
int out42 = 2531843;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in420, in421, in422, in423, in424, in425);
System.out.println("Output expected: " + out42 + " Output recieved: " + tmpVal );
result = tmpVal == out42;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in430 = {-9860, 6451, 9532, -1967, 6289, -2371, -11, 6799, 5447, 328, 2333, 8115, -6743, -1707, 6204, -2699, 1374, 8337, -5216, -6535, -8635, 6659, 8854, 5089, -9580, 4269, 8772, -1038, -2635};
int[] in431 = {1314, -7272, 8401, -7519, -3409, 4750, 3847, 3340, 4295, -3337, 7152, 4720, -7727, -9013, 6764, -812, -6057, -4207, 5861, -6890, 3655, 4947, -3775, 7091, 6993, -1784, -8994, 3355, -9845};
int in432 = 6246;
int in433 = -8342;
int in434 = 770;
int in435 = 151;
int out43 = 4471423;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in430, in431, in432, in433, in434, in435);
System.out.println("Output expected: " + out43 + " Output recieved: " + tmpVal );
result = tmpVal == out43;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in440 = {-7018, -2441, -6340, 136, -9141, -8211, 7035, -5353, -8743, -4930, 2556, 7860, 1931, -3644, -5671, -3070, -397, -6781, -7621, -4629, -5245, 2651, -7141, 3930};
int[] in441 = {2524, -5366, -3920, -7690, 9924, -290, 6379, 4465, -4634, 9410, 4114, -8233, -1116, -8335, -3816, -7746, -4919, 9431, 4511, 3008, 9909, -6855, 2012, -4046};
int in442 = -1400;
int in443 = -2660;
int in444 = 496;
int in445 = 521;
int out44 = 2013760;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in440, in441, in442, in443, in444, in445);
System.out.println("Output expected: " + out44 + " Output recieved: " + tmpVal );
result = tmpVal == out44;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in450 = {-5361, -4877, -5483};
int[] in451 = {-6526, -9876, 9682};
int in452 = -2298;
int in453 = 9000;
int in454 = 524;
int in455 = 327;
int out45 = 5920152;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in450, in451, in452, in453, in454, in455);
System.out.println("Output expected: " + out45 + " Output recieved: " + tmpVal );
result = tmpVal == out45;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in460 = {6099, -1681, 8841, 9130, 1944, 1910, -570, 9515, -3655, 8723, -5559, 5517, -2502, 503, -3337, 7071, -6115, 1679, 2435, 5610, -2523, -9400, 6826, 6943, -7772, -8032, -5067, 9274, 5785, -5400, 9715};
int[] in461 = {-1164, 3668, 1996, 5770, -4484, -848, -7735, 2106, 9160, -6669, 1486, 5454, -2186, 958, -5487, -606, -6941, -9601, -4403, -9044, -5368, 7251, 1277, 1619, -6900, 3282, 7467, -2100, -893, 5494, 1741};
int in462 = 2992;
int in463 = 8816;
int in464 = 863;
int in465 = 635;
int out46 = 7831188;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in460, in461, in462, in463, in464, in465);
System.out.println("Output expected: " + out46 + " Output recieved: " + tmpVal );
result = tmpVal == out46;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in470 = {5042, -3165, 2457, -8724, -9210, 6382, -1028, -412, -2724, 8891, 2195, -9540, 1828, -8998, -2798, 9591, -9373, 6009, 6067, 3039, -1538, 8675, -949, -9113, -8059, -7626, 3540, -4395, -9056, -451, -2055, 8601, 8063, 1506};
int[] in471 = {-8285, -6129, -907, 1461, -8890, -3671, -4475, -3870, -2571, 8384, 6176, 2012, -2637, 4940, 7020, 1215, -3945, -8944, 7005, 289, 2240, 1834, 3089, 1221, 2645, 551, 1604, -9120, -3961, -8290, 8832, -1932, 2310, -9385};
int in472 = 2867;
int in473 = -1316;
int in474 = 676;
int in475 = 115;
int out47 = 2368249;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in470, in471, in472, in473, in474, in475);
System.out.println("Output expected: " + out47 + " Output recieved: " + tmpVal );
result = tmpVal == out47;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in480 = {6973};
int[] in481 = {8580};
int in482 = -3866;
int in483 = 6781;
int in484 = 20;
int in485 = 989;
int out48 = 212940;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in480, in481, in482, in483, in484, in485);
System.out.println("Output expected: " + out48 + " Output recieved: " + tmpVal );
result = tmpVal == out48;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in490 = {-3725, -3341, 8493, 4882, -6704, 1118, 3658, 8869, -8623, -5873, 7606, 9801, 1661, 6414, -8252, -6671, -597, -569, -4166, -4816, 2807, -1003, 3311, -30, 7982, 6397, -7928, -5178, 4789, 7956, -2160, -8577, 3334};
int[] in491 = {6490, -1726, -5973, 6303, 4807, -2769, 6934, -268, -3524, -4474, 8650, -6593, -3222, 9898, 7522, 2580, 4214, -5434, -3282, -5826, 5771, -7472, 2587, -6353, 353, -3483, -6754, 6701, 753, 6257, 296, -4998, -422};
int in492 = 9131;
int in493 = -6323;
int in494 = 123;
int in495 = 78;
int out49 = 1374432;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in490, in491, in492, in493, in494, in495);
System.out.println("Output expected: " + out49 + " Output recieved: " + tmpVal );
result = tmpVal == out49;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in500 = {-9959, 9493, -7293, -2374, -5729, -6801, -4710, 436, 3669, 3524, 276, -3781};
int[] in501 = {5876, 4097, 4361, 3118, 3919, -3122, -6519, 4891, 5254, -4990, -2137, -9385};
int in502 = -9141;
int in503 = 710;
int in504 = 450;
int in505 = 589;
int out50 = 4432950;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in500, in501, in502, in503, in504, in505);
System.out.println("Output expected: " + out50 + " Output recieved: " + tmpVal );
result = tmpVal == out50;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in510 = {-5757, -6150, 5384, -1990, -125, 7350, -5881, 9497, 7848, 2086, -4011, 977, -6822, 2743, -2439, 2778, -8065, -1767, 9694, 1082, 663, -9277, -2347, 7850, 8366, -8292, -709, -8588, -1673, -1371, 1063, -6250, 2025, -9437, 6659, 5475, -7593, 6503, -2012, -5474, 8792, -5278};
int[] in511 = {-8746, -7056, 5394, 8915, -7002, -6826, -1601, -7255, 4581, -9396, 8162, 3434, -4446, -3123, -9242, -7117, 6770, 4267, -2828, 5322, -7708, -5862, -4883, 2201, 6227, -56, 4091, -6916, 7352, 3917, 9070, 4170, -541, -8416, 3207, 1090, -9721, -6746, -5041, 7619, -3111, 6615};
int in512 = -6684;
int in513 = 0;
int in514 = 980;
int in515 = 847;
int out51 = 6550320;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in510, in511, in512, in513, in514, in515);
System.out.println("Output expected: " + out51 + " Output recieved: " + tmpVal );
result = tmpVal == out51;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in520 = {-9515};
int[] in521 = {6777};
int in522 = -424;
int in523 = -7714;
int in524 = 666;
int in525 = 717;
int out52 = 5419908;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in520, in521, in522, in523, in524, in525);
System.out.println("Output expected: " + out52 + " Output recieved: " + tmpVal );
result = tmpVal == out52;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in530 = {2626, -5385, 2620, -6763, -2212, -5647, 8239, -4577, -8183, 5199, 3595, 7123, 4976, -2937, 3955, 9013, -5644};
int[] in531 = {-1568, -2489, 1973, -2655, 6447, 4022, 3638, 6821, 8841, 9379, 1750, 2534, -312, 5780, -7765, 7972, 2819};
int in532 = 5365;
int in533 = -6452;
int in534 = 820;
int in535 = 622;
int out53 = 8180586;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in530, in531, in532, in533, in534, in535);
System.out.println("Output expected: " + out53 + " Output recieved: " + tmpVal );
result = tmpVal == out53;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in540 = {9154, 3529, 7443, 7623, -278, 9895, -2813, -4712, 1706, -3415, 1382, 2951, -6384, 9062, -1070, -481, 2490, -8951, 7125, 5811, 1542, 3188, 522};
int[] in541 = {3615, -3467, 1422, 9061, 2456, -7250, -475, -588, -6872, 9426, 3193, 8922, 6214, 3926, -1614, -119, -7044, -917, 5712, 897, 6412, 9982, -4115};
int in542 = -5447;
int in543 = 6330;
int in544 = 503;
int in545 = 933;
int out54 = 5923831;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in540, in541, in542, in543, in544, in545);
System.out.println("Output expected: " + out54 + " Output recieved: " + tmpVal );
result = tmpVal == out54;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in550 = {7556, -713, -1328, 6458, -2500, 4371, 4877, 2266, -1981, 4695, 2650, -6532, 4924, -668, -2270, -3497, -2410, -3565, -1834, -1511, 4310, -5282, -3396, 3513, -9477, 2619, -3392, 5861, -1522, -95, 4025, 7448, -8196, -8500, 9411, 1724, 3546, 8289, -7471};
int[] in551 = {9765, -4733, -2811, 3190, 4475, -5592, -3788, -6150, 9372, 6179, 1037, -8030, 7746, -5609, 1454, -4365, -8569, -9235, -1145, -1882, 1427, 64, 9034, 5632, 8288, 7451, 3715, 9387, 6450, 8460, -2549, 4822, 1609, 6972, -8477, -4080, -4691, -8420, -8503};
int in552 = -8687;
int in553 = 7484;
int in554 = 57;
int in555 = 294;
int out55 = 921747;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in550, in551, in552, in553, in554, in555);
System.out.println("Output expected: " + out55 + " Output recieved: " + tmpVal );
result = tmpVal == out55;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in560 = {5750, 64, -6738, 9802, -7857, -8189, -7166, -7157, -3476, 1566, -4881};
int[] in561 = {4951, -8341, 6858, 7534, -8250, -2068, -2699, -3231, -1666, -2523, -9696};
int in562 = 4772;
int in563 = 1456;
int in564 = 580;
int in565 = 170;
int out56 = 3593070;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in560, in561, in562, in563, in564, in565);
System.out.println("Output expected: " + out56 + " Output recieved: " + tmpVal );
result = tmpVal == out56;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in570 = {-4947, -7059, 2134, 4062, 3143, 9031, -6460, 4134, -5409, 9702, 7700, 1605, -160, -4467, 2114, -3685, -3978, -6227, -7170, 3849, 183, -844, -2859, 6661, 3902, -8162, -4323, -1553, -8441, -9033, 8679, -7213};
int[] in571 = {-8579, -2889, 6264, -1227, 5892, 7891, -9541, 9958, -3707, 2595, -8672, -5458, 2974, 5434, 761, -6502, 8925, -9908, -93, 4951, -1183, 4082, -9028, -6556, 9919, 5841, -8283, 5920, -7240, -1264, 3030, -8984};
int in572 = 9542;
int in573 = 4466;
int in574 = 869;
int in575 = 55;
int out57 = 2012494;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in570, in571, in572, in573, in574, in575);
System.out.println("Output expected: " + out57 + " Output recieved: " + tmpVal );
result = tmpVal == out57;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in580 = {4973, 3355, 2620, -3647, 1699, -564, -7429, -7331, 614, -3200, 6059, 5787, -3812, -6918, -5948, 4643, -6198, 6610, 1703, 3654, -5976, 5176, -1712, -9122, 2690, -5363, 40, 6210, -2795, 3971, 8757, -1292, 4440, 8433, -5925, -2756, -9394, -2537, -7687, -6426};
int[] in581 = {-7945, -1378, 4032, -3047, -2361, 6811, -2551, 5772, 7457, 4916, -925, -5907, -8188, -7909, -325, 3588, 3582, 3648, 5532, 7496, 3768, -1635, -138, -511, 8417, 7602, 7997, -5168, 7935, -6557, 9828, 3597, -5200, 8179, 8050, 698, 703, -7660, 5693, 2522};
int in582 = 8527;
int in583 = 9116;
int in584 = 448;
int in585 = 180;
int out58 = 4337540;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in580, in581, in582, in583, in584, in585);
System.out.println("Output expected: " + out58 + " Output recieved: " + tmpVal );
result = tmpVal == out58;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in590 = {-8513, 4903, -5687, -6216, -3448, 2224, 2869, -3763, -9064, -7601, -1376, -9132, -6468, -2490, -2839, -926, -6141, -5147, 787, 5848, 9250, -1824, -9950, -8668};
int[] in591 = {1991, -7342, -3380, 3254, 4700, -2707, 1853, -3863, -2950, -1709, 7119, -7866, -8233, 3775, -7884, -4608, 6329, 4139, -395, 9358, 2619, -3207, 2438, -7531};
int in592 = 5949;
int in593 = -6998;
int in594 = 193;
int in595 = 801;
int out59 = 2498771;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in590, in591, in592, in593, in594, in595);
System.out.println("Output expected: " + out59 + " Output recieved: " + tmpVal );
result = tmpVal == out59;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in600 = {8465, -6477, -8030, 3313, -5055, 4615};
int[] in601 = {-931, -2359, 1789, -3200, 3223, -81};
int in602 = -2521;
int in603 = -4229;
int in604 = 433;
int in605 = 347;
int out60 = 2922750;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in600, in601, in602, in603, in604, in605);
System.out.println("Output expected: " + out60 + " Output recieved: " + tmpVal );
result = tmpVal == out60;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in610 = {2045, 4210, 3108, -6972, 9837, -318, 8239, -850, 4674, -3362, -9854, -9266, -5818, 9915, 8294, 190, 6591, 5806, -3123, -2775, -636, 1019, -7852, -5175, 2664, 7194, 2575, 6932, -105, -527, -3396, 8804, -7368, -7322, 7801, -3888, 2155, -6433, 2108, 3761, 4887, 2719, -2973, -9551, 3990, 4542, 7445};
int[] in611 = {-5449, -8860, -1940, -3490, -9389, -8608, 7732, 3793, 1562, -1203, -9588, 7555, -201, -2397, 4082, 5906, 5528, 2717, -1447, -5621, 854, 6217, -9704, -7162, 6686, 2560, 891, -4989, 339, -3383, 9497, -2689, -3278, 3668, -5259, 8557, 1016, -4480, 6401, 7254, 5715, -8135, -7722, -1924, 9929, 1037, -9338};
int in612 = 15;
int in613 = 4178;
int in614 = 719;
int in615 = 692;
int out61 = 3014767;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in610, in611, in612, in613, in614, in615);
System.out.println("Output expected: " + out61 + " Output recieved: " + tmpVal );
result = tmpVal == out61;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in620 = {-712, 3755, -3021, 6239, 2753, -7532, -9921, 7887, -8785, -2025, 8922, -1152, 7829, 401, -7146, 2428, 3934, -9949, -8765, 3764, 3110, -8430, 219, 5900, 3600, 6410, -8143, -8751, 3255, 4010, -7836, -8660, -3870, -2927, 9787, -7278, -5118, 1335, 1908, -8062, -1900, 5203, 9050, -2562, 6723, -326, -4624};
int[] in621 = {-2095, -4465, 3447, -6900, 6075, 7246, -5303, -2939, 7170, 249, 6659, -8669, -5889, -6933, 4240, 330, -6816, 3024, 4858, -9998, -62, -508, 6579, -6808, 5134, -8993, -9460, -8742, 5465, -2718, 4929, -4526, -1152, 2110, 2765, -3294, 9029, 8199, -9227, -3101, 9275, -59, -8404, 884, -70, 5130, 6621};
int in622 = 1340;
int in623 = -7991;
int in624 = 433;
int in625 = 479;
int out62 = 4040323;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in620, in621, in622, in623, in624, in625);
System.out.println("Output expected: " + out62 + " Output recieved: " + tmpVal );
result = tmpVal == out62;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in630 = {-8355, -8317, 135, -5383, 122, 2913, -4522, -3080, -1383, -5012, 6856, 4503, -9710, -936, 7808, 4800, -9884, -7357, -854, 5425, -8366, -1353, 1424, 2130, 9770, -4039, -4151, -1250, -9276, 8716, -2841, -1110, 4963, 6573};
int[] in631 = {-3814, 8919, -4197, 6858, -809, -1284, 2483, -9675, -8753, -8838, -369, 3877, 7178, 8603, 3680, 6952, 2310, -5387, 4400, -1391, -4610, 5505, 798, 259, -6495, -8105, -783, 1806, -4354, -6741, 2784, 6562, -3431, -6686};
int in632 = 6973;
int in633 = 6335;
int in634 = 206;
int in635 = 268;
int out63 = 2741448;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in630, in631, in632, in633, in634, in635);
System.out.println("Output expected: " + out63 + " Output recieved: " + tmpVal );
result = tmpVal == out63;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in640 = {-2418, 9174, -4022, -4844, -4099, -7877, -2592, 2767, 9223, 2926, 2134, -1277, -2859, 9556, 5758, -7969, 6066, 226, -2565, 1000, 9265, 9626, 4663, 595, -1316, 1247, 2544, -8291, -9813, -6313, 1652, -7279, 8840, 3826, -6344};
int[] in641 = {-6729, 1123, -1558, 9122, 5718, 9512, 3820, -3263, -9133, -8032, -3518, 6890, -7330, -1341, -1176, 5432, 6356, 8544, 6637, -7807, 2302, 4401, -3560, 4047, 6775, 7941, 2693, 9191, -8209, 3511, 9624, -6333, -8625, 3927, 7479};
int in642 = -1235;
int in643 = 6126;
int in644 = 794;
int in645 = 823;
int out64 = 5844634;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in640, in641, in642, in643, in644, in645);
System.out.println("Output expected: " + out64 + " Output recieved: " + tmpVal );
result = tmpVal == out64;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in650 = {-3073, 7923, -8154, 5790, -4225, -1622, -7943, -5178, 2529, 62, 9529, -9661, -2520, -517, 6492, 2588, -6706, 8171, 5878, -7515, -2640, -9605, -8102, -3940, -9144, 3650, -9011, -6583, -1935, 1660, -882, 4480, 4443, -5321, 6492, -1215};
int[] in651 = {-1175, -939, 4118, 1422, 4576, 7737, -6922, -8345, 9183, 8501, 1072, 5845, 9805, -1422, -4711, 2775, -1031, 2283, 6891, 4748, -1357, 9630, 2614, -205, 6043, 378, 9573, 3887, -9685, -1123, 4859, 1032, 4246, -9864, 6625, 4148};
int in652 = 6958;
int in653 = 103;
int in654 = 842;
int in655 = 124;
int out65 = 2748638;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in650, in651, in652, in653, in654, in655);
System.out.println("Output expected: " + out65 + " Output recieved: " + tmpVal );
result = tmpVal == out65;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in660 = {8251, 4606, 3803, 7199, 2269, 3331, 6495, -9430, 5658, 1358, -2269, -1332, 3169, -7288};
int[] in661 = {-8409, 5216, -4632, -5957, 3569, 6895, 1272, 6895, 6334, 5990, 6542, 1716, 1093, -2602};
int in662 = 9357;
int in663 = -2653;
int in664 = 515;
int in665 = 507;
int out66 = 6185150;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in660, in661, in662, in663, in664, in665);
System.out.println("Output expected: " + out66 + " Output recieved: " + tmpVal );
result = tmpVal == out66;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in670 = {};
int[] in671 = {};
int in672 = 2672;
int in673 = 7545;
int in674 = 318;
int in675 = 713;
int out67 = 3249006;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in670, in671, in672, in673, in674, in675);
System.out.println("Output expected: " + out67 + " Output recieved: " + tmpVal );
result = tmpVal == out67;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in680 = {-1442, 2675, -1638, 9114, 6201, 3099, 7291, -4725, 5499, 3573, -2769, -3053, 7712, 3248, -5192, 778, -7290, 9366, -1993, 6011};
int[] in681 = {-1730, 6177, -3784, 6590, 1598, -1429, 3169, 3451, 5323, 2425, -8726, -1740, -3718, 4107, 6477, -5505, -2599, 3669, -6987, 4642};
int in682 = -5900;
int in683 = 703;
int in684 = 135;
int in685 = 936;
int out68 = 891405;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in680, in681, in682, in683, in684, in685);
System.out.println("Output expected: " + out68 + " Output recieved: " + tmpVal );
result = tmpVal == out68;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in690 = {776, 9705, -106, -467, -2872, 2966, -1453, -2376, -8297, 2752, -5114, -4847, 7687, 3973, 9201, 7313, -1894, 3212, 4890, -4965, -9355, -2888, -827, -9739, 9496, -1159, 4461, 1044, 7754, 2393, 6415, -1266, 8899, 9491, 9712, -5453, 847, -1137, 7519, -2261};
int[] in691 = {-650, 241, -5946, -3273, -6343, 6549, 3789, -7883, 4646, -525, 449, -2830, 4687, -2446, 720, -2533, -2106, -97, -3019, 5996, 5606, -2424, 4238, 4504, -3583, 8154, 3042, -7331, -97, -1040, -9954, 2969, 8164, 9303, -7166, 4135, -5657, 7121, -9343, 1093};
int in692 = -8899;
int in693 = 2260;
int in694 = 633;
int in695 = 522;
int out69 = 6197292;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in690, in691, in692, in693, in694, in695);
System.out.println("Output expected: " + out69 + " Output recieved: " + tmpVal );
result = tmpVal == out69;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in700 = {7737, 4269, 6278, 8990, -9245, 6167, 5577, 6478, 7187, 8086, 1958, 8737, 6099, 4892};
int[] in701 = {-7311, -3466, -263, -2181, -2870, 6276, 678, -8230, 8810, 1275, 4160, -5625, -7160, -997};
int in702 = -4693;
int in703 = 9578;
int in704 = 915;
int in705 = 732;
int out70 = 13057965;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in700, in701, in702, in703, in704, in705);
System.out.println("Output expected: " + out70 + " Output recieved: " + tmpVal );
result = tmpVal == out70;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in710 = {7003, -3155, -4386, -8149, 7269, -7315, -468, -447, 816, 6195, -3032, 1283, -1208, 9350, 6990, 9229, 6092, -307, -7837, 1733, -9572, -5159, 8433, 690, -2056, -8227, 4539, -5154, 7640, -595, -4228, -9976, 1884, -2040, 1806, -7718, -4730, 3666, 3390, -4982, 9081, 2284, -2345, 6052, 3632};
int[] in711 = {718, -4114, 745, -4086, -6511, -2434, -6906, 2675, -8839, 1163, 9865, -1173, 7574, 2001, -3039, 5037, -9218, 858, 8921, 2289, 1798, 2421, 9856, -4032, 6590, -9601, 3495, -4460, 9261, -6560, -7281, -3523, -720, 972, -6034, -3933, -9326, -6863, -3084, -253, -3959, -6064, 4825, -405, 3311};
int in712 = -13;
int in713 = 1731;
int in714 = 341;
int in715 = 296;
int out71 = 594704;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in710, in711, in712, in713, in714, in715);
System.out.println("Output expected: " + out71 + " Output recieved: " + tmpVal );
result = tmpVal == out71;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in720 = {-8366, 8121, -3742, -8757, 3580, -298, 6269, -710, 9671, 3169, 6962, -7079, -5772, 6107};
int[] in721 = {5761, 5101, 4, -8269, -6278, -768, -6955, -7349, 6756, 1287, -4109, -5417, -8407, -7093};
int in722 = 1333;
int in723 = 2513;
int in724 = 443;
int in725 = 177;
int out72 = 1341662;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in720, in721, in722, in723, in724, in725);
System.out.println("Output expected: " + out72 + " Output recieved: " + tmpVal );
result = tmpVal == out72;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in730 = {3181};
int[] in731 = {2335};
int in732 = -1168;
int in733 = 4590;
int in734 = 650;
int in735 = 759;
int out73 = 3742700;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in730, in731, in732, in733, in734, in735);
System.out.println("Output expected: " + out73 + " Output recieved: " + tmpVal );
result = tmpVal == out73;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in740 = {7025, -9248, -4234, -2741, -3648, -7859, 5686, -2623, -9221, -8169, -4595, 8660, 8726, 1112, 4287, 8466, 5189, -4728, -8166, 1787, 2330, -8822, 2436, 9976, 1913, -7735, 7156, -4782, 6231, -6164, 1710, 6141, -830, 6567, 4773, -5074, 4043, 1086, 5757, 1348, -158, 1560, -3810, 4101, 2542, 1121};
int[] in741 = {1854, 702, 2678, -2957, -5734, 7825, -2136, -1860, -9690, -6586, -6723, 5162, -6686, 9823, -9388, -6761, 5759, 1272, 3205, -6943, -2190, -2384, -3510, 6753, -9097, -2363, -964, 6983, -6334, -4614, -6083, 5185, -7571, 8111, 5189, 29, 3610, 9245, -767, 2096, 208, -4980, 5735, -4223, 9711, -1826};
int in742 = 3859;
int in743 = 8069;
int in744 = 741;
int in745 = 722;
int out74 = 8677452;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in740, in741, in742, in743, in744, in745);
System.out.println("Output expected: " + out74 + " Output recieved: " + tmpVal );
result = tmpVal == out74;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in750 = {5642, 7302, -2161, 9838, 47, -4650, -6636, 1810, 9157, 5773, 6849, -719, 9517, 9864, -9976, 8558, 6828, -6212, -6982, 9965, 4785, -1179, -3786, 8816, 6154, 3303, -122, -8258, 3377, -150, 1300, -5597};
int[] in751 = {-2916, -6171, -4771, -1201, 8794, 5504, 2633, -450, 6031, -143, -5552, -4170, 843, -4028, 6858, -127, 703, 1040, 8158, -3247, 5886, 2945, -7859, 7014, -1058, -403, 1898, 7474, -822, 4122, 9433, 1856};
int in752 = 960;
int in753 = 17;
int in754 = 815;
int in755 = 5;
int out75 = 796255;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in750, in751, in752, in753, in754, in755);
System.out.println("Output expected: " + out75 + " Output recieved: " + tmpVal );
result = tmpVal == out75;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in760 = {1496, -2125, -7862, 5857, 7011, -7573, 286, -7713, 6482, -8472};
int[] in761 = {-8431, -3097, -6017, -9575, 5628, -4544, 1666, 7856, -5505, 8439};
int in762 = 6638;
int in763 = 8942;
int in764 = 640;
int in765 = 287;
int out76 = 5160516;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in760, in761, in762, in763, in764, in765);
System.out.println("Output expected: " + out76 + " Output recieved: " + tmpVal );
result = tmpVal == out76;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in770 = {4973, 7425, 7339, -9313, 2550, -5976, -7202, 4207, -6323, 552, 7999, 5855, 1519, -1670, 8046, -7790, 1208, -4094, 8040, -3804, 5610, -5559, -3955, -3412, -2380, -7458, -32, -7517, -9993, -2207, 1865, -7532, -1188, 7264, -1807, -6726, 1325, 4249, 9519, 7676, -5338, 3513, 8206, 6400, -4063, 2308};
int[] in771 = {-3379, -1383, -9871, 5758, -6078, 4055, 8621, -131, 8423, 1575, 6597, 5546, 9200, -899, 7576, 9363, -2334, -1620, 4679, -405, -4584, 8403, -2677, 491, -6708, -4377, 4326, -8345, 8317, 3856, -7423, -2063, 136, 1754, 5418, 215, 3615, 745, -148, 2466, -786, -8670, 6756, -4492, 7805, -9375};
int in772 = -2415;
int in773 = -6797;
int in774 = 690;
int in775 = 641;
int out77 = 6030773;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in770, in771, in772, in773, in774, in775);
System.out.println("Output expected: " + out77 + " Output recieved: " + tmpVal );
result = tmpVal == out77;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in780 = {};
int[] in781 = {};
int in782 = 1546;
int in783 = -591;
int in784 = 452;
int in785 = 557;
int out78 = 965924;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in780, in781, in782, in783, in784, in785);
System.out.println("Output expected: " + out78 + " Output recieved: " + tmpVal );
result = tmpVal == out78;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in790 = {2101, -3788};
int[] in791 = {-1217, 7479};
int in792 = 9470;
int in793 = 8977;
int in794 = 761;
int in795 = 550;
int out79 = 12184648;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in790, in791, in792, in793, in794, in795);
System.out.println("Output expected: " + out79 + " Output recieved: " + tmpVal );
result = tmpVal == out79;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in800 = {-5152, 5473, -6530, 6001, -6159, 7160, 7611, -6335, -2028};
int[] in801 = {8868, 4922, 3754, 7805, -5370, 2723, -1432, 6843, -9347};
int in802 = 7505;
int in803 = -1813;
int in804 = 534;
int in805 = 187;
int out80 = 4920031;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in800, in801, in802, in803, in804, in805);
System.out.println("Output expected: " + out80 + " Output recieved: " + tmpVal );
result = tmpVal == out80;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in810 = {-5469, -4207, -6814};
int[] in811 = {836, 5653, 1862};
int in812 = 7547;
int in813 = 2533;
int in814 = 914;
int in815 = 441;
int out81 = 9213120;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in810, in811, in812, in813, in814, in815);
System.out.println("Output expected: " + out81 + " Output recieved: " + tmpVal );
result = tmpVal == out81;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in820 = {-3320};
int[] in821 = {-9031};
int in822 = 7476;
int in823 = -9494;
int in824 = 568;
int in825 = 748;
int out82 = 9638960;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in820, in821, in822, in823, in824, in825);
System.out.println("Output expected: " + out82 + " Output recieved: " + tmpVal );
result = tmpVal == out82;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in830 = {6324, -5115, 3043, 8304, -8542, -6746, -8719, -6903, 2660, -2331, 4483, 5670, 240, 6988, 2648, 5663, 6734, -5730, 7799, -1262, -4601, -1044, -2550, -4984, -455, -8496, 3792, -6995, -1303, 2808};
int[] in831 = {914, 2523, -407, -7781, 2437, -5464, -4819, -8309, -6569, 2567, 8348, 9370, 6003, 9220, 623, -6436, -1881, 8618, -4362, 3363, 5304, 8194, 5873, 6860, -5265, 7197, -5493, 1912, 3381, -196};
int in832 = 7098;
int in833 = 6504;
int in834 = 190;
int in835 = 491;
int out83 = 2584380;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in830, in831, in832, in833, in834, in835);
System.out.println("Output expected: " + out83 + " Output recieved: " + tmpVal );
result = tmpVal == out83;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in840 = {6810, -4270, 8065, -2635, -9671, -3778, -1398, 7453, -915, 8328, 4373, 3987, 8752, 5345, 7903, 1133, 3481, 6316, -7649, -7499, -7279, -7524, 4956, 593, 3568, 3548, 8692, -8098, -9728, 1757, -3704};
int[] in841 = {-4392, -3127, -4708, -762, 209, -741, 1190, -2616, 1723, -5792, 4576, 527, -8853, -9052, -9201, -7631, -2487, -4755, 9456, 398, 3376, 6994, -9787, 8385, -9071, -8369, 2266, -6148, -9012, -6090, 2168};
int in842 = -1920;
int in843 = -8475;
int in844 = 878;
int in845 = 106;
int out84 = 3352086;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in840, in841, in842, in843, in844, in845);
System.out.println("Output expected: " + out84 + " Output recieved: " + tmpVal );
result = tmpVal == out84;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in850 = {7529, -179, 8778, -7852, -850, -2626, 4092, -566, -9689, 811, 4556, -4050, 5752, 8979, 3394, -321};
int[] in851 = {5790, 8526, -607, 7376, 1638, 4825, -182, 8985, -9304, -7605, 7543, 4536, 7078, 9764, 878, 1999};
int in852 = 1661;
int in853 = 5080;
int in854 = 991;
int in855 = 541;
int out85 = 5038203;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in850, in851, in852, in853, in854, in855);
System.out.println("Output expected: " + out85 + " Output recieved: " + tmpVal );
result = tmpVal == out85;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in860 = {4686, -9809, 4318, 526, 5984, -2153, -3796, 9296, -170, 3548, 5904, -3308, -7857, 9398, 8927, -414, -8906, -3669, 6476, 5315, 3701, 3957, 8709, -4818, -715, 2814, 40, 8700, 6416, -8063, 5641, -6054, -5013};
int[] in861 = {8423, -7623, -1339, -1546, -7626, -956, -1945, 5595, 7676, 8740, 4382, -5412, 8253, -2407, -9458, -4921, -1819, -3580, -238, -4109, -8147, 2363, -9802, -8679, -5795, 5081, -4892, -4400, -1724, 987, 8366, -8466, 2369};
int in862 = -377;
int in863 = -5941;
int in864 = 662;
int in865 = 4;
int out86 = 1392856;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in860, in861, in862, in863, in864, in865);
System.out.println("Output expected: " + out86 + " Output recieved: " + tmpVal );
result = tmpVal == out86;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in870 = {4359, -5938, 6727, -7943, -3202, -6641, 9365, 7972, 6366, -7778, 1901};
int[] in871 = {69, -9716, 9485, 8047, 9174, 5293, -5286, -2152, -424, -9323, 5734};
int in872 = -2167;
int in873 = 1163;
int in874 = 46;
int in875 = 367;
int out87 = 153180;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in870, in871, in872, in873, in874, in875);
System.out.println("Output expected: " + out87 + " Output recieved: " + tmpVal );
result = tmpVal == out87;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in880 = {9603, 296, 6306, -5381, 2486, 2683};
int[] in881 = {6053, 1706, -6585, -8591, -8285, 2315};
int in882 = -7050;
int in883 = 2111;
int in884 = 854;
int in885 = 556;
int out88 = 6019264;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in880, in881, in882, in883, in884, in885);
System.out.println("Output expected: " + out88 + " Output recieved: " + tmpVal );
result = tmpVal == out88;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in890 = {6004, 1371, 6833, 9221, -1518, -656, -2268, -7095, 1079, -6526, -2709, -348, 6221, -6224, 1691, 4980, -8323, 1800, -7472, 4686, 5662, 1922, 4914, 3874, -9325, -79, 2950, -9977, 9634, 8621, -1373};
int[] in891 = {-5542, -3655, -2201, 502, -481, 770, -594, -6204, 7610, -7352, -8709, 7434, 5427, 8688, -6806, -9874, 9460, -550, 2031, 1159, -295, -6264, 3544, 5009, -1599, -5819, -4598, -3244, 2909, -557, 3411};
int in892 = 2386;
int in893 = 6162;
int in894 = 638;
int in895 = 845;
int out89 = 5453624;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in890, in891, in892, in893, in894, in895);
System.out.println("Output expected: " + out89 + " Output recieved: " + tmpVal );
result = tmpVal == out89;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in900 = {-6616, -2545, -6709, 8996, 6627, -1165, -6396, -7075, 886, -4378, -4627, 8494, -8546, 7676, -2663, 7332, 8244, 7969, -524, -7314, 766, -8141, 4798, 7340, -2551, -9056, -4973, 8810, -5330, -6855, 8084, 5976, -4093, -4344, -9744, -3735, 6394, 2406};
int[] in901 = {-4878, -5048, 8843, -9035, 552, -4732, 9183, 5306, 3160, 6363, -1959, -1342, 3982, 4055, 7807, 4192, 7996, 6898, 2591, 1009, -245, 1037, -1317, 2616, -5446, 7244, -4588, -9420, 1113, 2379, 4915, -1871, -3195, -7429, -5671, -6533, 1456, 366};
int in902 = 934;
int in903 = -1055;
int in904 = 877;
int in905 = 379;
int out90 = 1257309;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in900, in901, in902, in903, in904, in905);
System.out.println("Output expected: " + out90 + " Output recieved: " + tmpVal );
result = tmpVal == out90;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in910 = {707, -6898, 9797, -3783, -5018, 4804, 4242, -8947, -4948};
int[] in911 = {2660, -7181, -6149, 9412, -7577, -4517, -884, -7055, 5261};
int in912 = 8829;
int in913 = -4823;
int in914 = 152;
int in915 = 900;
int out91 = 2075104;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in910, in911, in912, in913, in914, in915);
System.out.println("Output expected: " + out91 + " Output recieved: " + tmpVal );
result = tmpVal == out91;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in920 = {1827, 4198, 8776, 8034, -131, -8669, -5252, -7928, -1969, -3218, 9051, -4576, 8536, -6348, -1177, 6570, -2381, -9386, -8212, -4257, 7304, -1240, 4243};
int[] in921 = {-9773, 3554, 2362, -2386, 190, -1634, -5493, 7791, 6480, -7794, -4588, -7530, 4648, 1954, 2895, 7247, 3101, 2899, -6104, 5942, -357, 8586, -5681};
int in922 = -9512;
int in923 = -1836;
int in924 = 579;
int in925 = 87;
int out92 = 1178268;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in920, in921, in922, in923, in924, in925);
System.out.println("Output expected: " + out92 + " Output recieved: " + tmpVal );
result = tmpVal == out92;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in930 = {2272, -40, 4003, 1479, -2708, 2067, -4387, 1384, 8570, -3982};
int[] in931 = {-4477, -7688, -2635, 4311, 1849, -6402, 5724, 5410, 7425, -1102};
int in932 = 480;
int in933 = -6426;
int in934 = 92;
int in935 = 249;
int out93 = 635352;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in930, in931, in932, in933, in934, in935);
System.out.println("Output expected: " + out93 + " Output recieved: " + tmpVal );
result = tmpVal == out93;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in940 = {-4305, -230, 1443, -6486, 8642, -2720, -2452, 6789, 7021, -8684, -6351, -1557, 9413, 859, -6967, -9845, -7002, 4344, 6044, -9218, 3939, -5739, -6469, 1188, -9757, 5127, 3624, 6395, -4966, -1028, -7801};
int[] in941 = {-3344, 6104, 6428, -2125, 8778, -9113, 5976, -6120, 6304, -9009, 7471, 9491, -1352, -2095, -1238, -535, 7785, 6525, -4875, 457, 4550, -1511, -1324, 4071, -2322, -9467, 6665, -786, -5901, 2641, -353};
int in942 = -8306;
int in943 = -9011;
int in944 = 155;
int in945 = 201;
int out94 = 2684135;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in940, in941, in942, in943, in944, in945);
System.out.println("Output expected: " + out94 + " Output recieved: " + tmpVal );
result = tmpVal == out94;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in950 = {5753, 5575, 8404, 9202, -6205, 795, -1836, -1736, 9799, -6009, 6808, -2983, 867, 4074, -1546, 7842, 1772, 8034};
int[] in951 = {2462, 4368, -1477, -5026, 4006, 7633, -3396, -8792, -3248, -1510, -2581, 8413, -9837, 6084, -5550, 1432, -6885, -7772};
int in952 = 430;
int in953 = -4138;
int in954 = 317;
int in955 = 264;
int out95 = 1448056;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in950, in951, in952, in953, in954, in955);
System.out.println("Output expected: " + out95 + " Output recieved: " + tmpVal );
result = tmpVal == out95;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in960 = {1947, -790, 2567, 5305, 5181, 1642, 2046, 0, 849, -816, 2573, -619, -491, 3324, 2042, 0, 0, -478, -133, 1782, 1438, 0, 0, 0};
int[] in961 = {-642, 1080, 3141, 0, 526, -694, -625, -975, 4858, 927, -535, 2081, 2831, 2383, 3665, -975, -975, 2907, 4928, -670, 4269, -975, -975, -975};
int in962 = 5222;
int in963 = 8408;
int in964 = 624;
int in965 = 442;
int out96 = 7063004;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in960, in961, in962, in963, in964, in965);
System.out.println("Output expected: " + out96 + " Output recieved: " + tmpVal );
result = tmpVal == out96;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in970 = {-2635, 1705, -5781, 0, 0, 470, 0, 0};
int[] in971 = {-4048, 0, 0, 1705, 1705, -4840, 1705, 1705};
int in972 = -5471;
int in973 = -4966;
int in974 = 844;
int in975 = 501;
int out97 = 7521206;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in970, in971, in972, in973, in974, in975);
System.out.println("Output expected: " + out97 + " Output recieved: " + tmpVal );
result = tmpVal == out97;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in980 = {805, 0, 0, -2795, 1173, 22, -3466, 0, -3466, 301, 1173, 0, 1173, 0, -92, 0, 1173, -2066, -319, 0, 0, -3274, -1235, 1173, 0, 1173, -3466, -2438, 984};
int[] in981 = {1266, -1173, -1173, 1242, 0, 3962, 0, 4038, 0, 3001, 0, -1173, 0, 4038, 3946, -1173, 0, 1972, 3719, 4038, -1173, -192, -814, 0, -1173, 0, 0, 1600, 650};
int in982 = -3231;
int in983 = 4313;
int in984 = 713;
int in985 = 392;
int out98 = 4253125;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in980, in981, in982, in983, in984, in985);
System.out.println("Output expected: " + out98 + " Output recieved: " + tmpVal );
result = tmpVal == out98;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in990 = {0, 0, -983, -6083, 513, 0, 513, -3645, 0, -6083, -3398, 0, 513, 513, -2108, 0, -5932, -2844, 513, 513, 0, 513, -359, 0, 0, 513, 513, 431, 513, -4473, 0, 0};
int[] in991 = {-514, -513, 1469, 0, 0, -513, 0, 1273, 1542, 0, -262, 1542, 0, 0, -357, -513, 1023, 1332, 0, 0, 1542, 0, 1515, 1542, -513, 0, 0, 1103, 0, 1212, -513, 1542};
int in992 = -6013;
int in993 = 1111;
int in994 = 277;
int in995 = 239;
int out99 = 1966926;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in990, in991, in992, in993, in994, in995);
System.out.println("Output expected: " + out99 + " Output recieved: " + tmpVal );
result = tmpVal == out99;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1000 = {1503, 1028, 0, 0, -2093, 0, 0};
int[] in1001 = {0, 475, -1902, -1902, -262, -1902, -1902};
int in1002 = -1715;
int in1003 = -926;
int in1004 = 739;
int in1005 = 203;
int out100 = 1951699;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1000, in1001, in1002, in1003, in1004, in1005);
System.out.println("Output expected: " + out100 + " Output recieved: " + tmpVal );
result = tmpVal == out100;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1010 = {255, 270, 162, -53, 229, 125, -290, 179, -319, -57, -148, 0, 270, -58, 270, 180, 0, 0, 175, 270, 256, -319, 149, 260, 0, 0, -289, 243, 199, -177, -163, -125, -163, -319, 0, -319, -319, 0, -42};
int[] in1011 = {29, 0, -109, 468, -41, 279, -29, -91, 0, 464, -171, -270, 0, 463, 0, -90, -270, 521, 183, 0, -14, 0, -121, -10, -270, -270, 57, 52, 137, 273, 300, 373, 300, 0, -270, 0, 0, -270, -248};
int in1012 = -101;
int in1013 = 868;
int in1014 = 63;
int in1015 = 20;
int out101 = 41752;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1010, in1011, in1012, in1013, in1014, in1015);
System.out.println("Output expected: " + out101 + " Output recieved: " + tmpVal );
result = tmpVal == out101;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1020 = {-400, -401, 5, 44, -337, -88, 44, 21, 44, 18, 44, 44, 44, -270, -289, 12, 27, 44, 4, 44, 0, -262, 0, 0, 0, 0, 0, 44, -130};
int[] in1021 = {0, 0, 355, 0, 62, 312, 0, -23, 0, 234, 0, 0, 0, 130, -12, 289, 151, 0, 363, 0, -44, -15, -44, -44, 400, -44, -44, 0, 270};
int in1022 = -773;
int in1023 = 441;
int in1024 = 51;
int in1025 = 41;
int out102 = 53764;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1020, in1021, in1022, in1023, in1024, in1025);
System.out.println("Output expected: " + out102 + " Output recieved: " + tmpVal );
result = tmpVal == out102;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1030 = {0, 0};
int[] in1031 = {92, 92};
int in1032 = -322;
int in1033 = -298;
int in1034 = 62;
int in1035 = 46;
int out103 = 38440;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1030, in1031, in1032, in1033, in1034, in1035);
System.out.println("Output expected: " + out103 + " Output recieved: " + tmpVal );
result = tmpVal == out103;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1040 = {0, 6, 6, 0, 0, -261, 3, 0, -186, 0, 5, 0, 0, 0, 5, -31, 0, 0, -31, 5, 5, -31, -187, 5, 0, 5, 5, 5, 0, 5, -33, 0, -238, 0, -211, -238, 5, 0};
int[] in1041 = {-5, 0, 0, 261, 261, 0, 83, -5, -1, -5, 0, 239, 239, -5, 0, -4, -5, 239, -4, 0, 0, -4, -1, 0, -5, 0, 0, 0, -5, 0, 204, 238, 0, -5, 27, 0, 0, -5};
int in1042 = -889;
int in1043 = 736;
int in1044 = 53;
int in1045 = 51;
int out104 = 83349;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1040, in1041, in1042, in1043, in1044, in1045);
System.out.println("Output expected: " + out104 + " Output recieved: " + tmpVal );
result = tmpVal == out104;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1050 = {0, 222, 223, 63, -402, 140, 64, -119, 107, -10, 222, -269, 0, -544, -136, 0, 0, -544, -544, 0, 222, 219, 206, 222, 153, 0, -155, -447, 21, 122};
int[] in1051 = {223, 0, 0, -412, 80, -232, -411, 180, -326, 218, 0, -361, 222, 0, -427, 222, 222, 0, 0, -475, 0, -8, -44, 0, -195, 222, 167, -182, -454, 100};
int in1052 = -497;
int in1053 = -391;
int in1054 = 48;
int in1055 = 23;
int out105 = 36149;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1050, in1051, in1052, in1053, in1054, in1055);
System.out.println("Output expected: " + out105 + " Output recieved: " + tmpVal );
result = tmpVal == out105;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1060 = {-2, -4, 1, 0, -4, 0, -4, -4, -4, 0, -4, 34, 0, 0, 0, -4, 0, 34, 34, -4, -4, 0, 0, 0, -4, 0, -3, -2, 27, 0, -1, -3, 0, -3, 8, 4, 0, 26, 0, 26, 26, 19, 26, 4};
int[] in1061 = {1, 0, 3, -34, 0, -34, 0, 0, 0, -34, 0, 0, 4, -34, 4, 0, 4, 0, 0, 0, 0, 4, -34, -34, 0, 4, -1, -4, 0, -27, -14, 0, -26, 0, -18, 2, -26, 0, 3, 0, 0, -7, 0, -22};
int in1062 = 83;
int in1063 = -97;
int in1064 = 6;
int in1065 = 5;
int out106 = 925;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1060, in1061, in1062, in1063, in1064, in1065);
System.out.println("Output expected: " + out106 + " Output recieved: " + tmpVal );
result = tmpVal == out106;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1070 = {1, 0, -5, 0};
int[] in1071 = {-25, 5, 0, -27};
int in1072 = 42;
int in1073 = -51;
int in1074 = 7;
int in1075 = 5;
int out107 = 517;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1070, in1071, in1072, in1073, in1074, in1075);
System.out.println("Output expected: " + out107 + " Output recieved: " + tmpVal );
result = tmpVal == out107;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1080 = {-48, -23, 0, -1, 13, 22, 22};
int[] in1081 = {-6, 36, -22, -21, 26, 0, 0};
int in1082 = -50;
int in1083 = 33;
int in1084 = 6;
int in1085 = 3;
int out108 = 441;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1080, in1081, in1082, in1083, in1084, in1085);
System.out.println("Output expected: " + out108 + " Output recieved: " + tmpVal );
result = tmpVal == out108;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1090 = {-27, 0, 18, 7, 18, 5, -23, 9, 0, 0, -27, -4, 0, 18, 14, -22};
int[] in1091 = {0, -29, 0, -17, 0, 13, 4, -14, 18, -29, 0, -25, -29, 0, 3, -7};
int in1092 = -23;
int in1093 = -37;
int in1094 = 8;
int in1095 = 2;
int out109 = 290;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1090, in1091, in1092, in1093, in1094, in1095);
System.out.println("Output expected: " + out109 + " Output recieved: " + tmpVal );
result = tmpVal == out109;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1100 = {-16, -40, -40, 0, -17, 0, 49, -4};
int[] in1101 = {-23, 0, 0, -40, 28, -40, 0, 44};
int in1102 = 80;
int in1103 = 81;
int in1104 = 9;
int in1105 = 1;
int out110 = 551;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1100, in1101, in1102, in1103, in1104, in1105);
System.out.println("Output expected: " + out110 + " Output recieved: " + tmpVal );
result = tmpVal == out110;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1110 = {2, 0, 2, -5, 1, 1, 1, -5, 0, 0, 0, 0, 0, 1, -3, 1, 0, 1, 1, -2, 0, -4, 0, 1, 1, 1, 0, 0, -4, 1, 0, 0, 0, 0, 1, 0, 0, 0, -6, -2, 1, 0, 0, 1};
int[] in1111 = {0, -1, 0, 1, 0, 0, 0, 0, -1, -1, -1, -1, 6, 0, 3, 0, 6, 0, 0, 4, -1, 2, -1, 0, 0, 0, -1, -1, 2, 0, -1, 6, 6, -1, 0, -1, -1, -1, 0, 4, 0, -1, -1, 0};
int in1112 = -8;
int in1113 = 8;
int in1114 = 4;
int in1115 = 3;
int out111 = 53;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1110, in1111, in1112, in1113, in1114, in1115);
System.out.println("Output expected: " + out111 + " Output recieved: " + tmpVal );
result = tmpVal == out111;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1120 = {3, 0, -1, 0, 1, 1, -2, 0, 0, -2, 0, 0, -2, 6, 0, 0, -2, 3, 0, 0, 0, 7, 0, -1, 0, 3, -2, 7, 6, 0, -1, 2, 2, 0, 8, 1, 0, 1, 8, -2, 0, 7, -2, 0, 6};
int[] in1121 = {4, -2, 3, -2, 4, 4, 0, -2, -2, 0, -2, -2, 0, 3, -2, -2, 0, -1, -2, 4, -2, 3, -2, -1, -2, -1, 0, 1, 3, -2, -1, -1, -1, -1, 0, -1, 4, -1, 0, 0, 4, 1, 0, 4, 2};
int in1122 = 9;
int in1123 = 3;
int in1124 = 4;
int in1125 = 3;
int out112 = 43;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1120, in1121, in1122, in1123, in1124, in1125);
System.out.println("Output expected: " + out112 + " Output recieved: " + tmpVal );
result = tmpVal == out112;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1130 = {0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, -5, 0, 0, -5, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, -5, 1, -5, 0, 1, 0, -5};
int[] in1131 = {1, 0, -1, -1, 1, 1, 0, -1, -1, 0, -1, 1, 0, 1, 1, 0, 1, 0, 0, -1, 0, 1, -1, 1, 1, 0, -1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, -1, 0, 1, 0};
int in1132 = -4;
int in1133 = 0;
int in1134 = 3;
int in1135 = 2;
int out113 = 12;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1130, in1131, in1132, in1133, in1134, in1135);
System.out.println("Output expected: " + out113 + " Output recieved: " + tmpVal );
result = tmpVal == out113;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1140 = {0, -2, 1, -2, -1, 0, -2, -2, -1, -2, -2, 0, 5, 1, -2, -2, 0, 5, 8, -1, -1, -1, 0, 0, 5, -1, 0, 0, 0, 0, -1, 0, -1, -1, -1, 0};
int[] in1141 = {2, 0, 1, 0, 0, -7, 0, 0, -1, 0, 0, 2, -5, 1, 0, 0, 2, -5, 0, 0, 0, 0, 1, 1, -2, 0, 1, -7, 1, 1, 0, -7, 0, 0, 0, 1};
int in1142 = 8;
int in1143 = -6;
int in1144 = 5;
int in1145 = 4;
int out114 = 63;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1140, in1141, in1142, in1143, in1144, in1145);
System.out.println("Output expected: " + out114 + " Output recieved: " + tmpVal );
result = tmpVal == out114;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1150 = {-2, -2, -1, 0, 3, -3, -3, 3, 0, 2, 2, 0, -3, 3, 2, -3, 3};
int[] in1151 = {-1, -1, -6, 3, 0, 0, 0, 0, 3, 1, -1, 3, 0, 0, -1, 0, 0};
int in1152 = 0;
int in1153 = -10;
int in1154 = 3;
int in1155 = 2;
int out115 = 30;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1150, in1151, in1152, in1153, in1154, in1155);
System.out.println("Output expected: " + out115 + " Output recieved: " + tmpVal );
result = tmpVal == out115;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1160 = {82, -60, 57, 98, 30, -67, 84, -42, -100, 62};
int[] in1161 = {-7, 90, 53, -56, -15, -87, 22, -3, -61, -30};
int in1162 = 21;
int in1163 = 15;
int in1164 = 53;
int in1165 = 2;
int out116 = 1908;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1160, in1161, in1162, in1163, in1164, in1165);
System.out.println("Output expected: " + out116 + " Output recieved: " + tmpVal );
result = tmpVal == out116;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1170 = {34, -12, 1, 0, 21, -43, -98, 11, 86, -31};
int[] in1171 = {11, 5, -68, 69, -78, -49, -36, -2, 1, 70};
int in1172 = -97;
int in1173 = -39;
int in1174 = 47;
int in1175 = 13;
int out117 = 2476;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1170, in1171, in1172, in1173, in1174, in1175);
System.out.println("Output expected: " + out117 + " Output recieved: " + tmpVal );
result = tmpVal == out117;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1180 = {};
int[] in1181 = {};
int in1182 = 10000;
int in1183 = 10000;
int in1184 = 1000;
int in1185 = 1000;
int out118 = 20000000;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1180, in1181, in1182, in1183, in1184, in1185);
System.out.println("Output expected: " + out118 + " Output recieved: " + tmpVal );
result = tmpVal == out118;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1190 = {};
int[] in1191 = {};
int in1192 = -1;
int in1193 = 1;
int in1194 = 12;
int in1195 = 1;
int out119 = 24;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1190, in1191, in1192, in1193, in1194, in1195);
System.out.println("Output expected: " + out119 + " Output recieved: " + tmpVal );
result = tmpVal == out119;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1200 = {};
int[] in1201 = {};
int in1202 = 30;
int in1203 = -30;
int in1204 = 1;
int in1205 = 2;
int out120 = 60;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1200, in1201, in1202, in1203, in1204, in1205);
System.out.println("Output expected: " + out120 + " Output recieved: " + tmpVal );
result = tmpVal == out120;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1210 = {};
int[] in1211 = {};
int in1212 = 10000;
int in1213 = 10000;
int in1214 = 1000;
int in1215 = 1;
int out121 = 20000000;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1210, in1211, in1212, in1213, in1214, in1215);
System.out.println("Output expected: " + out121 + " Output recieved: " + tmpVal );
result = tmpVal == out121;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1220 = {};
int[] in1221 = {};
int in1222 = 3;
int in1223 = -3;
int in1224 = 10;
int in1225 = 100;
int out122 = 60;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1220, in1221, in1222, in1223, in1224, in1225);
System.out.println("Output expected: " + out122 + " Output recieved: " + tmpVal );
result = tmpVal == out122;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1230 = {3};
int[] in1231 = {0};
int in1232 = 5;
int in1233 = 0;
int in1234 = 10;
int in1235 = 20;
int out123 = 50;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1230, in1231, in1232, in1233, in1234, in1235);
System.out.println("Output expected: " + out123 + " Output recieved: " + tmpVal );
result = tmpVal == out123;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1240 = {};
int[] in1241 = {};
int in1242 = 10;
int in1243 = -10;
int in1244 = 1;
int in1245 = 1;
int out124 = 20;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1240, in1241, in1242, in1243, in1244, in1245);
System.out.println("Output expected: " + out124 + " Output recieved: " + tmpVal );
result = tmpVal == out124;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1250 = {44};
int[] in1251 = {44};
int in1252 = -1;
int in1253 = -1;
int in1254 = 2;
int in1255 = 7;
int out125 = 4;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1250, in1251, in1252, in1253, in1254, in1255);
System.out.println("Output expected: " + out125 + " Output recieved: " + tmpVal );
result = tmpVal == out125;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1260 = {};
int[] in1261 = {};
int in1262 = -2;
int in1263 = 2;
int in1264 = 5;
int in1265 = 5;
int out126 = 20;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1260, in1261, in1262, in1263, in1264, in1265);
System.out.println("Output expected: " + out126 + " Output recieved: " + tmpVal );
result = tmpVal == out126;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1270 = {};
int[] in1271 = {};
int in1272 = -5;
int in1273 = -5;
int in1274 = 1;
int in1275 = 2;
int out127 = 10;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1270, in1271, in1272, in1273, in1274, in1275);
System.out.println("Output expected: " + out127 + " Output recieved: " + tmpVal );
result = tmpVal == out127;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1280 = {};
int[] in1281 = {};
int in1282 = 9999;
int in1283 = 10000;
int in1284 = 999;
int in1285 = 10;
int out128 = 19979001;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1280, in1281, in1282, in1283, in1284, in1285);
System.out.println("Output expected: " + out128 + " Output recieved: " + tmpVal );
result = tmpVal == out128;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1290 = {-1};
int[] in1291 = {0};
int in1292 = 2;
int in1293 = 0;
int in1294 = 1;
int in1295 = 1;
int out129 = 2;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1290, in1291, in1292, in1293, in1294, in1295);
System.out.println("Output expected: " + out129 + " Output recieved: " + tmpVal );
result = tmpVal == out129;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1300 = {-99};
int[] in1301 = {-99};
int in1302 = 1;
int in1303 = 0;
int in1304 = 2;
int in1305 = 4;
int out130 = 2;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1300, in1301, in1302, in1303, in1304, in1305);
System.out.println("Output expected: " + out130 + " Output recieved: " + tmpVal );
result = tmpVal == out130;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1310 = {1};
int[] in1311 = {0};
int in1312 = -4;
int in1313 = -5;
int in1314 = 10;
int in1315 = 1;
int out131 = 20;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1310, in1311, in1312, in1313, in1314, in1315);
System.out.println("Output expected: " + out131 + " Output recieved: " + tmpVal );
result = tmpVal == out131;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1320 = {-100};
int[] in1321 = {-100};
int in1322 = -101;
int in1323 = 100;
int in1324 = 2;
int in1325 = 2;
int out132 = 402;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1320, in1321, in1322, in1323, in1324, in1325);
System.out.println("Output expected: " + out132 + " Output recieved: " + tmpVal );
result = tmpVal == out132;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1330 = {1};
int[] in1331 = {1};
int in1332 = 3;
int in1333 = 2;
int in1334 = 1000;
int in1335 = 1;
int out133 = 2003;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1330, in1331, in1332, in1333, in1334, in1335);
System.out.println("Output expected: " + out133 + " Output recieved: " + tmpVal );
result = tmpVal == out133;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1340 = {};
int[] in1341 = {};
int in1342 = -5;
int in1343 = -5;
int in1344 = 10;
int in1345 = 50;
int out134 = 100;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1340, in1341, in1342, in1343, in1344, in1345);
System.out.println("Output expected: " + out134 + " Output recieved: " + tmpVal );
result = tmpVal == out134;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1350 = {10, 10};
int[] in1351 = {10, -10};
int in1352 = 10;
int in1353 = -11;
int in1354 = 10;
int in1355 = 1;
int out135 = 201;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1350, in1351, in1352, in1353, in1354, in1355);
System.out.println("Output expected: " + out135 + " Output recieved: " + tmpVal );
result = tmpVal == out135;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1360 = {-1, 2};
int[] in1361 = {-1, 2};
int in1362 = 3;
int in1363 = 3;
int in1364 = 10;
int in1365 = 9;
int out136 = 58;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1360, in1361, in1362, in1363, in1364, in1365);
System.out.println("Output expected: " + out136 + " Output recieved: " + tmpVal );
result = tmpVal == out136;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1370 = {};
int[] in1371 = {};
int in1372 = 100;
int in1373 = 100;
int in1374 = 10;
int in1375 = 10;
int out137 = 2000;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1370, in1371, in1372, in1373, in1374, in1375);
System.out.println("Output expected: " + out137 + " Output recieved: " + tmpVal );
result = tmpVal == out137;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1380 = {50};
int[] in1381 = {50};
int in1382 = 50;
int in1383 = 50;
int in1384 = 1000;
int in1385 = 1000;
int out138 = 100000;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1380, in1381, in1382, in1383, in1384, in1385);
System.out.println("Output expected: " + out138 + " Output recieved: " + tmpVal );
result = tmpVal == out138;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1390 = {0, 0};
int[] in1391 = {-1, 2};
int in1392 = 0;
int in1393 = 4;
int in1394 = 2;
int in1395 = 1;
int out139 = 6;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1390, in1391, in1392, in1393, in1394, in1395);
System.out.println("Output expected: " + out139 + " Output recieved: " + tmpVal );
result = tmpVal == out139;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1400 = {2};
int[] in1401 = {-1};
int in1402 = 5;
int in1403 = -3;
int in1404 = 100;
int in1405 = 1;
int out140 = 305;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1400, in1401, in1402, in1403, in1404, in1405);
System.out.println("Output expected: " + out140 + " Output recieved: " + tmpVal );
result = tmpVal == out140;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1410 = {};
int[] in1411 = {};
int in1412 = -1;
int in1413 = 1;
int in1414 = 4;
int in1415 = 3;
int out141 = 8;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1410, in1411, in1412, in1413, in1414, in1415);
System.out.println("Output expected: " + out141 + " Output recieved: " + tmpVal );
result = tmpVal == out141;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1420 = {};
int[] in1421 = {};
int in1422 = 10000;
int in1423 = 10000;
int in1424 = 10;
int in1425 = 2;
int out142 = 200000;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1420, in1421, in1422, in1423, in1424, in1425);
System.out.println("Output expected: " + out142 + " Output recieved: " + tmpVal );
result = tmpVal == out142;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1430 = {};
int[] in1431 = {};
int in1432 = -10000;
int in1433 = -10000;
int in1434 = 1000;
int in1435 = 1;
int out143 = 20000000;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1430, in1431, in1432, in1433, in1434, in1435);
System.out.println("Output expected: " + out143 + " Output recieved: " + tmpVal );
result = tmpVal == out143;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1440 = {34, -12, 1, 0, 21, -43, -98, 11, 86, -31};
int[] in1441 = {11, 5, -68, 69, -78, -49, -36, -2, 1, 70};
int in1442 = -97;
int in1443 = -39;
int in1444 = 1;
int in1445 = 50;
int out144 = 136;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1440, in1441, in1442, in1443, in1444, in1445);
System.out.println("Output expected: " + out144 + " Output recieved: " + tmpVal );
result = tmpVal == out144;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1450 = {};
int[] in1451 = {};
int in1452 = 3;
int in1453 = -3;
int in1454 = 10;
int in1455 = 5;
int out145 = 60;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1450, in1451, in1452, in1453, in1454, in1455);
System.out.println("Output expected: " + out145 + " Output recieved: " + tmpVal );
result = tmpVal == out145;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1460 = {1};
int[] in1461 = {0};
int in1462 = 10;
int in1463 = 0;
int in1464 = 1000;
int in1465 = 1;
int out146 = 1009;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1460, in1461, in1462, in1463, in1464, in1465);
System.out.println("Output expected: " + out146 + " Output recieved: " + tmpVal );
result = tmpVal == out146;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1470 = {1};
int[] in1471 = {-1};
int in1472 = -1;
int in1473 = 1;
int in1474 = 1;
int in1475 = 1000;
int out147 = 2;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1470, in1471, in1472, in1473, in1474, in1475);
System.out.println("Output expected: " + out147 + " Output recieved: " + tmpVal );
result = tmpVal == out147;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1480 = {};
int[] in1481 = {};
int in1482 = 2;
int in1483 = -1;
int in1484 = 100;
int in1485 = 1;
int out148 = 300;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1480, in1481, in1482, in1483, in1484, in1485);
System.out.println("Output expected: " + out148 + " Output recieved: " + tmpVal );
result = tmpVal == out148;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1490 = {};
int[] in1491 = {};
int in1492 = -10;
int in1493 = 10;
int in1494 = 100;
int in1495 = 200;
int out149 = 2000;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1490, in1491, in1492, in1493, in1494, in1495);
System.out.println("Output expected: " + out149 + " Output recieved: " + tmpVal );
result = tmpVal == out149;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1500 = {-2, -2};
int[] in1501 = {0, -2};
int in1502 = 4;
int in1503 = 2;
int in1504 = 15;
int in1505 = 3;
int out150 = 54;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1500, in1501, in1502, in1503, in1504, in1505);
System.out.println("Output expected: " + out150 + " Output recieved: " + tmpVal );
result = tmpVal == out150;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in1510 = {1};
int[] in1511 = {0};
int in1512 = 7;
int in1513 = 0;
int in1514 = 10;
int in1515 = 3;
int out151 = 28;
System.out.println("testing with input: ");
test = new GrabbingTaxi();
tmpVal = test.minTime(in1510, in1511, in1512, in1513, in1514, in1515);
System.out.println("Output expected: " + out151 + " Output recieved: " + tmpVal );
result = tmpVal == out151;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
    }
}
