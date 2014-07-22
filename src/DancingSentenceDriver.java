public class DancingSentenceDriver {
public static void main(String [] args){
DancingSentence test;
int mark = 0;
int counter = 0;
String tmpVal;
boolean result;
counter ++;
String in00 = "This is a dancing sentence";
String out0 = "ThIs Is A dAnCiNg SeNtEnCe";
System.out.println("testing with input: ");
System.out.println(in00);
test = new DancingSentence();
tmpVal = test.makeDancing(in00);
System.out.println("Output expected: " + out0 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out0);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in10 = " This is a dancing sentence ";
String out1 = " ThIs Is A dAnCiNg SeNtEnCe ";
System.out.println("testing with input: ");
System.out.println(in10);
test = new DancingSentence();
tmpVal = test.makeDancing(in10);
System.out.println("Output expected: " + out1 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out1);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in20 = "aaaaaaaaaaa";
String out2 = "AaAaAaAaAaA";
System.out.println("testing with input: ");
System.out.println(in20);
test = new DancingSentence();
tmpVal = test.makeDancing(in20);
System.out.println("Output expected: " + out2 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out2);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in30 = "z";
String out3 = "Z";
System.out.println("testing with input: ");
System.out.println(in30);
test = new DancingSentence();
tmpVal = test.makeDancing(in30);
System.out.println("Output expected: " + out3 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out3);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in40 = " a";
String out4 = " A";
System.out.println("testing with input: ");
System.out.println(in40);
test = new DancingSentence();
tmpVal = test.makeDancing(in40);
System.out.println("Output expected: " + out4 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out4);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in50 = " A";
String out5 = " A";
System.out.println("testing with input: ");
System.out.println(in50);
test = new DancingSentence();
tmpVal = test.makeDancing(in50);
System.out.println("Output expected: " + out5 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out5);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in60 = "a ";
String out6 = "A ";
System.out.println("testing with input: ");
System.out.println(in60);
test = new DancingSentence();
tmpVal = test.makeDancing(in60);
System.out.println("Output expected: " + out6 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out6);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in70 = "A ";
String out7 = "A ";
System.out.println("testing with input: ");
System.out.println(in70);
test = new DancingSentence();
tmpVal = test.makeDancing(in70);
System.out.println("Output expected: " + out7 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out7);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in80 = " z ";
String out8 = " Z ";
System.out.println("testing with input: ");
System.out.println(in80);
test = new DancingSentence();
tmpVal = test.makeDancing(in80);
System.out.println("Output expected: " + out8 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out8);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in90 = " Z ";
String out9 = " Z ";
System.out.println("testing with input: ");
System.out.println(in90);
test = new DancingSentence();
tmpVal = test.makeDancing(in90);
System.out.println("Output expected: " + out9 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out9);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in100 = " z ";
String out10 = " Z ";
System.out.println("testing with input: ");
System.out.println(in100);
test = new DancingSentence();
tmpVal = test.makeDancing(in100);
System.out.println("Output expected: " + out10 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out10);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in110 = " Z ";
String out11 = " Z ";
System.out.println("testing with input: ");
System.out.println(in110);
test = new DancingSentence();
tmpVal = test.makeDancing(in110);
System.out.println("Output expected: " + out11 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out11);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in120 = "r";
String out12 = "R";
System.out.println("testing with input: ");
System.out.println(in120);
test = new DancingSentence();
tmpVal = test.makeDancing(in120);
System.out.println("Output expected: " + out12 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out12);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in130 = "R";
String out13 = "R";
System.out.println("testing with input: ");
System.out.println(in130);
test = new DancingSentence();
tmpVal = test.makeDancing(in130);
System.out.println("Output expected: " + out13 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out13);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in140 = "rr";
String out14 = "Rr";
System.out.println("testing with input: ");
System.out.println(in140);
test = new DancingSentence();
tmpVal = test.makeDancing(in140);
System.out.println("Output expected: " + out14 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out14);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in150 = "rR";
String out15 = "Rr";
System.out.println("testing with input: ");
System.out.println(in150);
test = new DancingSentence();
tmpVal = test.makeDancing(in150);
System.out.println("Output expected: " + out15 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out15);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in160 = "Rr";
String out16 = "Rr";
System.out.println("testing with input: ");
System.out.println(in160);
test = new DancingSentence();
tmpVal = test.makeDancing(in160);
System.out.println("Output expected: " + out16 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out16);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in170 = "RR";
String out17 = "Rr";
System.out.println("testing with input: ");
System.out.println(in170);
test = new DancingSentence();
tmpVal = test.makeDancing(in170);
System.out.println("Output expected: " + out17 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out17);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in180 = "RRR";
String out18 = "RrR";
System.out.println("testing with input: ");
System.out.println(in180);
test = new DancingSentence();
tmpVal = test.makeDancing(in180);
System.out.println("Output expected: " + out18 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out18);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in190 = "FMzLNyIR FeOdTaKBzPIkple hrVtuwR d kmXfBSGRazmtJC";
String out19 = "FmZlNyIr FeOdTaKbZpIkPlE hRvTuWr D kMxFbSgRaZmTjC";
System.out.println("testing with input: ");
System.out.println(in190);
test = new DancingSentence();
tmpVal = test.makeDancing(in190);
System.out.println("Output expected: " + out19 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out19);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in200 = "fl dFnxhBkmvUh";
String out20 = "Fl DfNxHbKmVuH";
System.out.println("testing with input: ");
System.out.println(in200);
test = new DancingSentence();
tmpVal = test.makeDancing(in200);
System.out.println("Output expected: " + out20 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out20);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in210 = "FciDhA EjJZVsg DClylMYvJ BxXQuw fD CeYx spbZ h";
String out21 = "FcIdHa EjJzVsG dClYlMyVj BxXqUw Fd CeYx SpBz H";
System.out.println("testing with input: ");
System.out.println(in210);
test = new DancingSentence();
tmpVal = test.makeDancing(in210);
System.out.println("Output expected: " + out21 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out21);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in220 = "CqEgtDu IGeEuci";
String out22 = "CqEgTdU iGeEuCi";
System.out.println("testing with input: ");
System.out.println(in220);
test = new DancingSentence();
tmpVal = test.makeDancing(in220);
System.out.println("Output expected: " + out22 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out22);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in230 = "tY eycWSY Oqpz ";
String out23 = "Ty EyCwSy OqPz ";
System.out.println("testing with input: ");
System.out.println(in230);
test = new DancingSentence();
tmpVal = test.makeDancing(in230);
System.out.println("Output expected: " + out23 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out23);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in240 = "tLJvR yraZDPyQQHc";
String out24 = "TlJvR yRaZdPyQqHc";
System.out.println("testing with input: ");
System.out.println(in240);
test = new DancingSentence();
tmpVal = test.makeDancing(in240);
System.out.println("Output expected: " + out24 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out24);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in250 = "cplwPppFIUvhCHCaTFmdVHAf";
String out25 = "CpLwPpPfIuVhChCaTfMdVhAf";
System.out.println("testing with input: ");
System.out.println(in250);
test = new DancingSentence();
tmpVal = test.makeDancing(in250);
System.out.println("Output expected: " + out25 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out25);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in260 = "jAfWhqgQtXGFsnSHOm mGNeiGAg njekasM ";
String out26 = "JaFwHqGqTxGfSnShOm MgNeIgAg NjEkAsM ";
System.out.println("testing with input: ");
System.out.println(in260);
test = new DancingSentence();
tmpVal = test.makeDancing(in260);
System.out.println("Output expected: " + out26 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out26);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in270 = "lkrBYRZ hHsCR SzI teDjiIFyc IYGyUZY nc EbntX";
String out27 = "LkRbYrZ hHsCr SzI tEdJiIfYc IyGyUzY nC eBnTx";
System.out.println("testing with input: ");
System.out.println(in270);
test = new DancingSentence();
tmpVal = test.makeDancing(in270);
System.out.println("Output expected: " + out27 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out27);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in280 = " HDUehUGk xZgOcXOulrYScFm VDLB DiWV";
String out28 = " HdUeHuGk XzGoCxOuLrYsCfM vDlB dIwV";
System.out.println("testing with input: ");
System.out.println(in280);
test = new DancingSentence();
tmpVal = test.makeDancing(in280);
System.out.println("Output expected: " + out28 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out28);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in290 = "IEHAQBFfRHkK";
String out29 = "IeHaQbFfRhKk";
System.out.println("testing with input: ");
System.out.println(in290);
test = new DancingSentence();
tmpVal = test.makeDancing(in290);
System.out.println("Output expected: " + out29 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out29);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in300 = "Vy RGSpMfdMOiXEg uit";
String out30 = "Vy RgSpMfDmOiXeG uIt";
System.out.println("testing with input: ");
System.out.println(in300);
test = new DancingSentence();
tmpVal = test.makeDancing(in300);
System.out.println("Output expected: " + out30 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out30);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in310 = "qoqLvbzjchYfoPcxUeCxE ahzFXHhamP";
String out31 = "QoQlVbZjChYfOpCxUeCxE aHzFxHhAmP";
System.out.println("testing with input: ");
System.out.println(in310);
test = new DancingSentence();
tmpVal = test.makeDancing(in310);
System.out.println("Output expected: " + out31 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out31);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in320 = "FbOB jQ";
String out32 = "FbOb Jq";
System.out.println("testing with input: ");
System.out.println(in320);
test = new DancingSentence();
tmpVal = test.makeDancing(in320);
System.out.println("Output expected: " + out32 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out32);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in330 = "NZ PtdorzsNHBXMsByJoWSOkooj ";
String out33 = "Nz PtDoRzSnHbXmSbYjOwSoKoOj ";
System.out.println("testing with input: ");
System.out.println(in330);
test = new DancingSentence();
tmpVal = test.makeDancing(in330);
System.out.println("Output expected: " + out33 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out33);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in340 = "RolkeHaljRxEAp ";
String out34 = "RoLkEhAlJrXeAp ";
System.out.println("testing with input: ");
System.out.println(in340);
test = new DancingSentence();
tmpVal = test.makeDancing(in340);
System.out.println("Output expected: " + out34 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out34);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in350 = " D";
String out35 = " D";
System.out.println("testing with input: ");
System.out.println(in350);
test = new DancingSentence();
tmpVal = test.makeDancing(in350);
System.out.println("Output expected: " + out35 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out35);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in360 = "wuo shHkN RkC";
String out36 = "WuO sHhKn RkC";
System.out.println("testing with input: ");
System.out.println(in360);
test = new DancingSentence();
tmpVal = test.makeDancing(in360);
System.out.println("Output expected: " + out36 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out36);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in370 = "zECJAdUg orH";
String out37 = "ZeCjAdUg OrH";
System.out.println("testing with input: ");
System.out.println(in370);
test = new DancingSentence();
tmpVal = test.makeDancing(in370);
System.out.println("Output expected: " + out37 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out37);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in380 = "zc xMTQjbMBmsjhIBOe nwXcEjBYrRIs";
String out38 = "Zc XmTqJbMbMsJhIbOe NwXcEjByRrIs";
System.out.println("testing with input: ");
System.out.println(in380);
test = new DancingSentence();
tmpVal = test.makeDancing(in380);
System.out.println("Output expected: " + out38 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out38);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in390 = "CQmBJQDaGvLczgvSg";
String out39 = "CqMbJqDaGvLcZgVsG";
System.out.println("testing with input: ");
System.out.println(in390);
test = new DancingSentence();
tmpVal = test.makeDancing(in390);
System.out.println("Output expected: " + out39 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out39);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in400 = "kDRrUycYCOdTYIZnW e yS";
String out40 = "KdRrUyCyCoDtYiZnW e Ys";
System.out.println("testing with input: ");
System.out.println(in400);
test = new DancingSentence();
tmpVal = test.makeDancing(in400);
System.out.println("Output expected: " + out40 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out40);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in410 = "k wqDnDXnZJr MtQukHYdbPHrysouZpWamZWhHhrDTDYgv";
String out41 = "K wQdNdXnZjR mTqUkHyDbPhRySoUzPwAmZwHhHrDtDyGv";
System.out.println("testing with input: ");
System.out.println(in410);
test = new DancingSentence();
tmpVal = test.makeDancing(in410);
System.out.println("Output expected: " + out41 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out41);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in420 = "DBSaisvXBynGeuKI fwYhpsQQd";
String out42 = "DbSaIsVxByNgEuKi FwYhPsQqD";
System.out.println("testing with input: ");
System.out.println(in420);
test = new DancingSentence();
tmpVal = test.makeDancing(in420);
System.out.println("Output expected: " + out42 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out42);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in430 = "POLZJbV";
String out43 = "PoLzJbV";
System.out.println("testing with input: ");
System.out.println(in430);
test = new DancingSentence();
tmpVal = test.makeDancing(in430);
System.out.println("Output expected: " + out43 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out43);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in440 = "vJvGQh kNhICqq cWixJ ";
String out44 = "VjVgQh KnHiCqQ cWiXj ";
System.out.println("testing with input: ");
System.out.println(in440);
test = new DancingSentence();
tmpVal = test.makeDancing(in440);
System.out.println("Output expected: " + out44 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out44);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in450 = "ASaEKYuJenWbYPRTMmiEDiEHuhjpwm Px";
String out45 = "AsAeKyUjEnWbYpRtMmIeDiEhUhJpWm Px";
System.out.println("testing with input: ");
System.out.println(in450);
test = new DancingSentence();
tmpVal = test.makeDancing(in450);
System.out.println("Output expected: " + out45 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out45);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in460 = "rLx pDLA RxdMQK q kyKztZ XltV lCWmkPBuTREDnyOnp ";
String out46 = "RlX pDlA rXdMqK q KyKzTz XlTv LcWmKpBuTrEdNyOnP ";
System.out.println("testing with input: ");
System.out.println(in460);
test = new DancingSentence();
tmpVal = test.makeDancing(in460);
System.out.println("Output expected: " + out46 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out46);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in470 = "WQas WddOmc";
String out47 = "WqAs WdDoMc";
System.out.println("testing with input: ");
System.out.println(in470);
test = new DancingSentence();
tmpVal = test.makeDancing(in470);
System.out.println("Output expected: " + out47 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out47);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in480 = "kFuhwcoPPBPzDd QrhOwspBZc QhBM d";
String out48 = "KfUhWcOpPbPzDd QrHoWsPbZc QhBm D";
System.out.println("testing with input: ");
System.out.println(in480);
test = new DancingSentence();
tmpVal = test.makeDancing(in480);
System.out.println("Output expected: " + out48 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out48);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in490 = "L yiy n OFQ I Gqee Z Zm loKXf";
String out49 = "L yIy N oFq I gQeE z Zm LoKxF";
System.out.println("testing with input: ");
System.out.println(in490);
test = new DancingSentence();
tmpVal = test.makeDancing(in490);
System.out.println("Output expected: " + out49 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out49);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in500 = "O FJ kIr X E yuk ";
String out50 = "O fJ kIr X e YuK ";
System.out.println("testing with input: ");
System.out.println(in500);
test = new DancingSentence();
tmpVal = test.makeDancing(in500);
System.out.println("Output expected: " + out50 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out50);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in510 = "diI k r BM QJ c fd G x A PW";
String out51 = "DiI k R bM qJ c Fd G x A pW";
System.out.println("testing with input: ");
System.out.println(in510);
test = new DancingSentence();
tmpVal = test.makeDancing(in510);
System.out.println("Output expected: " + out51 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out51);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in520 = "dn ";
String out52 = "Dn ";
System.out.println("testing with input: ");
System.out.println(in520);
test = new DancingSentence();
tmpVal = test.makeDancing(in520);
System.out.println("Output expected: " + out52 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out52);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in530 = "W MLs L II Gq syR p NB UF x U jd U E FJ";
String out53 = "W mLs L iI gQ sYr P nB uF x U jD u E fJ";
System.out.println("testing with input: ");
System.out.println(in530);
test = new DancingSentence();
tmpVal = test.makeDancing(in530);
System.out.println("Output expected: " + out53 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out53);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in540 = "J Nks qZ PDYqb z O w L w ";
String out54 = "J nKs Qz PdYqB z O w L w ";
System.out.println("testing with input: ");
System.out.println(in540);
test = new DancingSentence();
tmpVal = test.makeDancing(in540);
System.out.println("Output expected: " + out54 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out54);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in550 = " SXq oCvr c Z m ";
String out55 = " SxQ oCvR c Z m ";
System.out.println("testing with input: ");
System.out.println(in550);
test = new DancingSentence();
tmpVal = test.makeDancing(in550);
System.out.println("Output expected: " + out55 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out55);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in560 = " nRal yOZ gc m DhIrL OlX";
String out56 = " NrAl YoZ gC m DhIrL oLx";
System.out.println("testing with input: ");
System.out.println(in560);
test = new DancingSentence();
tmpVal = test.makeDancing(in560);
System.out.println("Output expected: " + out56 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out56);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in570 = " e HD i Vl o A lC Au ";
String out57 = " E hD i Vl O a Lc Au ";
System.out.println("testing with input: ");
System.out.println(in570);
test = new DancingSentence();
tmpVal = test.makeDancing(in570);
System.out.println("Output expected: " + out57 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out57);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in580 = " t s eJnFo HKF C k K XftjQY ";
String out58 = " T s EjNfO hKf C k K xFtJqY ";
System.out.println("testing with input: ");
System.out.println(in580);
test = new DancingSentence();
tmpVal = test.makeDancing(in580);
System.out.println("Output expected: " + out58 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out58);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in590 = "EdNns q";
String out59 = "EdNnS q";
System.out.println("testing with input: ");
System.out.println(in590);
test = new DancingSentence();
tmpVal = test.makeDancing(in590);
System.out.println("Output expected: " + out59 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out59);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in600 = " C yqdO";
String out60 = " C yQdO";
System.out.println("testing with input: ");
System.out.println(in600);
test = new DancingSentence();
tmpVal = test.makeDancing(in600);
System.out.println("Output expected: " + out60 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out60);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in610 = " p h ";
String out61 = " P h ";
System.out.println("testing with input: ");
System.out.println(in610);
test = new DancingSentence();
tmpVal = test.makeDancing(in610);
System.out.println("Output expected: " + out61 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out61);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in620 = " d w i K h M C HH iI p Cv X Xba BN f ";
String out62 = " D w I k H m C hH iI p Cv X xBa Bn F ";
System.out.println("testing with input: ");
System.out.println(in620);
test = new DancingSentence();
tmpVal = test.makeDancing(in620);
System.out.println("Output expected: " + out62 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out62);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in630 = "x z z E B icGr hlWQ W QoRr I";
String out63 = "X z Z e B iCgR hLwQ w QoRr I";
System.out.println("testing with input: ");
System.out.println(in630);
test = new DancingSentence();
tmpVal = test.makeDancing(in630);
System.out.println("Output expected: " + out63 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out63);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in640 = "G w s Mgf l t vc AZZw K";
String out64 = "G w S mGf L t Vc AzZw K";
System.out.println("testing with input: ");
System.out.println(in640);
test = new DancingSentence();
tmpVal = test.makeDancing(in640);
System.out.println("Output expected: " + out64 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out64);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in650 = "n l rCQLD ZUunPH D VdfU do X a ";
String out65 = "N l RcQlD zUuNpH d VdFu Do X a ";
System.out.println("testing with input: ");
System.out.println(in650);
test = new DancingSentence();
tmpVal = test.makeDancing(in650);
System.out.println("Output expected: " + out65 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out65);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in660 = "vv U SQ iQGg B xGG Eij A aB Y S fq";
String out66 = "Vv U sQ iQgG b XgG eIj A aB y S fQ";
System.out.println("testing with input: ");
System.out.println(in660);
test = new DancingSentence();
tmpVal = test.makeDancing(in660);
System.out.println("Output expected: " + out66 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out66);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in670 = " RzE kr F v l nh q f ";
String out67 = " RzE kR f V l Nh Q f ";
System.out.println("testing with input: ");
System.out.println(in670);
test = new DancingSentence();
tmpVal = test.makeDancing(in670);
System.out.println("Output expected: " + out67 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out67);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in680 = " X dZz dK QJ e qjL ";
String out68 = " X dZz Dk Qj E qJl ";
System.out.println("testing with input: ");
System.out.println(in680);
test = new DancingSentence();
tmpVal = test.makeDancing(in680);
System.out.println("Output expected: " + out68 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out68);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in690 = "CC uL Y jM";
String out69 = "Cc Ul Y jM";
System.out.println("testing with input: ");
System.out.println(in690);
test = new DancingSentence();
tmpVal = test.makeDancing(in690);
System.out.println("Output expected: " + out69 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out69);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in700 = "j yQ bJ t KaM wg ";
String out70 = "J yQ bJ t KaM wG ";
System.out.println("testing with input: ");
System.out.println(in700);
test = new DancingSentence();
tmpVal = test.makeDancing(in700);
System.out.println("Output expected: " + out70 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out70);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in710 = " j C t sB B ";
String out71 = " J c T sB b ";
System.out.println("testing with input: ");
System.out.println(in710);
test = new DancingSentence();
tmpVal = test.makeDancing(in710);
System.out.println("Output expected: " + out71 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out71);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in720 = " l D";
String out72 = " L d";
System.out.println("testing with input: ");
System.out.println(in720);
test = new DancingSentence();
tmpVal = test.makeDancing(in720);
System.out.println("Output expected: " + out72 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out72);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in730 = "f i W b q D Dxs V pF b vLJ Vikh ";
String out73 = "F i W b Q d DxS v Pf B vLj ViKh ";
System.out.println("testing with input: ");
System.out.println(in730);
test = new DancingSentence();
tmpVal = test.makeDancing(in730);
System.out.println("Output expected: " + out73 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out73);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in740 = " chh N ";
String out74 = " ChH n ";
System.out.println("testing with input: ");
System.out.println(in740);
test = new DancingSentence();
tmpVal = test.makeDancing(in740);
System.out.println("Output expected: " + out74 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out74);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in750 = " gYsN ibj pLMB qg g ";
String out75 = " GySn IbJ pLmB qG g ";
System.out.println("testing with input: ");
System.out.println(in750);
test = new DancingSentence();
tmpVal = test.makeDancing(in750);
System.out.println("Output expected: " + out75 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out75);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in760 = " a exQGG lTAdZX R Xsy c U cT TM M";
String out76 = " A eXqGg LtAdZx R xSy C u Ct Tm M";
System.out.println("testing with input: ");
System.out.println(in760);
test = new DancingSentence();
tmpVal = test.makeDancing(in760);
System.out.println("Output expected: " + out76 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out76);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in770 = "eA mpr H V N N qH ";
String out77 = "Ea MpR h V n N qH ";
System.out.println("testing with input: ");
System.out.println(in770);
test = new DancingSentence();
tmpVal = test.makeDancing(in770);
System.out.println("Output expected: " + out77 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out77);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in780 = "r z u T";
String out78 = "R z U t";
System.out.println("testing with input: ");
System.out.println(in780);
test = new DancingSentence();
tmpVal = test.makeDancing(in780);
System.out.println("Output expected: " + out78 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out78);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in790 = " This is a dancing sentence ";
String out79 = " ThIs Is A dAnCiNg SeNtEnCe ";
System.out.println("testing with input: ");
System.out.println(in790);
test = new DancingSentence();
tmpVal = test.makeDancing(in790);
System.out.println("Output expected: " + out79 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out79);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in800 = "abc";
String out80 = "AbC";
System.out.println("testing with input: ");
System.out.println(in800);
test = new DancingSentence();
tmpVal = test.makeDancing(in800);
System.out.println("Output expected: " + out80 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out80);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in810 = "aaaaaaaaaaa";
String out81 = "AaAaAaAaAaA";
System.out.println("testing with input: ");
System.out.println(in810);
test = new DancingSentence();
tmpVal = test.makeDancing(in810);
System.out.println("Output expected: " + out81 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out81);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in820 = "ZZ";
String out82 = "Zz";
System.out.println("testing with input: ");
System.out.println(in820);
test = new DancingSentence();
tmpVal = test.makeDancing(in820);
System.out.println("Output expected: " + out82 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out82);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in830 = " this is a dancing sentence";
String out83 = " ThIs Is A dAnCiNg SeNtEnCe";
System.out.println("testing with input: ");
System.out.println(in830);
test = new DancingSentence();
tmpVal = test.makeDancing(in830);
System.out.println("Output expected: " + out83 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out83);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in840 = " a";
String out84 = " A";
System.out.println("testing with input: ");
System.out.println(in840);
test = new DancingSentence();
tmpVal = test.makeDancing(in840);
System.out.println("Output expected: " + out84 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out84);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in850 = "AAA";
String out85 = "AaA";
System.out.println("testing with input: ");
System.out.println(in850);
test = new DancingSentence();
tmpVal = test.makeDancing(in850);
System.out.println("Output expected: " + out85 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out85);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in860 = "XXX";
String out86 = "XxX";
System.out.println("testing with input: ");
System.out.println(in860);
test = new DancingSentence();
tmpVal = test.makeDancing(in860);
System.out.println("Output expected: " + out86 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out86);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in870 = "a aa";
String out87 = "A aA";
System.out.println("testing with input: ");
System.out.println(in870);
test = new DancingSentence();
tmpVal = test.makeDancing(in870);
System.out.println("Output expected: " + out87 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out87);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in880 = "The quick brown fox jumped over the lazy dog";
String out88 = "ThE qUiCk BrOwN fOx JuMpEd OvEr ThE lAzY dOg";
System.out.println("testing with input: ");
System.out.println(in880);
test = new DancingSentence();
tmpVal = test.makeDancing(in880);
System.out.println("Output expected: " + out88 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out88);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in890 = "a a a a a a a a a";
String out89 = "A a A a A a A a A";
System.out.println("testing with input: ");
System.out.println(in890);
test = new DancingSentence();
tmpVal = test.makeDancing(in890);
System.out.println("Output expected: " + out89 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out89);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in900 = " a S S S aaa";
String out90 = " A s S s AaA";
System.out.println("testing with input: ");
System.out.println(in900);
test = new DancingSentence();
tmpVal = test.makeDancing(in900);
System.out.println("Output expected: " + out90 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out90);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in910 = "aA";
String out91 = "Aa";
System.out.println("testing with input: ");
System.out.println(in910);
test = new DancingSentence();
tmpVal = test.makeDancing(in910);
System.out.println("Output expected: " + out91 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out91);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in920 = "AAAAA";
String out92 = "AaAaA";
System.out.println("testing with input: ");
System.out.println(in920);
test = new DancingSentence();
tmpVal = test.makeDancing(in920);
System.out.println("Output expected: " + out92 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out92);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in930 = "aaaaaaaaaaaaaaaaa";
String out93 = "AaAaAaAaAaAaAaAaA";
System.out.println("testing with input: ");
System.out.println(in930);
test = new DancingSentence();
tmpVal = test.makeDancing(in930);
System.out.println("Output expected: " + out93 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out93);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in940 = "aB";
String out94 = "Ab";
System.out.println("testing with input: ");
System.out.println(in940);
test = new DancingSentence();
tmpVal = test.makeDancing(in940);
System.out.println("Output expected: " + out94 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out94);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in950 = "fgfdsgdfg";
String out95 = "FgFdSgDfG";
System.out.println("testing with input: ");
System.out.println(in950);
test = new DancingSentence();
tmpVal = test.makeDancing(in950);
System.out.println("Output expected: " + out95 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out95);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in960 = "ab";
String out96 = "Ab";
System.out.println("testing with input: ");
System.out.println(in960);
test = new DancingSentence();
tmpVal = test.makeDancing(in960);
System.out.println("Output expected: " + out96 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out96);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in970 = "A b";
String out97 = "A b";
System.out.println("testing with input: ");
System.out.println(in970);
test = new DancingSentence();
tmpVal = test.makeDancing(in970);
System.out.println("Output expected: " + out97 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out97);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in980 = " Z Z Z Z";
String out98 = " Z z Z z";
System.out.println("testing with input: ");
System.out.println(in980);
test = new DancingSentence();
tmpVal = test.makeDancing(in980);
System.out.println("Output expected: " + out98 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out98);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in990 = "z z";
String out99 = "Z z";
System.out.println("testing with input: ");
System.out.println(in990);
test = new DancingSentence();
tmpVal = test.makeDancing(in990);
System.out.println("Output expected: " + out99 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out99);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1000 = " Aa";
String out100 = " Aa";
System.out.println("testing with input: ");
System.out.println(in1000);
test = new DancingSentence();
tmpVal = test.makeDancing(in1000);
System.out.println("Output expected: " + out100 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out100);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1010 = "AB";
String out101 = "Ab";
System.out.println("testing with input: ");
System.out.println(in1010);
test = new DancingSentence();
tmpVal = test.makeDancing(in1010);
System.out.println("Output expected: " + out101 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out101);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1020 = "AAAA";
String out102 = "AaAa";
System.out.println("testing with input: ");
System.out.println(in1020);
test = new DancingSentence();
tmpVal = test.makeDancing(in1020);
System.out.println("Output expected: " + out102 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out102);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1030 = "BBBBBBBBBB";
String out103 = "BbBbBbBbBb";
System.out.println("testing with input: ");
System.out.println(in1030);
test = new DancingSentence();
tmpVal = test.makeDancing(in1030);
System.out.println("Output expected: " + out103 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out103);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1040 = "AAaA";
String out104 = "AaAa";
System.out.println("testing with input: ");
System.out.println(in1040);
test = new DancingSentence();
tmpVal = test.makeDancing(in1040);
System.out.println("Output expected: " + out104 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out104);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1050 = "DGDFSGDFSGDF";
String out105 = "DgDfSgDfSgDf";
System.out.println("testing with input: ");
System.out.println(in1050);
test = new DancingSentence();
tmpVal = test.makeDancing(in1050);
System.out.println("Output expected: " + out105 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out105);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1060 = "AAAAAA";
String out106 = "AaAaAa";
System.out.println("testing with input: ");
System.out.println(in1060);
test = new DancingSentence();
tmpVal = test.makeDancing(in1060);
System.out.println("Output expected: " + out106 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out106);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1070 = " tHiS is wrong";
String out107 = " ThIs Is WrOnG";
System.out.println("testing with input: ");
System.out.println(in1070);
test = new DancingSentence();
tmpVal = test.makeDancing(in1070);
System.out.println("Output expected: " + out107 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out107);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1080 = "Abc";
String out108 = "AbC";
System.out.println("testing with input: ");
System.out.println(in1080);
test = new DancingSentence();
tmpVal = test.makeDancing(in1080);
System.out.println("Output expected: " + out108 + " Output recieved: " + tmpVal );
result = tmpVal.equals(out108);
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
    }
}
