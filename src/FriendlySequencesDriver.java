import java.util.Arrays;
public class FriendlySequencesDriver {
   public static void main(String [] args){
   FriendlySequences test; 
   int mark = 0;
   int counter = 0;
   int tmpVal;
   boolean result;
   counter++; 
   int [] in0 = {112, 12, 21, 354, 534345, 345, 2221};
   int out0 = 6;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in0));
   test =  new FriendlySequences();

   tmpVal = test.count(in0);
   System.out.println("Output expected: " + out0 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out0;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in1 = {10, 1100, 10101, 111, 1111, 11111, 11, 1, 111};
   int out1 = 18;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in1));
   test =  new FriendlySequences();

   tmpVal = test.count(in1);
   System.out.println("Output expected: " + out1 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out1;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in2 = {0, 0, 0, 0};
   int out2 = 6;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in2));
   test =  new FriendlySequences();

   tmpVal = test.count(in2);
   System.out.println("Output expected: " + out2 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out2;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in3 = {123456890, 213456890, 198654320};
   int out3 = 3;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in3));
   test =  new FriendlySequences();

   tmpVal = test.count(in3);
   System.out.println("Output expected: " + out3 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out3;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in4 = {};
   int out4 = 0;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in4));
   test =  new FriendlySequences();

   tmpVal = test.count(in4);
   System.out.println("Output expected: " + out4 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out4;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in5 = {9};
   int out5 = 0;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in5));
   test =  new FriendlySequences();

   tmpVal = test.count(in5);
   System.out.println("Output expected: " + out5 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out5;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in6 = {970313};
   int out6 = 0;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in6));
   test =  new FriendlySequences();

   tmpVal = test.count(in6);
   System.out.println("Output expected: " + out6 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out6;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in7 = {8, 918389};
   int out7 = 0;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in7));
   test =  new FriendlySequences();

   tmpVal = test.count(in7);
   System.out.println("Output expected: " + out7 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out7;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in8 = {4, 547202, 0};
   int out8 = 0;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in8));
   test =  new FriendlySequences();

   tmpVal = test.count(in8);
   System.out.println("Output expected: " + out8 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out8;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in9 = {2, 2, 3, 337911};
   int out9 = 1;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in9));
   test =  new FriendlySequences();

   tmpVal = test.count(in9);
   System.out.println("Output expected: " + out9 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out9;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in10 = {486691, 419848666, 684914668, 648694861, 149468686};
   int out10 = 10;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in10));
   test =  new FriendlySequences();

   tmpVal = test.count(in10);
   System.out.println("Output expected: " + out10 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out10;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in11 = {1, 6, 6, 8, 1, 777590};
   int out11 = 1;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in11));
   test =  new FriendlySequences();

   tmpVal = test.count(in11);
   System.out.println("Output expected: " + out11 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out11;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in12 = {239534, 243923935, 393925342, 432939235, 993334225, 4, 8};
   int out12 = 10;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in12));
   test =  new FriendlySequences();

   tmpVal = test.count(in12);
   System.out.println("Output expected: " + out12 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out12;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in13 = {4, 6, 0, 1, 475954, 8, 1, 1};
   int out13 = 1;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in13));
   test =  new FriendlySequences();

   tmpVal = test.count(in13);
   System.out.println("Output expected: " + out13 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out13;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in14 = {9, 6, 8, 5, 808486, 486808880, 848886080, 804888068, 800868488};
   int out14 = 10;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in14));
   test =  new FriendlySequences();

   tmpVal = test.count(in14);
   System.out.println("Output expected: " + out14 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out14;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in15 = {3, 0, 3, 853591, 385559318, 153535988, 531985853, 559858133, 353585819, 559858331};
   int out15 = 21;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in15));
   test =  new FriendlySequences();

   tmpVal = test.count(in15);
   System.out.println("Output expected: " + out15 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out15;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in16 = {8, 8, 1, 5, 3, 7, 0, 3, 3, 384209, 4};
   int out16 = 2;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in16));
   test =  new FriendlySequences();

   tmpVal = test.count(in16);
   System.out.println("Output expected: " + out16 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out16;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in17 = {6, 2, 6, 3, 4, 904695, 909404956, 69049459, 6, 1, 8, 2};
   int out17 = 3;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in17));
   test =  new FriendlySequences();

   tmpVal = test.count(in17);
   System.out.println("Output expected: " + out17 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out17;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in18 = {2, 0, 5, 8, 3, 0, 3, 3, 548154, 4, 0, 6, 5};
   int out18 = 1;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in18));
   test =  new FriendlySequences();

   tmpVal = test.count(in18);
   System.out.println("Output expected: " + out18 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out18;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in19 = {5, 4, 101519, 1, 8, 8, 6, 3, 5, 7, 7, 1, 2, 8};
   int out19 = 2;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in19));
   test =  new FriendlySequences();

   tmpVal = test.count(in19);
   System.out.println("Output expected: " + out19 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out19;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in20 = {1, 2, 8, 7, 5, 0, 9, 0, 4, 0, 7, 732292, 5, 6, 8};
   int out20 = 0;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in20));
   test =  new FriendlySequences();

   tmpVal = test.count(in20);
   System.out.println("Output expected: " + out20 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out20;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in21 = {960611, 199606160, 961001966, 106916069, 61106699, 166199006, 16961069, 1, 6, 4, 7, 0, 770101, 6, 6, 8};
   int out21 = 22;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in21));
   test =  new FriendlySequences();

   tmpVal = test.count(in21);
   System.out.println("Output expected: " + out21 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out21;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in22 = {6, 3, 700554, 45005707, 547005700, 2, 6, 9, 5, 7, 283795, 9, 7, 7, 3, 0, 8};
   int out22 = 4;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in22));
   test =  new FriendlySequences();

   tmpVal = test.count(in22);
   System.out.println("Output expected: " + out22 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out22;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in23 = {9, 548609, 448595608, 808694554, 504689458, 408869545, 9, 6, 7, 6, 1, 1, 7, 3, 2, 4, 308934, 3};
   int out23 = 11;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in23));
   test =  new FriendlySequences();

   tmpVal = test.count(in23);
   System.out.println("Output expected: " + out23 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out23;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in24 = {8, 7, 4, 0, 7, 5, 6, 4, 8, 0, 997031, 779155, 8, 4, 9, 6, 3, 8, 2};
   int out24 = 0;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in24));
   test =  new FriendlySequences();

   tmpVal = test.count(in24);
   System.out.println("Output expected: " + out24 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out24;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in25 = {2, 9, 7, 3, 6, 8, 9, 1, 1, 7, 6, 3, 6, 0, 9, 0, 3, 6, 666639, 666666936};
   int out25 = 2;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in25));
   test =  new FriendlySequences();

   tmpVal = test.count(in25);
   System.out.println("Output expected: " + out25 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out25;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in26 = {0, 462913, 296421463, 662294143, 136426942, 126942643, 349262146, 926314624, 436491262, 3, 2, 2, 6, 2, 6, 2, 6, 0, 774479, 9, 0};
   int out26 = 29;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in26));
   test =  new FriendlySequences();

   tmpVal = test.count(in26);
   System.out.println("Output expected: " + out26 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out26;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in27 = {4, 3, 2, 5, 8, 0, 542847, 5, 2, 0, 8, 3, 4, 8, 6, 8, 6, 9, 5, 6, 9, 875726};
   int out27 = 0;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in27));
   test =  new FriendlySequences();

   tmpVal = test.count(in27);
   System.out.println("Output expected: " + out27 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out27;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in28 = {3, 7, 5, 5, 2, 575664, 5, 3, 2, 4, 7, 4, 5, 9, 2, 8, 9, 3, 4, 9, 3, 301684, 4};
   int out28 = 1;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in28));
   test =  new FriendlySequences();

   tmpVal = test.count(in28);
   System.out.println("Output expected: " + out28 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out28;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in29 = {8, 6, 706679, 707607696, 67766079, 269999, 962999269, 962929996, 699962992, 999692629, 992699269, 969292699, 692969992, 992629969, 299992669, 926969929, 926996299, 299969692, 922699699, 929669299, 969926992, 992996296, 669929929, 699699922};
   int out29 = 174;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in29));
   test =  new FriendlySequences();

   tmpVal = test.count(in29);
   System.out.println("Output expected: " + out29 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out29;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in30 = {7, 8, 3, 2, 1, 1, 6, 8, 6, 365905, 555066393, 635609535, 405842, 556336059, 8, 2, 2, 7, 5, 2, 5, 3, 1, 1, 2};
   int out30 = 6;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in30));
   test =  new FriendlySequences();

   tmpVal = test.count(in30);
   System.out.println("Output expected: " + out30 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out30;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in31 = {1, 9, 7, 5, 1, 4, 1, 5, 1, 7, 5, 5, 8, 1, 8, 8, 4, 922433, 7, 0, 5, 277434, 442777327, 747737422, 5, 3};
   int out31 = 5;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in31));
   test =  new FriendlySequences();

   tmpVal = test.count(in31);
   System.out.println("Output expected: " + out31 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out31;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in32 = {9, 1, 0, 5, 3, 4, 5, 771735, 177731757, 715777173, 771771375, 771175377, 777731157, 773177571, 737517717, 777315717, 717775173, 715771737, 153777717, 777771135, 796804, 796408796, 790687649, 706799684, 708699467, 7, 0};
   int out32 = 88;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in32));
   test =  new FriendlySequences();

   tmpVal = test.count(in32);
   System.out.println("Output expected: " + out32 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out32;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in33 = {3, 3, 4, 6, 4, 789504, 48995787, 984987570, 708945879, 889750749, 59887974, 78895974, 758479908, 885479079, 990457878, 548797098, 885970479, 8, 9, 7, 8, 7, 0, 9, 3, 7, 3, 5};
   int out33 = 15;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in33));
   test =  new FriendlySequences();

   tmpVal = test.count(in33);
   System.out.println("Output expected: " + out33 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out33;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in34 = {2, 5, 429005, 209544290, 240459902, 950292404, 492504092, 509290424, 207366, 606730722, 236200677, 20772636, 7263627, 307672206, 770203626, 362727600, 707626023, 723260076, 270203667, 9, 0, 6, 5, 5, 9, 1, 2, 8, 3};
   int out34 = 37;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in34));
   test =  new FriendlySequences();

   tmpVal = test.count(in34);
   System.out.println("Output expected: " + out34 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out34;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in35 = {5, 515038, 810355551, 85535151, 805555131, 835155510, 518510553, 51553518, 158550513, 155108355, 550855131, 515835510, 51535158, 135551580, 158150535, 315015558, 583105155, 531081555, 558511350, 305551158, 815535150, 185555130, 505553181, 555105183, 515385051, 558155130, 150385551, 15558315, 153585051, 9};
   int out35 = 101;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in35));
   test =  new FriendlySequences();

   tmpVal = test.count(in35);
   System.out.println("Output expected: " + out35 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out35;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in36 = {4, 9, 1, 8, 237785, 857332772, 4, 4, 3, 4, 1, 7, 8, 7, 6, 2, 4, 4, 52363, 23553236, 4, 7, 3, 1, 6, 2, 4, 2, 1, 0, 4};
   int out36 = 4;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in36));
   test =  new FriendlySequences();

   tmpVal = test.count(in36);
   System.out.println("Output expected: " + out36 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out36;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in37 = {2, 6, 8, 7, 9, 3, 6, 3, 1, 0, 8, 4, 5, 752901, 5, 1, 7, 7, 2, 1, 2, 634787, 9, 5, 9, 7, 6, 8, 2, 8, 860096, 7};
   int out37 = 1;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in37));
   test =  new FriendlySequences();

   tmpVal = test.count(in37);
   System.out.println("Output expected: " + out37 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out37;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in38 = {7, 8, 9, 1, 0, 2, 719776, 717797691, 771791796, 971779716, 777791916, 776197719, 1, 9, 8, 49874, 8, 9, 6, 0, 7, 1, 480526, 3, 7, 8, 0, 5, 7, 9, 0, 8, 4};
   int out38 = 15;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in38));
   test =  new FriendlySequences();

   tmpVal = test.count(in38);
   System.out.println("Output expected: " + out38 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out38;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in39 = {3, 4, 5, 9, 5, 4, 2, 6, 1, 6, 1, 5, 6, 8, 8, 76359, 59736637, 79756363, 66779353, 93757366, 283653, 93673567, 76363579, 79366573, 39676573, 36376597, 76653739, 67637359, 56937736, 97375636, 53636977, 96576373, 69675373, 960427};
   int out39 = 77;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in39));
   test =  new FriendlySequences();

   tmpVal = test.count(in39);
   System.out.println("Output expected: " + out39 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out39;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in40 = {2, 4, 0, 5, 3, 8, 8, 0, 6, 678359, 566738897, 857897663, 865976738, 868579367, 853897667, 753676898, 687753986, 0, 9, 5, 681426, 264181668, 668461182, 1, 8, 1, 5, 7, 941105, 445910911, 945409111, 59114419, 8, 5, 0};
   int out40 = 35;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in40));
   test =  new FriendlySequences();

   tmpVal = test.count(in40);
   System.out.println("Output expected: " + out40 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out40;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in41 = {9, 8, 5, 3, 8, 9, 7, 8, 7, 8, 1, 9, 3, 2, 5, 1, 9, 2, 5, 321223, 312123322, 222133231, 232223311, 321312322, 332212231, 132222133, 333122221, 121222333, 313231222, 332212312, 323312221, 322113322, 212312323, 222321133, 212331223, 312321322};
   int out41 = 136;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in41));
   test =  new FriendlySequences();

   tmpVal = test.count(in41);
   System.out.println("Output expected: " + out41 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out41;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in42 = {3, 0, 7, 7, 9, 995199, 999595919, 915999599, 559919999, 919599995, 195599999, 915999959, 519599999, 999559199, 955199999, 999959915, 199599959, 6, 0, 5, 172852, 5, 4, 5, 2, 7, 6, 3, 2, 3, 6, 1, 6, 0, 1, 620474, 5};
   int out42 = 67;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in42));
   test =  new FriendlySequences();

   tmpVal = test.count(in42);
   System.out.println("Output expected: " + out42 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out42;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in43 = {2, 2, 140702, 4211047, 210104047, 241410070, 401020174, 410270014, 470411200, 395963, 533959693, 539693935, 333965995, 363399595, 996955333, 933356599, 335953996, 935353996, 996335539, 563939359, 4117402, 47241001, 71142004, 120700441, 100201474, 410704102, 20147140, 410217004, 472140100, 420104701, 14270014, 714104002, 401007421, 447101200, 5, 1, 5, 9};
   int out43 = 168;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in43));
   test =  new FriendlySequences();

   tmpVal = test.count(in43);
   System.out.println("Output expected: " + out43 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out43;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in44 = {1, 2, 9, 284806, 688422048, 486202488, 888426420, 226844088, 268480428, 868220484, 624408828, 862440882, 224648880, 28442886, 842088264, 628208484, 688422804, 288248046, 846224088, 846028824, 880448262, 848402826, 408884226, 848280624, 848246820, 88822446, 7, 5, 1, 5, 3, 3, 2, 7, 0, 7, 5, 6, 219893};
   int out44 = 101;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in44));
   test =  new FriendlySequences();

   tmpVal = test.count(in44);
   System.out.println("Output expected: " + out44 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out44;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in45 = {8, 8, 7, 4, 2, 931137, 311933719, 719913133, 391971313, 193793311, 313317919, 393319171, 931313917, 393191371, 937331191, 339311719, 480516, 939731131, 939137311, 119731393, 191793133, 313713991, 193719133, 2, 2, 2, 2, 3, 5, 2, 8, 1, 4, 1, 4, 9, 7, 1, 0, 5};
   int out45 = 77;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in45));
   test =  new FriendlySequences();

   tmpVal = test.count(in45);
   System.out.println("Output expected: " + out45 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out45;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in46 = {2, 0, 6, 9, 5, 7, 4, 7, 5, 3, 9, 6, 2, 5, 7, 9, 0, 5, 4, 864950, 645496880, 66495884, 854668490, 464898056, 864864059, 649808456, 371581, 313717158, 117735138, 337511871, 890854664, 2, 0, 3, 2, 5, 3, 4, 5, 6, 483369};
   int out46 = 13;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in46));
   test =  new FriendlySequences();

   tmpVal = test.count(in46);
   System.out.println("Output expected: " + out46 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out46;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in47 = {9, 6, 4, 4, 8, 8, 1, 4, 7, 2, 2, 3, 7, 2, 5, 7, 715776, 777157516, 755771167, 177516757, 751771567, 775711756, 6, 4, 6, 8, 3, 0, 4, 1, 247022, 987149, 814989797, 881479979, 899148779, 988991477, 987719489, 179748989, 987919487, 799814897, 187997498, 977998184};
   int out47 = 73;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in47));
   test =  new FriendlySequences();

   tmpVal = test.count(in47);
   System.out.println("Output expected: " + out47 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out47;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in48 = {5, 6, 1, 455204, 550544452, 550454245, 504454552, 445554520, 45554254, 461664, 552505444, 455440525, 424555450, 450424555, 4, 4, 1, 3, 7, 5, 9, 0, 4, 3, 7, 9, 9, 7, 0, 9, 1, 7, 1, 5, 4, 3, 2, 989680, 6, 9, 8, 6, 4};
   int out48 = 18;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in48));
   test =  new FriendlySequences();

   tmpVal = test.count(in48);
   System.out.println("Output expected: " + out48 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out48;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in49 = {1, 2, 8, 6, 9, 5, 8, 2, 831117, 131871831, 817113183, 818171313, 731811318, 813817131, 171331881, 181133718, 113181783, 317111388, 318171813, 318371118, 178133118, 288957, 811311873, 711831318, 811713813, 813318711, 188311371, 173181318, 813318117, 9, 9, 8, 444597, 1, 6, 6, 5, 9, 4, 8, 1, 3, 3, 9};
   int out49 = 102;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in49));
   test =  new FriendlySequences();

   tmpVal = test.count(in49);
   System.out.println("Output expected: " + out49 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out49;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in50 = {6, 4, 0, 0, 2, 321480, 5, 432222, 222423423, 423232224, 224423322, 324322422, 224322324, 424232223, 324422232, 244222233, 422322432, 223244322, 432242322, 322243242, 223342242, 344222232, 322232442, 324322242, 222332244, 222243234, 222423324, 222234342, 222234324, 422323242, 424322223, 324223422, 232242423, 422322342, 242243223, 232432224, 224223234, 682238, 9, 9, 6, 8, 8, 4, 6};
   int out50 = 438;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in50));
   test =  new FriendlySequences();

   tmpVal = test.count(in50);
   System.out.println("Output expected: " + out50 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out50;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in51 = {2, 0, 6, 5, 8, 6, 4, 6, 3, 9, 0, 9, 4, 0, 7, 0, 3, 3, 4, 3, 5, 7, 8, 2, 8, 0, 8, 2, 3, 8, 5, 167926, 669172617, 416192, 726967161, 486640, 3, 5, 7, 5, 1, 3, 7, 2, 2, 9};
   int out51 = 3;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in51));
   test =  new FriendlySequences();

   tmpVal = test.count(in51);
   System.out.println("Output expected: " + out51 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out51;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in52 = {1, 8, 8, 4, 5, 0, 0, 8, 8, 0, 6, 234919, 112489, 191228411, 112419128, 811924112, 228114191, 211149821, 121291184, 121419218, 841119212, 211492181, 112411892, 121118249, 282119114, 982111142, 281119421, 811122914, 211489121, 111922184, 112298411, 948221111, 491112821, 814911221, 111429281, 498211211, 114221918, 129281141, 112281419, 112981214, 112842191, 894211121, 181112249, 249181121, 198412121, 114218219, 229419343};
   int out52 = 564;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in52));
   test =  new FriendlySequences();

   tmpVal = test.count(in52);
   System.out.println("Output expected: " + out52 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out52;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in53 = {4, 3, 5, 1, 7, 2, 794227, 961881, 191689816, 118991866, 989661811, 866911819, 181986619, 868919116, 618698119, 168169918, 911198686, 186189961, 986691811, 981161896, 861691981, 699168181, 681169981, 961169881, 619881619, 119186986, 169189168, 961916818, 886191619, 189698611, 116989618, 989069, 611968189, 611981968, 198611869, 689191681, 911986861, 196918618, 698811691, 981186169, 169968181, 169196881, 472427979, 5, 5, 3, 5, 2};
   int out53 = 322;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in53));
   test =  new FriendlySequences();

   tmpVal = test.count(in53);
   System.out.println("Output expected: " + out53 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out53;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in54 = {7, 7, 2, 2, 9, 4, 4, 4, 7, 1, 8, 4, 874341, 783844714, 341887447, 344148787, 448378741, 744378418, 257308, 572752830, 208357725, 223805775, 553787202, 820552773, 823757502, 572052837, 273257508, 38275257, 582270753, 825703527, 782235705, 822377550, 72258735, 372825570, 575320278, 702257358, 278520753, 827573502, 25257873, 587027352, 270585372, 757822305, 530277285, 6, 9, 604710, 8, 8, 3};
   int out54 = 79;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in54));
   test =  new FriendlySequences();

   tmpVal = test.count(in54);
   System.out.println("Output expected: " + out54 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out54;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in55 = {9, 1, 6, 3, 2, 7, 4, 9, 8, 2, 3, 4, 2, 5, 9, 2, 2, 4, 5, 8, 0, 4, 5, 598577, 9, 1, 6, 7, 5, 8, 4, 3, 7, 0, 9, 6, 5, 3, 4, 8, 3, 812963, 246154, 8, 2, 2, 0, 4, 4, 52476};
   int out55 = 3;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in55));
   test =  new FriendlySequences();

   tmpVal = test.count(in55);
   System.out.println("Output expected: " + out55 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out55;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in56 = {2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000};
   int out56 = 1225;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in56));
   test =  new FriendlySequences();

   tmpVal = test.count(in56);
   System.out.println("Output expected: " + out56 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out56;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in57 = {123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123, 123123123};
   int out57 = 1225;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in57));
   test =  new FriendlySequences();

   tmpVal = test.count(in57);
   System.out.println("Output expected: " + out57 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out57;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in58 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   int out58 = 1225;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in58));
   test =  new FriendlySequences();

   tmpVal = test.count(in58);
   System.out.println("Output expected: " + out58 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out58;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in59 = {1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890};
   int out59 = 1225;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in59));
   test =  new FriendlySequences();

   tmpVal = test.count(in59);
   System.out.println("Output expected: " + out59 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out59;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in60 = {11112222, 111222, 1122, 12, 1111122222};
   int out60 = 10;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in60));
   test =  new FriendlySequences();

   tmpVal = test.count(in60);
   System.out.println("Output expected: " + out60 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out60;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in61 = {};
   int out61 = 0;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in61));
   test =  new FriendlySequences();

   tmpVal = test.count(in61);
   System.out.println("Output expected: " + out61 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out61;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in62 = {10, 1100, 10101, 111, 1111, 11111, 11, 1, 111};
   int out62 = 18;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in62));
   test =  new FriendlySequences();

   tmpVal = test.count(in62);
   System.out.println("Output expected: " + out62 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out62;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in63 = {1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890, 1234567890};
   int out63 = 1225;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in63));
   test =  new FriendlySequences();

   tmpVal = test.count(in63);
   System.out.println("Output expected: " + out63 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out63;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in64 = {123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333, 123, 111222333};
   int out64 = 1225;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in64));
   test =  new FriendlySequences();

   tmpVal = test.count(in64);
   System.out.println("Output expected: " + out64 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out64;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in65 = {1, 11, 12, 111, 1111};
   int out65 = 2;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in65));
   test =  new FriendlySequences();

   tmpVal = test.count(in65);
   System.out.println("Output expected: " + out65 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out65;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in66 = {0, 10};
   int out66 = 0;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in66));
   test =  new FriendlySequences();

   tmpVal = test.count(in66);
   System.out.println("Output expected: " + out66 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out66;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in67 = {4578, 45678};
   int out67 = 0;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in67));
   test =  new FriendlySequences();

   tmpVal = test.count(in67);
   System.out.println("Output expected: " + out67 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out67;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in68 = {13, 123};
   int out68 = 0;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in68));
   test =  new FriendlySequences();

   tmpVal = test.count(in68);
   System.out.println("Output expected: " + out68 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out68;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in69 = {89, 889, 998, 888, 8, 98, 8, 98, 8, 89, 89, 8, 8, 89, 89, 899, 988, 89, 9, 98, 989, 898};
   int out69 = 19;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in69));
   test =  new FriendlySequences();

   tmpVal = test.count(in69);
   System.out.println("Output expected: " + out69 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out69;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in70 = {1, 12};
   int out70 = 0;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in70));
   test =  new FriendlySequences();

   tmpVal = test.count(in70);
   System.out.println("Output expected: " + out70 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out70;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in71 = {1223, 343, 436, 34, 54, 23, 5, 4, 64, 33, 22, 33, 44, 34, 34, 23, 43, 54, 54, 54, 4, 7, 4, 5, 3, 65, 34, 54, 34, 23, 3, 4, 3, 3, 3, 23, 32, 3, 65, 43, 54, 65, 45, 546, 545454545, 54, 23, 65, 34};
   int out71 = 9;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in71));
   test =  new FriendlySequences();

   tmpVal = test.count(in71);
   System.out.println("Output expected: " + out71 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out71;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in72 = {0, 0, 0, 0, 0, 0};
   int out72 = 15;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in72));
   test =  new FriendlySequences();

   tmpVal = test.count(in72);
   System.out.println("Output expected: " + out72 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out72;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in73 = {2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000};
   int out73 = 1225;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in73));
   test =  new FriendlySequences();

   tmpVal = test.count(in73);
   System.out.println("Output expected: " + out73 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out73;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in74 = {0, 0, 0, 0};
   int out74 = 6;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in74));
   test =  new FriendlySequences();

   tmpVal = test.count(in74);
   System.out.println("Output expected: " + out74 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out74;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in75 = {123, 1245, 657, 789, 768967, 67867867, 67889, 5432, 5675, 675668, 89778, 789, 0, 12321, 45646, 123, 67, 346, 7645, 7634, 234, 234};
   int out75 = 2;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in75));
   test =  new FriendlySequences();

   tmpVal = test.count(in75);
   System.out.println("Output expected: " + out75 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out75;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   int [] in76 = {19, 11};
   int out76 = 0;
   System.out.println("testing with input: ");
System.out.println(Arrays.toString(in76));
   test =  new FriendlySequences();

   tmpVal = test.count(in76);
   System.out.println("Output expected: " + out76 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out76;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
    }
}
