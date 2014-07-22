public class SpecialDayDriver {
public static void main(String [] args){
SpecialDay test;
int mark = 0;
int counter = 0;
int tmpVal;
boolean result;
counter ++;
String in00 = "THURSDAY";
int in01 = 4;
String in02 = "NOVEMBER";
int in03 = 23;
int out0 = 14;
System.out.println("testing with input: ");
System.out.println(in00 + in01 + in02 + in03);
test = new SpecialDay();
tmpVal = test.howMany(in00, in01, in02, in03);
System.out.println("Output expected: " + out0 + " Output recieved: " + tmpVal );
result = tmpVal == out0;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in10 = "MONDAY";
int in11 = 1;
String in12 = "SEPTEMBER";
int in13 = 2;
int out1 = 14;
System.out.println("testing with input: ");
System.out.println(in10 + in11 + in12 + in13);
test = new SpecialDay();
tmpVal = test.howMany(in10, in11, in12, in13);
System.out.println("Output expected: " + out1 + " Output recieved: " + tmpVal );
result = tmpVal == out1;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in20 = "SUNDAY";
int in21 = 2;
String in22 = "MAY";
int in23 = 13;
int out2 = 15;
System.out.println("testing with input: ");
System.out.println(in20 + in21 + in22 + in23);
test = new SpecialDay();
tmpVal = test.howMany(in20, in21, in22, in23);
System.out.println("Output expected: " + out2 + " Output recieved: " + tmpVal );
result = tmpVal == out2;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in30 = "SUNDAY";
int in31 = 3;
String in32 = "JUNE";
int in33 = 18;
int out3 = 14;
System.out.println("testing with input: ");
System.out.println(in30 + in31 + in32 + in33);
test = new SpecialDay();
tmpVal = test.howMany(in30, in31, in32, in33);
System.out.println("Output expected: " + out3 + " Output recieved: " + tmpVal );
result = tmpVal == out3;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in40 = "MONDAY";
int in41 = 3;
String in42 = "JANUARY";
int in43 = 16;
int out4 = 14;
System.out.println("testing with input: ");
System.out.println(in40 + in41 + in42 + in43);
test = new SpecialDay();
tmpVal = test.howMany(in40, in41, in42, in43);
System.out.println("Output expected: " + out4 + " Output recieved: " + tmpVal );
result = tmpVal == out4;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in50 = "MONDAY";
int in51 = 3;
String in52 = "APRIL";
int in53 = 15;
int out5 = 14;
System.out.println("testing with input: ");
System.out.println(in50 + in51 + in52 + in53);
test = new SpecialDay();
tmpVal = test.howMany(in50, in51, in52, in53);
System.out.println("Output expected: " + out5 + " Output recieved: " + tmpVal );
result = tmpVal == out5;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in60 = "TUESDAY";
int in61 = 5;
String in62 = "FEBRUARY";
int in63 = 29;
int out6 = 4;
System.out.println("testing with input: ");
System.out.println(in60 + in61 + in62 + in63);
test = new SpecialDay();
tmpVal = test.howMany(in60, in61, in62, in63);
System.out.println("Output expected: " + out6 + " Output recieved: " + tmpVal );
result = tmpVal == out6;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in70 = "MONDAY";
int in71 = 2;
String in72 = "OCTOBER";
int in73 = 6;
int out7 = 0;
System.out.println("testing with input: ");
System.out.println(in70 + in71 + in72 + in73);
test = new SpecialDay();
tmpVal = test.howMany(in70, in71, in72, in73);
System.out.println("Output expected: " + out7 + " Output recieved: " + tmpVal );
result = tmpVal == out7;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in80 = "THURSDAY";
int in81 = 3;
String in82 = "OCTOBER";
int in83 = 20;
int out8 = 14;
System.out.println("testing with input: ");
System.out.println(in80 + in81 + in82 + in83);
test = new SpecialDay();
tmpVal = test.howMany(in80, in81, in82, in83);
System.out.println("Output expected: " + out8 + " Output recieved: " + tmpVal );
result = tmpVal == out8;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in90 = "MONDAY";
int in91 = 5;
String in92 = "FEBRUARY";
int in93 = 29;
int out9 = 3;
System.out.println("testing with input: ");
System.out.println(in90 + in91 + in92 + in93);
test = new SpecialDay();
tmpVal = test.howMany(in90, in91, in92, in93);
System.out.println("Output expected: " + out9 + " Output recieved: " + tmpVal );
result = tmpVal == out9;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in100 = "SUNDAY";
int in101 = 1;
String in102 = "JANUARY";
int in103 = 1;
int out10 = 14;
System.out.println("testing with input: ");
System.out.println(in100 + in101 + in102 + in103);
test = new SpecialDay();
tmpVal = test.howMany(in100, in101, in102, in103);
System.out.println("Output expected: " + out10 + " Output recieved: " + tmpVal );
result = tmpVal == out10;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in110 = "MONDAY";
int in111 = 1;
String in112 = "FEBRUARY";
int in113 = 2;
int out11 = 15;
System.out.println("testing with input: ");
System.out.println(in110 + in111 + in112 + in113);
test = new SpecialDay();
tmpVal = test.howMany(in110, in111, in112, in113);
System.out.println("Output expected: " + out11 + " Output recieved: " + tmpVal );
result = tmpVal == out11;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in120 = "TUESDAY";
int in121 = 1;
String in122 = "MARCH";
int in123 = 3;
int out12 = 14;
System.out.println("testing with input: ");
System.out.println(in120 + in121 + in122 + in123);
test = new SpecialDay();
tmpVal = test.howMany(in120, in121, in122, in123);
System.out.println("Output expected: " + out12 + " Output recieved: " + tmpVal );
result = tmpVal == out12;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in130 = "WEDNESDAY";
int in131 = 1;
String in132 = "APRIL";
int in133 = 4;
int out13 = 15;
System.out.println("testing with input: ");
System.out.println(in130 + in131 + in132 + in133);
test = new SpecialDay();
tmpVal = test.howMany(in130, in131, in132, in133);
System.out.println("Output expected: " + out13 + " Output recieved: " + tmpVal );
result = tmpVal == out13;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in140 = "THURSDAY";
int in141 = 1;
String in142 = "MAY";
int in143 = 5;
int out14 = 14;
System.out.println("testing with input: ");
System.out.println(in140 + in141 + in142 + in143);
test = new SpecialDay();
tmpVal = test.howMany(in140, in141, in142, in143);
System.out.println("Output expected: " + out14 + " Output recieved: " + tmpVal );
result = tmpVal == out14;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in150 = "FRIDAY";
int in151 = 1;
String in152 = "JUNE";
int in153 = 6;
int out15 = 15;
System.out.println("testing with input: ");
System.out.println(in150 + in151 + in152 + in153);
test = new SpecialDay();
tmpVal = test.howMany(in150, in151, in152, in153);
System.out.println("Output expected: " + out15 + " Output recieved: " + tmpVal );
result = tmpVal == out15;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in160 = "SATURDAY";
int in161 = 1;
String in162 = "JULY";
int in163 = 7;
int out16 = 15;
System.out.println("testing with input: ");
System.out.println(in160 + in161 + in162 + in163);
test = new SpecialDay();
tmpVal = test.howMany(in160, in161, in162, in163);
System.out.println("Output expected: " + out16 + " Output recieved: " + tmpVal );
result = tmpVal == out16;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in170 = "SUNDAY";
int in171 = 2;
String in172 = "AUGUST";
int in173 = 8;
int out17 = 15;
System.out.println("testing with input: ");
System.out.println(in170 + in171 + in172 + in173);
test = new SpecialDay();
tmpVal = test.howMany(in170, in171, in172, in173);
System.out.println("Output expected: " + out17 + " Output recieved: " + tmpVal );
result = tmpVal == out17;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in180 = "MONDAY";
int in181 = 2;
String in182 = "SEPTEMBER";
int in183 = 9;
int out18 = 14;
System.out.println("testing with input: ");
System.out.println(in180 + in181 + in182 + in183);
test = new SpecialDay();
tmpVal = test.howMany(in180, in181, in182, in183);
System.out.println("Output expected: " + out18 + " Output recieved: " + tmpVal );
result = tmpVal == out18;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in190 = "TUESDAY";
int in191 = 2;
String in192 = "OCTOBER";
int in193 = 10;
int out19 = 14;
System.out.println("testing with input: ");
System.out.println(in190 + in191 + in192 + in193);
test = new SpecialDay();
tmpVal = test.howMany(in190, in191, in192, in193);
System.out.println("Output expected: " + out19 + " Output recieved: " + tmpVal );
result = tmpVal == out19;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in200 = "WEDNESDAY";
int in201 = 2;
String in202 = "NOVEMBER";
int in203 = 11;
int out20 = 14;
System.out.println("testing with input: ");
System.out.println(in200 + in201 + in202 + in203);
test = new SpecialDay();
tmpVal = test.howMany(in200, in201, in202, in203);
System.out.println("Output expected: " + out20 + " Output recieved: " + tmpVal );
result = tmpVal == out20;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in210 = "THURSDAY";
int in211 = 2;
String in212 = "DECEMBER";
int in213 = 12;
int out21 = 14;
System.out.println("testing with input: ");
System.out.println(in210 + in211 + in212 + in213);
test = new SpecialDay();
tmpVal = test.howMany(in210, in211, in212, in213);
System.out.println("Output expected: " + out21 + " Output recieved: " + tmpVal );
result = tmpVal == out21;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in220 = "FRIDAY";
int in221 = 2;
String in222 = "JANUARY";
int in223 = 13;
int out22 = 14;
System.out.println("testing with input: ");
System.out.println(in220 + in221 + in222 + in223);
test = new SpecialDay();
tmpVal = test.howMany(in220, in221, in222, in223);
System.out.println("Output expected: " + out22 + " Output recieved: " + tmpVal );
result = tmpVal == out22;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in230 = "SATURDAY";
int in231 = 2;
String in232 = "FEBRUARY";
int in233 = 14;
int out23 = 15;
System.out.println("testing with input: ");
System.out.println(in230 + in231 + in232 + in233);
test = new SpecialDay();
tmpVal = test.howMany(in230, in231, in232, in233);
System.out.println("Output expected: " + out23 + " Output recieved: " + tmpVal );
result = tmpVal == out23;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in240 = "SUNDAY";
int in241 = 3;
String in242 = "MARCH";
int in243 = 15;
int out24 = 14;
System.out.println("testing with input: ");
System.out.println(in240 + in241 + in242 + in243);
test = new SpecialDay();
tmpVal = test.howMany(in240, in241, in242, in243);
System.out.println("Output expected: " + out24 + " Output recieved: " + tmpVal );
result = tmpVal == out24;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in250 = "MONDAY";
int in251 = 3;
String in252 = "APRIL";
int in253 = 16;
int out25 = 15;
System.out.println("testing with input: ");
System.out.println(in250 + in251 + in252 + in253);
test = new SpecialDay();
tmpVal = test.howMany(in250, in251, in252, in253);
System.out.println("Output expected: " + out25 + " Output recieved: " + tmpVal );
result = tmpVal == out25;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in260 = "TUESDAY";
int in261 = 3;
String in262 = "MAY";
int in263 = 17;
int out26 = 14;
System.out.println("testing with input: ");
System.out.println(in260 + in261 + in262 + in263);
test = new SpecialDay();
tmpVal = test.howMany(in260, in261, in262, in263);
System.out.println("Output expected: " + out26 + " Output recieved: " + tmpVal );
result = tmpVal == out26;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in270 = "WEDNESDAY";
int in271 = 3;
String in272 = "JUNE";
int in273 = 18;
int out27 = 15;
System.out.println("testing with input: ");
System.out.println(in270 + in271 + in272 + in273);
test = new SpecialDay();
tmpVal = test.howMany(in270, in271, in272, in273);
System.out.println("Output expected: " + out27 + " Output recieved: " + tmpVal );
result = tmpVal == out27;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in280 = "THURSDAY";
int in281 = 3;
String in282 = "JULY";
int in283 = 19;
int out28 = 15;
System.out.println("testing with input: ");
System.out.println(in280 + in281 + in282 + in283);
test = new SpecialDay();
tmpVal = test.howMany(in280, in281, in282, in283);
System.out.println("Output expected: " + out28 + " Output recieved: " + tmpVal );
result = tmpVal == out28;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in290 = "FRIDAY";
int in291 = 3;
String in292 = "AUGUST";
int in293 = 20;
int out29 = 15;
System.out.println("testing with input: ");
System.out.println(in290 + in291 + in292 + in293);
test = new SpecialDay();
tmpVal = test.howMany(in290, in291, in292, in293);
System.out.println("Output expected: " + out29 + " Output recieved: " + tmpVal );
result = tmpVal == out29;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in300 = "SATURDAY";
int in301 = 3;
String in302 = "SEPTEMBER";
int in303 = 21;
int out30 = 14;
System.out.println("testing with input: ");
System.out.println(in300 + in301 + in302 + in303);
test = new SpecialDay();
tmpVal = test.howMany(in300, in301, in302, in303);
System.out.println("Output expected: " + out30 + " Output recieved: " + tmpVal );
result = tmpVal == out30;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in310 = "SUNDAY";
int in311 = 4;
String in312 = "OCTOBER";
int in313 = 22;
int out31 = 14;
System.out.println("testing with input: ");
System.out.println(in310 + in311 + in312 + in313);
test = new SpecialDay();
tmpVal = test.howMany(in310, in311, in312, in313);
System.out.println("Output expected: " + out31 + " Output recieved: " + tmpVal );
result = tmpVal == out31;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in320 = "MONDAY";
int in321 = 4;
String in322 = "NOVEMBER";
int in323 = 23;
int out32 = 14;
System.out.println("testing with input: ");
System.out.println(in320 + in321 + in322 + in323);
test = new SpecialDay();
tmpVal = test.howMany(in320, in321, in322, in323);
System.out.println("Output expected: " + out32 + " Output recieved: " + tmpVal );
result = tmpVal == out32;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in330 = "TUESDAY";
int in331 = 4;
String in332 = "DECEMBER";
int in333 = 24;
int out33 = 14;
System.out.println("testing with input: ");
System.out.println(in330 + in331 + in332 + in333);
test = new SpecialDay();
tmpVal = test.howMany(in330, in331, in332, in333);
System.out.println("Output expected: " + out33 + " Output recieved: " + tmpVal );
result = tmpVal == out33;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in340 = "WEDNESDAY";
int in341 = 4;
String in342 = "JANUARY";
int in343 = 25;
int out34 = 14;
System.out.println("testing with input: ");
System.out.println(in340 + in341 + in342 + in343);
test = new SpecialDay();
tmpVal = test.howMany(in340, in341, in342, in343);
System.out.println("Output expected: " + out34 + " Output recieved: " + tmpVal );
result = tmpVal == out34;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in350 = "THURSDAY";
int in351 = 4;
String in352 = "FEBRUARY";
int in353 = 26;
int out35 = 15;
System.out.println("testing with input: ");
System.out.println(in350 + in351 + in352 + in353);
test = new SpecialDay();
tmpVal = test.howMany(in350, in351, in352, in353);
System.out.println("Output expected: " + out35 + " Output recieved: " + tmpVal );
result = tmpVal == out35;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in360 = "FRIDAY";
int in361 = 4;
String in362 = "MARCH";
int in363 = 27;
int out36 = 14;
System.out.println("testing with input: ");
System.out.println(in360 + in361 + in362 + in363);
test = new SpecialDay();
tmpVal = test.howMany(in360, in361, in362, in363);
System.out.println("Output expected: " + out36 + " Output recieved: " + tmpVal );
result = tmpVal == out36;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in370 = "SATURDAY";
int in371 = 4;
String in372 = "APRIL";
int in373 = 28;
int out37 = 15;
System.out.println("testing with input: ");
System.out.println(in370 + in371 + in372 + in373);
test = new SpecialDay();
tmpVal = test.howMany(in370, in371, in372, in373);
System.out.println("Output expected: " + out37 + " Output recieved: " + tmpVal );
result = tmpVal == out37;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in380 = "SUNDAY";
int in381 = 5;
String in382 = "MAY";
int in383 = 29;
int out38 = 14;
System.out.println("testing with input: ");
System.out.println(in380 + in381 + in382 + in383);
test = new SpecialDay();
tmpVal = test.howMany(in380, in381, in382, in383);
System.out.println("Output expected: " + out38 + " Output recieved: " + tmpVal );
result = tmpVal == out38;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in390 = "MONDAY";
int in391 = 5;
String in392 = "JUNE";
int in393 = 30;
int out39 = 15;
System.out.println("testing with input: ");
System.out.println(in390 + in391 + in392 + in393);
test = new SpecialDay();
tmpVal = test.howMany(in390, in391, in392, in393);
System.out.println("Output expected: " + out39 + " Output recieved: " + tmpVal );
result = tmpVal == out39;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in400 = "TUESDAY";
int in401 = 5;
String in402 = "JULY";
int in403 = 31;
int out40 = 15;
System.out.println("testing with input: ");
System.out.println(in400 + in401 + in402 + in403);
test = new SpecialDay();
tmpVal = test.howMany(in400, in401, in402, in403);
System.out.println("Output expected: " + out40 + " Output recieved: " + tmpVal );
result = tmpVal == out40;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in410 = "MONDAY";
int in411 = 4;
String in412 = "FEBRUARY";
int in413 = 2;
int out41 = 0;
System.out.println("testing with input: ");
System.out.println(in410 + in411 + in412 + in413);
test = new SpecialDay();
tmpVal = test.howMany(in410, in411, in412, in413);
System.out.println("Output expected: " + out41 + " Output recieved: " + tmpVal );
result = tmpVal == out41;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in420 = "SATURDAY";
int in421 = 1;
String in422 = "SEPTEMBER";
int in423 = 18;
int out42 = 0;
System.out.println("testing with input: ");
System.out.println(in420 + in421 + in422 + in423);
test = new SpecialDay();
tmpVal = test.howMany(in420, in421, in422, in423);
System.out.println("Output expected: " + out42 + " Output recieved: " + tmpVal );
result = tmpVal == out42;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in430 = "TUESDAY";
int in431 = 3;
String in432 = "OCTOBER";
int in433 = 27;
int out43 = 0;
System.out.println("testing with input: ");
System.out.println(in430 + in431 + in432 + in433);
test = new SpecialDay();
tmpVal = test.howMany(in430, in431, in432, in433);
System.out.println("Output expected: " + out43 + " Output recieved: " + tmpVal );
result = tmpVal == out43;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in440 = "THURSDAY";
int in441 = 4;
String in442 = "DECEMBER";
int in443 = 28;
int out44 = 14;
System.out.println("testing with input: ");
System.out.println(in440 + in441 + in442 + in443);
test = new SpecialDay();
tmpVal = test.howMany(in440, in441, in442, in443);
System.out.println("Output expected: " + out44 + " Output recieved: " + tmpVal );
result = tmpVal == out44;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in450 = "SATURDAY";
int in451 = 5;
String in452 = "JANUARY";
int in453 = 29;
int out45 = 15;
System.out.println("testing with input: ");
System.out.println(in450 + in451 + in452 + in453);
test = new SpecialDay();
tmpVal = test.howMany(in450, in451, in452, in453);
System.out.println("Output expected: " + out45 + " Output recieved: " + tmpVal );
result = tmpVal == out45;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in460 = "MONDAY";
int in461 = 4;
String in462 = "FEBRUARY";
int in463 = 28;
int out46 = 15;
System.out.println("testing with input: ");
System.out.println(in460 + in461 + in462 + in463);
test = new SpecialDay();
tmpVal = test.howMany(in460, in461, in462, in463);
System.out.println("Output expected: " + out46 + " Output recieved: " + tmpVal );
result = tmpVal == out46;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in470 = "FRIDAY";
int in471 = 1;
String in472 = "JANUARY";
int in473 = 1;
int out47 = 14;
System.out.println("testing with input: ");
System.out.println(in470 + in471 + in472 + in473);
test = new SpecialDay();
tmpVal = test.howMany(in470, in471, in472, in473);
System.out.println("Output expected: " + out47 + " Output recieved: " + tmpVal );
result = tmpVal == out47;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in480 = "FRIDAY";
int in481 = 5;
String in482 = "FEBRUARY";
int in483 = 29;
int out48 = 4;
System.out.println("testing with input: ");
System.out.println(in480 + in481 + in482 + in483);
test = new SpecialDay();
tmpVal = test.howMany(in480, in481, in482, in483);
System.out.println("Output expected: " + out48 + " Output recieved: " + tmpVal );
result = tmpVal == out48;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in490 = "MONDAY";
int in491 = 4;
String in492 = "FEBRUARY";
int in493 = 29;
int out49 = 0;
System.out.println("testing with input: ");
System.out.println(in490 + in491 + in492 + in493);
test = new SpecialDay();
tmpVal = test.howMany(in490, in491, in492, in493);
System.out.println("Output expected: " + out49 + " Output recieved: " + tmpVal );
result = tmpVal == out49;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in500 = "MONDAY";
int in501 = 1;
String in502 = "MARCH";
int in503 = 1;
int out50 = 15;
System.out.println("testing with input: ");
System.out.println(in500 + in501 + in502 + in503);
test = new SpecialDay();
tmpVal = test.howMany(in500, in501, in502, in503);
System.out.println("Output expected: " + out50 + " Output recieved: " + tmpVal );
result = tmpVal == out50;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in510 = "SUNDAY";
int in511 = 2;
String in512 = "MAY";
int in513 = 13;
int out51 = 15;
System.out.println("testing with input: ");
System.out.println(in510 + in511 + in512 + in513);
test = new SpecialDay();
tmpVal = test.howMany(in510, in511, in512, in513);
System.out.println("Output expected: " + out51 + " Output recieved: " + tmpVal );
result = tmpVal == out51;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in520 = "SATURDAY";
int in521 = 1;
String in522 = "SEPTEMBER";
int in523 = 4;
int out52 = 15;
System.out.println("testing with input: ");
System.out.println(in520 + in521 + in522 + in523);
test = new SpecialDay();
tmpVal = test.howMany(in520, in521, in522, in523);
System.out.println("Output expected: " + out52 + " Output recieved: " + tmpVal );
result = tmpVal == out52;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
    }
}
