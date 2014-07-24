import java.util.*;

public class SlowKeyboardDriver {
public static void main(String [] args){
SlowKeyboard test;
int mark = 0;
int counter = 0;
int tmpVal;
boolean result;
counter ++;
String in00 = "59:56";
int out0 = 4;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in00);
System.out.println("Output expected: " + out0 + " Output recieved: " + tmpVal );
result = tmpVal == out0;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in10 = "59:59";
int out1 = 6;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in10);
System.out.println("Output expected: " + out1 + " Output recieved: " + tmpVal );
result = tmpVal == out1;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in20 = "00:00";
int out2 = 6;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in20);
System.out.println("Output expected: " + out2 + " Output recieved: " + tmpVal );
result = tmpVal == out2;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in30 = "00:56";
int out3 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in30);
System.out.println("Output expected: " + out3 + " Output recieved: " + tmpVal );
result = tmpVal == out3;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in40 = "12:13";
int out4 = 8;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in40);
System.out.println("Output expected: " + out4 + " Output recieved: " + tmpVal );
result = tmpVal == out4;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in50 = "12:34";
int out5 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in50);
System.out.println("Output expected: " + out5 + " Output recieved: " + tmpVal );
result = tmpVal == out5;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in60 = "33:12";
int out6 = 8;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in60);
System.out.println("Output expected: " + out6 + " Output recieved: " + tmpVal );
result = tmpVal == out6;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in70 = "49:18";
int out7 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in70);
System.out.println("Output expected: " + out7 + " Output recieved: " + tmpVal );
result = tmpVal == out7;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in80 = "10:23";
int out8 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in80);
System.out.println("Output expected: " + out8 + " Output recieved: " + tmpVal );
result = tmpVal == out8;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in90 = "02:37";
int out9 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in90);
System.out.println("Output expected: " + out9 + " Output recieved: " + tmpVal );
result = tmpVal == out9;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in100 = "02:22";
int out10 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in100);
System.out.println("Output expected: " + out10 + " Output recieved: " + tmpVal );
result = tmpVal == out10;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in110 = "01:55";
int out11 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in110);
System.out.println("Output expected: " + out11 + " Output recieved: " + tmpVal );
result = tmpVal == out11;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in120 = "02:41";
int out12 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in120);
System.out.println("Output expected: " + out12 + " Output recieved: " + tmpVal );
result = tmpVal == out12;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in130 = "43:47";
int out13 = 8;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in130);
System.out.println("Output expected: " + out13 + " Output recieved: " + tmpVal );
result = tmpVal == out13;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in140 = "14:29";
int out14 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in140);
System.out.println("Output expected: " + out14 + " Output recieved: " + tmpVal );
result = tmpVal == out14;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in150 = "24:39";
int out15 = 8;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in150);
System.out.println("Output expected: " + out15 + " Output recieved: " + tmpVal );
result = tmpVal == out15;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in160 = "33:46";
int out16 = 8;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in160);
System.out.println("Output expected: " + out16 + " Output recieved: " + tmpVal );
result = tmpVal == out16;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in170 = "16:35";
int out17 = 9;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in170);
System.out.println("Output expected: " + out17 + " Output recieved: " + tmpVal );
result = tmpVal == out17;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in180 = "50:45";
int out18 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in180);
System.out.println("Output expected: " + out18 + " Output recieved: " + tmpVal );
result = tmpVal == out18;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in190 = "29:29";
int out19 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in190);
System.out.println("Output expected: " + out19 + " Output recieved: " + tmpVal );
result = tmpVal == out19;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in200 = "41:47";
int out20 = 8;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in200);
System.out.println("Output expected: " + out20 + " Output recieved: " + tmpVal );
result = tmpVal == out20;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in210 = "01:39";
int out21 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in210);
System.out.println("Output expected: " + out21 + " Output recieved: " + tmpVal );
result = tmpVal == out21;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in220 = "15:51";
int out22 = 8;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in220);
System.out.println("Output expected: " + out22 + " Output recieved: " + tmpVal );
result = tmpVal == out22;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in230 = "44:08";
int out23 = 8;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in230);
System.out.println("Output expected: " + out23 + " Output recieved: " + tmpVal );
result = tmpVal == out23;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in240 = "02:48";
int out24 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in240);
System.out.println("Output expected: " + out24 + " Output recieved: " + tmpVal );
result = tmpVal == out24;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in250 = "50:54";
int out25 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in250);
System.out.println("Output expected: " + out25 + " Output recieved: " + tmpVal );
result = tmpVal == out25;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in260 = "20:48";
int out26 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in260);
System.out.println("Output expected: " + out26 + " Output recieved: " + tmpVal );
result = tmpVal == out26;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in270 = "17:47";
int out27 = 8;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in270);
System.out.println("Output expected: " + out27 + " Output recieved: " + tmpVal );
result = tmpVal == out27;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in280 = "41:04";
int out28 = 7;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in280);
System.out.println("Output expected: " + out28 + " Output recieved: " + tmpVal );
result = tmpVal == out28;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in290 = "32:00";
int out29 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in290);
System.out.println("Output expected: " + out29 + " Output recieved: " + tmpVal );
result = tmpVal == out29;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in300 = "45:10";
int out30 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in300);
System.out.println("Output expected: " + out30 + " Output recieved: " + tmpVal );
result = tmpVal == out30;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in310 = "58:41";
int out31 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in310);
System.out.println("Output expected: " + out31 + " Output recieved: " + tmpVal );
result = tmpVal == out31;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in320 = "23:03";
int out32 = 8;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in320);
System.out.println("Output expected: " + out32 + " Output recieved: " + tmpVal );
result = tmpVal == out32;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in330 = "44:43";
int out33 = 6;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in330);
System.out.println("Output expected: " + out33 + " Output recieved: " + tmpVal );
result = tmpVal == out33;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in340 = "51:30";
int out34 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in340);
System.out.println("Output expected: " + out34 + " Output recieved: " + tmpVal );
result = tmpVal == out34;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in350 = "58:26";
int out35 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in350);
System.out.println("Output expected: " + out35 + " Output recieved: " + tmpVal );
result = tmpVal == out35;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in360 = "39:45";
int out36 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in360);
System.out.println("Output expected: " + out36 + " Output recieved: " + tmpVal );
result = tmpVal == out36;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in370 = "21:27";
int out37 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in370);
System.out.println("Output expected: " + out37 + " Output recieved: " + tmpVal );
result = tmpVal == out37;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in380 = "51:32";
int out38 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in380);
System.out.println("Output expected: " + out38 + " Output recieved: " + tmpVal );
result = tmpVal == out38;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in390 = "43:49";
int out39 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in390);
System.out.println("Output expected: " + out39 + " Output recieved: " + tmpVal );
result = tmpVal == out39;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in400 = "48:13";
int out40 = 9;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in400);
System.out.println("Output expected: " + out40 + " Output recieved: " + tmpVal );
result = tmpVal == out40;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in410 = "58:30";
int out41 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in410);
System.out.println("Output expected: " + out41 + " Output recieved: " + tmpVal );
result = tmpVal == out41;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in420 = "01:01";
int out42 = 9;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in420);
System.out.println("Output expected: " + out42 + " Output recieved: " + tmpVal );
result = tmpVal == out42;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in430 = "34:51";
int out43 = 9;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in430);
System.out.println("Output expected: " + out43 + " Output recieved: " + tmpVal );
result = tmpVal == out43;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in440 = "40:12";
int out44 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in440);
System.out.println("Output expected: " + out44 + " Output recieved: " + tmpVal );
result = tmpVal == out44;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in450 = "44:22";
int out45 = 8;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in450);
System.out.println("Output expected: " + out45 + " Output recieved: " + tmpVal );
result = tmpVal == out45;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in460 = "29:18";
int out46 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in460);
System.out.println("Output expected: " + out46 + " Output recieved: " + tmpVal );
result = tmpVal == out46;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in470 = "48:40";
int out47 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in470);
System.out.println("Output expected: " + out47 + " Output recieved: " + tmpVal );
result = tmpVal == out47;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in480 = "04:29";
int out48 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in480);
System.out.println("Output expected: " + out48 + " Output recieved: " + tmpVal );
result = tmpVal == out48;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in490 = "59:27";
int out49 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in490);
System.out.println("Output expected: " + out49 + " Output recieved: " + tmpVal );
result = tmpVal == out49;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in500 = "48:11";
int out50 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in500);
System.out.println("Output expected: " + out50 + " Output recieved: " + tmpVal );
result = tmpVal == out50;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in510 = "32:50";
int out51 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in510);
System.out.println("Output expected: " + out51 + " Output recieved: " + tmpVal );
result = tmpVal == out51;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in520 = "22:15";
int out52 = 6;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in520);
System.out.println("Output expected: " + out52 + " Output recieved: " + tmpVal );
result = tmpVal == out52;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in530 = "47:56";
int out53 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in530);
System.out.println("Output expected: " + out53 + " Output recieved: " + tmpVal );
result = tmpVal == out53;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in540 = "05:47";
int out54 = 8;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in540);
System.out.println("Output expected: " + out54 + " Output recieved: " + tmpVal );
result = tmpVal == out54;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in550 = "27:45";
int out55 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in550);
System.out.println("Output expected: " + out55 + " Output recieved: " + tmpVal );
result = tmpVal == out55;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in560 = "59:14";
int out56 = 8;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in560);
System.out.println("Output expected: " + out56 + " Output recieved: " + tmpVal );
result = tmpVal == out56;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in570 = "37:42";
int out57 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in570);
System.out.println("Output expected: " + out57 + " Output recieved: " + tmpVal );
result = tmpVal == out57;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in580 = "47:26";
int out58 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in580);
System.out.println("Output expected: " + out58 + " Output recieved: " + tmpVal );
result = tmpVal == out58;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in590 = "02:47";
int out59 = 8;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in590);
System.out.println("Output expected: " + out59 + " Output recieved: " + tmpVal );
result = tmpVal == out59;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in600 = "20:18";
int out60 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in600);
System.out.println("Output expected: " + out60 + " Output recieved: " + tmpVal );
result = tmpVal == out60;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in610 = "15:40";
int out61 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in610);
System.out.println("Output expected: " + out61 + " Output recieved: " + tmpVal );
result = tmpVal == out61;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in620 = "15:39";
int out62 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in620);
System.out.println("Output expected: " + out62 + " Output recieved: " + tmpVal );
result = tmpVal == out62;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in630 = "23:53";
int out63 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in630);
System.out.println("Output expected: " + out63 + " Output recieved: " + tmpVal );
result = tmpVal == out63;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in640 = "50:57";
int out64 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in640);
System.out.println("Output expected: " + out64 + " Output recieved: " + tmpVal );
result = tmpVal == out64;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in650 = "29:35";
int out65 = 9;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in650);
System.out.println("Output expected: " + out65 + " Output recieved: " + tmpVal );
result = tmpVal == out65;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in660 = "07:17";
int out66 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in660);
System.out.println("Output expected: " + out66 + " Output recieved: " + tmpVal );
result = tmpVal == out66;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in670 = "40:11";
int out67 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in670);
System.out.println("Output expected: " + out67 + " Output recieved: " + tmpVal );
result = tmpVal == out67;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in680 = "27:03";
int out68 = 8;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in680);
System.out.println("Output expected: " + out68 + " Output recieved: " + tmpVal );
result = tmpVal == out68;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in690 = "38:02";
int out69 = 9;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in690);
System.out.println("Output expected: " + out69 + " Output recieved: " + tmpVal );
result = tmpVal == out69;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in700 = "54:02";
int out70 = 9;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in700);
System.out.println("Output expected: " + out70 + " Output recieved: " + tmpVal );
result = tmpVal == out70;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in710 = "30:19";
int out71 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in710);
System.out.println("Output expected: " + out71 + " Output recieved: " + tmpVal );
result = tmpVal == out71;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in720 = "02:33";
int out72 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in720);
System.out.println("Output expected: " + out72 + " Output recieved: " + tmpVal );
result = tmpVal == out72;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in730 = "42:07";
int out73 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in730);
System.out.println("Output expected: " + out73 + " Output recieved: " + tmpVal );
result = tmpVal == out73;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in740 = "53:12";
int out74 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in740);
System.out.println("Output expected: " + out74 + " Output recieved: " + tmpVal );
result = tmpVal == out74;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in750 = "07:15";
int out75 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in750);
System.out.println("Output expected: " + out75 + " Output recieved: " + tmpVal );
result = tmpVal == out75;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in760 = "24:43";
int out76 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in760);
System.out.println("Output expected: " + out76 + " Output recieved: " + tmpVal );
result = tmpVal == out76;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in770 = "48:28";
int out77 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in770);
System.out.println("Output expected: " + out77 + " Output recieved: " + tmpVal );
result = tmpVal == out77;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in780 = "35:08";
int out78 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in780);
System.out.println("Output expected: " + out78 + " Output recieved: " + tmpVal );
result = tmpVal == out78;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in790 = "42:25";
int out79 = 8;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in790);
System.out.println("Output expected: " + out79 + " Output recieved: " + tmpVal );
result = tmpVal == out79;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in800 = "06:11";
int out80 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in800);
System.out.println("Output expected: " + out80 + " Output recieved: " + tmpVal );
result = tmpVal == out80;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in810 = "30:36";
int out81 = 8;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in810);
System.out.println("Output expected: " + out81 + " Output recieved: " + tmpVal );
result = tmpVal == out81;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in820 = "00:56";
int out82 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in820);
System.out.println("Output expected: " + out82 + " Output recieved: " + tmpVal );
result = tmpVal == out82;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in830 = "19:48";
int out83 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in830);
System.out.println("Output expected: " + out83 + " Output recieved: " + tmpVal );
result = tmpVal == out83;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in840 = "35:08";
int out84 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in840);
System.out.println("Output expected: " + out84 + " Output recieved: " + tmpVal );
result = tmpVal == out84;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in850 = "11:53";
int out85 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in850);
System.out.println("Output expected: " + out85 + " Output recieved: " + tmpVal );
result = tmpVal == out85;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in860 = "39:28";
int out86 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in860);
System.out.println("Output expected: " + out86 + " Output recieved: " + tmpVal );
result = tmpVal == out86;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in870 = "19:25";
int out87 = 8;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in870);
System.out.println("Output expected: " + out87 + " Output recieved: " + tmpVal );
result = tmpVal == out87;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in880 = "50:43";
int out88 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in880);
System.out.println("Output expected: " + out88 + " Output recieved: " + tmpVal );
result = tmpVal == out88;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in890 = "05:20";
int out89 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in890);
System.out.println("Output expected: " + out89 + " Output recieved: " + tmpVal );
result = tmpVal == out89;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in900 = "33:06";
int out90 = 8;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in900);
System.out.println("Output expected: " + out90 + " Output recieved: " + tmpVal );
result = tmpVal == out90;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in910 = "14:13";
int out91 = 9;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in910);
System.out.println("Output expected: " + out91 + " Output recieved: " + tmpVal );
result = tmpVal == out91;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in920 = "40:34";
int out92 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in920);
System.out.println("Output expected: " + out92 + " Output recieved: " + tmpVal );
result = tmpVal == out92;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in930 = "05:17";
int out93 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in930);
System.out.println("Output expected: " + out93 + " Output recieved: " + tmpVal );
result = tmpVal == out93;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in940 = "31:44";
int out94 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in940);
System.out.println("Output expected: " + out94 + " Output recieved: " + tmpVal );
result = tmpVal == out94;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in950 = "20:29";
int out95 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in950);
System.out.println("Output expected: " + out95 + " Output recieved: " + tmpVal );
result = tmpVal == out95;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in960 = "41:43";
int out96 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in960);
System.out.println("Output expected: " + out96 + " Output recieved: " + tmpVal );
result = tmpVal == out96;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in970 = "16:53";
int out97 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in970);
System.out.println("Output expected: " + out97 + " Output recieved: " + tmpVal );
result = tmpVal == out97;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in980 = "43:55";
int out98 = 8;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in980);
System.out.println("Output expected: " + out98 + " Output recieved: " + tmpVal );
result = tmpVal == out98;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in990 = "22:07";
int out99 = 8;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in990);
System.out.println("Output expected: " + out99 + " Output recieved: " + tmpVal );
result = tmpVal == out99;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1000 = "49:36";
int out100 = 8;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in1000);
System.out.println("Output expected: " + out100 + " Output recieved: " + tmpVal );
result = tmpVal == out100;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1010 = "20:19";
int out101 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in1010);
System.out.println("Output expected: " + out101 + " Output recieved: " + tmpVal );
result = tmpVal == out101;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1020 = "02:21";
int out102 = 8;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in1020);
System.out.println("Output expected: " + out102 + " Output recieved: " + tmpVal );
result = tmpVal == out102;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1030 = "27:16";
int out103 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in1030);
System.out.println("Output expected: " + out103 + " Output recieved: " + tmpVal );
result = tmpVal == out103;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1040 = "29:41";
int out104 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in1040);
System.out.println("Output expected: " + out104 + " Output recieved: " + tmpVal );
result = tmpVal == out104;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1050 = "24:58";
int out105 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in1050);
System.out.println("Output expected: " + out105 + " Output recieved: " + tmpVal );
result = tmpVal == out105;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1060 = "22:58";
int out106 = 10;
System.out.println("testing with input: ");
test = new SlowKeyboard();
tmpVal = test.enterTime(in1060);
System.out.println("Output expected: " + out106 + " Output recieved: " + tmpVal );
result = tmpVal == out106;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
    }
}
