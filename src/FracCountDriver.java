import java.util.*;

public class FracCountDriver {
public static void main(String [] args){
FracCount test;
int mark = 0;
int counter = 0;
int tmpVal;
boolean result;
counter ++;
int in00 = 1;
int in01 = 2;
int out0 = 1;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in00, in01);
System.out.println("Output expected: " + out0 + " Output recieved: " + tmpVal );
result = tmpVal == out0;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in10 = 5;
int in11 = 6;
int out1 = 11;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in10, in11);
System.out.println("Output expected: " + out1 + " Output recieved: " + tmpVal );
result = tmpVal == out1;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in20 = 999;
int in21 = 1000;
int out2 = 304191;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in20, in21);
System.out.println("Output expected: " + out2 + " Output recieved: " + tmpVal );
result = tmpVal == out2;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in30 = 777;
int in31 = 778;
int out3 = 184139;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in30, in31);
System.out.println("Output expected: " + out3 + " Output recieved: " + tmpVal );
result = tmpVal == out3;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in40 = 12;
int in41 = 625;
int out4 = 118493;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in40, in41);
System.out.println("Output expected: " + out4 + " Output recieved: " + tmpVal );
result = tmpVal == out4;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in50 = 1;
int in51 = 111;
int out5 = 3716;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in50, in51);
System.out.println("Output expected: " + out5 + " Output recieved: " + tmpVal );
result = tmpVal == out5;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in60 = 1;
int in61 = 512;
int out6 = 79596;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in60, in61);
System.out.println("Output expected: " + out6 + " Output recieved: " + tmpVal );
result = tmpVal == out6;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in70 = 2;
int in71 = 889;
int out7 = 239959;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in70, in71);
System.out.println("Output expected: " + out7 + " Output recieved: " + tmpVal );
result = tmpVal == out7;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in80 = 2;
int in81 = 3;
int out8 = 3;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in80, in81);
System.out.println("Output expected: " + out8 + " Output recieved: " + tmpVal );
result = tmpVal == out8;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in90 = 2;
int in91 = 5;
int out9 = 7;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in90, in91);
System.out.println("Output expected: " + out9 + " Output recieved: " + tmpVal );
result = tmpVal == out9;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in100 = 37;
int in101 = 75;
int out10 = 1715;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in100, in101);
System.out.println("Output expected: " + out10 + " Output recieved: " + tmpVal );
result = tmpVal == out10;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in110 = 65;
int in111 = 72;
int out11 = 1585;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in110, in111);
System.out.println("Output expected: " + out11 + " Output recieved: " + tmpVal );
result = tmpVal == out11;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in120 = 13;
int in121 = 15;
int out12 = 70;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in120, in121);
System.out.println("Output expected: " + out12 + " Output recieved: " + tmpVal );
result = tmpVal == out12;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in130 = 81;
int in131 = 1000;
int out13 = 303824;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in130, in131);
System.out.println("Output expected: " + out13 + " Output recieved: " + tmpVal );
result = tmpVal == out13;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in140 = 16;
int in141 = 19;
int out14 = 117;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in140, in141);
System.out.println("Output expected: " + out14 + " Output recieved: " + tmpVal );
result = tmpVal == out14;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in150 = 1;
int in151 = 1000;
int out15 = 303792;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in150, in151);
System.out.println("Output expected: " + out15 + " Output recieved: " + tmpVal );
result = tmpVal == out15;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in160 = 805;
int in161 = 816;
int out16 = 202456;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in160, in161);
System.out.println("Output expected: " + out16 + " Output recieved: " + tmpVal );
result = tmpVal == out16;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in170 = 162;
int in171 = 421;
int out17 = 53817;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in170, in171);
System.out.println("Output expected: " + out17 + " Output recieved: " + tmpVal );
result = tmpVal == out17;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in180 = 501;
int in181 = 670;
int out18 = 136459;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in180, in181);
System.out.println("Output expected: " + out18 + " Output recieved: " + tmpVal );
result = tmpVal == out18;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in190 = 91;
int in191 = 116;
int out19 = 4115;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in190, in191);
System.out.println("Output expected: " + out19 + " Output recieved: " + tmpVal );
result = tmpVal == out19;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in200 = 174;
int in201 = 341;
int out20 = 35339;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in200, in201);
System.out.println("Output expected: " + out20 + " Output recieved: " + tmpVal );
result = tmpVal == out20;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in210 = 407;
int in211 = 504;
int out21 = 77316;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in210, in211);
System.out.println("Output expected: " + out21 + " Output recieved: " + tmpVal );
result = tmpVal == out21;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in220 = 599;
int in221 = 790;
int out22 = 189766;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in220, in221);
System.out.println("Output expected: " + out22 + " Output recieved: " + tmpVal );
result = tmpVal == out22;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in230 = 89;
int in231 = 915;
int out23 = 254296;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in230, in231);
System.out.println("Output expected: " + out23 + " Output recieved: " + tmpVal );
result = tmpVal == out23;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in240 = 113;
int in241 = 275;
int out24 = 22964;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in240, in241);
System.out.println("Output expected: " + out24 + " Output recieved: " + tmpVal );
result = tmpVal == out24;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in250 = 606;
int in251 = 947;
int out25 = 272697;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in250, in251);
System.out.println("Output expected: " + out25 + " Output recieved: " + tmpVal );
result = tmpVal == out25;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in260 = 100;
int in261 = 281;
int out26 = 23959;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in260, in261);
System.out.println("Output expected: " + out26 + " Output recieved: " + tmpVal );
result = tmpVal == out26;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in270 = 53;
int in271 = 445;
int out27 = 60046;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in270, in271);
System.out.println("Output expected: " + out27 + " Output recieved: " + tmpVal );
result = tmpVal == out27;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in280 = 386;
int in281 = 493;
int out28 = 74040;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in280, in281);
System.out.println("Output expected: " + out28 + " Output recieved: " + tmpVal );
result = tmpVal == out28;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in290 = 443;
int in291 = 511;
int out29 = 79537;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in290, in291);
System.out.println("Output expected: " + out29 + " Output recieved: " + tmpVal );
result = tmpVal == out29;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in300 = 221;
int in301 = 499;
int out30 = 75638;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in300, in301);
System.out.println("Output expected: " + out30 + " Output recieved: " + tmpVal );
result = tmpVal == out30;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in310 = 177;
int in311 = 466;
int out31 = 65958;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in310, in311);
System.out.println("Output expected: " + out31 + " Output recieved: " + tmpVal );
result = tmpVal == out31;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in320 = 159;
int in321 = 299;
int out32 = 27194;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in320, in321);
System.out.println("Output expected: " + out32 + " Output recieved: " + tmpVal );
result = tmpVal == out32;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in330 = 479;
int in331 = 806;
int out33 = 197404;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in330, in331);
System.out.println("Output expected: " + out33 + " Output recieved: " + tmpVal );
result = tmpVal == out33;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in340 = 136;
int in341 = 211;
int out34 = 13549;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in340, in341);
System.out.println("Output expected: " + out34 + " Output recieved: " + tmpVal );
result = tmpVal == out34;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in350 = 305;
int in351 = 313;
int out35 = 29940;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in350, in351);
System.out.println("Output expected: " + out35 + " Output recieved: " + tmpVal );
result = tmpVal == out35;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in360 = 20;
int in361 = 441;
int out36 = 58985;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in360, in361);
System.out.println("Output expected: " + out36 + " Output recieved: " + tmpVal );
result = tmpVal == out36;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in370 = 109;
int in371 = 452;
int out37 = 62088;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in370, in371);
System.out.println("Output expected: " + out37 + " Output recieved: " + tmpVal );
result = tmpVal == out37;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in380 = 25;
int in381 = 67;
int out38 = 1352;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in380, in381);
System.out.println("Output expected: " + out38 + " Output recieved: " + tmpVal );
result = tmpVal == out38;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in390 = 781;
int in391 = 801;
int out39 = 195264;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in390, in391);
System.out.println("Output expected: " + out39 + " Output recieved: " + tmpVal );
result = tmpVal == out39;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in400 = 77;
int in401 = 393;
int out40 = 46871;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in400, in401);
System.out.println("Output expected: " + out40 + " Output recieved: " + tmpVal );
result = tmpVal == out40;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in410 = 694;
int in411 = 921;
int out41 = 257984;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in410, in411);
System.out.println("Output expected: " + out41 + " Output recieved: " + tmpVal );
result = tmpVal == out41;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in420 = 37;
int in421 = 54;
int out42 = 894;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in420, in421);
System.out.println("Output expected: " + out42 + " Output recieved: " + tmpVal );
result = tmpVal == out42;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in430 = 104;
int in431 = 321;
int out43 = 31301;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in430, in431);
System.out.println("Output expected: " + out43 + " Output recieved: " + tmpVal );
result = tmpVal == out43;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in440 = 2;
int in441 = 5;
int out44 = 7;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in440, in441);
System.out.println("Output expected: " + out44 + " Output recieved: " + tmpVal );
result = tmpVal == out44;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in450 = 76;
int in451 = 837;
int out45 = 212648;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in450, in451);
System.out.println("Output expected: " + out45 + " Output recieved: " + tmpVal );
result = tmpVal == out45;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in460 = 227;
int in461 = 513;
int out46 = 79995;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in460, in461);
System.out.println("Output expected: " + out46 + " Output recieved: " + tmpVal );
result = tmpVal == out46;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in470 = 301;
int in471 = 349;
int out47 = 37162;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in470, in471);
System.out.println("Output expected: " + out47 + " Output recieved: " + tmpVal );
result = tmpVal == out47;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in480 = 23;
int in481 = 401;
int out48 = 48700;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in480, in481);
System.out.println("Output expected: " + out48 + " Output recieved: " + tmpVal );
result = tmpVal == out48;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in490 = 29;
int in491 = 591;
int out49 = 105969;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in490, in491);
System.out.println("Output expected: " + out49 + " Output recieved: " + tmpVal );
result = tmpVal == out49;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in500 = 330;
int in501 = 893;
int out50 = 242355;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in500, in501);
System.out.println("Output expected: " + out50 + " Output recieved: " + tmpVal );
result = tmpVal == out50;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in510 = 21;
int in511 = 68;
int out51 = 1403;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in510, in511);
System.out.println("Output expected: " + out51 + " Output recieved: " + tmpVal );
result = tmpVal == out51;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in520 = 7;
int in521 = 20;
int out52 = 122;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in520, in521);
System.out.println("Output expected: " + out52 + " Output recieved: " + tmpVal );
result = tmpVal == out52;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in530 = 79;
int in531 = 206;
int out53 = 12895;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in530, in531);
System.out.println("Output expected: " + out53 + " Output recieved: " + tmpVal );
result = tmpVal == out53;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in540 = 516;
int in541 = 583;
int out54 = 103496;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in540, in541);
System.out.println("Output expected: " + out54 + " Output recieved: " + tmpVal );
result = tmpVal == out54;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in550 = 209;
int in551 = 419;
int out55 = 53350;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in550, in551);
System.out.println("Output expected: " + out55 + " Output recieved: " + tmpVal );
result = tmpVal == out55;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in560 = 172;
int in561 = 855;
int out56 = 222030;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in560, in561);
System.out.println("Output expected: " + out56 + " Output recieved: " + tmpVal );
result = tmpVal == out56;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in570 = 183;
int in571 = 634;
int out57 = 122141;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in570, in571);
System.out.println("Output expected: " + out57 + " Output recieved: " + tmpVal );
result = tmpVal == out57;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in580 = 79;
int in581 = 251;
int out58 = 19102;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in580, in581);
System.out.println("Output expected: " + out58 + " Output recieved: " + tmpVal );
result = tmpVal == out58;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in590 = 233;
int in591 = 927;
int out59 = 261011;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in590, in591);
System.out.println("Output expected: " + out59 + " Output recieved: " + tmpVal );
result = tmpVal == out59;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in600 = 227;
int in601 = 642;
int out60 = 125252;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in600, in601);
System.out.println("Output expected: " + out60 + " Output recieved: " + tmpVal );
result = tmpVal == out60;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in610 = 467;
int in611 = 755;
int out61 = 173342;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in610, in611);
System.out.println("Output expected: " + out61 + " Output recieved: " + tmpVal );
result = tmpVal == out61;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in620 = 5;
int in621 = 16;
int out62 = 74;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in620, in621);
System.out.println("Output expected: " + out62 + " Output recieved: " + tmpVal );
result = tmpVal == out62;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in630 = 262;
int in631 = 945;
int out63 = 271359;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in630, in631);
System.out.println("Output expected: " + out63 + " Output recieved: " + tmpVal );
result = tmpVal == out63;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in640 = 283;
int in641 = 726;
int out64 = 160133;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in640, in641);
System.out.println("Output expected: " + out64 + " Output recieved: " + tmpVal );
result = tmpVal == out64;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in650 = 11;
int in651 = 14;
int out65 = 62;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in650, in651);
System.out.println("Output expected: " + out65 + " Output recieved: " + tmpVal );
result = tmpVal == out65;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in660 = 999;
int in661 = 1000;
int out66 = 304191;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in660, in661);
System.out.println("Output expected: " + out66 + " Output recieved: " + tmpVal );
result = tmpVal == out66;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in670 = 998;
int in671 = 999;
int out67 = 303791;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in670, in671);
System.out.println("Output expected: " + out67 + " Output recieved: " + tmpVal );
result = tmpVal == out67;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in680 = 101;
int in681 = 501;
int out68 = 76183;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in680, in681);
System.out.println("Output expected: " + out68 + " Output recieved: " + tmpVal );
result = tmpVal == out68;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in690 = 419;
int in691 = 600;
int out69 = 109451;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in690, in691);
System.out.println("Output expected: " + out69 + " Output recieved: " + tmpVal );
result = tmpVal == out69;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in700 = 119;
int in701 = 600;
int out70 = 109371;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in700, in701);
System.out.println("Output expected: " + out70 + " Output recieved: " + tmpVal );
result = tmpVal == out70;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in710 = 1;
int in711 = 3;
int out71 = 2;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in710, in711);
System.out.println("Output expected: " + out71 + " Output recieved: " + tmpVal );
result = tmpVal == out71;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int in720 = 2;
int in721 = 13;
int out72 = 47;
System.out.println("testing with input: ");
test = new FracCount();
tmpVal = test.position(in720, in721);
System.out.println("Output expected: " + out72 + " Output recieved: " + tmpVal );
result = tmpVal == out72;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
    }
}
