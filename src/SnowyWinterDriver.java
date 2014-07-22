public class SnowyWinterDriver {
public static void main(String [] args){
SnowyWinter test;
int mark = 0;
int counter = 0;
int tmpVal;
boolean result;
counter ++;
int[] in00 = {17, 85, 57};
int[] in01 = {33, 86, 84};
int out0 = 44;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in00, in01);
System.out.println("Output expected: " + out0 + " Output recieved: " + tmpVal );
result = tmpVal == out0;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in10 = {45, 100, 125, 10, 15, 35, 30, 9};
int[] in11 = {46, 200, 175, 20, 25, 45, 40, 10};
int out1 = 132;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in10, in11);
System.out.println("Output expected: " + out1 + " Output recieved: " + tmpVal );
result = tmpVal == out1;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in20 = {4387, 711, 2510, 1001, 4687, 3400, 5254, 584, 284, 1423, 3755, 929, 2154, 5719, 1326, 2368, 554};
int[] in21 = {7890, 5075, 2600, 6867, 7860, 9789, 6422, 5002, 4180, 7086, 8615, 9832, 4169, 7188, 9975, 8690, 1423};
int out2 = 9691;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in20, in21);
System.out.println("Output expected: " + out2 + " Output recieved: " + tmpVal );
result = tmpVal == out2;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in30 = {4906, 5601, 5087, 1020, 4362, 2657, 6257, 5509, 5107, 5315, 277, 6801, 2136, 2921, 5233, 5082, 497, 8250, 3956, 5720};
int[] in31 = {4930, 9130, 9366, 2322, 4687, 4848, 8856, 6302, 5496, 5438, 829, 9053, 4233, 4119, 9781, 8034, 3956, 9939, 4908, 5928};
int out3 = 9510;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in30, in31);
System.out.println("Output expected: " + out3 + " Output recieved: " + tmpVal );
result = tmpVal == out3;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in40 = {0, 4, 2};
int[] in41 = {1, 5, 3};
int out4 = 3;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in40, in41);
System.out.println("Output expected: " + out4 + " Output recieved: " + tmpVal );
result = tmpVal == out4;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in50 = {41};
int[] in51 = {8466};
int out5 = 8425;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in50, in51);
System.out.println("Output expected: " + out5 + " Output recieved: " + tmpVal );
result = tmpVal == out5;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in60 = {6334, 5723};
int[] in61 = {6498, 9168};
int out6 = 3445;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in60, in61);
System.out.println("Output expected: " + out6 + " Output recieved: " + tmpVal );
result = tmpVal == out6;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in70 = {1477, 4462, 5705};
int[] in71 = {9356, 6960, 8143};
int out7 = 7879;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in70, in71);
System.out.println("Output expected: " + out7 + " Output recieved: " + tmpVal );
result = tmpVal == out7;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in80 = {3279, 491, 1941, 4827};
int[] in81 = {6826, 9961, 2995, 5436};
int out8 = 9470;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in80, in81);
System.out.println("Output expected: " + out8 + " Output recieved: " + tmpVal );
result = tmpVal == out8;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in90 = {2388, 153, 292, 7420, 9717};
int[] in91 = {4603, 3902, 2381, 8715, 9894};
int out9 = 5922;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in90, in91);
System.out.println("Output expected: " + out9 + " Output recieved: " + tmpVal );
result = tmpVal == out9;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in100 = {1724, 1537, 1869, 5665, 7034, 3809};
int[] in101 = {5447, 4770, 9911, 6297, 9894, 8701};
int out10 = 8374;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in100, in101);
System.out.println("Output expected: " + out10 + " Output recieved: " + tmpVal );
result = tmpVal == out10;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in110 = {330, 4664, 5140, 6868, 5545, 2659, 35};
int[] in111 = {1319, 7672, 7711, 8251, 7642, 2754, 2858};
int out11 = 6410;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in110, in111);
System.out.println("Output expected: " + out11 + " Output recieved: " + tmpVal );
result = tmpVal == out11;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in120 = {8723, 778, 2315, 1842, 103, 8942, 2646, 3803};
int[] in121 = {9741, 7527, 3035, 2188, 288, 9040, 9263, 7444};
int out12 = 9148;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in120, in121);
System.out.println("Output expected: " + out12 + " Output recieved: " + tmpVal );
result = tmpVal == out12;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in130 = {5889, 4368, 1098, 3548, 2622, 4082, 1839, 4966, 3930};
int[] in131 = {6729, 5349, 5005, 4391, 9628, 9953, 8755, 7376, 6306};
int out13 = 8855;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in130, in131);
System.out.println("Output expected: " + out13 + " Output recieved: " + tmpVal );
result = tmpVal == out13;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in140 = {2436, 1322, 1536, 2082, 2927, 1112, 4639, 2702, 2306, 1670};
int[] in141 = {6943, 4624, 5537, 6117, 6540, 4833, 9656, 9930, 3976, 2384};
int out14 = 8818;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in140, in141);
System.out.println("Output expected: " + out14 + " Output recieved: " + tmpVal );
result = tmpVal == out14;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in150 = {5021, 6922, 5829, 5572, 5097, 3289, 8635, 2353, 3653, 2051, 1150};
int[] in151 = {8743, 9071, 6270, 6775, 6511, 3984, 9161, 4765, 5573, 4031, 7348};
int out15 = 8011;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in150, in151);
System.out.println("Output expected: " + out15 + " Output recieved: " + tmpVal );
result = tmpVal == out15;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in160 = {1722, 3430, 188, 1336, 2286, 382, 4944, 2206, 4219, 4944, 3029, 6412};
int[] in161 = {6940, 3965, 1104, 8006, 5456, 7751, 8909, 9758, 8587, 6422, 7504, 9166};
int out16 = 9570;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in160, in161);
System.out.println("Output expected: " + out16 + " Output recieved: " + tmpVal );
result = tmpVal == out16;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in170 = {900, 1655, 6359, 535, 1546, 4041, 3602, 290, 1019, 4019, 3197, 4482, 4734};
int[] in171 = {2588, 8761, 7409, 7622, 6483, 7593, 4348, 833, 9374, 4596, 7346, 9667, 8281};
int out17 = 9377;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in170, in171);
System.out.println("Output expected: " + out17 + " Output recieved: " + tmpVal );
result = tmpVal == out17;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in180 = {53, 6416, 3788, 467, 3728, 2481, 2421, 4309, 2811, 4308, 7450, 598, 1553, 300};
int[] in181 = {1999, 7936, 6900, 8126, 4892, 4646, 7806, 6617, 9514, 7616, 8934, 5249, 6518, 2796};
int out18 = 9461;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in180, in181);
System.out.println("Output expected: " + out18 + " Output recieved: " + tmpVal );
result = tmpVal == out18;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in190 = {1007, 2606, 2699, 483, 3093, 520, 9312, 5198, 3457, 578, 4797, 796, 7155, 470, 2291};
int[] in191 = {6224, 5844, 4988, 3195, 4342, 1587, 9503, 7448, 6618, 9795, 5280, 9588, 8007, 3620, 8537};
int out19 = 9325;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in190, in191);
System.out.println("Output expected: " + out19 + " Output recieved: " + tmpVal );
result = tmpVal == out19;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in200 = {4177, 8189, 6191, 2886, 1510, 2634, 53, 326, 4886, 8431, 140, 1416, 1879, 321, 20, 3557};
int[] in201 = {6038, 9655, 7958, 9814, 9155, 6201, 4270, 2644, 6360, 8874, 9867, 3842, 1995, 8650, 5699, 8474};
int out20 = 9847;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in200, in201);
System.out.println("Output expected: " + out20 + " Output recieved: " + tmpVal );
result = tmpVal == out20;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in210 = {4387, 711, 2510, 1001, 4687, 3400, 5254, 584, 284, 1423, 3755, 929, 2154, 5719, 1326, 2368, 554};
int[] in211 = {7890, 5075, 2600, 6867, 7860, 9789, 6422, 5002, 4180, 7086, 8615, 9832, 4169, 7188, 9975, 8690, 1423};
int out21 = 9691;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in210, in211);
System.out.println("Output expected: " + out21 + " Output recieved: " + tmpVal );
result = tmpVal == out21;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in220 = {3434, 7441, 142, 1716, 2422, 5994, 2528, 2547, 2948, 193, 414, 6104, 4486, 2454, 1700, 669, 2262, 4313};
int[] in221 = {6548, 9512, 8059, 3753, 6138, 6278, 6686, 7436, 9865, 3193, 3297, 8284, 6281, 5732, 8113, 1313, 5786, 4353};
int out22 = 9723;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in220, in221);
System.out.println("Output expected: " + out22 + " Output recieved: " + tmpVal );
result = tmpVal == out22;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in230 = {51, 807, 943, 4313, 8319, 3644, 481, 220, 2161, 448, 465, 1657, 6290, 22, 6152, 647, 3185, 4474, 2168};
int[] in231 = {1182, 912, 1832, 7754, 9557, 7980, 4144, 3194, 7129, 5535, 1172, 2043, 6437, 7252, 9508, 4745, 8313, 8020, 4017};
int out23 = 9535;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in230, in231);
System.out.println("Output expected: " + out23 + " Output recieved: " + tmpVal );
result = tmpVal == out23;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in240 = {8786, 7391, 201, 4414, 5822, 5872, 157, 1832, 7487, 7518, 2267, 1763, 3984, 3102, 7627, 4099, 524, 1543, 1022, 3060};
int[] in241 = {9905, 7957, 3625, 6475, 9314, 9332, 4370, 8068, 8295, 8177, 7772, 2668, 7191, 8480, 9211, 4802, 2625, 1924, 9970, 4180};
int out24 = 9813;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in240, in241);
System.out.println("Output expected: " + out24 + " Output recieved: " + tmpVal );
result = tmpVal == out24;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in250 = {1000, 7504, 2723, 142, 1283, 3063, 8360, 971, 4269, 235, 5758, 4667, 2549, 140, 1622, 2125, 1692, 2656, 2464, 2591, 3849};
int[] in251 = {7430, 7591, 3030, 8492, 7221, 7900, 9186, 2411, 9168, 830, 9710, 8895, 7285, 3693, 2695, 8017, 6574, 6300, 7370, 4678, 5482};
int out25 = 9570;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in250, in251);
System.out.println("Output expected: " + out25 + " Output recieved: " + tmpVal );
result = tmpVal == out25;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in260 = {1018, 1117, 2800, 1057, 4757, 313, 224, 2042, 5109, 7085, 3487, 4473, 2625, 1925, 5421, 4961, 123, 3260, 194, 1264, 6202, 324};
int[] in261 = {8462, 3150, 8086, 1926, 9010, 2167, 9576, 2756, 7164, 7882, 9563, 9575, 5625, 5629, 8518, 6902, 4594, 3737, 2522, 8260, 8116, 5030};
int out26 = 9453;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in260, in261);
System.out.println("Output expected: " + out26 + " Output recieved: " + tmpVal );
result = tmpVal == out26;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in270 = {768, 5545, 1151, 4923, 185, 849, 3828, 897, 7577, 3006, 1200, 6056, 2303, 2324, 5108, 1111, 2848, 2426, 2992, 6540, 1108, 2353, 6072};
int[] in271 = {9009, 6411, 1518, 9788, 1761, 4940, 8661, 7712, 8957, 8365, 1476, 6439, 2759, 9356, 6477, 4886, 9800, 4459, 7382, 9404, 8702, 2834, 9348};
int out27 = 9615;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in270, in271);
System.out.println("Output expected: " + out27 + " Output recieved: " + tmpVal );
result = tmpVal == out27;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in280 = {4484, 554, 1626, 3356, 3269, 3867, 2895, 111, 2716, 1584, 4127, 4227, 6559, 2294, 2052, 3584, 6654, 1455, 2530, 2483, 911, 66, 2937, 2140};
int[] in281 = {8822, 3214, 9357, 8526, 9335, 9359, 3021, 9615, 8695, 4039, 4421, 4565, 8932, 9853, 6961, 9732, 6971, 4368, 2963, 2607, 1634, 2846, 4675, 2223};
int out28 = 9787;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in280, in281);
System.out.println("Output expected: " + out28 + " Output recieved: " + tmpVal );
result = tmpVal == out28;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in290 = {3752, 173, 1457, 3221, 1626, 1780, 3848, 2277, 2192, 1637, 1993, 175, 547, 300, 4412, 4853, 1461, 874, 422, 1752, 2672, 39, 70, 610, 1017};
int[] in291 = {6511, 2739, 7824, 7869, 1931, 5204, 7397, 2699, 2733, 6532, 5556, 5703, 6962, 5880, 6640, 9854, 3141, 7609, 2675, 8442, 8294, 9313, 875, 2817, 4931};
int out29 = 9815;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in290, in291);
System.out.println("Output expected: " + out29 + " Output recieved: " + tmpVal );
result = tmpVal == out29;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in300 = {692, 3168, 38, 8683, 2589, 5144, 9313, 6738, 1257, 335, 1191, 2180, 3829, 606, 5997, 7548, 1624, 6467, 1237, 7811, 599, 213, 3990, 5601, 3390, 2670};
int[] in301 = {8110, 3829, 6486, 9089, 9496, 5988, 9352, 8650, 2042, 8759, 7605, 5262, 8501, 3773, 9290, 9554, 5559, 9539, 6127, 9172, 6077, 8683, 8213, 5822, 5758, 6426};
int out30 = 9516;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in300, in301);
System.out.println("Output expected: " + out30 + " Output recieved: " + tmpVal );
result = tmpVal == out30;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in310 = {4084, 74, 4968, 3845, 503, 1219, 2363, 2169, 7487, 2163, 911, 6704, 1815, 750, 1539, 303, 1096, 3583, 2971, 1074, 1543, 7545, 1769, 3984, 5943, 2865, 3243};
int[] in311 = {8025, 8785, 5497, 6287, 2601, 2661, 5706, 9010, 8239, 5540, 7619, 7591, 9232, 5203, 4975, 1421, 1246, 3647, 7863, 2911, 8710, 8677, 5261, 8519, 8287, 8539, 5506};
int out31 = 9158;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in310, in311);
System.out.println("Output expected: " + out31 + " Output recieved: " + tmpVal );
result = tmpVal == out31;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in320 = {7868, 8321, 1130, 5085, 8568, 7102, 3527, 1599, 4014, 28, 2088, 2636, 2407, 4681, 1341, 608, 1219, 886, 690, 2842, 1428, 748, 781, 2223, 5184, 5627, 1223, 3359};
int[] in321 = {8316, 9601, 4470, 7150, 9761, 9899, 4422, 6967, 5565, 1541, 5345, 2943, 6461, 5049, 1588, 2057, 1758, 9952, 4145, 7949, 5618, 7065, 4536, 8034, 7038, 9853, 5747, 9922};
int out32 = 9924;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in320, in321);
System.out.println("Output expected: " + out32 + " Output recieved: " + tmpVal );
result = tmpVal == out32;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in330 = {2254, 4944, 2723, 1023, 353, 2547, 8583, 3340, 7912, 1193, 1946, 424, 4427, 2401, 624, 90, 6035, 4735, 811, 6652, 835, 480, 1013, 7840, 2011, 2634, 1650, 1632, 352};
int[] in331 = {4764, 4954, 3316, 5409, 998, 9496, 9515, 7963, 8075, 6141, 5070, 4605, 6171, 6705, 9810, 9374, 6564, 9139, 5994, 8256, 3934, 1355, 1131, 8229, 4624, 4186, 9689, 5662, 892};
int out33 = 9720;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in330, in331);
System.out.println("Output expected: " + out33 + " Output recieved: " + tmpVal );
result = tmpVal == out33;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in340 = {1414, 4007, 2231, 6302, 4255, 148, 2316, 4026, 1078, 1316, 4048, 1358, 1902, 6907, 3561, 4946, 1282, 671, 5402, 3831, 257, 2617, 0, 1943, 2391, 2682, 5589, 2721, 6410, 1458};
int[] in341 = {3451, 7262, 5454, 6633, 6301, 1123, 4213, 7107, 9198, 6857, 4153, 5263, 3676, 9641, 4901, 8487, 3652, 2220, 6923, 9368, 3878, 9007, 3969, 9781, 6502, 5311, 6698, 5938, 9036, 6234};
int out34 = 9781;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in340, in341);
System.out.println("Output expected: " + out34 + " Output recieved: " + tmpVal );
result = tmpVal == out34;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in350 = {2507, 3959, 1515, 4935, 58, 3970, 5116, 4553, 3039, 209, 1954, 708, 4482, 8380, 5949, 1679, 5896, 788, 3975, 8687, 7, 2940, 1361, 28, 4776, 1885, 1071, 1332, 4294, 823, 5628};
int[] in351 = {9961, 6493, 5267, 8867, 4699, 6262, 6214, 7815, 8329, 9286, 8080, 6084, 4772, 9813, 6541, 8114, 7109, 3071, 8131, 9954, 6111, 5789, 1723, 5182, 7200, 5071, 1972, 2865, 6151, 2165, 9676};
int out35 = 9954;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in350, in351);
System.out.println("Output expected: " + out35 + " Output recieved: " + tmpVal );
result = tmpVal == out35;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in360 = {2598, 3309, 77, 115, 1528, 6677, 8405, 6816, 7516, 8664, 7679, 1340, 1661, 4720, 413, 7901, 3939, 1759, 7529, 2267, 5602, 1904, 1012, 1134, 4112, 3554, 1291, 9150, 1054, 248, 3711, 111};
int[] in361 = {8648, 4693, 4686, 2248, 6665, 7864, 9419, 8826, 7724, 9085, 9963, 5686, 6021, 6064, 9307, 9871, 7123, 2742, 8421, 4806, 9318, 4305, 3479, 6628, 6807, 4084, 2289, 9994, 5343, 4707, 7491, 5131};
int out36 = 9917;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in360, in361);
System.out.println("Output expected: " + out36 + " Output recieved: " + tmpVal );
result = tmpVal == out36;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in370 = {6438, 4720, 1052, 5267, 6421, 865, 2495, 1194, 6631, 2021, 1146, 3036, 646, 804, 4098, 4599, 797, 446, 540, 4575, 8762, 2334, 1415, 3850, 4228, 4449, 229, 939, 5146, 1655, 673, 1751, 3144};
int[] in371 = {7958, 9702, 6995, 7479, 8237, 7916, 7658, 8484, 7462, 2157, 8391, 3925, 9456, 6602, 7828, 9290, 7278, 8351, 3881, 8313, 9567, 8396, 9896, 5826, 6814, 6924, 658, 4518, 9558, 5160, 792, 2359, 6397};
int out37 = 9667;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in370, in371);
System.out.println("Output expected: " + out37 + " Output recieved: " + tmpVal );
result = tmpVal == out37;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in380 = {6944, 1186, 7661, 4513, 475, 526, 2569, 905, 8960, 521, 2548, 330, 4332, 909, 6335, 1278, 2392, 711, 1588, 2505, 3, 2623, 8662, 565, 7085, 8372, 8194, 3824, 7572, 4639, 8818, 943, 287, 5565};
int[] in381 = {8714, 9568, 8638, 5074, 1520, 5614, 3233, 9464, 9556, 4160, 7468, 1920, 8348, 2923, 9736, 8336, 7636, 8162, 9948, 9134, 3336, 6336, 9970, 5606, 9280, 9152, 8650, 9876, 8394, 6249, 9172, 2608, 1941, 8419};
int out38 = 9967;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in380, in381);
System.out.println("Output expected: " + out38 + " Output recieved: " + tmpVal );
result = tmpVal == out38;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in390 = {3805, 1447, 1615, 1063, 6073, 297, 9573, 3160, 1169, 6029, 6266, 421, 771, 907, 4182, 5494, 874, 4901, 474, 6819, 5545, 1575, 192, 7592, 754, 1012, 1671, 3427, 5967, 4406, 1908, 1758, 5204, 958, 5945};
int[] in391 = {7585, 6215, 2609, 9166, 6892, 3508, 9694, 5588, 7967, 7356, 9425, 8508, 8779, 3550, 5389, 5764, 1364, 8253, 4460, 6972, 6120, 9789, 5603, 7950, 6342, 2481, 3437, 5912, 9762, 4415, 7222, 6432, 9484, 4319, 6804};
int out39 = 9597;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in390, in391);
System.out.println("Output expected: " + out39 + " Output recieved: " + tmpVal );
result = tmpVal == out39;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in400 = {8166, 1366, 1785, 553, 3447, 6220, 2376, 6946, 2722, 2016, 1108, 2179, 8925, 4324, 5968, 1642, 2666, 1065, 2193, 6827, 5870, 696, 1026, 1407, 7185, 235, 1311, 2499, 2111, 3648, 1191, 681, 265, 7712, 5470, 970};
int[] in401 = {8699, 7691, 8530, 971, 5021, 8282, 9329, 8581, 7981, 4775, 9220, 3854, 9489, 6486, 9676, 7534, 5676, 1989, 7783, 7727, 9424, 7611, 8702, 5545, 9508, 4235, 6441, 8850, 5126, 8147, 1454, 5868, 7463, 9792, 8633, 2828};
int out40 = 9557;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in400, in401);
System.out.println("Output expected: " + out40 + " Output recieved: " + tmpVal );
result = tmpVal == out40;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in410 = {4899, 3876, 702, 1381, 6589, 2237, 2176, 167, 1307, 1057, 7926, 1670, 2258, 7213, 1284, 2742, 4472, 5841, 716, 4863, 937, 2748, 8597, 2661, 2753, 276, 9434, 2072, 1386, 7833, 3329, 8928, 2432, 1735, 1598, 1836, 1979};
int[] in411 = {8440, 5177, 5768, 4363, 8823, 8023, 6594, 2327, 2041, 8180, 9487, 2525, 5651, 9860, 5781, 8610, 7128, 8433, 3503, 4866, 1881, 9257, 8612, 8456, 6061, 805, 9488, 6365, 7586, 8360, 6046, 9490, 3838, 6766, 9809, 1890, 7328};
int out41 = 9693;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in410, in411);
System.out.println("Output expected: " + out41 + " Output recieved: " + tmpVal );
result = tmpVal == out41;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in420 = {1368, 1241, 6608, 1646, 7208, 3264, 3241, 2013, 189, 645, 9523, 4472, 7198, 9853, 4919, 2576, 2541, 3340, 899, 5538, 6193, 5009, 1560, 1494, 2785, 1537, 3391, 3209, 1576, 968, 73, 1495, 1273, 6582, 1158, 416, 159, 2923};
int[] in421 = {9350, 1792, 9252, 7431, 9535, 3497, 7647, 6839, 6099, 9811, 9850, 8631, 9889, 9990, 5695, 7779, 2930, 3486, 2523, 8483, 7492, 8250, 5833, 1840, 8528, 8804, 8789, 3548, 6977, 9277, 191, 1620, 3825, 9789, 3577, 6487, 3449, 9072};
int out42 = 9917;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in420, in421);
System.out.println("Output expected: " + out42 + " Output recieved: " + tmpVal );
result = tmpVal == out42;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in430 = {379, 207, 6477, 2604, 2073, 2610, 8759, 1055, 1160, 3715, 2741, 4954, 395, 613, 903, 134, 7030, 2581, 3517, 7005, 241, 3523, 1755, 7094, 7296, 177, 3578, 2749, 3727, 2995, 2678, 897, 1783, 3093, 1242, 7514, 167, 1190, 6748};
int[] in431 = {7006, 7965, 8502, 5369, 4195, 3721, 9018, 2889, 6682, 9931, 5450, 6813, 2862, 5459, 2599, 4680, 9198, 4386, 7240, 8670, 8881, 5247, 2104, 9619, 9916, 5677, 5056, 7575, 4006, 4079, 4674, 7751, 5564, 3607, 6172, 9927, 5055, 5973, 8922};
int out43 = 9797;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in430, in431);
System.out.println("Output expected: " + out43 + " Output recieved: " + tmpVal );
result = tmpVal == out43;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in440 = {985, 2144, 1574, 4628, 5790, 2910, 690, 9091, 6855, 638, 236, 1223, 6954, 3181, 177, 3065, 2513, 1076, 4139, 1944, 170, 3488, 4748, 3333, 2212, 7005, 6366, 4882, 1807, 2187, 6479, 6321, 1348, 4206, 2274, 186, 7664, 2028, 4860, 1776};
int[] in441 = {5651, 6445, 6515, 9914, 5874, 5468, 8146, 9815, 6947, 6050, 8551, 9487, 8160, 8394, 6096, 7063, 9261, 2577, 6877, 4611, 2445, 9973, 6149, 3864, 7281, 7430, 8896, 8520, 7640, 7231, 6705, 6538, 9446, 9646, 5757, 419, 8486, 3455, 9612, 9251};
int out44 = 9803;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in440, in441);
System.out.println("Output expected: " + out44 + " Output recieved: " + tmpVal );
result = tmpVal == out44;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in450 = {1345, 860, 2454, 2104, 5820, 6279, 4453, 5946, 8317, 1375, 4996, 2073, 634, 1643, 3231, 4747, 5676, 4800, 4198, 853, 572, 1558, 6473, 1550, 1181, 2699, 7464, 2529, 2112, 3475, 6888, 6670, 29, 3989, 3163, 1292, 6576, 2206, 7169, 3396, 1017};
int[] in451 = {2502, 2429, 9080, 4196, 8752, 7295, 6019, 7122, 9135, 1774, 9857, 9253, 6922, 8886, 8153, 8678, 9925, 6450, 4959, 6361, 5716, 3243, 8272, 4351, 4287, 8109, 8642, 7172, 9981, 4381, 8247, 8805, 2369, 9320, 5430, 9658, 7205, 6947, 8165, 6696, 3692};
int out45 = 9952;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in450, in451);
System.out.println("Output expected: " + out45 + " Output recieved: " + tmpVal );
result = tmpVal == out45;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in460 = {4787, 106, 1968, 1615, 3684, 7905, 2096, 4388, 1784, 4485, 708, 5812, 6085, 318, 1331, 3443, 3184, 4360, 6429, 268, 267, 337, 1308, 406, 7768, 5000, 542, 35, 3288, 1644, 3092, 760, 491, 7481, 5664, 752, 5083, 218, 1779, 4872, 3343, 2591};
int[] in461 = {5528, 7983, 8976, 4015, 6625, 9168, 5926, 8116, 5198, 9198, 2419, 8270, 7413, 3580, 7267, 8387, 4506, 7826, 8072, 7152, 4693, 9884, 7603, 2676, 9020, 9412, 7536, 1386, 7355, 3181, 6583, 986, 8217, 9501, 9445, 2102, 9094, 3524, 3964, 8106, 3656, 7078};
int out46 = 9849;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in460, in461);
System.out.println("Output expected: " + out46 + " Output recieved: " + tmpVal );
result = tmpVal == out46;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in470 = {4867, 1409, 966, 2078, 7039, 1528, 661, 2258, 2095, 1873, 6833, 5678, 5725, 4071, 3558, 5602, 439, 1560, 1960, 1078, 796, 79, 2075, 1490, 7740, 472, 8880, 1071, 707, 664, 3586, 2480, 8313, 1009, 2010, 1454, 742, 21, 4510, 6016, 3715, 3289, 2758};
int[] in471 = {6079, 3712, 3251, 7214, 8766, 2932, 3777, 6651, 7934, 4363, 7720, 8976, 8454, 4806, 9156, 7831, 7905, 7375, 2883, 1836, 1199, 507, 5340, 9058, 8546, 4771, 9096, 3333, 3398, 2953, 4141, 7167, 9395, 6224, 8135, 8761, 5041, 7921, 9248, 7366, 9714, 7649, 3335};
int out47 = 9693;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in470, in471);
System.out.println("Output expected: " + out47 + " Output recieved: " + tmpVal );
result = tmpVal == out47;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in480 = {1893, 2638, 1977, 4789, 8660, 3652, 2026, 5986, 81, 1419, 2243, 1060, 650, 467, 1045, 1485, 3276, 1321, 3988, 2585, 7944, 8468, 181, 3953, 4777, 133, 3485, 2088, 2934, 4789, 4960, 1000, 1806, 2669, 1457, 2997, 3596, 4843, 7372, 1026, 4722, 3489, 1598, 1196};
int[] in481 = {3169, 5303, 4197, 9103, 8681, 8753, 4031, 7042, 6251, 5813, 2715, 7229, 8863, 4769, 5004, 1594, 4324, 6540, 7679, 4708, 9269, 9219, 3587, 4978, 5006, 3261, 7194, 9031, 9778, 5992, 8964, 9104, 4565, 3134, 2668, 3545, 4217, 8838, 8563, 9262, 8799, 7604, 4225, 3690};
int out48 = 9697;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in480, in481);
System.out.println("Output expected: " + out48 + " Output recieved: " + tmpVal );
result = tmpVal == out48;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in490 = {361, 2361, 3565, 3443, 495, 5021, 1809, 3013, 3393, 5278, 1608, 2704, 1338, 144, 1336, 4602, 76, 1722, 2330, 592, 8845, 4987, 8616, 487, 1961, 4696, 1628, 1908, 4472, 1917, 292, 6734, 1053, 7075, 4118, 429, 2778, 2278, 665, 4116, 2736, 575, 736, 554, 1899};
int[] in491 = {9770, 9299, 7721, 7420, 8609, 6740, 9149, 8055, 8738, 9881, 2653, 3822, 4243, 2288, 3152, 4623, 2223, 1978, 9731, 8221, 9128, 9443, 8804, 5750, 7336, 8133, 2206, 3222, 6735, 7370, 3855, 9561, 7604, 8184, 8380, 6741, 4682, 8282, 833, 4123, 8027, 2116, 4090, 2793, 6059};
int out49 = 9805;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in490, in491);
System.out.println("Output expected: " + out49 + " Output recieved: " + tmpVal );
result = tmpVal == out49;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in500 = {3432, 2136, 4874, 1182, 6788, 38, 3351, 2972, 3070, 2188, 1487, 3053, 680, 5901, 4174, 1695, 2465, 1081, 7619, 5825, 3836, 2580, 4397, 1023, 4832, 4242, 2702, 500, 686, 4635, 1399, 1687, 3161, 9124, 1381, 6258, 3873, 720, 2192, 6038, 7811, 8243, 2422, 541, 1545, 499};
int[] in501 = {8793, 4580, 5907, 8072, 8719, 474, 8329, 6289, 3591, 5786, 3239, 4892, 7062, 7003, 8478, 6139, 3997, 3637, 9513, 9991, 5721, 4826, 8978, 1890, 6941, 7349, 8707, 5139, 8346, 5890, 8412, 2814, 8935, 9409, 9876, 7187, 6703, 2663, 2564, 6359, 8587, 9467, 6865, 3188, 3062, 9615};
int out50 = 9928;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in500, in501);
System.out.println("Output expected: " + out50 + " Output recieved: " + tmpVal );
result = tmpVal == out50;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in510 = {5021, 1200, 45, 1570, 5965, 8456, 1530, 6817, 555, 1492, 588, 3388, 2318, 5789, 132, 1775, 3567, 2077, 2257, 893, 102, 4750, 721, 8989, 335, 3256, 2352, 479, 2680, 1, 4422, 6135, 2360, 2192, 176, 1354, 1847, 6344, 1910, 4963, 59, 71, 2700, 1068, 3529, 1549, 3730};
int[] in511 = {9099, 7225, 1049, 8636, 9458, 9405, 9960, 7975, 7531, 8044, 6801, 8914, 7450, 6272, 9381, 4640, 8299, 7953, 3585, 5331, 489, 7232, 4269, 9610, 1639, 9046, 9658, 5300, 8989, 5567, 6894, 8007, 6741, 3697, 3186, 4042, 3939, 7469, 4380, 5708, 5383, 7502, 9462, 8100, 5154, 2071, 9148};
int out51 = 9959;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in510, in511);
System.out.println("Output expected: " + out51 + " Output recieved: " + tmpVal );
result = tmpVal == out51;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in520 = {843, 3048, 4063, 8771, 8469, 6747, 4397, 497, 5677, 3042, 1085, 1563, 7021, 1909, 5651, 5476, 7614, 5220, 2346, 2176, 1632, 1662, 8260, 9419, 9021, 2685, 3917, 1714, 1266, 65, 388, 5617, 2003, 3027, 3150, 8629, 6407, 2294, 8489, 6175, 1068, 641, 6839, 3891, 272, 2992, 2200, 8290};
int[] in521 = {2244, 4117, 6361, 9551, 9729, 7511, 5869, 7103, 7350, 8051, 4521, 5832, 9850, 7240, 9492, 8578, 9874, 9177, 4614, 6796, 6856, 2883, 8901, 9769, 9273, 5839, 8886, 1892, 3697, 1748, 6932, 6080, 9128, 8630, 4588, 9171, 9863, 5426, 9679, 6608, 5234, 6459, 7631, 7035, 2628, 8780, 7460, 9661};
int out52 = 9809;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in520, in521);
System.out.println("Output expected: " + out52 + " Output recieved: " + tmpVal );
result = tmpVal == out52;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in530 = {995, 1148, 6716, 6640, 4883, 2657, 384, 2648, 6839, 1497, 7281, 8057, 175, 3271, 4287, 2503, 699, 530, 205, 7540, 1621, 3760, 2934, 480, 8492, 8594, 537, 536, 1474, 4915, 5752, 3757, 2252, 726, 2758, 392, 7271, 2932, 134, 3690, 3693, 2624, 989, 1646, 928, 669, 5447, 4597, 121};
int[] in531 = {2305, 8422, 8890, 8701, 5566, 3659, 8244, 2762, 9600, 7208, 9248, 8421, 578, 6785, 7997, 4977, 2138, 2461, 2117, 8827, 4457, 4397, 7096, 611, 9566, 9160, 7746, 7670, 1553, 6370, 6759, 5432, 9063, 2401, 3034, 545, 8791, 6192, 7102, 8209, 4666, 7498, 5247, 3879, 1148, 872, 5596, 5434, 1443};
int out53 = 9479;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in530, in531);
System.out.println("Output expected: " + out53 + " Output recieved: " + tmpVal );
result = tmpVal == out53;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in540 = {1731, 2859, 3965, 815, 6703, 305, 8221, 789, 47, 808, 6089, 3741, 598, 6473, 506, 7588, 7807, 40, 3818, 26, 2503, 63, 2569, 4675, 8639, 1107, 81, 1083, 1247, 1380, 5500, 859, 3565, 832, 882, 887, 882, 1263, 1257, 776, 2520, 2926, 5132, 2673, 999, 2737, 5974, 354, 934, 2142};
int[] in541 = {8153, 4434, 9385, 1392, 9864, 950, 8683, 2665, 2466, 3929, 9813, 5427, 1604, 7195, 5158, 9858, 7888, 1446, 9364, 7974, 5087, 6410, 6840, 5393, 9984, 7650, 8187, 3388, 8685, 4755, 8126, 4275, 6422, 3872, 4427, 6646, 6478, 4923, 5045, 5821, 3854, 4771, 7249, 3335, 6333, 9310, 7590, 1071, 2077, 7281};
int out54 = 9958;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in540, in541);
System.out.println("Output expected: " + out54 + " Output recieved: " + tmpVal );
result = tmpVal == out54;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in550 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int[] in551 = {10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000};
int out55 = 10000;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in550, in551);
System.out.println("Output expected: " + out55 + " Output recieved: " + tmpVal );
result = tmpVal == out55;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in560 = {8786, 7391, 201, 4414, 5822, 5872, 157, 1832, 7487, 7518, 2267, 1763, 3984, 3102, 7627, 4099, 524, 1543, 1022, 3060};
int[] in561 = {9905, 7957, 3625, 6475, 9314, 9332, 4370, 8068, 8295, 8177, 7772, 2668, 7191, 8480, 9211, 4802, 2625, 1924, 9970, 4180};
int out56 = 9813;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in560, in561);
System.out.println("Output expected: " + out56 + " Output recieved: " + tmpVal );
result = tmpVal == out56;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in570 = {51, 807, 943, 4313, 8319, 3644, 481, 220, 2161, 448, 465, 1657, 6290, 22, 6152, 647, 3185, 4474, 2168};
int[] in571 = {1182, 912, 1832, 7754, 9557, 7980, 4144, 3194, 7129, 5535, 1172, 2043, 6437, 7252, 9508, 4745, 8313, 8020, 4017};
int out57 = 9535;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in570, in571);
System.out.println("Output expected: " + out57 + " Output recieved: " + tmpVal );
result = tmpVal == out57;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in580 = {45, 100, 125, 10, 15, 35, 30, 9};
int[] in581 = {46, 200, 175, 20, 25, 45, 40, 10};
int out58 = 132;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in580, in581);
System.out.println("Output expected: " + out58 + " Output recieved: " + tmpVal );
result = tmpVal == out58;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in590 = {5};
int[] in591 = {88};
int out59 = 83;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in590, in591);
System.out.println("Output expected: " + out59 + " Output recieved: " + tmpVal );
result = tmpVal == out59;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in600 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int[] in601 = {10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000};
int out60 = 10000;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in600, in601);
System.out.println("Output expected: " + out60 + " Output recieved: " + tmpVal );
result = tmpVal == out60;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in610 = {4906, 5601, 5087, 1020, 4362, 2657, 6257, 5509, 5107, 5315, 277, 6801, 2136, 2921, 5233, 5082, 497, 8250, 3956, 5720};
int[] in611 = {4930, 9130, 9366, 2322, 4687, 4848, 8856, 6302, 5496, 5438, 829, 9053, 4233, 4119, 9781, 8034, 3956, 9939, 4908, 5928};
int out61 = 9510;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in610, in611);
System.out.println("Output expected: " + out61 + " Output recieved: " + tmpVal );
result = tmpVal == out61;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in620 = {0, 4350, 2, 54, 222, 545, 1000, 54, 54, 0, 0, 254, 323, 9999, 32};
int[] in621 = {66, 10000, 1000, 435, 3579, 10000, 6700, 98, 100, 1, 4352, 355, 9999, 10000, 763};
int out62 = 10000;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in620, in621);
System.out.println("Output expected: " + out62 + " Output recieved: " + tmpVal );
result = tmpVal == out62;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in630 = {0};
int[] in631 = {5};
int out63 = 5;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in630, in631);
System.out.println("Output expected: " + out63 + " Output recieved: " + tmpVal );
result = tmpVal == out63;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in640 = {0};
int[] in641 = {1};
int out64 = 1;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in640, in641);
System.out.println("Output expected: " + out64 + " Output recieved: " + tmpVal );
result = tmpVal == out64;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in650 = {3, 1};
int[] in651 = {4, 5};
int out65 = 4;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in650, in651);
System.out.println("Output expected: " + out65 + " Output recieved: " + tmpVal );
result = tmpVal == out65;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in660 = {5, 5};
int[] in661 = {10, 10};
int out66 = 5;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in660, in661);
System.out.println("Output expected: " + out66 + " Output recieved: " + tmpVal );
result = tmpVal == out66;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in670 = {1, 1};
int[] in671 = {2, 3};
int out67 = 2;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in670, in671);
System.out.println("Output expected: " + out67 + " Output recieved: " + tmpVal );
result = tmpVal == out67;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in680 = {2, 3};
int[] in681 = {3, 4};
int out68 = 2;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in680, in681);
System.out.println("Output expected: " + out68 + " Output recieved: " + tmpVal );
result = tmpVal == out68;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in690 = {2, 1};
int[] in691 = {3, 5};
int out69 = 4;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in690, in691);
System.out.println("Output expected: " + out69 + " Output recieved: " + tmpVal );
result = tmpVal == out69;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in700 = {3, 1};
int[] in701 = {5, 7};
int out70 = 6;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in700, in701);
System.out.println("Output expected: " + out70 + " Output recieved: " + tmpVal );
result = tmpVal == out70;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in710 = {1, 1};
int[] in711 = {10, 2};
int out71 = 9;
System.out.println("testing with input: ");
test = new SnowyWinter();
tmpVal = test.snowyHighwayLength(in710, in711);
System.out.println("Output expected: " + out71 + " Output recieved: " + tmpVal );
result = tmpVal == out71;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
    }
}
