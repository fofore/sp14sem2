import java.util.Arrays;
public class FunnyFenceDriver {
   public static void main(String [] args){
   FunnyFence test; 
   int mark = 0;
   int counter = 0;
   int tmpVal;
   boolean result;
   counter++; 
   String in0 = "|-|-|";
   int out0 = 5;
   System.out.println("testing with input: ");
System.out.println(in0);
   test =  new FunnyFence();

   tmpVal = test.getLength(in0);
   System.out.println("Output expected: " + out0 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out0;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in1 = "-|-|-|-";
   int out1 = 7;
   System.out.println("testing with input: ");
System.out.println(in1);
   test =  new FunnyFence();

   tmpVal = test.getLength(in1);
   System.out.println("Output expected: " + out1 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out1;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in2 = "||||||";
   int out2 = 1;
   System.out.println("testing with input: ");
System.out.println(in2);
   test =  new FunnyFence();

   tmpVal = test.getLength(in2);
   System.out.println("Output expected: " + out2 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out2;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in3 = "|-||-|-";
   int out3 = 4;
   System.out.println("testing with input: ");
System.out.println(in3);
   test =  new FunnyFence();

   tmpVal = test.getLength(in3);
   System.out.println("Output expected: " + out3 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out3;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in4 = "|-|---|-|---|-|";
   int out4 = 5;
   System.out.println("testing with input: ");
System.out.println(in4);
   test =  new FunnyFence();

   tmpVal = test.getLength(in4);
   System.out.println("Output expected: " + out4 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out4;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in5 = "|";
   int out5 = 1;
   System.out.println("testing with input: ");
System.out.println(in5);
   test =  new FunnyFence();

   tmpVal = test.getLength(in5);
   System.out.println("Output expected: " + out5 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out5;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in6 = "-";
   int out6 = 1;
   System.out.println("testing with input: ");
System.out.println(in6);
   test =  new FunnyFence();

   tmpVal = test.getLength(in6);
   System.out.println("Output expected: " + out6 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out6;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in7 = "||";
   int out7 = 1;
   System.out.println("testing with input: ");
System.out.println(in7);
   test =  new FunnyFence();

   tmpVal = test.getLength(in7);
   System.out.println("Output expected: " + out7 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out7;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in8 = "--";
   int out8 = 1;
   System.out.println("testing with input: ");
System.out.println(in8);
   test =  new FunnyFence();

   tmpVal = test.getLength(in8);
   System.out.println("Output expected: " + out8 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out8;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in9 = "|-";
   int out9 = 2;
   System.out.println("testing with input: ");
System.out.println(in9);
   test =  new FunnyFence();

   tmpVal = test.getLength(in9);
   System.out.println("Output expected: " + out9 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out9;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in10 = "-|";
   int out10 = 2;
   System.out.println("testing with input: ");
System.out.println(in10);
   test =  new FunnyFence();

   tmpVal = test.getLength(in10);
   System.out.println("Output expected: " + out10 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out10;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in11 = "|||";
   int out11 = 1;
   System.out.println("testing with input: ");
System.out.println(in11);
   test =  new FunnyFence();

   tmpVal = test.getLength(in11);
   System.out.println("Output expected: " + out11 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out11;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in12 = "|--";
   int out12 = 2;
   System.out.println("testing with input: ");
System.out.println(in12);
   test =  new FunnyFence();

   tmpVal = test.getLength(in12);
   System.out.println("Output expected: " + out12 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out12;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in13 = "||-";
   int out13 = 2;
   System.out.println("testing with input: ");
System.out.println(in13);
   test =  new FunnyFence();

   tmpVal = test.getLength(in13);
   System.out.println("Output expected: " + out13 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out13;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in14 = "|-|";
   int out14 = 3;
   System.out.println("testing with input: ");
System.out.println(in14);
   test =  new FunnyFence();

   tmpVal = test.getLength(in14);
   System.out.println("Output expected: " + out14 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out14;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in15 = "-||";
   int out15 = 2;
   System.out.println("testing with input: ");
System.out.println(in15);
   test =  new FunnyFence();

   tmpVal = test.getLength(in15);
   System.out.println("Output expected: " + out15 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out15;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in16 = "---";
   int out16 = 1;
   System.out.println("testing with input: ");
System.out.println(in16);
   test =  new FunnyFence();

   tmpVal = test.getLength(in16);
   System.out.println("Output expected: " + out16 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out16;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in17 = "-|-";
   int out17 = 3;
   System.out.println("testing with input: ");
System.out.println(in17);
   test =  new FunnyFence();

   tmpVal = test.getLength(in17);
   System.out.println("Output expected: " + out17 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out17;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in18 = "--|";
   int out18 = 2;
   System.out.println("testing with input: ");
System.out.println(in18);
   test =  new FunnyFence();

   tmpVal = test.getLength(in18);
   System.out.println("Output expected: " + out18 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out18;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in19 = "--------------------------------------------------";
   int out19 = 1;
   System.out.println("testing with input: ");
System.out.println(in19);
   test =  new FunnyFence();

   tmpVal = test.getLength(in19);
   System.out.println("Output expected: " + out19 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out19;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in20 = "-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|";
   int out20 = 50;
   System.out.println("testing with input: ");
System.out.println(in20);
   test =  new FunnyFence();

   tmpVal = test.getLength(in20);
   System.out.println("Output expected: " + out20 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out20;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in21 = "-|-|";
   int out21 = 4;
   System.out.println("testing with input: ");
System.out.println(in21);
   test =  new FunnyFence();

   tmpVal = test.getLength(in21);
   System.out.println("Output expected: " + out21 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out21;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in22 = "||-|-";
   int out22 = 4;
   System.out.println("testing with input: ");
System.out.println(in22);
   test =  new FunnyFence();

   tmpVal = test.getLength(in22);
   System.out.println("Output expected: " + out22 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out22;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in23 = "|-|-|-";
   int out23 = 6;
   System.out.println("testing with input: ");
System.out.println(in23);
   test =  new FunnyFence();

   tmpVal = test.getLength(in23);
   System.out.println("Output expected: " + out23 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out23;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in24 = "|-|-|||";
   int out24 = 5;
   System.out.println("testing with input: ");
System.out.println(in24);
   test =  new FunnyFence();

   tmpVal = test.getLength(in24);
   System.out.println("Output expected: " + out24 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out24;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in25 = "-|-|-|-|";
   int out25 = 8;
   System.out.println("testing with input: ");
System.out.println(in25);
   test =  new FunnyFence();

   tmpVal = test.getLength(in25);
   System.out.println("Output expected: " + out25 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out25;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in26 = "|-|-|-|-|";
   int out26 = 9;
   System.out.println("testing with input: ");
System.out.println(in26);
   test =  new FunnyFence();

   tmpVal = test.getLength(in26);
   System.out.println("Output expected: " + out26 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out26;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in27 = "|||-|-|-||";
   int out27 = 7;
   System.out.println("testing with input: ");
System.out.println(in27);
   test =  new FunnyFence();

   tmpVal = test.getLength(in27);
   System.out.println("Output expected: " + out27 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out27;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in28 = "-|-|-|-|-|-";
   int out28 = 11;
   System.out.println("testing with input: ");
System.out.println(in28);
   test =  new FunnyFence();

   tmpVal = test.getLength(in28);
   System.out.println("Output expected: " + out28 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out28;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in29 = "|-|-|-|-|-|-";
   int out29 = 12;
   System.out.println("testing with input: ");
System.out.println(in29);
   test =  new FunnyFence();

   tmpVal = test.getLength(in29);
   System.out.println("Output expected: " + out29 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out29;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in30 = "|-|-|-|-|-|-|";
   int out30 = 13;
   System.out.println("testing with input: ");
System.out.println(in30);
   test =  new FunnyFence();

   tmpVal = test.getLength(in30);
   System.out.println("Output expected: " + out30 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out30;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in31 = "-|||-|||--|--|";
   int out31 = 3;
   System.out.println("testing with input: ");
System.out.println(in31);
   test =  new FunnyFence();

   tmpVal = test.getLength(in31);
   System.out.println("Output expected: " + out31 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out31;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in32 = "|-|-|-|-|-|-|-|";
   int out32 = 15;
   System.out.println("testing with input: ");
System.out.println(in32);
   test =  new FunnyFence();

   tmpVal = test.getLength(in32);
   System.out.println("Output expected: " + out32 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out32;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in33 = "|-|-|||-||||-||-";
   int out33 = 5;
   System.out.println("testing with input: ");
System.out.println(in33);
   test =  new FunnyFence();

   tmpVal = test.getLength(in33);
   System.out.println("Output expected: " + out33 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out33;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in34 = "|-|-|-|-|-|-|-|-|";
   int out34 = 17;
   System.out.println("testing with input: ");
System.out.println(in34);
   test =  new FunnyFence();

   tmpVal = test.getLength(in34);
   System.out.println("Output expected: " + out34 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out34;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in35 = "|-||-|--|-||-|-|-|";
   int out35 = 7;
   System.out.println("testing with input: ");
System.out.println(in35);
   test =  new FunnyFence();

   tmpVal = test.getLength(in35);
   System.out.println("Output expected: " + out35 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out35;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in36 = "|-|-|-||---|-|-||-|";
   int out36 = 7;
   System.out.println("testing with input: ");
System.out.println(in36);
   test =  new FunnyFence();

   tmpVal = test.getLength(in36);
   System.out.println("Output expected: " + out36 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out36;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in37 = "----|||||--||-|||-||";
   int out37 = 3;
   System.out.println("testing with input: ");
System.out.println(in37);
   test =  new FunnyFence();

   tmpVal = test.getLength(in37);
   System.out.println("Output expected: " + out37 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out37;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in38 = "-|-|-|-|-|-|-|-|-|-|-";
   int out38 = 21;
   System.out.println("testing with input: ");
System.out.println(in38);
   test =  new FunnyFence();

   tmpVal = test.getLength(in38);
   System.out.println("Output expected: " + out38 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out38;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in39 = "||||-||-|-|-|-|||-||-|";
   int out39 = 9;
   System.out.println("testing with input: ");
System.out.println(in39);
   test =  new FunnyFence();

   tmpVal = test.getLength(in39);
   System.out.println("Output expected: " + out39 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out39;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in40 = "|-|-|-|--|-||-|-|-|---|";
   int out40 = 8;
   System.out.println("testing with input: ");
System.out.println(in40);
   test =  new FunnyFence();

   tmpVal = test.getLength(in40);
   System.out.println("Output expected: " + out40 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out40;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in41 = "|----||----|-||-|-|-|-||";
   int out41 = 9;
   System.out.println("testing with input: ");
System.out.println(in41);
   test =  new FunnyFence();

   tmpVal = test.getLength(in41);
   System.out.println("Output expected: " + out41 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out41;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in42 = "|-|-|-|-|-|--||-|-|-|-|-|";
   int out42 = 12;
   System.out.println("testing with input: ");
System.out.println(in42);
   test =  new FunnyFence();

   tmpVal = test.getLength(in42);
   System.out.println("Output expected: " + out42 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out42;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in43 = "||--||-||||||--|---||-|--|";
   int out43 = 4;
   System.out.println("testing with input: ");
System.out.println(in43);
   test =  new FunnyFence();

   tmpVal = test.getLength(in43);
   System.out.println("Output expected: " + out43 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out43;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in44 = "|--|-|-||-|-|-|-|-|-|||-||-";
   int out44 = 13;
   System.out.println("testing with input: ");
System.out.println(in44);
   test =  new FunnyFence();

   tmpVal = test.getLength(in44);
   System.out.println("Output expected: " + out44 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out44;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in45 = "|-|-|-|-|-|-|-|-|-|-|-|-|-|-";
   int out45 = 28;
   System.out.println("testing with input: ");
System.out.println(in45);
   test =  new FunnyFence();

   tmpVal = test.getLength(in45);
   System.out.println("Output expected: " + out45 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out45;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in46 = "|-||-|||-|-||-|-|-|-|-|-|-||-";
   int out46 = 15;
   System.out.println("testing with input: ");
System.out.println(in46);
   test =  new FunnyFence();

   tmpVal = test.getLength(in46);
   System.out.println("Output expected: " + out46 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out46;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in47 = "-|-|-||-|||-|-|--|-|-|||---||-";
   int out47 = 6;
   System.out.println("testing with input: ");
System.out.println(in47);
   test =  new FunnyFence();

   tmpVal = test.getLength(in47);
   System.out.println("Output expected: " + out47 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out47;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in48 = "-|-|-||-||--|-|-||-|-|-|-|--|-|";
   int out48 = 10;
   System.out.println("testing with input: ");
System.out.println(in48);
   test =  new FunnyFence();

   tmpVal = test.getLength(in48);
   System.out.println("Output expected: " + out48 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out48;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in49 = "-|-|--|-|-|-|-||-|-||-|-|-|-|-|-";
   int out49 = 12;
   System.out.println("testing with input: ");
System.out.println(in49);
   test =  new FunnyFence();

   tmpVal = test.getLength(in49);
   System.out.println("Output expected: " + out49 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out49;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in50 = "|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|--";
   int out50 = 32;
   System.out.println("testing with input: ");
System.out.println(in50);
   test =  new FunnyFence();

   tmpVal = test.getLength(in50);
   System.out.println("Output expected: " + out50 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out50;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in51 = "-|--|||-|-|---|-|--|--|--|-|-|--|-";
   int out51 = 7;
   System.out.println("testing with input: ");
System.out.println(in51);
   test =  new FunnyFence();

   tmpVal = test.getLength(in51);
   System.out.println("Output expected: " + out51 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out51;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in52 = "|-|-|-|-|---|-|-||-||-|-|--|-|-|-|-";
   int out52 = 10;
   System.out.println("testing with input: ");
System.out.println(in52);
   test =  new FunnyFence();

   tmpVal = test.getLength(in52);
   System.out.println("Output expected: " + out52 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out52;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in53 = "|---||------|-||||-|-|-|-|-||--|||-|";
   int out53 = 11;
   System.out.println("testing with input: ");
System.out.println(in53);
   test =  new FunnyFence();

   tmpVal = test.getLength(in53);
   System.out.println("Output expected: " + out53 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out53;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in54 = "--||-|---|-|-||-||||--||-||-||-||-|--";
   int out54 = 6;
   System.out.println("testing with input: ");
System.out.println(in54);
   test =  new FunnyFence();

   tmpVal = test.getLength(in54);
   System.out.println("Output expected: " + out54 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out54;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in55 = "-|-|--|---||||-|-|-----|--|-|---|----|";
   int out55 = 6;
   System.out.println("testing with input: ");
System.out.println(in55);
   test =  new FunnyFence();

   tmpVal = test.getLength(in55);
   System.out.println("Output expected: " + out55 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out55;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in56 = "-|-|-||-|-||-|-|-|-|-|--|-|-|-|-||-|-||";
   int out56 = 12;
   System.out.println("testing with input: ");
System.out.println(in56);
   test =  new FunnyFence();

   tmpVal = test.getLength(in56);
   System.out.println("Output expected: " + out56 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out56;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in57 = "-|-|--||--|-|-|-|-|-|--|||-|-|||-|-|||||";
   int out57 = 13;
   System.out.println("testing with input: ");
System.out.println(in57);
   test =  new FunnyFence();

   tmpVal = test.getLength(in57);
   System.out.println("Output expected: " + out57 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out57;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in58 = "|-|-|-|-|-|-|-|-||-|-|-|-|--|-|-|-|-|-|-|";
   int out58 = 17;
   System.out.println("testing with input: ");
System.out.println(in58);
   test =  new FunnyFence();

   tmpVal = test.getLength(in58);
   System.out.println("Output expected: " + out58 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out58;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in59 = "|-|-|-|-|-|-|-|-|-|-|--|-|--|--|-|-|-|-|-|";
   int out59 = 22;
   System.out.println("testing with input: ");
System.out.println(in59);
   test =  new FunnyFence();

   tmpVal = test.getLength(in59);
   System.out.println("Output expected: " + out59 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out59;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in60 = "-|-|-|-|-|-|-|-|-||-|-|-|-|-|-|-|-|-|-|-|-|";
   int out60 = 25;
   System.out.println("testing with input: ");
System.out.println(in60);
   test =  new FunnyFence();

   tmpVal = test.getLength(in60);
   System.out.println("Output expected: " + out60 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out60;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in61 = "--|||--|-|||-|---|--|-|--|-||-|-|-|-|--|-||-";
   int out61 = 10;
   System.out.println("testing with input: ");
System.out.println(in61);
   test =  new FunnyFence();

   tmpVal = test.getLength(in61);
   System.out.println("Output expected: " + out61 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out61;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in62 = "-|||--||-|--|--||---|-|--|||-|-|||-|--|-|--||";
   int out62 = 5;
   System.out.println("testing with input: ");
System.out.println(in62);
   test =  new FunnyFence();

   tmpVal = test.getLength(in62);
   System.out.println("Output expected: " + out62 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out62;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in63 = "|||-||--|--|---|-||-|-|-|--||---||-||-||-|--||";
   int out63 = 8;
   System.out.println("testing with input: ");
System.out.println(in63);
   test =  new FunnyFence();

   tmpVal = test.getLength(in63);
   System.out.println("Output expected: " + out63 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out63;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in64 = "|||||-||--|----||||-||||-----|--||--|||-||-|-|-";
   int out64 = 6;
   System.out.println("testing with input: ");
System.out.println(in64);
   test =  new FunnyFence();

   tmpVal = test.getLength(in64);
   System.out.println("Output expected: " + out64 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out64;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in65 = "--||||-|||||||-|--|||-|-|-|-|-|||-||-||||-|-|--|";
   int out65 = 11;
   System.out.println("testing with input: ");
System.out.println(in65);
   test =  new FunnyFence();

   tmpVal = test.getLength(in65);
   System.out.println("Output expected: " + out65 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out65;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in66 = "|-|||||-|--||-|||--|||||-|----|-|----|-||-|||||||";
   int out66 = 5;
   System.out.println("testing with input: ");
System.out.println(in66);
   test =  new FunnyFence();

   tmpVal = test.getLength(in66);
   System.out.println("Output expected: " + out66 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out66;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in67 = "||-|-|-|-|-|-|-|--|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-";
   int out67 = 33;
   System.out.println("testing with input: ");
System.out.println(in67);
   test =  new FunnyFence();

   tmpVal = test.getLength(in67);
   System.out.println("Output expected: " + out67 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out67;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in68 = "-";
   int out68 = 1;
   System.out.println("testing with input: ");
System.out.println(in68);
   test =  new FunnyFence();

   tmpVal = test.getLength(in68);
   System.out.println("Output expected: " + out68 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out68;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in69 = "|";
   int out69 = 1;
   System.out.println("testing with input: ");
System.out.println(in69);
   test =  new FunnyFence();

   tmpVal = test.getLength(in69);
   System.out.println("Output expected: " + out69 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out69;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in70 = "--";
   int out70 = 1;
   System.out.println("testing with input: ");
System.out.println(in70);
   test =  new FunnyFence();

   tmpVal = test.getLength(in70);
   System.out.println("Output expected: " + out70 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out70;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in71 = "|-||-|-|-|";
   int out71 = 7;
   System.out.println("testing with input: ");
System.out.println(in71);
   test =  new FunnyFence();

   tmpVal = test.getLength(in71);
   System.out.println("Output expected: " + out71 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out71;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in72 = "|-----|||-------||||||||-----------";
   int out72 = 2;
   System.out.println("testing with input: ");
System.out.println(in72);
   test =  new FunnyFence();

   tmpVal = test.getLength(in72);
   System.out.println("Output expected: " + out72 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out72;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in73 = "||||||";
   int out73 = 1;
   System.out.println("testing with input: ");
System.out.println(in73);
   test =  new FunnyFence();

   tmpVal = test.getLength(in73);
   System.out.println("Output expected: " + out73 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out73;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

   counter++; 
   String in74 = "|||||||";
   int out74 = 1;
   System.out.println("testing with input: ");
System.out.println(in74);
   test =  new FunnyFence();

   tmpVal = test.getLength(in74);
   System.out.println("Output expected: " + out74 + 
                      " Output recieved: " + tmpVal );
   result = tmpVal == out74;
    if (result) { mark++;}
    else{System.out.println("failed test");
 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
     return;}

 System.out.println("total_marks: " + mark);
 System.out.println("out_of: " + counter);
    }
}
