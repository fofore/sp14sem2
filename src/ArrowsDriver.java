public class ArrowsDriver {
public static void main(String [] args){
Arrows test;
int mark = 0;
int counter = 0;
int tmpVal;
boolean result;
counter ++;
String in00 = "<--->--==>";
int out0 = 4;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in00);
System.out.println("Output expected: " + out0 + " Output recieved: " + tmpVal );
result = tmpVal == out0;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in10 = "<<<<<<<<<<";
int out1 = 1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in10);
System.out.println("Output expected: " + out1 + " Output recieved: " + tmpVal );
result = tmpVal == out1;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in20 = "----==-";
int out2 = -1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in20);
System.out.println("Output expected: " + out2 + " Output recieved: " + tmpVal );
result = tmpVal == out2;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in30 = "<----=====>";
int out3 = 6;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in30);
System.out.println("Output expected: " + out3 + " Output recieved: " + tmpVal );
result = tmpVal == out3;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in40 = ">----=====<";
int out4 = 1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in40);
System.out.println("Output expected: " + out4 + " Output recieved: " + tmpVal );
result = tmpVal == out4;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in50 = "=========>";
int out5 = 10;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in50);
System.out.println("Output expected: " + out5 + " Output recieved: " + tmpVal );
result = tmpVal == out5;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in60 = "<---";
int out6 = 4;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in60);
System.out.println("Output expected: " + out6 + " Output recieved: " + tmpVal );
result = tmpVal == out6;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in70 = "<==============================";
int out7 = 31;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in70);
System.out.println("Output expected: " + out7 + " Output recieved: " + tmpVal );
result = tmpVal == out7;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in80 = "---------------------------------------->";
int out8 = 41;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in80);
System.out.println("Output expected: " + out8 + " Output recieved: " + tmpVal );
result = tmpVal == out8;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in90 = "<-==>";
int out9 = 3;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in90);
System.out.println("Output expected: " + out9 + " Output recieved: " + tmpVal );
result = tmpVal == out9;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in100 = "<=-->";
int out10 = 3;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in100);
System.out.println("Output expected: " + out10 + " Output recieved: " + tmpVal );
result = tmpVal == out10;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in110 = "->==>";
int out11 = 3;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in110);
System.out.println("Output expected: " + out11 + " Output recieved: " + tmpVal );
result = tmpVal == out11;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in120 = "=>-->---------------------";
int out12 = 3;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in120);
System.out.println("Output expected: " + out12 + " Output recieved: " + tmpVal );
result = tmpVal == out12;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in130 = "=><--";
int out13 = 3;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in130);
System.out.println("Output expected: " + out13 + " Output recieved: " + tmpVal );
result = tmpVal == out13;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in140 = "=><==->------<-======->====<-===";
int out14 = 3;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in140);
System.out.println("Output expected: " + out14 + " Output recieved: " + tmpVal );
result = tmpVal == out14;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in150 = "-><--<<<<>----------==================<=->";
int out15 = 3;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in150);
System.out.println("Output expected: " + out15 + " Output recieved: " + tmpVal );
result = tmpVal == out15;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in160 = "-><==-------------------------=>";
int out16 = 3;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in160);
System.out.println("Output expected: " + out16 + " Output recieved: " + tmpVal );
result = tmpVal == out16;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in170 = "<=<--<><><<<<<<<-><<<<<<-<->";
int out17 = 3;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in170);
System.out.println("Output expected: " + out17 + " Output recieved: " + tmpVal );
result = tmpVal == out17;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in180 = "<-<--<<<<<<<->>>>>>>>>>";
int out18 = 3;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in180);
System.out.println("Output expected: " + out18 + " Output recieved: " + tmpVal );
result = tmpVal == out18;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in190 = "<-<==<>>>>>>>>>>";
int out19 = 3;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in190);
System.out.println("Output expected: " + out19 + " Output recieved: " + tmpVal );
result = tmpVal == out19;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in200 = "<=<==<<<<<<<<<<";
int out20 = 3;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in200);
System.out.println("Output expected: " + out20 + " Output recieved: " + tmpVal );
result = tmpVal == out20;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in210 = "-";
int out21 = -1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in210);
System.out.println("Output expected: " + out21 + " Output recieved: " + tmpVal );
result = tmpVal == out21;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in220 = "=";
int out22 = -1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in220);
System.out.println("Output expected: " + out22 + " Output recieved: " + tmpVal );
result = tmpVal == out22;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in230 = "<";
int out23 = 1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in230);
System.out.println("Output expected: " + out23 + " Output recieved: " + tmpVal );
result = tmpVal == out23;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in240 = ">";
int out24 = 1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in240);
System.out.println("Output expected: " + out24 + " Output recieved: " + tmpVal );
result = tmpVal == out24;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in250 = "-=-<-<=><>=>=>>==->><>>-<>=>==-<=->=<<-->--><<-<==";
int out25 = 3;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in250);
System.out.println("Output expected: " + out25 + " Output recieved: " + tmpVal );
result = tmpVal == out25;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in260 = "<-<->--=-<=<<--===--<-=-=->>><<-<=<>==>>>=>>>-<--<";
int out26 = 3;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in260);
System.out.println("Output expected: " + out26 + " Output recieved: " + tmpVal );
result = tmpVal == out26;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in270 = ">=<";
int out27 = 1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in270);
System.out.println("Output expected: " + out27 + " Output recieved: " + tmpVal );
result = tmpVal == out27;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in280 = "->----=-<===->>=<=>--<-=";
int out28 = 4;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in280);
System.out.println("Output expected: " + out28 + " Output recieved: " + tmpVal );
result = tmpVal == out28;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in290 = ">==--=><=-><><<>==-=>=<=<>>=>=<---<=><--=-==<==>-";
int out29 = 4;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in290);
System.out.println("Output expected: " + out29 + " Output recieved: " + tmpVal );
result = tmpVal == out29;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in300 = "-<-><-<=<<<><=<----><-=><-=->-==<<=-<-<";
int out30 = 5;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in300);
System.out.println("Output expected: " + out30 + " Output recieved: " + tmpVal );
result = tmpVal == out30;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in310 = "<<-<><->=-=-======>=<<<>>-<=<>";
int out31 = 7;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in310);
System.out.println("Output expected: " + out31 + " Output recieved: " + tmpVal );
result = tmpVal == out31;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in320 = "<-<==<=->>>>><<--<<<<<--===<<<<>>=<->--><-<><---<>";
int out32 = 4;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in320);
System.out.println("Output expected: " + out32 + " Output recieved: " + tmpVal );
result = tmpVal == out32;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in330 = "<-<-->>---><<=<>=<->>-<<-<>>>><>>-==";
int out33 = 4;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in330);
System.out.println("Output expected: " + out33 + " Output recieved: " + tmpVal );
result = tmpVal == out33;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in340 = "<->>-->>->=-<=-<=-<<-<<>==<=-==<<-->=<";
int out34 = 3;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in340);
System.out.println("Output expected: " + out34 + " Output recieved: " + tmpVal );
result = tmpVal == out34;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in350 = "=<>--=<<><><<--=--->-<-<=<->>---->=<<<<--->-<<<=-";
int out35 = 5;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in350);
System.out.println("Output expected: " + out35 + " Output recieved: " + tmpVal );
result = tmpVal == out35;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in360 = "==>>===-<-<---<==<-=-=->==---->->==-=>---===-==->>";
int out36 = 5;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in360);
System.out.println("Output expected: " + out36 + " Output recieved: " + tmpVal );
result = tmpVal == out36;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in370 = "<--=<>-=<--<--=->=-=---==-=<--->><==-===>=";
int out37 = 4;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in370);
System.out.println("Output expected: " + out37 + " Output recieved: " + tmpVal );
result = tmpVal == out37;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in380 = "=-==---======-><=-==<--=<=--=-====>===->";
int out38 = 5;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in380);
System.out.println("Output expected: " + out38 + " Output recieved: " + tmpVal );
result = tmpVal == out38;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in390 = "-==>-<--=<=---<>---=<=<=-=-<--=<-====-=---=>>=-=>";
int out39 = 3;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in390);
System.out.println("Output expected: " + out39 + " Output recieved: " + tmpVal );
result = tmpVal == out39;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in400 = "-=-===<=<=-<<>--->=<><=-=<-=--=->=";
int out40 = 4;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in400);
System.out.println("Output expected: " + out40 + " Output recieved: " + tmpVal );
result = tmpVal == out40;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in410 = "==<>>==<->--===->>=>-=<-====<=>><><<====><>===<=>>";
int out41 = 5;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in410);
System.out.println("Output expected: " + out41 + " Output recieved: " + tmpVal );
result = tmpVal == out41;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in420 = "===-<=";
int out42 = 2;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in420);
System.out.println("Output expected: " + out42 + " Output recieved: " + tmpVal );
result = tmpVal == out42;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in430 = "<-=<=>>>->>==>=<===><===>==-==><==-=<>-=>===-=";
int out43 = 4;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in430);
System.out.println("Output expected: " + out43 + " Output recieved: " + tmpVal );
result = tmpVal == out43;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in440 = "<=>==<====--<=>=>>-=>==>===-=<====-==-<>-<=<====<";
int out44 = 5;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in440);
System.out.println("Output expected: " + out44 + " Output recieved: " + tmpVal );
result = tmpVal == out44;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in450 = "-<==><>=";
int out45 = 3;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in450);
System.out.println("Output expected: " + out45 + " Output recieved: " + tmpVal );
result = tmpVal == out45;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in460 = ">>--<-<-----=-=-=--<>->--==>-<-<--<------<------<>";
int out46 = 7;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in460);
System.out.println("Output expected: " + out46 + " Output recieved: " + tmpVal );
result = tmpVal == out46;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in470 = "-=-<==-->>=<--><-<-<-==->--";
int out47 = 3;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in470);
System.out.println("Output expected: " + out47 + " Output recieved: " + tmpVal );
result = tmpVal == out47;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in480 = "--=->--=----<-=-<-";
int out48 = 2;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in480);
System.out.println("Output expected: " + out48 + " Output recieved: " + tmpVal );
result = tmpVal == out48;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in490 = "---<->>=----=-->=>-<=---->->=-<>-=><-->=--->>----";
int out49 = 5;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in490);
System.out.println("Output expected: " + out49 + " Output recieved: " + tmpVal );
result = tmpVal == out49;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in500 = "=----=<--<=-<-";
int out50 = 3;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in500);
System.out.println("Output expected: " + out50 + " Output recieved: " + tmpVal );
result = tmpVal == out50;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in510 = "============================================>===>-";
int out51 = 45;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in510);
System.out.println("Output expected: " + out51 + " Output recieved: " + tmpVal );
result = tmpVal == out51;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in520 = "----=<=>-><-------=>======><-";
int out52 = 8;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in520);
System.out.println("Output expected: " + out52 + " Output recieved: " + tmpVal );
result = tmpVal == out52;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in530 = "==>><=";
int out53 = 3;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in530);
System.out.println("Output expected: " + out53 + " Output recieved: " + tmpVal );
result = tmpVal == out53;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in540 = "===========================================<===--";
int out54 = 4;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in540);
System.out.println("Output expected: " + out54 + " Output recieved: " + tmpVal );
result = tmpVal == out54;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in550 = "-------------->->=====----------<=========<>";
int out55 = 15;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in550);
System.out.println("Output expected: " + out55 + " Output recieved: " + tmpVal );
result = tmpVal == out55;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in560 = "--------========<---<-------=-<----<---<<=---<===<";
int out56 = 8;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in560);
System.out.println("Output expected: " + out56 + " Output recieved: " + tmpVal );
result = tmpVal == out56;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in570 = "<====<-=";
int out57 = 5;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in570);
System.out.println("Output expected: " + out57 + " Output recieved: " + tmpVal );
result = tmpVal == out57;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in580 = "=======>>---><";
int out58 = 8;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in580);
System.out.println("Output expected: " + out58 + " Output recieved: " + tmpVal );
result = tmpVal == out58;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in590 = "<===================================>==<-----<>=<";
int out59 = 36;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in590);
System.out.println("Output expected: " + out59 + " Output recieved: " + tmpVal );
result = tmpVal == out59;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in600 = "---------<--<--------<==>";
int out60 = 9;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in600);
System.out.println("Output expected: " + out60 + " Output recieved: " + tmpVal );
result = tmpVal == out60;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in610 = "====================>--------->===================";
int out61 = 21;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in610);
System.out.println("Output expected: " + out61 + " Output recieved: " + tmpVal );
result = tmpVal == out61;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in620 = "=====>----";
int out62 = 6;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in620);
System.out.println("Output expected: " + out62 + " Output recieved: " + tmpVal );
result = tmpVal == out62;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in630 = "========";
int out63 = -1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in630);
System.out.println("Output expected: " + out63 + " Output recieved: " + tmpVal );
result = tmpVal == out63;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in640 = "<==============================================<<";
int out64 = 47;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in640);
System.out.println("Output expected: " + out64 + " Output recieved: " + tmpVal );
result = tmpVal == out64;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in650 = "<==========================<>====";
int out65 = 27;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in650);
System.out.println("Output expected: " + out65 + " Output recieved: " + tmpVal );
result = tmpVal == out65;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in660 = "-------------";
int out66 = -1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in660);
System.out.println("Output expected: " + out66 + " Output recieved: " + tmpVal );
result = tmpVal == out66;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in670 = "----------------------=========================---";
int out67 = -1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in670);
System.out.println("Output expected: " + out67 + " Output recieved: " + tmpVal );
result = tmpVal == out67;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in680 = "-----===------------=================--==---";
int out68 = -1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in680);
System.out.println("Output expected: " + out68 + " Output recieved: " + tmpVal );
result = tmpVal == out68;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in690 = "================---------------------------====";
int out69 = -1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in690);
System.out.println("Output expected: " + out69 + " Output recieved: " + tmpVal );
result = tmpVal == out69;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in700 = "------------------==========================-===-";
int out70 = -1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in700);
System.out.println("Output expected: " + out70 + " Output recieved: " + tmpVal );
result = tmpVal == out70;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in710 = "===---=--";
int out71 = -1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in710);
System.out.println("Output expected: " + out71 + " Output recieved: " + tmpVal );
result = tmpVal == out71;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in720 = "<<<>>>><><<<<>><<>><<<<>><>>><<<>>>><><<<<<>>><>>>";
int out72 = 1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in720);
System.out.println("Output expected: " + out72 + " Output recieved: " + tmpVal );
result = tmpVal == out72;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in730 = "><<><<<<><>><>>><<<>><>><><><><<>><<<<<<><<><><><>";
int out73 = 1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in730);
System.out.println("Output expected: " + out73 + " Output recieved: " + tmpVal );
result = tmpVal == out73;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in740 = "=================================================>";
int out74 = 50;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in740);
System.out.println("Output expected: " + out74 + " Output recieved: " + tmpVal );
result = tmpVal == out74;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in750 = "<=================================================";
int out75 = 50;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in750);
System.out.println("Output expected: " + out75 + " Output recieved: " + tmpVal );
result = tmpVal == out75;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in760 = "------------------------------------------------->";
int out76 = 50;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in760);
System.out.println("Output expected: " + out76 + " Output recieved: " + tmpVal );
result = tmpVal == out76;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in770 = "<-------------------------------------------------";
int out77 = 50;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in770);
System.out.println("Output expected: " + out77 + " Output recieved: " + tmpVal );
result = tmpVal == out77;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in780 = "<";
int out78 = 1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in780);
System.out.println("Output expected: " + out78 + " Output recieved: " + tmpVal );
result = tmpVal == out78;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in790 = ">-";
int out79 = 1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in790);
System.out.println("Output expected: " + out79 + " Output recieved: " + tmpVal );
result = tmpVal == out79;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in800 = "-";
int out80 = -1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in800);
System.out.println("Output expected: " + out80 + " Output recieved: " + tmpVal );
result = tmpVal == out80;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in810 = ">";
int out81 = 1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in810);
System.out.println("Output expected: " + out81 + " Output recieved: " + tmpVal );
result = tmpVal == out81;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in820 = "-<===";
int out82 = 4;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in820);
System.out.println("Output expected: " + out82 + " Output recieved: " + tmpVal );
result = tmpVal == out82;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in830 = "<------------";
int out83 = 13;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in830);
System.out.println("Output expected: " + out83 + " Output recieved: " + tmpVal );
result = tmpVal == out83;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in840 = "---<--";
int out84 = 3;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in840);
System.out.println("Output expected: " + out84 + " Output recieved: " + tmpVal );
result = tmpVal == out84;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in850 = ">>";
int out85 = 1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in850);
System.out.println("Output expected: " + out85 + " Output recieved: " + tmpVal );
result = tmpVal == out85;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in860 = "---------------<--";
int out86 = 3;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in860);
System.out.println("Output expected: " + out86 + " Output recieved: " + tmpVal );
result = tmpVal == out86;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in870 = "<-->--------";
int out87 = 3;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in870);
System.out.println("Output expected: " + out87 + " Output recieved: " + tmpVal );
result = tmpVal == out87;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in880 = "<-";
int out88 = 2;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in880);
System.out.println("Output expected: " + out88 + " Output recieved: " + tmpVal );
result = tmpVal == out88;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in890 = "<---->--";
int out89 = 5;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in890);
System.out.println("Output expected: " + out89 + " Output recieved: " + tmpVal );
result = tmpVal == out89;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in900 = "<-------------------------";
int out90 = 26;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in900);
System.out.println("Output expected: " + out90 + " Output recieved: " + tmpVal );
result = tmpVal == out90;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in910 = "<<-";
int out91 = 2;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in910);
System.out.println("Output expected: " + out91 + " Output recieved: " + tmpVal );
result = tmpVal == out91;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in920 = "<>-";
int out92 = 1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in920);
System.out.println("Output expected: " + out92 + " Output recieved: " + tmpVal );
result = tmpVal == out92;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in930 = ">=====";
int out93 = 1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in930);
System.out.println("Output expected: " + out93 + " Output recieved: " + tmpVal );
result = tmpVal == out93;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in940 = "<--==------";
int out94 = 3;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in940);
System.out.println("Output expected: " + out94 + " Output recieved: " + tmpVal );
result = tmpVal == out94;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in950 = "=><---------";
int out95 = 10;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in950);
System.out.println("Output expected: " + out95 + " Output recieved: " + tmpVal );
result = tmpVal == out95;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in960 = ">--";
int out96 = 1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in960);
System.out.println("Output expected: " + out96 + " Output recieved: " + tmpVal );
result = tmpVal == out96;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in970 = "<=<==<===<====<=====<======<=======<==============";
int out97 = 15;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in970);
System.out.println("Output expected: " + out97 + " Output recieved: " + tmpVal );
result = tmpVal == out97;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in980 = "----==-";
int out98 = -1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in980);
System.out.println("Output expected: " + out98 + " Output recieved: " + tmpVal );
result = tmpVal == out98;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in990 = "<>====";
int out99 = 1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in990);
System.out.println("Output expected: " + out99 + " Output recieved: " + tmpVal );
result = tmpVal == out99;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1000 = "--<";
int out100 = 1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in1000);
System.out.println("Output expected: " + out100 + " Output recieved: " + tmpVal );
result = tmpVal == out100;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1010 = "----<";
int out101 = 1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in1010);
System.out.println("Output expected: " + out101 + " Output recieved: " + tmpVal );
result = tmpVal == out101;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1020 = "=============->";
int out102 = 2;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in1020);
System.out.println("Output expected: " + out102 + " Output recieved: " + tmpVal );
result = tmpVal == out102;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1030 = "<>";
int out103 = 1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in1030);
System.out.println("Output expected: " + out103 + " Output recieved: " + tmpVal );
result = tmpVal == out103;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1040 = "<------";
int out104 = 7;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in1040);
System.out.println("Output expected: " + out104 + " Output recieved: " + tmpVal );
result = tmpVal == out104;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1050 = "<-----------------------------------------";
int out105 = 42;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in1050);
System.out.println("Output expected: " + out105 + " Output recieved: " + tmpVal );
result = tmpVal == out105;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1060 = "<---<";
int out106 = 4;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in1060);
System.out.println("Output expected: " + out106 + " Output recieved: " + tmpVal );
result = tmpVal == out106;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1070 = "<<<<<<<<<<";
int out107 = 1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in1070);
System.out.println("Output expected: " + out107 + " Output recieved: " + tmpVal );
result = tmpVal == out107;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1080 = "<--";
int out108 = 3;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in1080);
System.out.println("Output expected: " + out108 + " Output recieved: " + tmpVal );
result = tmpVal == out108;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1090 = ">---";
int out109 = 1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in1090);
System.out.println("Output expected: " + out109 + " Output recieved: " + tmpVal );
result = tmpVal == out109;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1100 = "<-======";
int out110 = 2;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in1100);
System.out.println("Output expected: " + out110 + " Output recieved: " + tmpVal );
result = tmpVal == out110;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1110 = "----------------<";
int out111 = 1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in1110);
System.out.println("Output expected: " + out111 + " Output recieved: " + tmpVal );
result = tmpVal == out111;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1120 = "-<===---==--==->=======------------============-=";
int out112 = 4;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in1120);
System.out.println("Output expected: " + out112 + " Output recieved: " + tmpVal );
result = tmpVal == out112;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1130 = "-->";
int out113 = 3;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in1130);
System.out.println("Output expected: " + out113 + " Output recieved: " + tmpVal );
result = tmpVal == out113;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1140 = "<--=>";
int out114 = 3;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in1140);
System.out.println("Output expected: " + out114 + " Output recieved: " + tmpVal );
result = tmpVal == out114;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1150 = "---<";
int out115 = 1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in1150);
System.out.println("Output expected: " + out115 + " Output recieved: " + tmpVal );
result = tmpVal == out115;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1160 = "=>";
int out116 = 2;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in1160);
System.out.println("Output expected: " + out116 + " Output recieved: " + tmpVal );
result = tmpVal == out116;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1170 = ">-------";
int out117 = 1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in1170);
System.out.println("Output expected: " + out117 + " Output recieved: " + tmpVal );
result = tmpVal == out117;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1180 = "<<<----==--===--->><<<--<<--<<-->>>";
int out118 = 5;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in1180);
System.out.println("Output expected: " + out118 + " Output recieved: " + tmpVal );
result = tmpVal == out118;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1190 = "<><-><---><-=--><<>><><-<->--<<-<-";
int out119 = 4;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in1190);
System.out.println("Output expected: " + out119 + " Output recieved: " + tmpVal );
result = tmpVal == out119;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1200 = ">=========";
int out120 = 1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in1200);
System.out.println("Output expected: " + out120 + " Output recieved: " + tmpVal );
result = tmpVal == out120;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1210 = ">-----";
int out121 = 1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in1210);
System.out.println("Output expected: " + out121 + " Output recieved: " + tmpVal );
result = tmpVal == out121;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1220 = "<>>>>";
int out122 = 1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in1220);
System.out.println("Output expected: " + out122 + " Output recieved: " + tmpVal );
result = tmpVal == out122;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1230 = "<===========";
int out123 = 12;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in1230);
System.out.println("Output expected: " + out123 + " Output recieved: " + tmpVal );
result = tmpVal == out123;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1240 = "<-=-=-=-=-=-=--=-=-=";
int out124 = 2;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in1240);
System.out.println("Output expected: " + out124 + " Output recieved: " + tmpVal );
result = tmpVal == out124;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1250 = "<======";
int out125 = 7;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in1250);
System.out.println("Output expected: " + out125 + " Output recieved: " + tmpVal );
result = tmpVal == out125;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1260 = "-----<";
int out126 = 1;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in1260);
System.out.println("Output expected: " + out126 + " Output recieved: " + tmpVal );
result = tmpVal == out126;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1270 = "<==";
int out127 = 3;
System.out.println("testing with input: ");
test = new Arrows();
tmpVal = test.longestArrow(in1270);
System.out.println("Output expected: " + out127 + " Output recieved: " + tmpVal );
result = tmpVal == out127;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
    }
}
